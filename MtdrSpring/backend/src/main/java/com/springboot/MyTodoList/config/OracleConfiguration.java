package com.springboot.MyTodoList.config;


import oracle.jdbc.pool.OracleDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class OracleConfiguration {
    Logger logger = LoggerFactory.getLogger(DbSettings.class);
    @Autowired
    private DbSettings dbSettings;
    @Autowired
    private K8DbSettings k8DbSettings;
    @Bean
    public DataSource dataSource() throws SQLException{
        OracleDataSource ds = new OracleDataSource();
//        ds.setDriverType(k8DbSettings.getDriver_class_name());
//        logger.info("Using Driver " + k8DbSettings.getDriver_class_name());
//        ds.setURL(k8DbSettings.getDb_url());
//        logger.info("Using URL " + k8DbSettings.getDb_url());
//        ds.setUser(k8DbSettings.getDb_user());
//        logger.info("Using User " + k8DbSettings.getDb_user());
//        ds.setPassword(k8DbSettings.getDbpassword());
//        logger.info("Using password " + k8DbSettings.getDbpassword());
        ds.setDriverType(dbSettings.getDriver_class_name());
        logger.info("Using Driver " + dbSettings.getDriver_class_name());
        ds.setURL(dbSettings.getUrl());
        logger.info("Using URL: " + dbSettings.getUrl());
        ds.setUser(dbSettings.getUsername());
        logger.info("Using Username: " + dbSettings.getUsername());
        ds.setPassword(dbSettings.getPassword());
        logger.info("Using Password: " + dbSettings.getPassword());
        return ds;
    }

}
