# Spring Boot Cloud

## Ports

| Service               | Port   |
| --------------------- | ------ |
| frontend-edge-service | 18100  |
| application-service   | 18110  |
| appl-edge-service     | 18200  |
| soap-service          | 18210  |
| registry-service      | 18300  |
| admin-service         | 18400  |

## Links
* Spring Boot Admin: [http://localhost:18400](http://localhost:18400)
* Registy / Netflix Eureka: [http://localhost:18300](http://localhost:18300)
* Rest 
     * via frontend-edge-service: [http://localhost:18100/api/greeting](http://localhost:18100/api/greeting)
     * direkt: [http://localhost:18110/greeting](http://localhost:18110/greeting)
* WSDL
     * via appl-edge-service: [http://localhost:18200/soap/countries.wsdl](http://localhost:18200/soap/countries.wsdl)
     * direkt: [http://localhost:18210/soap/countries.wsdl](http://localhost:18210/soap/countries.wsdl)

## Builden

Im Parentverzeichnis oder in den einzelnen Moduln:

    mvn package

## Starten

Im Modul:

    java -jar target/...-service-1.0.0-SNAPSHOT.jar
    
### mit Profil

    java -Dspring.profiles.active=node1 -jar target/application-service-1.0.0-SNAPSHOT.jar
    java -Dspring.profiles.active=node2 -jar target/application-service-1.0.0-SNAPSHOT.jar
    
## SOAP-Test

Slash am Ende ist wichtig!

    curl --header "content-type: text/xml" -d @test/request-spain.xml http://localhost:18200/soap/
    
