package sir.mllmn.books.repository;

import sir.mllmn.books.domain.Book;

import java.util.List;

public interface IBookRepository {
	
	List<Book> getBooks();
	
	Book findBookById(int id);
	
	void saveBook(Book book);
	
	void deleteBook(int id);

}
