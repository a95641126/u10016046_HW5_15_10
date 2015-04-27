import java.util.ArrayList;
import java.util.Scanner;


public class CopyMyStackTest implements Cloneable{

	public static void main(String[] args) {
		
		String str1,str2;
		boolean a=true;
			MyStack s = new MyStack();
		while(a==true){
			System.out.println("若要push請輸入1,若要pop請輸入2,若要copy stack中的資料請打3,若要離開請打4:");
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();
			
			switch(x){
			case 1 :
				System.out.println("請輸入要push的字串:");
				str1 = input.next();
				s.push(str1);
				
				break;
			case 2:
				if(s.isEmpty()){
					System.out.println("Stack為空的");
				}
				else{
					s.pop();
					System.out.println("你已成功pop出Stack");
				}
				break;
			case 3:
				ArrayList<String> list1 = (ArrayList<String>) s.getList();
				
				System.out.println("複製的Stack:"+list1);
				break;
				
			case 4:
				a = false;
				break;
			default:
				System.out.println("輸入錯誤,請重新輸入");
				break;
				
			}
			
		}
		
	}

}
