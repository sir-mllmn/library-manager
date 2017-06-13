package sir.mllmn.books.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sir.mllmn.books")
public class LibraryManagerMcsApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibraryManagerMcsApplication.class, args);
	}
}