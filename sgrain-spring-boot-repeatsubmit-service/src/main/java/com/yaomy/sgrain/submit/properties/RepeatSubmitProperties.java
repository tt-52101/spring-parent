package com.yaomy.sgrain.submit.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: spring-parent
 * @description: 重复提交属性配置类
 * @author: 姚明洋
 * @create: 2020/03/26
 */
@ConfigurationProperties(prefix = "spring.sgrain.repeat-submit")
public class RepeatSubmitProperties {
    private boolean enable = true;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
