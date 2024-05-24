package com.legenda.lee.studySdb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.*;
import java.util.stream.Collectors;

public class Init {

    public static void main(String[] args) {
        List<String> ruleNamelist = new ArrayList<>();

        Map<String, List<String>> ruleProductMap = new HashMap<>();

        ruleNamelist.add("IRS-省大数据局失信被执行人黑名单规则");
        ruleNamelist.add("IRS-涉案民事刑事判决记录信息规则");
        ruleNamelist.add("IRS-安全生产不良记录黑名单规则");
        ruleNamelist.add("IRS-省法院失信被执行人黑名单规则");
        ruleNamelist.add("IRS-生态环境行为信用评价规则");
        ruleNamelist.add("IRS-环境违法失信黑名单规则");
        ruleNamelist.add("IRS-严重违法失信企业黑名单规则");
        ruleNamelist.add("IRS-省税务局行政处罚信息规则");
        ruleNamelist.add("IRS-重大税收违法黑名单规则-企业");
        ruleNamelist.add("IRS-重大税收违法黑名单规则-个人");

        ruleNamelist.add("个人策略-命中历史不良行为");
        ruleNamelist.add("个人策略-近三年发生过失信被执行");
        ruleNamelist.add("个人策略-近三年发生过限制高消费");
        ruleNamelist.add("个人策略-命中限制高消费");
        ruleNamelist.add("个人策略-命中团伙欺诈");
        ruleNamelist.add("个人策略-命中被执行");
        ruleNamelist.add("个人策略-命中疑似高危人群");
        ruleNamelist.add("个人策略-命中反欺诈高分");
        ruleNamelist.add("个人策略-命中失信被执行");

        ruleNamelist.add("企业策略-近三年发生过终本案件");
        ruleNamelist.add("企业策略-命中限制高消费");
        ruleNamelist.add("企业策略-近三年发生过限制高消费");
        ruleNamelist.add("企业策略-近三年发生过失信被执行");
        ruleNamelist.add("企业策略-近一年发生过股权冻结");
        ruleNamelist.add("企业策略-命中失信被执行");
        ruleNamelist.add("企业策略-近三年发生过司法拍卖");
        ruleNamelist.add("企业策略-近一年发生过重大税收违法");
        ruleNamelist.add("企业策略-近三年发生过被执行");
        ruleNamelist.add("企业策略-命中被执行");
        ruleNamelist.add("省信用中心-企业信用评价等级高风险策略");
        ruleNamelist.add("省信用中心-企业信用评价等级中风险策略");
        ruleNamelist.add("企业策略-6个月内发生过法人变更");
        ruleNamelist.add("企业策略-命中终本案件");


        ruleProductMap.put("IRS-省大数据局失信被执行人黑名单规则", new ArrayList<>(Arrays.asList("zceq17224r9qbvb1")));
        ruleProductMap.put("IRS-涉案民事刑事判决记录信息规则", new ArrayList<>(Arrays.asList("uwJ71aeh2xg4Kf19")));
        ruleProductMap.put("IRS-安全生产不良记录黑名单规则", new ArrayList<>(Arrays.asList("fgwHjZiz019TbAqschmd")));
        ruleProductMap.put("IRS-省法院失信被执行人黑名单规则", new ArrayList<>(Arrays.asList("04hebe44RV4X9To5")));
        ruleProductMap.put("IRS-生态环境行为信用评价规则", new ArrayList<>(Arrays.asList("mZK4aw79d6NV8bWa")));
        ruleProductMap.put("IRS-环境违法失信黑名单规则", new ArrayList<>(Arrays.asList("hV7T45waOD69B72f")));
        ruleProductMap.put("IRS-严重违法失信企业黑名单规则", new ArrayList<>(Arrays.asList("VjV1fdce6emYEe8f")));
        ruleProductMap.put("IRS-省税务局行政处罚信息规则", new ArrayList<>(Arrays.asList("taxPenaltyInfo")));
        ruleProductMap.put("IRS-重大税收违法黑名单规则-企业", new ArrayList<>(Arrays.asList("evvfeB588m202045")));
        ruleProductMap.put("IRS-重大税收违法黑名单规则-个人", new ArrayList<>(Arrays.asList("evvfeB588m202045")));

        ruleProductMap.put("个人策略-命中历史不良行为", new ArrayList<>(Arrays.asList("port_riskbehavior_assess_st")));
        ruleProductMap.put("个人策略-近三年发生过失信被执行", new ArrayList<>(Arrays.asList("port_court_type_query_st", "ExecutionLimited")));
        ruleProductMap.put("个人策略-近三年发生过限制高消费", new ArrayList<>(Arrays.asList("ExecutionLimited")));
        ruleProductMap.put("个人策略-命中限制高消费", new ArrayList<>(Arrays.asList("ExecutionLimited")));
        ruleProductMap.put("个人策略-命中团伙欺诈", new ArrayList<>(Arrays.asList("BQGL0002")));
        ruleProductMap.put("个人策略-命中被执行", new ArrayList<>(Arrays.asList("port_court_type_query_st")));
        ruleProductMap.put("个人策略-命中疑似高危人群", new ArrayList<>(Arrays.asList("veri_cell_interrelated_st")));
        ruleProductMap.put("个人策略-命中反欺诈高分", new ArrayList<>(Arrays.asList("BHDTSC01")));
        ruleProductMap.put("个人策略-命中失信被执行", new ArrayList<>(Arrays.asList("ExecutionLimited")));

        ruleProductMap.put("企业策略-近三年发生过终本案件", new ArrayList<>(Arrays.asList("FLSS74")));
        ruleProductMap.put("企业策略-命中限制高消费", new ArrayList<>(Arrays.asList("humanXianxiao")));
        ruleProductMap.put("企业策略-近三年发生过限制高消费", new ArrayList<>(Arrays.asList("humanXianxiao")));
        ruleProductMap.put("企业策略-近三年发生过失信被执行", new ArrayList<>(Arrays.asList("humanDishonest")));
        ruleProductMap.put("企业策略-近一年发生过股权冻结", new ArrayList<>(Arrays.asList("judicialAssistFrozen")));
        ruleProductMap.put("企业策略-命中失信被执行", new ArrayList<>(Arrays.asList("humanDishonest")));
        ruleProductMap.put("企业策略-近三年发生过司法拍卖", new ArrayList<>(Arrays.asList("S001")));
        ruleProductMap.put("企业策略-近一年发生过重大税收违法", new ArrayList<>(Arrays.asList("riskTaxPunish")));
        ruleProductMap.put("企业策略-近三年发生过被执行", new ArrayList<>(Arrays.asList("FLSS71")));
        ruleProductMap.put("企业策略-命中被执行", new ArrayList<>(Arrays.asList("300214")));
        ruleProductMap.put("省信用中心-企业信用评价等级高风险策略", new ArrayList<>(Arrays.asList("atg.biz.xypjcx.1")));
        ruleProductMap.put("省信用中心-企业信用评价等级中风险策略", new ArrayList<>(Arrays.asList("atg.biz.xypjcx.1")));
        ruleProductMap.put("企业策略-6个月内发生过法人变更", new ArrayList<>(Arrays.asList("100138")));
        ruleProductMap.put("企业策略-命中终本案件", new ArrayList<>(Arrays.asList("300303")));



        String response = "{\"code\":0,\"data\":{\"invokeId\":\"2024052215533903204087\",\"refuseRuleList\":[],\"requestSerialNo\":\"d9da937a685449f89b3b781795450abf\",\"riskResult\":\"WARN\",\"tradeFlowIdentify\":\"zb_proApply_submit_xq_dcl\",\"tradeFlowName\":\"融资担保-业务中心-产品业务办理-准入风控\",\"warnRuleList\":[{\"hitSubSerialNoList\":[{\"subRequestSerialNo\":\"33040120240522100079\"}],\"interfaceDesc\":\"企业规则_IRS-涉案民事刑事判决记录信息规则\",\"interfaceIdentify\":\"F1709518610601\",\"interfaceName\":\"IRS-涉案民事刑事判决记录信息规则\",\"prompt\":\"该债务人于省法院存在“涉案民事刑事判决”记录，建议重点关注。\"}]},\"msg\":\"成功\"}";

   // BaseResponse riskResponse = JSON.parseObject(response, BaseResponse.class);
   BaseResponse riskResponse = JSON.parseObject(response, new TypeReference<BaseResponse<RiskResponse>>(){});

   RiskResponse riskResponse1 = (RiskResponse)riskResponse.getData();

        // 收集命中的规则集合
        List<String> interfaceNameList = riskResponse1.getWarnRuleList().stream().map(RiskModelApiVo.InterfaceBean::getInterfaceName).collect(Collectors.toList());

        // 需要查询的命中三方调用规则名称
        List<String> intersectionRuleNameList = interfaceNameList.stream().filter(ruleNamelist::contains).collect(Collectors.toList());
        System.out.println("");



                StringBuilder sb = new StringBuilder();

                sb.append("ddd");
                sb.append("\n");
                sb.append("aaaa");
                sb.append("\n");

        System.out.println(sb.toString());

    }

}
