package one;
import java.util.Scanner;
public class rangame {
	public static void main(String args[]){
		int a,c;
		int i,j;
		String b;
		System.out.println("请输入一个1~6的整数或大小");
		for(i=0;i<6;i++){
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextLine();
		c=(int)Math.random()*6+1;
		if (c<4&&a<4){
			System.out.println("结果为小，恭喜你猜对了！");
			System.out.println("结果是:"+c);
		}else if(c>3&&a>3){
			System.out.println("结果为大，恭喜你猜对了！");
			System.out.println("结果是:"+c);
		}
		/*else if (b.equals('小')){
			System.out.println("结果为小，恭喜你猜对了！");
			System.out.println("结果是:"+c);
		}else if(b.equals('大')){
			System.out.println("结果为大，恭喜你猜对了！");
			System.out.println("结果是:"+c);
		}*/
		else{
			System.out.println("不好意思你输了！~~");
			System.out.println("结果是:"+c);
		}
		}
	}
}





