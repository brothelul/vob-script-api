package com.mosesc.vobscriptapi.configurer;

import com.mosesc.vobscriptapi.interceptor.WebInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @auther mosesc
 * @date 12/14/18.
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebInterceptor());
        super.addInterceptors(registry);
    }
}
