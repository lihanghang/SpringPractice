/**
 * Copyright (C), 2019-2021, XXX
 * FileName: CostTime
 * Author:   HangHangLi
 * Date:     2021/9/11 17:14
 * Description: 接口耗时统计
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mason.practice.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author HangHangLi
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CostTime {
}
