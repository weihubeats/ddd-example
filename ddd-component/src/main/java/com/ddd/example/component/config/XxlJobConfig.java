package com.ddd.example.component.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author : wh
 * @date : 2025/5/8
 * @description:
 */
@Configuration
@ComponentScan(basePackages = "com.ddd.example.app.task")
@Profile("!dev")
public class XxlJobConfig {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${xxl-job.admin.address}")
    private String adminAddress;

    @Value("${xxl-job.admin.logRetentionDays}")
    private Integer logRetentionDays;

    @Value("${xxl-job.admin.logPath}")
    private String logPath;

    @Bean(destroyMethod = "destroy")
    public XxlJobSpringExecutor xxlJobExecutor() {
        XxlJobSpringExecutor xxlJobExecutor = new XxlJobSpringExecutor();
        xxlJobExecutor.setAdminAddresses(adminAddress);
        xxlJobExecutor.setAppname(appName);
        xxlJobExecutor.setLogPath(logPath);
        xxlJobExecutor.setLogRetentionDays(logRetentionDays);
        return xxlJobExecutor;
    }
    
}
