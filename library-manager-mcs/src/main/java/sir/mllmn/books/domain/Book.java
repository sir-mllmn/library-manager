package sir.mllmn.books.domain;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("books")
public class Book {

	@PrimaryKey
	private int id;
	
	private String name;
	
	private int year;
	
	private int pages;

	public Book(){}

	public Book(int id, String name, int year, int pages) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.pages = pages;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
