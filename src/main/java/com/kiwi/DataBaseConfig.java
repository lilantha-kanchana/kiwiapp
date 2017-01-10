package com.kiwi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import javax.sql.DataSource;

/**
 * Created by malithi on 12/26/16.
 */
////BELOW IS CREATED FOR EMBEDED H2 DB
//@Configuration
//class DataBaseConfig {
//    @Bean
//    public DataSource dataSource(){
//        System.out.println(" hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
//        return new EmbeddedDatabaseBuilder()
//                    .setType(EmbeddedDatabaseType.H2)
//                    .setName("STOCK_DB")
//                    .addScripts("schema.sql","data.sql")
//                    .build();
//
//    }
//
//}
