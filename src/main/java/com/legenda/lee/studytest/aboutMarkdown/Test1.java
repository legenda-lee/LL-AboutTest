package com.legenda.lee.studytest.aboutMarkdown;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.data.MutableDataSet;

public class Test1 {

    public static void main(String[] args) {


        String response = "## 注意事项\n" +
                "* 本次初始版本为简单的应用版本，只是消息推送，暂无交互式的回调动作。\n" +
                "* 所以安全性上暂且只需要注意发送的消息内容不要包含任何敏感信息！！！\n" +
                "* 不要包含任何敏感信息！不要包含任何敏感信息！不要包含任何敏感信息！\n" +
                "* 如必需，要脱敏！如必需，要脱敏！如必需，要脱敏！如必需，要脱敏！！";


        String htmlText = markdownToHtml(response);
        System.out.println(htmlText);

    }


    // 示例方法，将Markdown转换为HTML
    public static String markdownToHtml(String markdown) {
        MutableDataSet options = new MutableDataSet();

        // 用于解析Markdown的Parser
        Parser parser = Parser.builder(options).build();

        // 用于将解析的文档渲染为HTML的HtmlRenderer
        HtmlRenderer renderer = HtmlRenderer.builder(options).build();

        // 解析Markdown文本
        Document document = parser.parse(markdown);

        // 渲染为HTML
        String html = renderer.render(document);

        return html;
    }

}
