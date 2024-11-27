package xiao.study.propertiesinject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import xiao.study.propertiesinject.demos.web.config.Properties;

@SpringBootApplication
@EnableConfigurationProperties(Properties.class)
public class PropertiesInjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertiesInjectApplication.class, args);
    }

}
