package com.bendouthwaite.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@PropertySource(value={"application.properties"})
public class DatabaseConfig {

    @Autowired
    private Environment env;

    @Bean
    public DataSource getDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(env.getRequiredProperty("datasource.driver"));

        dataSource.setUsername(System.getenv().get("DATASOURCE_USERNAME"));
        dataSource.setUrl(System.getenv().get("DATASOURCE_URL"));
        dataSource.setPassword(System.getenv().get("DATASOURCE_PASSWORD"));

        return dataSource;
    }

}
