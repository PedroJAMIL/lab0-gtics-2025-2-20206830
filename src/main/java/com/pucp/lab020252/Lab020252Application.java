package com.pucp.lab020252;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Lab020252Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab020252Application.class, args);
        System.out.println("Hola Mundo");
		List<String> lista = List.of("Hola", "Mundo", "Frito");
		for (String item : lista) {
			System.out.println(item);
		}
		System.out.println("Creación de mascotas");

	}

}
