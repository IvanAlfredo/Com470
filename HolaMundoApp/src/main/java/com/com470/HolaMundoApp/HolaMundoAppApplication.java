package com.com470.HolaMundoApp;

import com.com470.HolaMundoApp.model.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaMundoAppApplication.class, args);
                //Primitivos
                int a=5;
                int b=5;
                System.out.println("Primitivo-->"+(a==b));
                
                //Objetos
                Persona personaA = new Persona("Juan", "Perez");
                Persona personaB = new Persona("Juan", "Perez");
                System.out.println("Objetos-->"+(personaA.equals(personaB)));
	}

}
