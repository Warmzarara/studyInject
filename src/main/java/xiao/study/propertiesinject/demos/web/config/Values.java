package xiao.study.propertiesinject.demos.web.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Values {
    @Value("${word.fst}")
    private String fst;

    @Value("${word.sec}")
    private String sec;
}
