import java.util.*; 
public class Display
{ 
        public static void main(String[] args)
 { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the digits:"); 
        for (int i = 0; i < 4; ++i)
        { 
            int n=sc.nextInt(); 
            System.out.println(n + "-" + (char)n); 
        } 
  } 
}
