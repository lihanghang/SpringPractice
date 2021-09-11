/**
 * Copyright (C), 2019-2021, XXX
 * FileName: HelloSpringController
 * Author:   hanghangli
 * Date:     2021/9/11 17:03
 * Description: 控制器测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mason.practice.controller;

import com.mason.practice.annotation.CostTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanghangli
 */
@RestController
public class HelloSpringController {

    @GetMapping("hello")
    @CostTime
    public String hello(){
        return "Hello, Spring!";
    }
}
