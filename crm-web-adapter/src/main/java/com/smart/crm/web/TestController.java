package com.smart.crm.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author bob
 * @since 2024-06-04
 */
@RestController
public class TestController {

    @GetMapping(value = "/api/currentUser")
    public String currentUser() {
        return "{\n" +
                "    \"data\": {\n" +
                "        \"name\": \"Serati Ma\",\n" +
                "        \"avatar\": \"https://gw.alipayobjects.com/zos/rmsportal/BiazfanxmamNRoxxVxka.png\",\n" +
                "        \"userid\": \"00000001\",\n" +
                "        \"email\": \"antdesign@alipay.com\",\n" +
                "        \"signature\": \"海纳百川，有容乃大\",\n" +
                "        \"title\": \"交互专家\",\n" +
                "        \"group\": \"蚂蚁金服－某某某事业群－某某平台部－某某技术部－UED\",\n" +
                "        \"tags\": [\n" +
                "            {\n" +
                "                \"key\": \"0\",\n" +
                "                \"label\": \"很有想法的\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"key\": \"1\",\n" +
                "                \"label\": \"专注设计\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"key\": \"2\",\n" +
                "                \"label\": \"辣~\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"key\": \"3\",\n" +
                "                \"label\": \"大长腿\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"key\": \"4\",\n" +
                "                \"label\": \"川妹子\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"key\": \"5\",\n" +
                "                \"label\": \"海纳百川\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"notifyCount\": 12,\n" +
                "        \"unreadCount\": 11,\n" +
                "        \"country\": \"China\",\n" +
                "        \"geographic\": {\n" +
                "            \"province\": {\n" +
                "                \"label\": \"浙江省\",\n" +
                "                \"key\": \"330000\"\n" +
                "            },\n" +
                "            \"city\": {\n" +
                "                \"label\": \"杭州市\",\n" +
                "                \"key\": \"330100\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"address\": \"西湖区工专路 77 号\",\n" +
                "        \"phone\": \"0752-268888888\"\n" +
                "    }\n" +
                "}";
    }

    @GetMapping(value = "/api/login/account")
    public String account() {
        return "Hello, welcome to COLA world!";
    }
}
