package edu.victorlamas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {
		"edu.victorlamas.config",
		"edu.victorlamas.controller",
		"edu.victorlamas.models",
		"edu.victorlamas.services",
})
@EnableMongoRepositories(basePackages = "edu.victorlamas.repositories")
public class ChatApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}
}