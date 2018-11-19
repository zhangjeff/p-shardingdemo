//package com.jeff.template.config;
//
//import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
//import io.shardingjdbc.core.api.ShardingDataSourceFactory;
//import io.shardingjdbc.core.api.config.MasterSlaveRuleConfiguration;
//import io.shardingjdbc.core.api.config.ShardingRuleConfiguration;
//import io.shardingjdbc.core.api.config.TableRuleConfiguration;
//import io.shardingjdbc.core.api.config.strategy.InlineShardingStrategyConfiguration;
//import org.apache.commons.dbcp.BasicDataSource;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.core.io.support.ResourcePatternResolver;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//import java.util.concurrent.ConcurrentHashMap;
//
//@Configuration
//@MapperScan("com.jeff.template.mapper")
//public class DataSourceShardingSlaveConfig {
//
//    @Bean(name = "datasource")
//    public DataSource DataSourceSlaveSharding() throws Exception{
//        Map<String, DataSource> dataSourceMap = new HashMap<>();
//
//        // 配置主库
//        BasicDataSource masterDataSource = new BasicDataSource();
//        masterDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        masterDataSource.setUrl("jdbc:mysql://localhost:3306/ds_master");
//        masterDataSource.setUsername("root");
//        masterDataSource.setPassword("");
//        dataSourceMap.put("ds_master", masterDataSource);
//
//        // 配置第一个从库
//        BasicDataSource slaveDataSource1 = new BasicDataSource();
//        slaveDataSource1.setDriverClassName("com.mysql.jdbc.Driver");
//        slaveDataSource1.setUrl("jdbc:mysql://localhost:3306/ds_slave0");
//        slaveDataSource1.setUsername("root");
//        slaveDataSource1.setPassword("");
//        dataSourceMap.put("ds_slave0", slaveDataSource1);
//
//        // 配置第二个从库
//        BasicDataSource slaveDataSource2 = new BasicDataSource();
//        slaveDataSource2.setDriverClassName("com.mysql.jdbc.Driver");
//        slaveDataSource2.setUrl("jdbc:mysql://localhost:3306/ds_slave1");
//        slaveDataSource2.setUsername("root");
//        slaveDataSource2.setPassword("");
//        dataSourceMap.put("ds_slave1", slaveDataSource2);
//
//        // 配置读写分离规则
//        MasterSlaveRuleConfiguration masterSlaveRuleConfig = new MasterSlaveRuleConfiguration("ds_master_slave", "ds_master", Arrays.asList("ds_slave0", "ds_slave1"));
//
//        // 获取数据源对象
//        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(createDataSourceMap(), masterSlaveRuleConfig, new HashMap<String, Object>(), new Properties());
//        return dataSource;
//    }
//
//
//
//    @Bean(name = "sqlSessionFactoryBean")
//    public SqlSessionFactoryBean myGetSqlSessionFactory(DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        // mapperLocations
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        try {
//            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:sqlmapper/**/*.xml"));
//        } catch (IOException e) {
//            System.out.println("sqlSessionFactoryBean的setMapperLocations有问题");
//            e.printStackTrace();
//        }
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        return sqlSessionFactoryBean;
//    }
//
//
//}
