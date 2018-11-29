//package com.jeff.template.config;
//
//import io.shardingjdbc.core.api.ShardingDataSourceFactory;
//import io.shardingjdbc.core.api.config.ShardingRuleConfiguration;
//import io.shardingjdbc.core.api.config.TableRuleConfiguration;
//import io.shardingjdbc.core.api.config.strategy.InlineShardingStrategyConfiguration;
//import io.shardingjdbc.core.constant.ShardingPropertiesConstant;
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
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//import java.util.concurrent.ConcurrentHashMap;
//
////@Configuration
////@MapperScan("com.jeff.template.mapper")
//public class DataSourceShardingConfig {
//
////    @Bean(name = "datasource")
////    public DataSource dataSourceMaster(){
////        BasicDataSource dataSource = new BasicDataSource();
////        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
////        dataSource.setUrl("jdbc:mysql://localhost:3306/db_user?characterEncoding=utf8");
////        dataSource.setPassword("root");
////        dataSource.setUsername("root");
////        dataSource.setMaxIdle(2);
////        dataSource.setMaxActive(20);
////        dataSource.setMaxWait(1000);
////        dataSource.setInitialSize(2);
////
////        dataSource.setValidationQuery("SELECT 1");
////        dataSource.setRemoveAbandoned(true);
////        dataSource.setTestWhileIdle(true);
////        dataSource.setTimeBetweenEvictionRunsMillis(30000);
////        dataSource.setNumTestsPerEvictionRun(30);
////        dataSource.setMinEvictableIdleTimeMillis(1800000);
////        return dataSource;
////    }
//
//    @Bean(name = "datasource")
//    public DataSource DataSourceSlaveSharding() throws Exception{
//        // 配置真实数据源
//        Map<String, DataSource> dataSourceMap = new HashMap<>();
//
//        // 配置第一个数据源
//        BasicDataSource dataSource1 = new BasicDataSource();
//        dataSource1.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource1.setUrl("jdbc:mysql://localhost:3306/demo_ds_master_0");
//        dataSource1.setUsername("root");
//        dataSource1.setPassword("root");
//        dataSourceMap.put("ds0", dataSource1);
//
//        // 配置第二个数据源
//        BasicDataSource dataSource2 = new BasicDataSource();
//        dataSource2.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource2.setUrl("jdbc:mysql://localhost:3306/demo_ds_master_1");
//        dataSource2.setUsername("root");
//        dataSource2.setPassword("root");
//        dataSourceMap.put("ds1", dataSource2);
//
//        // 配置Order表规则
//        TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration();
//        orderTableRuleConfig.setLogicTable("t_order");
//        orderTableRuleConfig.setActualDataNodes("ds${0..1}.t_order_${0..1}");
//
//        // 配置分库 + 分表策略
//        orderTableRuleConfig.setDatabaseShardingStrategyConfig(new InlineShardingStrategyConfiguration("id", "ds${id % 2}"));
//        orderTableRuleConfig.setTableShardingStrategyConfig(new InlineShardingStrategyConfiguration("id", "t_order_${id % 2}"));
//        // 配置分片规则
//        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
//        shardingRuleConfig.getTableRuleConfigs().add(orderTableRuleConfig);
//        Properties properties = new Properties();
//        properties.setProperty(ShardingPropertiesConstant.SQL_SHOW.getKey(), "true");
//        // 获取数据源对象
//        DataSource dataSource = ShardingDataSourceFactory.createDataSource(dataSourceMap, shardingRuleConfig, new ConcurrentHashMap(), properties);
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
