package pl.com.ergosoft.spring.webAppSecure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.Properties;

@SpringBootApplication
public class WebAppSecureApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppSecureApplication.class, args);
	}

	@Bean
	public UserDetailsService userDetailsRepository() {
		final Properties users = new Properties();
		users.put("user","pass,ROLE_USER,enabled");
		return new InMemoryUserDetailsManager(users);
	}
}
