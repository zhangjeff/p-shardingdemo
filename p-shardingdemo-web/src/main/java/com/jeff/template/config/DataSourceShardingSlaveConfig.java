//package com.jeff.template.config;
//
//import org.apache.commons.dbcp.BasicDataSource;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.core.io.support.ResourcePatternResolver;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
////@Configuration
//@MapperScan("com.jeff.template.mapper")
//public class DataSourceShardingSlaveConfig {
//    public DataSource dataSourceMaster0() {
//        BasicDataSource result = new BasicDataSource();
//        result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
//        result.setUrl("jdbc:mysql://localhost:3306/demo_ds_master_0?useSSL=false");
//        result.setUsername("root");
//        result.setPassword("root");
//        return result;
//    }
//
//    public DataSource dataSourceSlave0() {
//        BasicDataSource result = new BasicDataSource();
//        result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
//        result.setUrl("jdbc:mysql://localhost:3306/demo_ds_master_0_slave_0?useSSL=false");
//        result.setUsername("root");
//        result.setPassword("root");
//        return result;
//    }
//
//    public DataSource dataSourceMaster1() {
//        BasicDataSource result = new BasicDataSource();
//        result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
//        result.setUrl("jdbc:mysql://localhost:3306/demo_ds_master_1?useSSL=false");
//        result.setUsername("root");
//        result.setPassword("root");
//        return result;
//    }
//
//
//    public DataSource dataSourceSlave1() {
//        BasicDataSource result = new BasicDataSource();
//        result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
//        result.setUrl("jdbc:mysql://localhost:3306/demo_ds_master_1_slave_1?useSSL=false");
//        result.setUsername("root");
//        result.setPassword("root");
//        return result;
//    }
//
//    public Map<String, DataSource> getDataSourceMap() {
//        Map<String, DataSource> dataSourceMap = new HashMap<>(2, 1);
//
//        dataSourceMap.put("tx_order_master_0", dataSourceMaster0());
//        dataSourceMap.put("tx_order_master_1", dataSourceMaster1());
//        dataSourceMap.put("tx_order_slave_0", dataSourceSlave0());
//        dataSourceMap.put("tx_order_slave_1", dataSourceSlave1());
//        return dataSourceMap;
//    }
//
//
////    @Bean(name = "shardingDataSource")
////    public DataSource getShardingDataSource() throws SQLException, IOException {
////
////
////        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
////        shardingRuleConfig.setDefaultDataSourceName("tx_order_1");
////        shardingRuleConfig.getTableRuleConfigs().addAll(getTableRuleConfigurations());
////
////
////        // 构建读写分离配置
////        MasterSlaveRuleConfiguration masterSlaveRuleConfig0 = new MasterSlaveRuleConfiguration();
////        masterSlaveRuleConfig0.setName("tx_order_0");
////        masterSlaveRuleConfig0.setMasterDataSourceName("tx_order_master_0");
////        masterSlaveRuleConfig0.getSlaveDataSourceNames().add("tx_order_slave_0");
////
////        MasterSlaveRuleConfiguration masterSlaveRuleConfig1 = new MasterSlaveRuleConfiguration();
////        masterSlaveRuleConfig1.setName("tx_order_1");
////        masterSlaveRuleConfig1.setMasterDataSourceName("tx_order_master_1");
////        masterSlaveRuleConfig1.getSlaveDataSourceNames().add("tx_order_slave_1");
////
////        shardingRuleConfig.getMasterSlaveRuleConfigs().add(masterSlaveRuleConfig0);
////        shardingRuleConfig.getMasterSlaveRuleConfigs().add(masterSlaveRuleConfig1);
////
////        shardingRuleConfig.getBindingTableGroups().add(SHARDING_TABELS + "," + INDEP_TABELS);
//////        shardingRuleConfig.setDefaultDatabaseShardingStrategyConfig(new StandardShardingStrategyConfiguration("channel", PreciseDatabaseShardingAlgorithm.class.getName()));
//////        shardingRuleConfig.setDefaultTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("channel", PreciseTableShardingAlgorithm.class.getName()));
////
////
////        Properties props = new Properties();
////        props.setProperty(ShardingPropertiesConstant.SQL_SHOW.getKey(), "true");
////
////        return ShardingDataSourceFactory.createDataSource(getDataSourceMap(), shardingRuleConfig, new HashMap<String, Object>(), props);
//    }
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
////    private List<TableRuleConfiguration> getTableRuleConfigurations() {
////        List<TableRuleConfiguration> tableRuleConfigurations = new ArrayList<>();
////
////        for (String s : SHARDING_TABELS.split(",")) {
////            TableRuleConfiguration table = new TableRuleConfiguration();
////            table.setLogicTable(s);
////            table.setActualDataNodes("tx_order_${0..1}." + s + "_${[0, 1]}");
////            table.setDatabaseShardingStrategyConfig(new StandardShardingStrategyConfiguration("channel", PreciseDatabaseShardingAlgorithm.class.getName()));
////            table.setTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("channel", PreciseTableShardingAlgorithm.class.getName()));
//////            if (!"t_order".equals(s)) {
//////                table.setKeyGeneratorColumnName("id");
//////            }
////            tableRuleConfigurations.add(table);
////        }
////        for (String s : INDEP_TABELS.split(",")) {
////            TableRuleConfiguration table = new TableRuleConfiguration();
////            table.setLogicTable(s);
////            table.setActualDataNodes("tx_order_${0}." + s + "_${[0]}");
//////            table.setKeyGeneratorColumnName("id");
////            tableRuleConfigurations.add(table);
////        }
////
////
////        return tableRuleConfigurations;
////    }
//
//    private static final String SHARDING_TABELS = "t_cancel_payment_log,t_order_item";
//    private static final String INDEP_TABELS = "t_order";
//}
