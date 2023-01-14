package pl.zarembapawel.backuper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.zarembapawel.backuper.service.BackuperService;

@SpringBootApplication
public class BackuperApplication {

	private static BackuperService backuperService;

	@Autowired
	public BackuperApplication(BackuperService backuperService) {
		BackuperApplication.backuperService = backuperService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BackuperApplication.class, args);
		backuperService.runAction();
	}
}
