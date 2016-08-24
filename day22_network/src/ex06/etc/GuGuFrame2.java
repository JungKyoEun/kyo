package ex06.etc;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GuGuFrame2 extends Frame implements ActionListener {
	TextArea tx=new TextArea("---구구단---",7,30);
	
	public GuGuFrame2(String title){ //생성자함수 
		super(title);
		Panel p=new Panel();
		Panel p1=new Panel();
		
		Button btn2 = new Button("2단");
		Button btn3 = new Button("3단");
		Button btn4 = new Button("4단");
		Button btn5 = new Button("5단");
		Button btn6 = new Button("6단");
		Button btn7 = new Button("7단");
		Button btn8 = new Button("8단");
		Button btn9 = new Button("9단");
		
		setLayout(new BorderLayout()); //배치관리자
		setBounds(350, 250, 320, 200);   //setSize(320, 200);
		setResizable(false);  //크기 변경 막음
		//패널에 TextArea를 등록함
		p.add(tx);
		//GuGuFrame에 패널을 등록 
		add("North",p); 
		//패널에 버튼 등록
		p1.add(btn2); p1.add(btn3); p1.add(btn4); p1.add(btn5); p1.add(btn6);
		p1.add(btn7); p1.add(btn8); p1.add(btn9);
		//GuGuFrame에 패널 등록 
		add("South",p1);
		//버튼에 이벤트 등록함
		btn2.addActionListener(this); btn3.addActionListener(this); btn4.addActionListener(this);
		btn5.addActionListener(this); btn6.addActionListener(this); btn7.addActionListener(this);
		btn8.addActionListener(this); btn9.addActionListener(this);
		
		///윈도우(프레임) 이벤트 등록 /////////////////////////////////////
		addWindowListener( new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			} 		
		}); 
		///////////////////////////////////////////////////////////////////////
		
		//////닫기 이벤트 처리 - WindowListener interface ///////////////////
	}
	
	//이벤트 처리 
	public void actionPerformed(ActionEvent e) {
		char chk = e.getActionCommand().charAt(0);
		int dan = (int)chk - 48;
		System.out.println(dan);
			tx.append("\n---" + chk + "단 ---");
			for (int i = 1; i < 10; i++) {
				tx.append("\n" + chk + " * " + i + " = " + dan*i);
			}
	}

	
}
