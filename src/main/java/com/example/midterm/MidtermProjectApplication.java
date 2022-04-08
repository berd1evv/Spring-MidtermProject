package com.example.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class MidtermProjectApplication {
	@Autowired
	private StudentsRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(MidtermProjectApplication.class, args);
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("students", repo.findAll());
		return "index";
	}

}
