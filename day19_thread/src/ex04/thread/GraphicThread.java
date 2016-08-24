package ex04.thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable {
	
	int x,y,num;
	Color color;
	Random random; 
	
	public GraphicThread(int num){ //생성자함수 - 초기화
		this.num = num;
		color = Color.red;
		random = new Random();
		
		setSize(500,400); // 프레임(화면)크기 = 너비, 높이
		setVisible(true);	//화면보여주기
		setLocation(250,300);//x,y좌표 위치에 프레임 위치시킴
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기
	}
	
	@Override
	public void run() { //Runnable 때문에 오버라이드 됐음. //스레드 구현부(실행부)
		Rectangle rect = getBounds();
		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			repaint();
			try{
				Thread.sleep(10);
			}catch(Exception e){
				
			}
		}

	}

	@Override
	public void update(Graphics g) {//붓은 들고나온상태
		g.clipRect(x, y, 3, 3);
		paint(g);//그려주는 역할
	}

	@Override
	public void paint(Graphics g) {
	g.setColor(color);
	g.fillOval(x, y, 3, 3);
	}

	public static void main(String[] args) {
		/*GraphicThread gt = new GraphicThread(2000);
		Thread t = new Thread(new GraphicThread(2000));
		t.start();
		*/
		
		 new Thread(new GraphicThread(2000)).start();
	}
}
