package menu_member;

import _mall.MenuCommand;
import controller.MallController;
import util.Util;

public class _MemberMain implements MenuCommand {
	private MallController mallCont;
	
	@Override
	public void init() {
		mallCont = MallController.getInstance();
	}
	
	@Override
	public boolean update() {
		System.out.println("[1] 상품구매 [2] 장바구니 [3] 게시판 [4] 나의 정보 [5] 회원 탈퇴 [0] 로그 아웃 ");
		int sel = Util.getValue("메뉴 입력", 0, 5);
		if(sel == 0) {
			//mallCont.setNext();
		} else if(sel == 1) {
			//mallCont.setNext("MemberShopping");
		} else if(sel == 2) {
			//mallCont.setNext("MemberCart");
		} else if(sel == 3) {
			//mallCont.setNext("MemberBoard");
		} else if(sel == 4)
		
		return true;
		return false;
	}

}
