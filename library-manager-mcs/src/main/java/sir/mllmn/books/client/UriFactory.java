package sir.mllmn.books.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class UriFactory {

    @Value("${application.search-service-url}")
    private String searchServiceUrl;

    public URI getSearchServiceUri() {
        return UriComponentsBuilder.fromHttpUrl(searchServiceUrl)
                .path("/search")
                .build()
                .toUri();

    }
}
