package com.pch.circulardependency.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

//    @Bean
//    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> cookieProcessorCustomizer() {
//        return (factory) -> factory.addContextCustomizers(
//                (context) -> context.setCookieProcessor(new LegacyCookieProcessor()));
//    }

    @Autowired
    private CustomBean customBean;

    @Bean
    public CustomBean customBean(){
        return new CustomBean("Pavlo", "Chechehov");
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        CustomBean custom = context.getBeanFactory().getBean(CustomBean.class);
        System.out.println("custom = " + custom);
        context.close();
//        new AnnotationConfigApplicationContext("com.pch.circulardependency.demo");
    }

}
