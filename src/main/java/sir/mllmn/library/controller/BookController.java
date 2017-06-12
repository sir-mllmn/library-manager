package sir.mllmn.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import sir.mllmn.library.domain.Book;
import sir.mllmn.library.repository.IBookRepository;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

	@Value("${application.library-name}")
	private String libraryName;

	@Autowired
	private IBookRepository bookRepository;

	@GetMapping("/info")
	public String getLibraryName() {
		return libraryName;
	}

	@GetMapping
	public List<Book> getBooks() {
		return bookRepository.getBooks();				
	}

	@GetMapping("{id}")
	public Book getBook(@PathVariable int id) {
		return bookRepository.findBookById(id);				
	}

	@PostMapping
	public void saveBook(@RequestBody Book book) {
		bookRepository.saveBook(book);				
	}

	@PutMapping
	public void updateBook(@RequestBody Book book) {
		bookRepository.saveBook(book);				
	}
	
}
