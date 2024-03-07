package com.PT.config;

import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration  // 환경 설정 관련 Class 임을 명시
@EnableConfigurationProperties(BatchProperties.class)
public class BatchConfig {
}