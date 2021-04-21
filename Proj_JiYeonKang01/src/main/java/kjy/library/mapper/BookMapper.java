package kjy.library.mapper;

import java.util.List;

import kjy.library.domain.BookVO;

public interface BookMapper {

	public List<BookVO> getList();  // 과제에 void
	
	public void insert(BookVO book);
	
	public Integer insertSelectKey(BookVO book);

	public BookVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BookVO board);

}
