package com.demo.util;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/***
 * mybites配置文件
 *
 *整合分页插件
 *              <dependency>
 *             <groupId>com.github.pagehelper</groupId>
 *             <artifactId>pagehelper</artifactId>
 *             <version>4.1.0</version>
 *         </dependency>
 *
 */
@Configuration
public class PageUtil {
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper=new PageHelper();
        Properties properites=new Properties();
        properites.setProperty("offsetAsPageNum","true");

        properites.setProperty("rowBoundsWithCount","true");
        properites.setProperty("reasonable","true");
        pageHelper.setProperties(properites);
        return pageHelper;
    }


}
