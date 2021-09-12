# Spring Practice Demo Project
> Spring framework practice。基于Spring框架完成一些有趣的事情。
> start date: 20210401
## Get Start
1. DownLoad Project Code
```$xslt
git clone https://github.com/lihanghang/SpringPractice.git
```
2. How to run project?
- use mvnw or mvnw.cmd file to execute the following command:
    + Windows(Mac OS): mvnw.cmd(mvnw) -N io.takari:maven:wrapper

## 基于Drools的规则引擎
1. 官网学习：https://www.drools.org/
2. Drools 使用7.54.0.Final版本
3. 和SpringBoot 2.3.11.Release进行整合

## jar包应用
1. Using ehcache 3.8
2. Using Logback
3. Using MySQL 5.7.28
4. Using hikari

## 基本命令
1. DB
```mysql
CREATE DATABASE DB_NAME CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```
```mysql
GRANT ALL PRIVILEGES ON *.* TO 'USER_NAME'@'localhost' IDENTIFIED BY 'PASS_WORD';
```
## ref
1. 习惯linux命令可将Terminal替换为 bash。
    - settings-->tools-->Terminal-->shell path 路径变为bash.exe的位置
    - 注意：git-bash.exe是弹框出来的终端；bash.exe可内嵌到idea的Terminal中
2. 

---
Author: LiHangHang
Update: 2021-09-11
