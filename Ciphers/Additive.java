import java.util.*;
public class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter String");
        //String str = sc.nextLine();
        //int shift = 23;
        //String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String str2="";
        //int[] ascii = new int[str.length()];
        System.out.println("Please enter your text (In Capital Letters Only...!)");
        System.out.print(">>: ");
        String str = sc.nextLine();
        String str2="";
        
        System.out.print("Enter Shift: ");
        int shift = sc.nextInt();
        for(int i=0;i<str.length();i++)
        {
            int val = str.charAt(i);
            val+=shift;
            val-=64;
            if(val>26)
            {
                val = val%26;
            }
            val+=64;
            str2=str2+(char)(val);
            //ascii[i]=val;
            val=0;
        }
        //for(int i=0;i<ascii.length;i++)
        //System.out.println(ascii[i]);
        System.out.print("Your Encrypted text: ");
        System.out.println(str2);
        
        
    }
}

