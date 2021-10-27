package com.batista.fabio.testemc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.batista.fabio.testemc.domain.Categoria;
import com.batista.fabio.testemc.domain.Produto;
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
		
		Produto p1 = new Produto(1, "Computador", 2000.00);
		Produto p2 = new Produto(2, "Impressora", 800.00);
		Produto p3 = new Produto(3, "Mouse", 80.00);
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
	
	

}
