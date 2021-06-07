package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Criteria {
	private int pageNum;
	private int amount;
	private String type; // T, W, C 의 조합
	private String keyword; // 검색할 단어
	
	public Criteria() {
		this(1, 10);
	}
	
	public Criteria(int pageNum , int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	// 검색 조건이 있으면, 검색조건을 여러 개로 분해한 배열 리턴
	public String[] getTypeArr() {
		return type == null? new String[] {} : type.split("");
	}
}
