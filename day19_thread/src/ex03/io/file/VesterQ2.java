package ex03.io.file;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VesterQ2 {
	static int i = 0 ;
	static Vector <String> n = new Vector < String >();
	static Vector <Integer> h = new Vector < Integer >();
	static Vector <Integer> w = new Vector < Integer >();
	static Vector <String> b = new Vector < String>();
	
	public static void main(String[] args) {
		int[] numcon;  //선언
		
		while(true){
			System.out.println("1. 추가  2. 삭제  3.출력  4. 종료");
			Scanner sc = new Scanner(System.in);
			int Menu = sc.nextInt();
			
			switch(Menu) {
				case 1 :  //추가하는 함수
					input();
					break;				
				case 2 : // 삭제하는 함수
					System.out.println("삭제할 번호 : ");
					int delnum = sc.nextInt();
					delete(delnum);
					break;
				case 3 :  // 출력하는 함수
					display();
					break; 			
				case 4 :  System.exit(0);
				
				}//end switch
		}//end while

	} //end main
		
		public static void display(){
			if(i > 0){
				System.out.println( "[회원수 총 " +i + " 명]");
				System.out.println(" 번호\t이름\t\t키\t\t몸무게\t상태  ");
				System.out.println( "-----------------------------------------------------");
				
				Iterator it = n.iterator(); Iterator it2 = h.iterator(); 
				Iterator it3 = w.iterator(); Iterator it4 = b.iterator();
			
				int nn = 0;
				while(it.hasNext()){  // 다음 요소가 있다면....
						System.out.println(nn++ +"\t"+ it.next() + "\t" + it2.next() + "cm\t" + it3.next()+"kg\t\t" + it4.next());
				}
			}
			else System.out.println("입력된 회원이 없습니다.");
			System.out.println( "-----------------------------------------------------");
		}//display end

		public static void input(){
	
			
			Scanner sc = new Scanner(System.in);
				
			System.out.print("이름 : ");
			String name = sc.next();
			n.add(name);
			System.out.print("키 : ");
			int height = sc.nextInt();
			h.add(height);
			
			System.out.print("몸무게 : ");
			int weight = sc.nextInt();
			w.add(weight);
			
			double BMI = weight/((height/100.0)*(height/100.0));

			if(BMI < 18.5) b.add("저체중");
			else if(BMI >= 18.5 && BMI <23)	b.add("정상체중");
			else if(BMI >= 23 && BMI <25)	b.add("과체중");
			else if(BMI >= 25 && BMI <30)	b.add("경도비만");
			else if(BMI >= 30 && BMI <35)	b.add("중도비만");
			else b.add("고도비만");
			i++;
			
			//System.out.println(n.get(0));
		}
		
		public static void delete(int ii){
			n.remove(ii); h.remove(ii); w.remove(ii);
			--i;
		}
		
		/*public static void delete(){
			
			n.remove(); h.remove(); w.remove();
			--i;
		}*/
}