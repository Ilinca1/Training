package com.endava.training;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.MappingException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ivamesu on 8/2/2016.
 */
@Configuration
public class Config {
    @Bean
    public Mapper getMapper() {
        return new DozerBeanMapper();
    }
}
