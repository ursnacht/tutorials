package ch.glue.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableEurekaServer
public class EurekaServerApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
    
    // Erlaubt es Spring Boot Admin auf die Konfiguration des Registry Services zuzugreifen
    @Configuration
    public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().anyRequest().permitAll()  
                .and().csrf().disable();
        }
    }
}
