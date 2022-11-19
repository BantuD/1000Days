import java.util.*;
public class Main
{
    
    static char vigenereTable(int col,int row)
    {
        
        //Encryption part  (Return vigenere column and rowth alphabet )
        int i=row;
        int count=0;
        String str="";
        while(i<26) // store from given index till end
        {
            str+=(char)(i+65);
            i++;
        }
        while(count<row) //store from 0 to given index
        {
            str+=(char)(count+65);
            count++;
        }
      //System.out.println(str); // Debug
      return (str.charAt(col));
    }
    
   //Overloaded vigenereTable method
    static String vigenereTable(int row)
    {
        
        //Encryption part  (Return vigenere column and rowth alphabet )
        int i=row;
        int count=0;
        String str="";
        while(i<26) // store from given index till end
        {
            str+=(char)(i+65);
            i++;
        }
        while(count<row) //store from 0 to given index
        {
            str+=(char)(count+65);
            count++;
        }
      //System.out.println(str); // Debug
      return str;
    }
    static String circulateString(String str,int size) // size = size of PlainText
    {
        if(str.length()>size) // if key is already greater than the plaintext
        {
            return str;
        }
        
        String tempStr="";
        while(tempStr.length()<size)
        {
            for(int i=0;i<str.length() && tempStr.length()<size;i++)
            {
                tempStr+=str.charAt(i);
            }
        }
     return tempStr;
     //return "hello";
    }
    static void encryption()
    {
        Scanner sc = new Scanner(System.in);
       // String str1="RajulDubey";
	   //String str2="BEST";
	   
	   System.out.print("Enter PainText: ");
	   String str1 = sc.nextLine();
	   System.out.print("Enter the key: ");
	   String str2 = sc.nextLine();
	   
	    str2=circulateString(str2,str1.length());
	    String enStr="";
	    for(int i=0;i<str1.length();i++)
	    {
	        int col = str1.charAt(i);
	        int row = str2.charAt(i);
	        enStr+=vigenereTable(col-65,row-65); // (col,row);
	    }
		System.out.println("Encrypted text: "+enStr); 
    }
    static void decryption()
    {
        Scanner sc = new Scanner(System.in);
       // String str1="RajulDubey";
	   //String str2="BEST";
	   
	   System.out.print("Enter PainText: ");
	   String str1 = sc.nextLine();
	   System.out.print("Enter the key: ");
	   String str2 = sc.nextLine();
	   String temp="";
	    str2=circulateString(str2,str1.length());
	    String decStr="";
	    
	    for(int i=0;i<str1.length();i++)
	    {
	        int row = str2.charAt(i); // getting alphabet
	        row-=65; // removing ascii index
	        temp = (vigenereTable(row));  // creating and stroing the rotated string accordingly
	       decStr+=(char)(temp.indexOf(str1.charAt(i))+65);  // finding the index of ciphertext into temp
	       // and getting its index converting the index into alphabet as normal sequence of A,B,C,D....
	    }
	    
	    //temp = vigenereTable(1);
      System.out.println(decStr);
    }
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	    System.out.println("******Select option******");
	    System.out.println("Encryption: 1");
	    System.out.println("Decryption: 2");
	   System.out.print(":>> ");
	   int op = sc.nextInt();
	    switch(op)
	    {
	        case 1:
	        encryption();
	        break;
	        case 2:
	       // System.out.println("Not yet created..");
	       decryption();
	        break;
	        default:
	        break;
	    };
	}
}
