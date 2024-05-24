package com.legenda.lee.studytest.aboutJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Test9 {

    public static void main(String[] args) {


                String response = "{\"msg\":\"成功\",\"code\":\"00\",\"data\":\"\",\"datas\":[{\"nSRSBH\":\"91330402MA2JEMR068\",\"sHXYDM\":\"91330402MA2JEMR068\",\"cFRQ\":\"20211214\",\"fKJE\":\"50\",\"wH\":\"南税简罚〔2021〕2109号\",\"nSRMC\":\"浙江铭度家具集团有限公司\",\"dJXH\":\"10213304000000197355\",\"cFYJ\":null,\"tong_time\":\"2022-03-16 17:03:29.0\"}],\"totalPage\":1,\"indicatorData\":true,\"dataCount\":1,\"totalDataCount\":1,\"requestId\":\"364b1c5055902f46083fed9a668debde\"}";




                   JSONObject object = JSONObject.parseObject(response);
        String pretty = JSON.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);

        System.out.println(response);
        System.out.println("-------------");
        System.out.println(pretty);

        System.out.println("-------------");

                StringBuilder sb = new StringBuilder();

                        sb.append("#### 返回信息：\n");

                sb.append(pretty);
                sb.append("\n\n");

        System.out.println(sb.toString());


        String a = "{\n" +
                "\t\"msg\":\"成功\",\n" +
                "\t\"code\":\"00\",\n" +
                "\t\"data\":\"\",\n" +
                "\t\"datas\":[\n" +
                "\t\t{\n" +
                "\t\t\t\"nSRSBH\":\"91330402MA2JEMR068\",\n" +
                "\t\t\t\"wH\":\"南税简罚〔2021〕2109号\",\n" +
                "\t\t\t\"sHXYDM\":\"91330402MA2JEMR068\",\n" +
                "\t\t\t\"nSRMC\":\"浙江铭度家具集团有限公司\",\n" +
                "\t\t\t\"dJXH\":\"10213304000000197355\",\n" +
                "\t\t\t\"cFYJ\":null,\n" +
                "\t\t\t\"cFRQ\":\"20211214\",\n" +
                "\t\t\t\"tong_time\":\"2022-03-16 17:03:29.0\",\n" +
                "\t\t\t\"fKJE\":\"50\"\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"totalPage\":1,\n" +
                "\t\"requestId\":\"364b1c5055902f46083fed9a668debde\",\n" +
                "\t\"indicatorData\":true,\n" +
                "\t\"dataCount\":1,\n" +
                "\t\"totalDataCount\":1\n" +
                "}\n";
    }

}
