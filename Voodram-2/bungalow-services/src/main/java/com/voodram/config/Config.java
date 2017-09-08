package com.voodram.config;


import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.voodram.util.RegionConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class Config {

    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient(RegionConstants.HOST_NAME,RegionConstants.PORT);
    }


    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), RegionConstants.DATABASE_NAME);
    }
}
