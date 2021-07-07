package com.legenda.lee.studyStream.aboutMaxMin;

import lombok.Data;

import java.io.Serializable;


/**
 * @author Legenda-Lee(lee.legenda@gmail.com)
 * @date 2020-10-24 14:51:01
 * @description 示例
 *         {
 *             "drugId": 4531354074901,
 *             "drugName": "盐酸左氧氟沙星胶囊",
 *             "takeAmount": 1,
 *             "takeUnit": "盒",
 *             "drugUsage": "口服",
 *             "perNum": "2",
 *             "perUnit": "粒",
 *             "usageFrequencyName": "2次/天",
 *             "usageFrequencyCode": 3,
 *             "dose": 8,
 *             "spec": "0.1g*10粒*2板"
 *         }
 */
@Data
public class MedicineDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 药物ID
     */
    private Long drugId;

    /**
     * 药物名称
     */
    private String drugName;

    /**
     * 药物用法
     */
    private String drugUsage;

    /**
     * 药物每次用量
     */
    private String perNum;

    /**
     * 单次用量单位
     */
    private String perUnit;

    /**
     * 使用频次
     */
    private String usageFrequencyName;

    /**
     * 使用频次code
     */
    private Integer usageFrequencyCode;

    /**
     * 用药天数(单位为天)
     */
    private Integer dose;

    /**
     * 购买数量
     */
    private Integer takeAmount;

    /**
     * 购买数量单位
     */
    private String takeUnit;

    /**
     * 规格
     */
    private String spec;

}
