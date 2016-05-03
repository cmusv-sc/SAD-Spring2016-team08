# MicroService

### Linkes:
1.weather service: http://localhost:8040/weather?zip=44411

2.book service: http://localhost:8050/book?bibkeys=0451526538

3.movie service: http://localhost:8060/movie?movie=batman

#### to run:
* 1. go to each service folder (need to start eureka serivice so others can run)
* 2. mvn install
* 3. mvn spring-boot:run

#### to add a service:
* 1.copy the weatherService folder
* 2.change the names and logic in Controller
* 3.change the port in resources\application.yml for this package
* 4 done!



