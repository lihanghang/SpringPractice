/*
 * Copyright (C), 2019-2021, XXX
 * FileName: ElectionService
 * Author:   HangHangLi
 * Date:     2021/9/12 20:11
 * Description: 选举人
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mason.practice.service;

import com.mason.practice.dao.ElectionBasicInfoDao;
import com.mason.practice.pojo.Election;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ElectionService {

    @Resource
    private ElectionBasicInfoDao electionBasicInfoDao;

    public List<Election> queryElectionInfo() {
        return electionBasicInfoDao.queryElectionInfo();
    }
}
