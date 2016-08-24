package ex01.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutEx {
	public static void main(String[] args) {
		Frame f = new Frame("GridLayout test"); //container
		//f.setLayout(new GridLayout(2,4));
		f.setLayout(new GridLayout(4,2)); //행 렬 ! 4행 2열
		
		Button btn1 = new Button("1,1"); //component
		Button btn2 = new Button("1,2");
		Button btn3 = new Button("1,3");
		Button btn4 = new Button("1,4");
		Button btn5 = new Button("2,1");
		Button btn6 = new Button("2,2");
		Button btn7 = new Button("2,3");
		
		f.add(btn1); f.add(btn2); f.add(btn3); f.add(btn4);
		f.add(btn5); f.add(btn6); f.add(btn7);
		f.setBackground(Color.yellow);
		f.setLocation(300, 300);
		f.setVisible(true);
		f.setSize(500, 200);
		
	}

}
