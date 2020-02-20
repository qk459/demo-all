package com.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@PropertySource("classpath:application-datasource.properties")
public class DruidConfig {

    /**
     *
     * 读取配置文件的三种方式
     *
     * 一、如果读取的是application.properties或者application.yml中的数据不需要进行添加@PropertySource("classpath:application-datasource.properties")
     * 变量直接用 @Value($"druid.login.user_name")来赋值
     *
     *
     * 二、如果读取的不是application.properties或者application.yml中的配置文件，需要进行
     * @PropertySource("classpath:application-datasource.properties")
     * 变量直接用 @Value("druid.login.user_name")来赋值或者用自动装配

        @Component 表示将该类标识为Bean
     *
     * @ConfigurationProperties(prefix = "demo")用于绑定属性，其中prefix表示所绑定的属性的前缀。
     *
     * @PropertySource(value = "config.properties")表示配置文件路径。
     *
     *三、通过Environment
     *
     *  （1） springBoot的启动类需要加载该配置文件，
            @PropertySource("classpath:application-datasource.yml")
     *
      *
      *     （2）实用类 Autowired
     *     private Environment environment;
     *      environment.getProperty("spring.druid.web-stat-filter.deny")
     *
     *
     *
     */
    @Value("druid.login.user_name")
    private String userName;

    @Value("druid.login.password")
    private String password;


    @Bean(name = "default_datadatasource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }


    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String, String> initParameters = new HashMap<>(3);
        // 用户名
        initParameters.put("loginUsername", userName);
        // 密码
        initParameters.put("loginPassword", password);
        // 禁用HTML页面上的“Reset All”功能
        initParameters.put("resetEnable", "false");
        servletRegistrationBean.setInitParameters(initParameters);
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

}
