package ex03.swing;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RootPaneContainer;
import javax.swing.table.DefaultTableModel;

public class NakjunKyoeun extends JFrame  implements ActionListener{
	String [] str1 = {"전체보기","추 가","삭 제","검 색","취 소"};
	JButton [] btn = new JButton[5];
	
    
	public NakjunKyoeun(){
		JFrame f=new JFrame();
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JTable table;
		JLabel lj1, lj2, lj3, lj4;

		String[] fieldName = {"번 호 " ,"이 름", "이 메 일", "전화번호"};

		  
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton( str1[i]);
			btn[i].addActionListener(this);
			p1.add(btn[i]);
		}
		TextField tf1=new TextField(15);
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		TextField tf4=new TextField(15);
		 
		
		 p.setLayout(new GridLayout(4, 1));
		 lj1 = new JLabel("번 호");
	     p.add(lj1); 
	     p.add(tf1);
		 p.add(new JLabel("이 름")); p.add(tf2);
		 p.add(new JLabel("이 메 일")); p.add(tf3);
		 p.add(new JLabel("전화번호")); p.add(tf4);
		
		DefaultTableModel dmt = new DefaultTableModel(fieldName, 0);
		table = new JTable(dmt);
		JScrollPane  sp = new JScrollPane(table);
		getContentPane().add(sp);
		f.add(sp);
		
		
	    f.add("South",p1);
	    f.add("West",p);
	    f.add("East",p2);
		f.setSize(500,300);
		f.setVisible(true);
		f.setResizable(false);
	}
    
			
	public static void main(String[] args) {
		new NakjunKyoeun();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
