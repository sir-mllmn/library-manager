package sir.mllmn.search.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import sir.mllmn.search.domain.Search;
import sir.mllmn.search.repository.ISearchRepository;

import java.util.List;

@RestController
@RequestMapping("statistic")
public class StatisticController {

	private static Logger LOG = LoggerFactory.getLogger(StatisticController.class);

	@Autowired
	private ISearchRepository searchRepository;

	@Value("${application.view-name}")
	private String appName;

	private int searchIdCounter;

	@GetMapping
	public List<Search> getSearches() {
		return searchRepository.getSearches();
	}

	@GetMapping("info")
	public String info() {
		LOG.info("Responded for ping");
		return appName;
	}


	@GetMapping("search/{id}")
	public Search getSearch(@PathVariable("id") int id) {
		return searchRepository.getSearch(id);
	}

	@PostMapping("search")
	@ResponseBody
	public Search saveSearch(@RequestBody Search search) {
		search.setId(++searchIdCounter);
		searchRepository.saveSearch(search);
		return search;
	}

}
