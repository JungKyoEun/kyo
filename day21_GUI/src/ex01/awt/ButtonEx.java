package ex01.awt;

import java.awt.*;

public class ButtonEx extends Frame {
	Button btn1, btn2, btn3,btn4, btn5;

	public ButtonEx(String str) {
		super(str);
		setLayout(new FlowLayout());
		btn1 = new Button("1번");
		btn2 = new Button("2번");
		btn3 = new Button("3번");
		btn4 = new Button("4번");
		btn5 = new Button("5번");
		
		this.add(btn1);//컴포넌트 Button같은걸 container Frame 따위에 붙일 때는 add!!
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx("버튼 예제");
	}
}
