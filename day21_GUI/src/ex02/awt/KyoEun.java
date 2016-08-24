package ex02.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KyoEun extends Frame implements ActionListener{
	Label lb;
	Button b1, b2;
	
	public KyoEun(String str){
		super(str);
		lb=new Label("버튼을 눌러주세요");
		b1 = new Button("정교은");
		b2 = new Button("kosta");
		b1.addActionListener(this);
		b2.addActionListener(this);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		add("Center", p);
		add("South",lb);
		setSize(300,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		System.out.println(e.getActionCommand());
		if((Button)obj==b1){
			lb.setText("정교은 눌렀습니다.");
		}else{
			lb.setText("kosta 눌렀습니다.");
		}
	}
	public static void main(String[] args) {
		new KyoEun("Action이벤트 ");
	}
}
