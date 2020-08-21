package org.mohajer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class MohajerApplication {

	@Bean
	CommandLineRunner test(){
		return args -> {
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(MohajerApplication.class, args);
	}

}
