/**
 * Copyright (C), 2019-2021, XXX
 * FileName: CacheEventLogger
 * Author:   hanghangli
 * Date:     2021/9/11 19:46
 * Description: ehcache config class
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mason.practice.config;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author hanghangli
 */
public class CacheEventLogger implements CacheEventListener<Object, Object> {
    private final static Logger logger = LoggerFactory.getLogger(CacheEventLogger.class);

    @Override
    public void onEvent(CacheEvent<? extends Object, ? extends Object> cacheEvent) {

        logger.info("\n Cache Key: {} \n Old value: {}\n New value: {}", cacheEvent.getKey(), cacheEvent.getOldValue(),
                cacheEvent.getNewValue());
    }
}
