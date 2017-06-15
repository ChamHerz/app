package MyResftfullApp.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="MyResftfullApp")
public class VirtualMindApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualMindApplication.class, args);
	}
}
