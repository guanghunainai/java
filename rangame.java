package one;
import java.util.Scanner;
public class rangame {
	public static void main(String args[]){
		int a,c;
		int i,j;
		String b;
		System.out.println("������һ��1~6���������С");
		for(i=0;i<6;i++){
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextLine();
		c=(int)Math.random()*6+1;
		if (c<4&&a<4){
			System.out.println("���ΪС����ϲ��¶��ˣ�");
			System.out.println("�����:"+c);
		}else if(c>3&&a>3){
			System.out.println("���Ϊ�󣬹�ϲ��¶��ˣ�");
			System.out.println("�����:"+c);
		}
		/*else if (b.equals('С')){
			System.out.println("���ΪС����ϲ��¶��ˣ�");
			System.out.println("�����:"+c);
		}else if(b.equals('��')){
			System.out.println("���Ϊ�󣬹�ϲ��¶��ˣ�");
			System.out.println("�����:"+c);
		}*/
		else{
			System.out.println("������˼�����ˣ�~~");
			System.out.println("�����:"+c);
		}
		}
	}
}





