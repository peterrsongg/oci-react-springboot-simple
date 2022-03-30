package com.springboot.MyTodoList.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spec.template.spec.containers.env.name")
public class K8DbSettings {
    private String database_name;
    private String database_url;
    private String driver_class_name;
    private String dbpassword;


    public String getDbpassword() {
        return dbpassword;
    }

    public void setDbpassword(String dbpassword) {
        this.dbpassword = dbpassword;
    }


    public String getDatabase_name() {
        return database_name;
    }

    public void setDatabase_name(String database_name) {
        this.database_name = database_name;
    }

    public String getDatabase_url() {
        return database_url;
    }

    public void setDatabase_url(String database_url) {
        this.database_url = database_url;
    }

    public String getDriver_class_name() {
        return driver_class_name;
    }

    public void setDriver_class_name(String driver_class_name) {
        this.driver_class_name = driver_class_name;
    }






}
