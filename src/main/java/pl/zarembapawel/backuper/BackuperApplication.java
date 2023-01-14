package pl.zarembapawel.backuper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackuperApplication {

	static Logger logger = LoggerFactory.getLogger(BackuperApplication.class);

	public static void main(String[] args) {
		logger.info("Hello");
		SpringApplication.run(BackuperApplication.class, args);
	}

}
