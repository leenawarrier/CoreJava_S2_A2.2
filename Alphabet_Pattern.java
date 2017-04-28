import java.util.Scanner;

//Class Alphabet_Pattern which contains the main method()
public class Alphabet_Pattern{

     public static void main(String []args) {
		 //Accept an alphabet to decide the pattern size
        System.out.println("Enter an alphabet");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
		//Find the no of rows needed
        int a = (int)c;
        if((a>=97 && a<=122) || (a>=65 && a<=90))
        {
            int srt=0;
            if(a>=97 && a<=122) srt = 97;
            if(a>=65 && a<=90) srt = 65;            
            for(int i=0;i<=a-srt;i++)
            {
                for(int j=i;j<=a-srt;j++)
                    System.out.print(" ");
                for(int k=srt;k<=srt+i;k++){
                    System.out.print((char)k);}
                for(int l=srt+i-1;l>=srt;l--)
                    System.out.print((char)l);    
                System.out.print("\n");
            }
            for(int i=1;i<=a-srt;i++)
            {
                for(int j=0;j<=i;j++)
                    System.out.print(" ");
                for(int k=srt;k<=a-i;k++){
                    System.out.print((char)k);}
                for(int l=a-i-1;l>=srt;l--)
                    System.out.print((char)l);    
                System.out.print("\n");
            }
        }
        else {
            System.out.print("Did not entered an alphabet");        
        }
    }
}
