package ex01.awt;

import java.awt.Frame;
import java.awt.TextArea;

public class FrameMain extends Frame {

	TextArea ta;

	public FrameMain(String str) { // ������ �Լ� - �ʱ�ȭ
		super(str);
		setVisible(true);
		pack(); //setBounds(350, 200, 400, 300); //setBounds(x,y,w,h); //pack() == component size ��ŭ!
		ta = new TextArea("������ ��������!!", 5, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		this.add(ta);
	}

	public static void main(String[] args) {
		new FrameMain("��â����");
	}
}
