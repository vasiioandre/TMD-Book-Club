package com.endava.tmd.tmdbookclub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TmdBookClubApplication {

    public static void main(String[] args) {

        SpringApplication.run(TmdBookClubApplication.class, args);
        System.out.println("Yaas!");
    }

}
