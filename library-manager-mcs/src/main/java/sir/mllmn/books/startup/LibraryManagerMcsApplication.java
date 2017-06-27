package sir.mllmn.books.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import sir.mllmn.books.config.RibbonConfiguration;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("sir.mllmn.books")
@RibbonClient(name = "search-statistic-app", configuration = RibbonConfiguration.class)
public class LibraryManagerMcsApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibraryManagerMcsApplication.class, args);
	}
}