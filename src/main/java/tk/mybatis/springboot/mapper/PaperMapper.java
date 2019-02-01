package tk.mybatis.springboot.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.springboot.model.Paper;
import tk.mybatis.springboot.util.MyMapper;

/**
 * @author zhiwj
 * @date 2019/1/31
 */
public interface PaperMapper extends MyMapper<Paper> {


    @Select("<script>SELECT  " +
            " *   " +
            "FROM  " +
            " paper   " +
            "WHERE  " +
            " STATUS = 1  " +
            " and id > #{id}  " +
            " <if test=\" type != null \" >  " +
            " and  type = #{type}  " +
            " </if> " +
            " ORDER BY id  " +
            "  limit 0, 1 </script>")
    Paper findNextByOrder(@Param("id") Integer id, @Param("type") Integer type);

    /**
     * 效率低的排序  以后改
     * @param type
     * @return
     */
    @Select(" <script> SELECT * FROM paper WHERE status=1  <if test=' type != null '> and type=#{type} </if> ORDER BY RAND()  LIMIT 1  </script>")
    Paper findNextByRandom(@Param("type") Integer type);
}
