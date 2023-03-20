import java.util.Scanner;

public class factorial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        int i=1, num,fact=1;
        num=sc.nextInt();
        if(num<0) {
        	System.out.println("Invalid Number");
        }
        else {
        	for(i=1;i<=num;i++) {
        		fact=fact*i;
        	}
        	System.out.println("Factorial is"+fact);
        }
	}

}