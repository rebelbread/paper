package tk.mybatis.springboot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.springboot.mapper.PaperMapper;
import tk.mybatis.springboot.model.BlankPaper;
import tk.mybatis.springboot.model.Paper;
import tk.mybatis.springboot.model.SinglePaper;
import tk.mybatis.springboot.model.TFPaper;

import java.io.IOException;

/**
 * @author zhiwj
 * @date 2019/1/31
 */
@RestController
@RequestMapping("/paper")
public class PaperController {

    @Autowired
    PaperMapper paperMapper;

    @RequestMapping("/order")
    public Paper orderNext(Integer id, Integer type) throws IOException {
        Paper paper = paperMapper.findNextByOrder(id, type);
        return parsePaper(paper);
    }

    @RequestMapping("/random")
    public Paper randomNext(Integer type) throws IOException {

//        153
//        223
//        274
//        113
//        21
        Paper paper = paperMapper.findNextByRandom(type);
        return parsePaper(paper);
    }

    private Paper parsePaper(Paper paper) throws IOException {


        switch (paper.getType()) {

            case 1:
            case 4: return parseSinglePaper(paper);
            case 2: return parseTFPaper(paper);
            case 3:
            case 5: return parseBlankPaper(paper);
            default: return paper;
        }


    }

    private Paper parseBlankPaper(Paper paper) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        BlankPaper myPaper = mapper.readValue(paper.getAnswer(), BlankPaper.class);
        myPaper.setId(paper.getId());
        myPaper.setNo(paper.getNo());
        myPaper.setType(paper.getType());
        myPaper.setTitle(paper.getTitle());
        return myPaper;
    }

    private Paper parseTFPaper(Paper paper) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TFPaper tfPaper = mapper.readValue(paper.getAnswer(), TFPaper.class);
        tfPaper.setId(paper.getId());
        tfPaper.setNo(paper.getNo());
        tfPaper.setType(paper.getType());
        tfPaper.setTitle(paper.getTitle());
        return tfPaper;
    }

    private Paper parseSinglePaper(Paper paper) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SinglePaper singlePaper = mapper.readValue(paper.getAnswer(), SinglePaper.class);
        singlePaper.setId(paper.getId());
        singlePaper.setNo(paper.getNo());
        singlePaper.setType(paper.getType());
        singlePaper.setTitle(paper.getTitle());
        return singlePaper;
    }

}
