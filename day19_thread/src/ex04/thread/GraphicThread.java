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
	
	public GraphicThread(int num){ //�������Լ� - �ʱ�ȭ
		this.num = num;
		color = Color.red;
		random = new Random();
		
		setSize(500,400); // ������(ȭ��)ũ�� = �ʺ�, ����
		setVisible(true);	//ȭ�麸���ֱ�
		setLocation(250,300);//x,y��ǥ ��ġ�� ������ ��ġ��Ŵ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ݱ�
	}
	
	@Override
	public void run() { //Runnable ������ �������̵� ����. //������ ������(�����)
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
	public void update(Graphics g) {//���� ����»���
		g.clipRect(x, y, 3, 3);
		paint(g);//�׷��ִ� ����
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
