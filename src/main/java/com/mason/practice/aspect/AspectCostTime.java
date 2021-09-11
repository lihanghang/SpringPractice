/**
 * Copyright (C), 2019-2021, XXX
 * FileName: AspectCostTime
 * Author:   hanghangli
 * Date:     2021/9/11 17:16
 * Description: 接口耗时统计切面
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mason.practice.aspect;

import com.alibaba.fastjson.JSON;
import com.mason.practice.utils.HttpUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hanghangli
 */
@Aspect
@Component
public class AspectCostTime {
    ThreadLocal<Long> startTime = new ThreadLocal<>();
    private static final Logger logger = LoggerFactory.getLogger(AspectCostTime.class);
    @org.aspectj.lang.annotation.Pointcut("@annotation(com.mason.practice.annotation.CostTime)")
    public void costTime() {
    }

    @Before("costTime()")
    public void doBefore(JoinPoint joinPoint) throws Throwable{
        startTime.set(System.currentTimeMillis());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if(attributes != null) {
            HttpServletRequest request = attributes.getRequest();
            logger.info("\n 请求的IP地址：{}", HttpUtils.getRequestIp(request));
            System.out.println("URL:" + request.getRequestURL().toString());
            System.out.println("Method:" + request.getMethod());
        }
        else {
            logger.error(attributes.toString());
        }

    }

    @Around("costTime()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint){
        Object obj = null;
        try {
            obj = proceedingJoinPoint.proceed();
            String methodName = proceedingJoinPoint.getSignature().getName();
            String className = proceedingJoinPoint.getSignature().getDeclaringTypeName();
            logger.info("\n 方法名：{} \n 类名：{}", methodName, className);

        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return obj;
    }

    @AfterReturning(returning = "ret", pointcut = "costTime()")
    public void doAfterReturn(Object ret){
        long endTime = System.currentTimeMillis();
        logger.info("\n 返回值：{} \n 耗时：{} ms", JSON.toJSONString(ret), endTime-startTime.get());
        startTime.remove();
    }

}
