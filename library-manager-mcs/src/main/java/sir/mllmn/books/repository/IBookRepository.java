package sir.mllmn.books.repository;

import org.springframework.data.repository.CrudRepository;
import sir.mllmn.books.domain.Book;

import java.util.List;

public interface IBookRepository extends CrudRepository<Book, Integer> {

	Book findById(int id);

	List<Book> findAll();

	Book save(Book book);

}
