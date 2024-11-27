package xiao.study.propertiesinject.demos.web.service.impl;

import org.springframework.stereotype.Service;
import xiao.study.propertiesinject.demos.web.config.Values;
import xiao.study.propertiesinject.demos.web.service.ValueInject;

import javax.annotation.Resource;
@Service
public class ValueInjectImpl implements ValueInject {
    @Resource
    private Values values;

    @Override
    public void inject() {
        try {
            System.out.println(values.getFst()+values.getSec());
            System.out.println("Value注入成功");
        } catch (Exception e) {
            System.out.println("Value注入失败");
            throw new RuntimeException(e);
        }
    }
}
