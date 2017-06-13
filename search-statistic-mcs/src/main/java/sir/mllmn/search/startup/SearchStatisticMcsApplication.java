package sir.mllmn.search.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sir.mllmn.search")
public class SearchStatisticMcsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SearchStatisticMcsApplication.class, args);
	}
}
