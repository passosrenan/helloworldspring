package br.senai.sp.cotia.hellospring.controller;

import java.sql.Connection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.sp.cotia.hellospring.dao.ConnectionFactory;


// classe substituída por servelt, que agora processa as requisições em métodos 
@Controller
public class indexController {
	
	@RequestMapping("index")
	public String index() {
		System.out.println("Passou aqui"+ConnectionFactory.conectar());
		return "index";
	}
	
}
