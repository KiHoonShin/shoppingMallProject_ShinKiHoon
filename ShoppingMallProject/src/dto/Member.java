package dto;

public class Member {
	private int memberNum;
	private String id;
	private String pw;
	private String memberName;
	
	// 1000/admin/admin/관리자
	// 멤버에 처음은 항상 이걸로 고정
	public Member(String id, String pw, String memberName) {
		super();
		this.id = id;
		this.pw = pw;
		this.memberName = memberName;
	}
	
	private Member(String number, String id, String pw, String memberName) {
		super();
		this.memberNum = Integer.parseInt(number);
		this.id = id;
		this.pw = pw;
		this.memberName = memberName;
	}
	
}
