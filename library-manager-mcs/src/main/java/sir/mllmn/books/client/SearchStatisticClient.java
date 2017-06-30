package sir.mllmn.books.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import sir.mllmn.books.domain.Search;

@FeignClient("${application.search-service-url}")
public interface SearchStatisticClient {

    @PostMapping(value = "/search", consumes = "application/json")
    Search findSearch(Search search);
}
