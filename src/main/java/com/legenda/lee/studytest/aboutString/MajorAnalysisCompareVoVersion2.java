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
public class MajorAnalysisCompareVoVersion2 extends MajorAnalysisVo implements Comparable<MajorAnalysisCompareVoVersion2> {

    //(value = "年份")
    private String compareFileDate;

    //(value = "专业代码")
    private String compareMajorName;

    //(value = "二级学科")
    private String compareSecondaryDiscipline;

    //(value = "学习方式")
    private Integer compareStudyType;

    //(value = "学习方式描述")
    private String compareStudyTypeDesc;

    //(value = "对比方式")
    private Integer compareOrderType;

    //(value = "对比方式描述")
    private String compareOrderTypeDesc;



    //(value = "排名")
    private Integer compareOrderNo;

    //(value = "院校名称")
    private String compareFileCollege;

    //(value = "排名值")
    private String compareOrderValue;



    /**
     * 新增的返回字段
     */
    //(value = "16个值有值的总数")
    private Integer hasValueCount;

    //(value = "上岸难度")
    private Integer hardScore;

    //(value = "上岸难度-展示")
    private String hardScoreShow;

    //(value = "招生人数-展示")
    private String recruitNumberShow;

    //(value = "报考人数-展示")
    private String applyNumberShow;

    //(value = "推免人数-展示")
    private String appointNumberShow;

    //(value = "统考录取人数-展示")
    private String generalEnterNumberShow;

    //(value = "录取合计人数-展示")
    private String totalEnterNumberShow;

    //(value = "录取最高分（初试）-展示")
    private String maxEnterScoreShow;

    //(value = "录取最低分（初试）-展示")
    private String minEnterScoreShow;

    //(value = "复试线-展示")
    private String reexamineScoreShow;



    @Override
    public int compareTo(MajorAnalysisCompareVoVersion2 o) {
        //如何重写方法
        //按年龄升序排序比较
        //this(当前调用方法的对象)   o(参数传入)
        //所有比较最底层的逻辑都是发生两两比较逻辑的,返回比较结果
        //只关心结果结果三种:
        //正数:   this.age - o.age    >
        //负数:   this.age - o.age    <
        //0       this   ==
        if (this.hardScoreShow.equals("无")) {
            return 1;
        }
        return o.hardScore - this.hardScore;
    }

}
