package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio2Application.class, args);
	}

}

/*
Requests en terminal...
	Metodo GET:
		curl -X GET -H "Accept: application/json" http://localhost:8080/persona/60160
		curl -X GET -H "Accept: application/json" http://localhost:8080/persona/
		curl -X GET -H "Accept: application/json" http://localhost:8080/domicilio/456
		curl -X GET -H "Accept: application/json" http://localhost:8080/domicilio/
	Metodo POST:
		curl -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{"calle":"Lavalle","numero":321,"localidad":"Buenos Aires","provincia":"Buenos Aires"}' http://localhost:8080/domicilio/
		curl -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{"nombre":"Mauro","apellido":"Sarmiento","codigo":60544}' http://localhost:8080/persona/
	Metodo PUT:
		curl -X PUT -H "Accept: application/json" -H "Content-Type: application/json" -d '{"calle":"Uspallata","numero":321,"localidad":"Buenos Aires","provincia":"Buenos Aires"}' http://localhost:8080/domicilio/321
		curl -X PUT -H "Accept: application/json" -H "Content-Type: application/json" -d '{"nombre":"Julian","apellido":"Castillo","codigo":60544}' http://localhost:8080/persona/60544
	Metodo DELETE:
		curl -X DELETE -H "Accept: application/json" -H "Content-Type: application/json" http://localhost:8080/domicilio/321
		curl -X DELETE -H "Accept: application/json" -H "Content-Type: application/json" http://localhost:8080/persona/60544
*/

