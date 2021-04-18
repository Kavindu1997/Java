import java.util.Scanner;

public class reverseString {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String text=scanner.nextLine();
         char[] arr = text.toCharArray();
         char[] newarr=new char[arr.length];

         for(int i=arr.length,j=0;i>0;i--,j++){
           newarr[j]=arr[i-1];

         }
         System.out.println(newarr);
     }    
}
