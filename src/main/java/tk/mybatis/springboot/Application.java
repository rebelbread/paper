package tk.mybatis.springboot;

//特别注意，下面的是 tk.MapperScan

import com.alibaba.druid.support.json.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import tk.mybatis.spring.annotation.MapperScan;
import tk.mybatis.springboot.mapper.PaperMapper;
import tk.mybatis.springboot.model.Paper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author liuzh
 * @since 2015-12-12 18:22
 */
@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "tk.mybatis.springboot.mapper")
public class Application extends WebMvcConfigurerAdapter implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private PaperMapper paperMapper;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("服务启动完成!");

//        判断();
//        单选();
//        填空();
//        多选();
//        解答();


    }

//    private void 单选() throws IOException {
//        File f=new File("E:\\code\\MyBatis-Spring-Boot\\src\\main\\resources\\单选.xlsx");
//        List<String[]> excel = POIUtil.readExcel(f);
//
//        List<Paper> list = new ArrayList<>(excel.size());
//        for (String[] strings : excel) {
//            Paper paper = new Paper();
//            paper.setNo(strings[0]);
//            paper.setTitle(strings[2]);
//
//            HashMap<String, Object> map = new HashMap<>(2);
//            map.put("result", strings[7]);
//            map.put("A", strings[3]);
//            map.put("B", strings[4]);
//            map.put("C", strings[5]);
//            map.put("D", strings[6]);
//            paper.setType(1);
//            paper.setAnswer(JSONUtils.toJSONString(map));
//            paper.setStatus(1);
//            paper.setCreateTime(new Date());
//            list.add(paper);
//        }
//
//        paperMapper.insertList(list);
//    }
//
//    private void 多选() throws IOException {
//        File f=new File("E:\\code\\MyBatis-Spring-Boot\\src\\main\\resources\\多选.xlsx");
//        List<String[]> excel = POIUtil.readExcel(f);
//
//        List<Paper> list = new ArrayList<>(excel.size());
//        for (String[] strings : excel) {
//            Paper paper = new Paper();
//            paper.setNo(strings[0]);
//            paper.setTitle(strings[2]);
//
//            HashMap<String, Object> map = new HashMap<>(2);
//            map.put("result", strings[7]);
//            map.put("A", strings[3]);
//            map.put("B", strings[4]);
//            map.put("C", strings[5]);
//            map.put("D", strings[6]);
//            paper.setType(4);
//            paper.setAnswer(JSONUtils.toJSONString(map));
//            paper.setStatus(1);
//            paper.setCreateTime(new Date());
//            list.add(paper);
//        }
//
//        paperMapper.insertList(list);
//    }
//
//    private void 填空() throws IOException {
//        File f=new File("E:\\code\\MyBatis-Spring-Boot\\src\\main\\resources\\填空.xlsx");
//        List<String[]> excel = POIUtil.readExcel(f);
//
//        List<Paper> list = new ArrayList<>(excel.size());
//        for (String[] strings : excel) {
//            Paper paper = new Paper();
//            paper.setNo(strings[0]);
//            paper.setTitle(strings[2]);
//
//            HashMap<String, Object> map = new HashMap<>(2);
//            map.put("result", strings[3]);
//            paper.setType(3);
//            paper.setAnswer(JSONUtils.toJSONString(map));
//            paper.setStatus(1);
//            paper.setCreateTime(new Date());
//            list.add(paper);
//        }
//
//        paperMapper.insertList(list);
//    }
//
//    private void 判断() throws IOException {
//        File f=new File("E:\\code\\MyBatis-Spring-Boot\\src\\main\\resources\\判断.xlsx");
//        List<String[]> excel = POIUtil.readExcel(f);
//
//        List<Paper> list = new ArrayList<>(excel.size());
//        for (String[] strings : excel) {
//            Paper paper = new Paper();
//            paper.setNo(strings[0]);
//            paper.setTitle(strings[2]);
//
//            HashMap<String, Object> map = new HashMap<>(2);
//            map.put("result", strings[3]);
//            map.put("A", "是");
//            map.put("B", "非");
//            paper.setType(2);
//            paper.setAnswer(JSONUtils.toJSONString(map));
//            paper.setStatus(1);
//            paper.setCreateTime(new Date());
//            list.add(paper);
//        }
//
//        paperMapper.insertList(list);
//    }
//
//    private void 解答() throws IOException {
//        File f=new File("E:\\code\\MyBatis-Spring-Boot\\src\\main\\resources\\解答.xlsx");
//        List<String[]> excel = POIUtil.readExcel(f);
//
//        List<Paper> list = new ArrayList<>(excel.size());
//        for (String[] strings : excel) {
//            Paper paper = new Paper();
//            paper.setNo(strings[0]);
//            paper.setTitle(strings[2]);
//
//            HashMap<String, Object> map = new HashMap<>(2);
//            map.put("result", strings[3]);
//            paper.setType(5);
//            paper.setAnswer(JSONUtils.toJSONString(map));
//            paper.setStatus(1);
//            paper.setCreateTime(new Date());
//            list.add(paper);
//        }
//
//        paperMapper.insertList(list);
//    }


}
