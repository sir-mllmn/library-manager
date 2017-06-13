package sir.mllmn.books.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import sir.mllmn.books.domain.Book;
import sir.mllmn.books.domain.Search;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryBookRepository implements IBookRepository {

	@Value("${application.view-name}")
	private String APP_NAME;

	private final Map<Integer, Book> books;

	private int bookIdCounter;

	public InMemoryBookRepository() {
		books = init();
	}

	private Map<Integer, Book> init() {
		Map<Integer, Book> books;
		books = new HashMap<>();
		Book book = new Book();
		book.setId(++bookIdCounter);
		book.setName("Thinking in Java");
		book.setPages(1150);
		book.setYear(2006);
		books.put(book.getId(), book);
		return books;
	}

	@Override
	public List<Book> getBooks() {
		return new ArrayList<>(books.values());
	}
	
	@Override
	public Book findBookById(int id) {
		return books.get(id);
	}

	@Override
	public void saveBook(Book book) {
		if(book.getId() == 0) {
			book.setId(++bookIdCounter);
			books.put(book.getId(), book);			
		} else {
			books.put(book.getId(), book);
		}	
	}

	@Override
	public void deleteBook(int id) {
		books.remove(id);
	}

}
