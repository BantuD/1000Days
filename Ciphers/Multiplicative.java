import java.util.*;
public class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String str = sc.nextLine();
        System.out.println("Enter the key: ");
        int key=sc.nextInt();
        String str2="";
      
        for(int i=0;i<str.length();i++)
        {
        int val = str.charAt(i);
        val-=65;
        val=(val*key)%26;
        val+=65;
        str2=str2+(char)(val);    
        }
       System.out.println("Encrypted text: "+str2);
    
    }
}
