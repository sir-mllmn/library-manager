package sir.mllmn.search.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sir.mllmn.search")
@EnableEurekaClient
public class SearchStatisticMcsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SearchStatisticMcsApplication.class, args);
	}
}
I