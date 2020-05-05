package com.sap.membership.trade.controller;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sap.membership.trade.domain.BaseEvent;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStreamReader;

@Controller
public class WeiXinController {

    @RequestMapping(value = "/wx", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public String messageService(HttpServletRequest request) throws IOException {

        char[] buf = new char[1024];
        int length;
        StringBuilder builder = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(request.getInputStream(), "utf-8");
        while ((length = inputStreamReader.read(buf)) != -1) {
            builder.append(new String(buf, 0, length));
        }

        inputStreamReader.close();

        System.out.println(builder);

        XmlMapper xmlMapper = new XmlMapper();
        //忽略pojo中不存在的字段
        xmlMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,true);
        BaseEvent baseEvent = xmlMapper.readValue(builder.toString(), BaseEvent.class);

        System.out.println(baseEvent);

        return "";
    }

}
