package com.dxl.mg.config;

import cn.dev33.satoken.spring.SaBeanInject;
import cn.dev33.satoken.spring.SaBeanRegister;
import cn.dev33.satoken.spring.oauth2.SaOAuth2BeanInject;
import cn.dev33.satoken.spring.oauth2.SaOAuth2BeanRegister;
import cn.dev33.satoken.spring.sso.SaSsoBeanInject;
import cn.dev33.satoken.spring.sso.SaSsoBeanRegister;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude = {
        SaBeanRegister.class
        , SaBeanInject.class
        , SaSsoBeanRegister.class
        , SaSsoBeanInject.class
        , SaOAuth2BeanRegister.class
        , SaOAuth2BeanInject.class
})
public class SaTokenConfig {
}
