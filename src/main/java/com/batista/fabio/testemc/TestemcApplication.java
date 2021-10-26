package com.batista.fabio.testemc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.batista.fabio.testemc.domain.Categoria;
import com.batista.fabio.testemc.repositories.CategoriaRepository;

@SpringBootApplication
public class TestemcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(TestemcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
	
	

}
