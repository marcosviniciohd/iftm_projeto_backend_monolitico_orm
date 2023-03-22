package com.iftm.api.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
@RequestMapping("/api/")
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@GetMapping
	public String helloworld(){
		return "Hello World";
	}

	@GetMapping("mars")
	public String hellomars(){
		return "Hello Mars";
	}

	@GetMapping("moon")
	public String hellomoon(){
		return "Hello Moon";
	}

	@GetMapping("alunos")
	public List<Aluno> getAlunos(){
		var listaDeAlunos = new ArrayList<Aluno>();
		listaDeAlunos.add(new Aluno("Antonio", 27));
		listaDeAlunos.add(new Aluno("Maria", 32));
		listaDeAlunos.add(new Aluno("João", 42));
		return listaDeAlunos;
	}

	@PostMapping("aluno")
	public Aluno saveAluno(@RequestBody Aluno aluno){
		Logger logger = Logger.getLogger(
				HelloworldApplication.class.getName());
		logger.info("Aluno recebido: \n" + aluno.toString());
		return aluno;
	}

}
