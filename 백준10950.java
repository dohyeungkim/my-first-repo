import java.util.Scanner;

public class 백준10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int C = sc.nextInt();
        int num1;
        int num2;
        int num3 = 0;
        for(int i=0;i<C;i++) {
        	num1 = sc.nextInt();
        	num2 = sc.nextInt();
        	num3 = num1 + num2;
        }
        System.out.println(num3);        
	}

}
