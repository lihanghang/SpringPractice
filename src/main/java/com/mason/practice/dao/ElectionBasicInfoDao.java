/*
  Copyright (C), 2019-2021, XXX
  FileName: ElectionBasicInfo
  Author:   HangHangLi
  Date:     2021/9/12 20:02
  Description: 选举人基本信息获取
  History:
  <author>          <time>          <version>          <desc>
  作者姓名           修改时间           版本号              描述
 */
package com.mason.practice.dao;

import com.mason.practice.pojo.Election;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ElectionBasicInfoDao {
    List<Election> queryElectionInfo();
}

