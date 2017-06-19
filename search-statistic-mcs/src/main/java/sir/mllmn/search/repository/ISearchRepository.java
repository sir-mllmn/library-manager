package sir.mllmn.search.repository;



import sir.mllmn.search.domain.Search;

import java.util.List;

public interface ISearchRepository {
	
	List<Search> getSearches();
	
	Search getSearch(int id);
	
	void saveSearch(Search search);
}
