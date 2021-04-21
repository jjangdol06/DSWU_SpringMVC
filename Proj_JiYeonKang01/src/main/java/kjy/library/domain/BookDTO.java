package kjy.library.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BookDTO {
	
	private String title;
	
	private String author;
	
	private String genre;
	
	private int price;
	
	private Date pubdate;
	
}
