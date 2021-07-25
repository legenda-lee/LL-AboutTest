package com.legenda.lee.studytest.aboutString;


import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 专业分析数据信息
 * </p>
 *
 * @author Legenda-Lee(达哥)
 * @since 2020-08-19
 */
@Data
public class MajorAnalysisVo {

    private Integer id;

    //(value = "文件年份")
    private String fileDate;

    //(value = "院校名称")
    private String fileCollege;

    //(value = "院校编码")
    private String schoolCode;

    //(value = "专业代码")
    private String majorName;

    //(value = "二级学科")
    private String secondaryDiscipline;

    //(value = "学习方式(1:全日制、2:非全日制)")
    private Integer studyType;

    //(value = "学习方式描述(1:全日制、2:非全日制)")
    private String studyTypeDesc;

    //(value = "招生人数")
    private Integer recruitNumber;

    //(value = "报考人数")
    private Integer applyNumber;

    //(value = "复试人数")
    private Integer reexamineNumber;

    //(value = "推免人数")
    private Integer appointNumber;

    //(value = "调剂人数")
    private Integer adjustNumber;

    //(value = "统考录取人数")
    private Integer generalEnterNumber;

    //(value = "录取合计人数")
    private Integer totalEnterNumber;

    //(value = "录取最高分（初试）")
    private Integer maxEnterScore;

    //(value = "录取最低分（初试）")
    private Integer minEnterScore;

    //(value = "复试线")
    private Integer reexamineScore;

    //(value = "汇总文件名称")
    private String fileNameData;

    //(value = "汇总文件链接")
    private String filePathData;

    //(value = "复试线文件名称")
    private String fileNameReexamine;

    //(value = "复试线文件链接")
    private String filePathReexamine;

    //(value = "是否已删除(0:未删，1:已删)")
    private Integer isDeleted;

    //(value = "创建人")
    private String createId;

    //(value = "修改人")
    private String updateId;

    //(value = "创建时间")
    private LocalDateTime createTime;

    //(value = "修改时间")
    private LocalDateTime updateTime;


    // 新增的三个返回字段
    //(value = "地区")
    private String city;

    //(value = "学校水平")
    private String schoolLevel;

    //(value = "学科评估")
    private String majorLevel;


}
