package com.mmc.zuul.filter;

import com.alibaba.fastjson.JSON;
import com.netflix.zuul.context.RequestContext;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: mmc
 * @create: 2020-04-12 23:02
 **/
@Component
public class ErrorFilter extends SendErrorFilter {

    @Override
    public Object run() {
       try{
           RequestContext ctx = RequestContext.getCurrentContext();
           HttpServletRequest request = ctx.getRequest();
           HttpServletResponse response = ctx.getResponse();
           ExceptionHolder exception = findZuulException(ctx.getThrowable());
           response.setContentType("application/json;charset=utf-8");
           response.setCharacterEncoding("UTF-8");

           Map<String,Object> errorMap=new HashMap<>();
           errorMap.put("code","-1");
           errorMap.put("errMsg",exception.getThrowable().getCause().getMessage());
           response.getWriter().write(JSON.toJSONString(errorMap));
       }catch (Exception e){
           try {
               ReflectionUtils.rethrowException(e);
           } catch (Exception e1) {
               e1.printStackTrace();
           }
       }
       return null;
    }
}
