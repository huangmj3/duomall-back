package com.huangmaojie.duomall.user.config;

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
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author huangmaojie
 * @date 2020/3/3
 */
@Configuration
@MapperScan("com.huangmaojie.duomall.user.mapper")
public class DataSourceConfig {

    /**
     * dataSource是用来提供数据库配置的相关信息，读取配置文件，获得相关系数
     */
    @Bean(name = "duomall")
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Primary
    public DataSource druidDataSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     *   SqlSessionFactory用dataSource中提供的参数来构建工厂类，因为工厂需要根据url,
     *   用户名,密码等信息用于连接数据库，并且设置一些连接池属性
     */
    @Bean(name = "duomallSqlSessionFactory")
    @Primary
    public SqlSessionFactory duomall1SqlSessionFactory(@Qualifier("duomall") DataSource dataSource) throws  Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    /**
     *   事务管理器
     */
    @Bean(name = "duomallTransactionManager")
    @Primary
    public DataSourceTransactionManager duomallTransactionManager(@Qualifier("duomall") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     *   提供一个线程安全的SqlSession接口
     */
    @Bean(name = "duomallSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate duomallSqlSessionTemplate(@Qualifier("duomallSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
