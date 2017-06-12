package sir.mllmn.library.repository;

import sir.mllmn.library.domain.Book;

import java.util.List;

public interface IBookRepository {
	
	List<Book> getBooks();
	
	Book findBookById(int id);
	
	void saveBook(Book book);
	
	void deleteBook(int id);

}
