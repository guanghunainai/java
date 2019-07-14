package one;

public class addition {
	public static void main(String args[]){
		int i,j,b,c;
		for(j=1;j<10;j++){
			for(i=1;i<j+1;i++){
				if(i==j){
					c=i+j;
					System.out.print(i+"+"+j+"="+c);
					System.out.println();
				}else{
				b=i+j;
				System.out.print(i+"+"+j+"="+b+" ");
				}
			}
		}
	}
}
