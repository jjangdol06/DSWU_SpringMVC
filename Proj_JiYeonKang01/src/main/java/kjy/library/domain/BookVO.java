package kjy.library.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BookVO {
	
	private Long bno;
	
	private String title;
	
	private String author;
	
	private String genre;
	
	private int price;
	
	private Date pubdate;
	
}
