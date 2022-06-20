package com.github.cookieandcoke.guide.config;

import com.github.cookieandcoke.guide.servlet.HelloServlet;
import com.github.cookieandcoke.guide.servlet.WelcomeServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean<HelloServlet> helloServlet() {
        ServletRegistrationBean<HelloServlet> servlet =
                new ServletRegistrationBean<>(new HelloServlet(), "/servlet/hello");
        servlet.setLoadOnStartup(1);
        return servlet;
    }

    @Bean
    public ServletRegistrationBean<WelcomeServlet> welcomeServlet() {
        ServletRegistrationBean<WelcomeServlet> servlet =
                new ServletRegistrationBean<>(new WelcomeServlet(), "/servlet/welcome");
        servlet.setLoadOnStartup(1);
        return servlet;
    }
}
