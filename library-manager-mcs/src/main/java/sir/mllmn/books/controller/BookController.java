package sir.mllmn.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import sir.mllmn.books.client.SearchStatisticClient;
import sir.mllmn.books.domain.Book;
import sir.mllmn.books.domain.Search;
import sir.mllmn.books.repository.IBookRepository;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.List;

@RestController
@RequestMapping("book")
@EnableEurekaClient
public class BookController {

    @Value("${application.view-name}")
    private String appName;

    @Value("${application.library-name}")
    private String libraryName;

    @Autowired
    private IBookRepository bookRepository;

    @Autowired
    private SearchStatisticClient searchStatisticClient;

    @GetMapping("/info")
    public String getLibraryName() {
        return libraryName;
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id) {
        Book bookById = bookRepository.findById(id);
        if (bookById != null) {
            Search search = new Search();
            search.setBookId(id);
            search.setBrowser("Chrome");
            search.setUserName(System.getProperty("user.name"));
            search.setApplicationName(appName);
            search.setIp(resolveHostName());
            Search resolvedSearch = searchStatisticClient.findSearch(search);
            //todo implement for cassandra one to many
        }
        return bookById;
    }

    //todo replace with some normal implementation
    private String resolveHostName() {
        try {
            return Inet4Address.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping
    public void saveBook(@RequestBody Book book) {
        bookRepository.save(book);
    }

    @PutMapping
    public void updateBook(@RequestBody Book book) {
        bookRepository.save(book);
    }

}
