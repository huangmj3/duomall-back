package com.huangmaojie.duomall.user.config;//package com.huangmaojie.duomall.user.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
///**
// * @author huangmaojie
// * @date 2020/3/3
// */
//@Configuration
//@EnableTransactionManagement
//@AutoConfigureAfter({DruidConfig.class})
//@MapperScan("com.huangmaojie.duomall.user.mapper")
//public class DataSourceConfig {
//
//    @Autowired
//    private DataSource dataSource;
//
//    /**
//     * 事务管理器
//     */
////    @Bean(name = "transactionManager")
////    public DataSourceTransactionManager transactionManager() {
////        System.out.println("事物管理器创建");
////        return new DataSourceTransactionManager(dataSource);
////    }
//
//    /**
//     * SqlSessionFactory用dataSource中提供的参数来构ø建工厂类，因为工厂需要根据url,
//     * 用户名,密码等信息用于连接数据库，并且设置一些连接池属性
//     */
//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
//        System.out.println("SqlSession工厂创建");
//        return bean.getObject();
//    }
//
//    /**
//     * 提供一个线程安全的SqlSession接口
//     */
////    @Bean(name = "sqlSessionTemplate")
////    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
////        System.out.println("线程安全的SqlSession接口创建");
////        return new SqlSessionTemplate(sqlSessionFactory);
////    }
//}
