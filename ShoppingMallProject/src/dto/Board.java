package dto;

import java.time.LocalDate;

public class Board {
	private static int num;
	private int boardNum;
	private String title;
	private String id;
	private String date;
	private String contents;
	private int hits;
	
	public Board() {
		
	}
	
	private Board(String number, String title, String contents, String id, String date, String hits) {
		super();
		boardNum = Integer.parseInt(number);
		this.title = title;
		this.contents = contents;
		this.id = id;
		this.date = date;
		this.hits = Integer.parseInt(hits);
		num++;
	}
	
}
