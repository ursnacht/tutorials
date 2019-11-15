package ch.glue.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
public class Application {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${eureka.instance.instance-id}")
    private String instance;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

// mvn package
// java -Dspring.profiles.active=node2 -jar target/application-service-1.0.0-SNAPSHOT.jar