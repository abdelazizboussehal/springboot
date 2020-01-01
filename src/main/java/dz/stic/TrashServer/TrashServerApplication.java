package dz.stic.TrashServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Collections;


@SpringBootApplication
@EnableJpaAuditing
public class TrashServerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TrashServerApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "9090"));
		app.run(args);
	}


}
