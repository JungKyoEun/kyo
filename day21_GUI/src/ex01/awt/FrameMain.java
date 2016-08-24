package ex01.awt;

import java.awt.Frame;
import java.awt.TextArea;

public class FrameMain extends Frame {

	TextArea ta;

	public FrameMain(String str) { // 생성자 함수 - 초기화
		super(str);
		setVisible(true);
		pack(); //setBounds(350, 200, 400, 300); //setBounds(x,y,w,h); //pack() == component size 만큼!
		ta = new TextArea("문장을 넣으세요!!", 5, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		this.add(ta);
	}

	public static void main(String[] args) {
		new FrameMain("새창띄우기");
	}
}
