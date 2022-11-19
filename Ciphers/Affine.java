import java.util.*;
public class Main
{
    static void encryption()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String str = sc.nextLine();
        System.out.println("Enter the key1: ");
        int key1=sc.nextInt();
        System.out.println("Enter the key2: ");
        int key2=sc.nextInt();
        String str2="";
      
        for(int i=0;i<str.length();i++)
        {
        int val = str.charAt(i);
        val-=65;
        //val=(val*key)%26;
        val=(key1*val+key2)%26;
        val+=65;
        str2=str2+(char)(val);    
        }
       System.out.println("Encrypted text: "+str2);
    }
    static void dencryption()
    {
        int inv=0;
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Encrypted text: ");
       String str=sc.nextLine();
       String str2="";
       System.out.println("Enter the key1: ");
       int key1=sc.nextInt();
       System.out.println("Enter the key2: ");
       int key2=sc.nextInt();
       
       while((key1*inv)%26!=1) //Finding inverse of key1
        {
            inv++;
        }
        
       for(int i=0;i<str.length();i++)
        {
        int val = str.charAt(i);
        val=val-65;
         val = (inv*(val-key2));
         if(val<0)
         {
        
        if(val<0)
        val=-val;
        
        while(val>26)
        {
            val=val-26;
        }
        val=26-val;
        
         }
         else{
             val = val%26;
         }
        val+=65;
        str2+=(char)(val);
        val=0;
        }
       System.out.println("Decrypted text: "+str2);
       
    }
    public static void main(String[] args) {
        
        dencryption();
    
    }
}
