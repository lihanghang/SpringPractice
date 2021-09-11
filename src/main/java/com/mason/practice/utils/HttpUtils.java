/**
 * Copyright (C), 2019-2021, XXX
 * FileName: HttpUtils
 * Author:   hanghangli
 * Date:     2021/9/11 18:08
 * Description: http请求自定义工具类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mason.practice.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hanghangli
 */
public final class HttpUtils {
    private static final String[] IP_HEADERS = {
            "X-Forwarded-For",
            "Proxy-Client-IP",
            "WL-Proxy-Client-IP",
            "HTTP_X_FORWARDED_FOR",
            "HTTP_X_FORWARDED",
            "HTTP_X_CLUSTER_CLIENT_IP",
            "HTTP_CLIENT_IP",
            "HTTP_FORWARDED_FOR",
            "HTTP_FORWARDED",
            "HTTP_VIA",
            "REMOTE_ADDR"
    };


    public static String getRequestIp(HttpServletRequest request){
        for(String header : IP_HEADERS){
            String value = request.getHeader(header);
            if(value == null || value.isEmpty()){
                continue;
            }
            String [] parts = value.split("\\s *, \\s*");
            return parts[0];
        }
        return request.getRemoteAddr();
    }
}
