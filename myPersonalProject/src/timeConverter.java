package myPersonalProject.src;
import java.util.Scanner;

public class timeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int res=days*24*3600;
		System.out.println(res);
        
    }
    
}
