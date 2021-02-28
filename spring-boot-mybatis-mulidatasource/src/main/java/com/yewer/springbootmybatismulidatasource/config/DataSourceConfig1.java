package com.yewer.springbootmybatismulidatasource.config;

import javax.sql.DataSource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = "com.yewer.springbootmybatismulidatasource.mapper.ds1", sqlSessionFactoryRef = "ds1SqlSessionFactory")
public class DataSourceConfig1 {

    @Bean(name = "DS1")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.ds1")
    public DataSource getDataSource() {
        //return DataSourceBuilder.create().build();
        return DruidDataSourceBuilder.create().build();

    }

    @Bean(name = "ds1SqlSessionFactory")
    @Primary
    public SqlSessionFactory getDs1SqlSessionFactory(@Qualifier("DS1") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:*/mapper/ds1/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "ds1SqlSessionTemplate")
    @Primary
    public SqlSessionTemplate getDs1SqlSessionTemplate(
            @Qualifier("ds1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name = "ds1TransactionManager")
    @Primary
    public DataSourceTransactionManager getTransactionManager(@Qualifier("DS1") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
