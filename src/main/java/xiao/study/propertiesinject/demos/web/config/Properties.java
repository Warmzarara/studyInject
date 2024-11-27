package xiao.study.propertiesinject.demos.web.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "word")
@Data
public class Properties {
    private String fst;
    private String sec;
}
