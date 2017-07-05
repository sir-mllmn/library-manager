package sir.mllmn.books.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("sir.mllmn.books")
@EnableFeignClients(basePackages = "sir.mllmn.books.client")
@EnableCassandraRepositories(basePackages = "sir.mllmn.books.repository")
public class LibraryManagerMcsApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibraryManagerMcsApplication.class, args);
	}
}