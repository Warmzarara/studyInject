package xiao.study.propertiesinject.demos.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiao.study.propertiesinject.demos.web.config.Properties;
import xiao.study.propertiesinject.demos.web.service.DoInject;

@Service
public class DoInjectImpl implements DoInject {
    @Autowired
    private Properties properties;
    @Override
    public void doInject() {
        try {
            System.out.println(properties.getFst()+""+properties.getSec());
            System.out.println("测试ConfigurationProperties注入成功");
        } catch (Exception e) {
            System.out.println("测试ConfigurationProperties注入失败");
            throw new RuntimeException(e);
        }

    }
}
