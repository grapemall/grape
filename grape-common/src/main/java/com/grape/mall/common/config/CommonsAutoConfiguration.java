package com.grape.mall.common.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.grape.mall.common.handlers.OperationTimeMetaObjectHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonsAutoConfiguration {

    @Bean
    public MetaObjectHandler operationTimeMetaObjectHandler() {
        return new OperationTimeMetaObjectHandler();
    }

}
