package com.mycompany.ghhrkapp1.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.mycompany.ghhrkapp1.entity"})
@EnableJpaRepositories(basePackages = {"com.mycompany.ghhrkapp1.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
