package ex02.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gugudan extends Frame implements ActionListener {
	TextArea ta;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

	public Gugudan(String str) {
		super(str);
		
		ta = new TextArea();
		b1 = new Button("1단");
		b2 = new Button("2단");
		b3 = new Button("3단");
		b4 = new Button("4단");
		b5 = new Button("5단");
		b6 = new Button("6단");
		b7 = new Button("7단");
		b8 = new Button("8단");
		b9 = new Button("9단");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		add("Center", ta);
		
		add("South", p);

		setSize(300, 200);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		System.out.println(e.getActionCommand());
		if ((Button)obj == b1) {
			for (int i = 1; i < 10; i++) {
				int gob = 1 * i;
				ta.append("1 * " + i + "=" + gob+"\n");
			}
		} else if ((Button)obj == b2) {
			for (int i = 1; i < 10; i++) {
				int gob = 2 * i;
				ta.append("2 * " + i + "=" + gob+"\n");
			}
		} else if ((Button)obj == b3) {
			for (int i = 1; i < 10; i++) {
				int gob = 3 * i;
				ta.append("3 * " + i + "=" + gob+"\n");
			}
		} else if ((Button)obj == b4) {
			for (int i = 1; i < 10; i++) {
				int gob = 4 * i;
				ta.append("4 * " + i + "=" + gob+"\n");
			}
		} else if ((Button)obj == b5) {
			for (int i = 1; i < 10; i++) {
				int gob = 5 * i;
				ta.append("5 * " + i + "=" + gob+"\n");
			}
		} else if ((Button)obj == b6) {
			for (int i = 1; i < 10; i++) {
				int gob = 6 * i;
				ta.append("6 * " + i + "=" + gob+"\n");
			}
		} else if ((Button)obj == b7) {
			for (int i = 1; i < 10; i++) {
				int gob = 7 * i;
				ta.append("7 * " + i + "=" + gob+"\n");
			}
		} else if ((Button)obj == b8) {
			for (int i = 1; i < 10; i++) {
				int gob = 8 * i;
				ta.append("8 * " + i + "=" + gob+"\n");
			}
		} else {
			for (int i = 1; i < 10; i++) {
				int gob = 9 * i;
				ta.append("9 * " + i + "=" + gob+"\n");
			}
		}

	}

	public static void main(String[] args) {
		new Gugudan("구구단 프로그램");

	}

}
