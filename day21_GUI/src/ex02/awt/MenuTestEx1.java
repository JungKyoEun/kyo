package ex02.awt;
import java.awt.*;
class  MenuTestEx1{
	public static void main(String[] args) {
		Frame f  = new Frame("Menu Test");
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("파일");
			MenuItem mi1 = new MenuItem("열기",new MenuShortcut('o'));
			CheckboxMenuItem mi2 = new CheckboxMenuItem("닫기");
			Menu m1m = new Menu("저장");
				MenuItem m1m1 = new MenuItem("지금저장");
				MenuItem m1m2 = new MenuItem("다른저장");
		m1m.add(m1m1);
		m1m.add(m1m2);
		m1.add(mi1);
		m1.add(mi2);
		m1.addSeparator();
		m1.add(m1m);

		mb.add(m1);
		f.setMenuBar(mb);
		f.setSize(300,300);
		f.show();
	}
}
