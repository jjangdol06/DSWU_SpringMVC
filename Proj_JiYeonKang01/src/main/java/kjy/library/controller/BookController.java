package kjy.library.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kjy.library.domain.BookDTO;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/books/*")
@Log4j
public class BookController {

	@RequestMapping("/registerBook")
	public String registerBook(BookDTO bookDTO) { 
		log.info("title : " + bookDTO.getTitle());
		log.info("author : " + bookDTO.getAuthor());
		log.info("genre : " + bookDTO.getGenre());
		log.info("price : " + bookDTO.getPrice());
		log.info("pubdate : " + bookDTO.getPubdate());
		
		return "registerBook";
	}
	
	@GetMapping("/getBook")
	public @ResponseBody BookDTO getBook() throws ParseException {
		log.info("/getBook............");
		
        Date pubdate=new SimpleDateFormat("yyyy/MM/dd").parse("2020/02/02");  
		
		BookDTO dto = new BookDTO();
		dto.setTitle("title01");
		dto.setAuthor("kjy01");
		dto.setGenre("fiction");
		dto.setPrice(1000);
		dto.setPubdate(pubdate);
		
		log.info(dto);
		return dto;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
}
