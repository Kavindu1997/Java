import java.util.Scanner;

public class loanConverter {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();

		for(int i=1;i<=3;i++){
			int pay=amount/10;
			amount-=pay;			
		}
		System.out.println(amount);
		
	}
    
}
