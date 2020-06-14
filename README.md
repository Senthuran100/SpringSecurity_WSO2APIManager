# SpringSecurity_WSO2APIManager
Protecting the APIs in Spring boot using WSO2 API Manager as a Authorization Server.


- Start the Spring boot application using the below command by passing the client_trustsore.jks
```java
java  -Djavax.net.ssl.trustStore=wso2am-2.6.0/repository/resources/security/client-truststore.jks -Djavax.net.ssl.trustStorePassword=wso2carbon -jar target/demo-0.0.1-SNAPSHOT.jar
```


- Create an Application in the Store portal of  WSO2 API Manger.

- Then get an access token using the password grant type.
```java
curl -u AjxUhunXYYCzsCO6MeTTm9U1m0ca:UQ8Vw_k1zOLwHhNO8lF0f3SLC1Ua -k -d "grant_type=password&username=admin&password=admin" -H "Content-Type:application/x-www-form-urlencoded" https://localhost:9443/oauth2/token
```

- Then invoke the /cars API by passing the access token
```java
curl -k http://localhost:8080/cars -H "Authorization: Bearer 778548c0-e344-334b-bcb1-551dfeb3fecd"
```
