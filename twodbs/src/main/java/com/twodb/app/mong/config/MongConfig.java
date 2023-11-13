package com.twodb.app.mong.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
//
//import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import jakarta.persistence.EntityManagerFactory;

//@PropertySource({ "classpath:application.properties" })
@EnableTransactionManagement
@Configuration
@EnableJpaRepositories(
    basePackages = {"com.twodb.app.mong.Entity"}, 
    entityManagerFactoryRef = "userEntityManager", 
    transactionManagerRef = "userTransactionManager"
)
public class MongConfig {
    @Autowired
    private Environment env;

  
    
    @Bean
    LocalContainerEntityManagerFactoryBean userEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(userDataSource());
        em.setPackagesToScan(
          new String[] { "com.twodb.app.mong.Entity" });

        HibernateJpaVendorAdapter vendorAdapter= new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",
          env.getProperty("spring.mysql.jpa.hibernate.ddl-auto"));
        properties.put("hibernate.dialect",
          env.getProperty("spring.jpa.properties.hibernate.dialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }

    
    @Bean
    DataSource userDataSource() {
 
        DriverManagerDataSource dataSource= new DriverManagerDataSource();
        dataSource.setDriverClassName(
          env.getProperty("spring.mysql.datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.mysql.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.mysql.datasource.user"));
        dataSource.setPassword(env.getProperty("spring.mysql.datasource.pass"));

        return dataSource;
    }

    
    @Bean
    PlatformTransactionManager userTransactionManager() {
 
        JpaTransactionManager transactionManager= new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
          userEntityManager().getObject());
        return transactionManager;
    }
}