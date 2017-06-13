package sir.mllmn.books.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LibraryManagerAppConfiguration {
    @Bean
    public RestTemplate getSearchStatisticRestTemplate() {
        return new RestTemplate();
    }
}
