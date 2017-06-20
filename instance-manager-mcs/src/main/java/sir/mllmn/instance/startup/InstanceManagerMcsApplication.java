package sir.mllmn.instance.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("sir.mllmn.instance")
public class InstanceManagerMcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstanceManagerMcsApplication.class, args);
	}
}
