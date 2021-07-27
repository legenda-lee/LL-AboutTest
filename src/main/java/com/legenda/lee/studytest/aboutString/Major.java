package com.legenda.lee.studytest.aboutString;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 专业分析数据信息
 * </p>
 *
 * @author Legenda-Lee(达哥)
 * @since 2020-08-19
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Major extends MajorAnalysisVo implements Comparable<Major> {


    //(value = "上岸难度")
    private Integer hardScore;

    //(value = "上岸难度-展示")
    private String hardScoreShow;



    @Override
    public int compareTo(Major o) {
        //如何重写方法
        //按年龄升序排序比较
        //this(当前调用方法的对象)   o(参数传入)
        //所有比较最底层的逻辑都是发生两两比较逻辑的,返回比较结果
        //只关心结果结果三种:
        //正数:   this.age - o.age    >
        //负数:   this.age - o.age    <
        //0       this   ==
        if (this.getHardScoreShow().equals("无")) {
            return 1;
        }
        return o.hardScore - this.hardScore;
    }

}
