package sir.mllmn.search.repository;

import org.springframework.stereotype.Repository;
import sir.mllmn.search.domain.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemorySearchRepository implements ISearchRepository {
	private final List<Search> searches = new ArrayList<>();
	private int counter;

	@Override
	public List<Search> getSearches() {
		return searches;
	}
	
	@Override
	//todo refactor with optionals
	public Search getSearch(int id) {
		Optional<Search> found = searches.stream()
				.filter(search -> id == search.getId())
				.findFirst();
		return found.orElse(null);
	}

	@Override
	public void saveSearch(Search search) {
		search.setId(counter ++);
		searches.add(search);
	}

}
