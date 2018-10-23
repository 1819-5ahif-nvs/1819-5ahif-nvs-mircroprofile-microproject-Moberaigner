#Erstes Microprofile-Programm für Thorntail

* Thorntail auf thorntail.io generieren

* Thorntail Plugin in pom.xml:
```
 <plugins>
   <plugin>
     <groupId>io.thorntail</groupId>
    <artifactId>thorntail-maven-plugin</artifactId>
     <version>${version.thorntail}</version>     
     <executions>
      <execution>
        <id>package</id>
        <goals>
          <goal>package</goal>
        </goals>
      </execution>
    </executions>
  </plugin>
</plugins>
```

* dependencies
```
<dependencies>
    <dependency>
      <groupId>org.jboss.spec.javax.ws.rs</groupId>
      <artifactId>jboss-jaxrs-api_2.0_spec</artifactId>
      <version>${version.jaxrs-api}</version>
      <scope>provided</scope>
    </dependency>
</dependencies>
<dependency>
    <groupid>io.thorntail</groupId>
    <artifactId>jpa</artifactId>
    <version>${version.thorntail}</version>
</dependency>
<dependency>
    <groupid>io.thorntail</groupId>
    <artifactId>undertow</artifactId>
    <version>${version.thorntail}</version>
</dependency>
 <dependency>
      <groupId>org.hibernate.javax.persistence</groupId>
      <artifactId>hibernate-jpa-2.1-api</artifactId>
      <version>1.0.0.Final</version>
</dependency>
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.5</version>
</dependency>
```


* derby-maven-plugin:
>wird benötigt, um Derby db beim ausführen des Programms lokal zu starten 
  ```
<plugin>
  <groupId>org.carlspring.maven</groupId>
  <artifactId>derby-maven-plugin</artifactId>
  <version>1.10</version>
  <executions>
    <execution>
      <id>start-derby</id>
      <phase>pre-integration-test</phase>
      <goals>
        <goal>start</goal>
      </goals>
    </execution>
    <execution>
      <id>stop-derby</id>
      <phase>post-integration-test</phase>
      <goals>
        <goal>stop</goal>
      </goals>
    </execution>
  </executions>
</plugin>
```

##Projekt builden
>mvn package

##Projekt starten
>java -jar ./target/zoo-thorntail.jar

##execute Dockerfile
>docker build -t airhacks/derbydb .

URL:
http://localhost:8080/rs/pets
http://localhost:8080/rs/zookeeper
