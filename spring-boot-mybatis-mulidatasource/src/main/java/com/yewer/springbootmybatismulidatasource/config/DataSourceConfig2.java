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
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = "com.yewer.springbootmybatismulidatasource.mapper.ds2", sqlSessionFactoryRef = "ds2SqlSessionFactory")
public class DataSourceConfig2 {

    @Bean(name = "DS2")
    @ConfigurationProperties(prefix = "spring.datasource.ds2")
    public DataSource getDataSource() {
        // return DataSourceBuilder.create().build();
        return DruidDataSourceBuilder.create().build();

    }

    @Bean(name = "ds2SqlSessionFactory")
    public SqlSessionFactory getDs2SqlSessionFactory(@Qualifier("DS2") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:*/mapper/ds2/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "ds2SqlSessionTemplate")
    public SqlSessionTemplate getDs2SqlSessionTemplate(
            @Qualifier("ds2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name = "ds2TransactionManager")
    public DataSourceTransactionManager getTransactionManager(@Qualifier("DS2") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
