package kjy.library.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BookDTO {
	
	private String title;
	
	private String author;
	
	private String genre;
	
	private int price;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone="Asia/Seoul")
	private Date pubdate;
	
}
