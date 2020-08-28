package com.backbase.stream.product.sink;

import com.backbase.stream.config.BackbaseStreamConfigurationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Slf4j
@SpringBootApplication
@EnableConfigurationProperties({BackbaseStreamConfigurationProperties.class})
public class ProductSinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductSinkApplication.class, args);
    }

}
