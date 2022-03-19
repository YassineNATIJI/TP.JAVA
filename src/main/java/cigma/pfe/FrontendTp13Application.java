package cigma.pfe;

import io.jsonwebtoken.Claims;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

import static cigma.pfe.config.security.JWTDemo.createJWT;
import static cigma.pfe.config.security.JWTDemo.decodeJWT;


@SpringBootApplication
public class FrontendTp13Application {

	public static void main(String[] args) {
		SpringApplication.run(FrontendTp13Application.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}