package MyResftfullApp.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@SpringBootApplication
//@ComponentScan(basePackages="MyResftfullApp")
@SpringBootApplication(scanBasePackages = "MyResftfullApp.controller")
@EntityScan(basePackages = "MyResftfullApp.controller")
@EnableWebMvc
public class VirtualMindApplication extends WebMvcAutoConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(VirtualMindApplication.class, args);
	}
}
