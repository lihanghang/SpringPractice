/*
 * Copyright (C), 2019-2021, XXX
 * FileName: HelloSpringController
 * Author:   HangHangLi
 * Date:     2021/9/11 17:03
 * Description: 控制器测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mason.practice.controller;

import com.mason.practice.annotation.CostTime;
import com.mason.practice.pojo.Election;
import com.mason.practice.service.ElectionService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HangHangLi
 */
@RestController
public class HelloSpringController {

    @Resource
    ElectionService electionService;

    @GetMapping("")
    @CostTime
    @Cacheable(value = "local-cache", key="'hello_spring'")
    public String hello(){
        return "Hello, Spring!";
    }

    @GetMapping("getElectionInfo")
    @CostTime
    @Cacheable(value = "local-cache", key="'getElectionInfo'")
    public List<Election> getElectionInfo(){
        return electionService.queryElectionInfo();
    }
}
