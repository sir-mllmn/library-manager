package sir.mllmn.books.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LibraryManagerAppConfiguration {
    @Bean
    @LoadBalanced
    public RestTemplate getSearchStatisticRestTemplate() {
        return new RestTemplate();
    }
}
