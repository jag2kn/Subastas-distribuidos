### Servidor de subastas

Servidor realizado sobre Reactor para peticiones de diferentes clientes


Ejemplo de peticiones

Realizar login con el usuario Pepe

 localhost:9955/login/Pepe

Ver el estado actual de la subasta

 localhost:9955/estado
 
Realizar una oferta en la subasta del usuario Pepe por 500

 localhost:9955/ofertar/500/Pepe


### Para compilar:

 mvn clean compile

### Para correr:

 mvn exec:java -Dexec.mainClass="com.github.pk11.rnio.HttpServer"



Luego visitar: `http://localhost:9955`
