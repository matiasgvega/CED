import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Write a program which takes input as string and check it is palindrom or not.
 * If the string and the reverse of string are same then we say string is palindrom.
 * Example : 1.If string is "level" then the output should be: palindrome 2.
 * If string is "helloworld" then the output should be: not a palindrome
 */
public class Palindrom {

    public static void main(String a[]) throws Exception
    {
        String strn;
        int flag=0;
        System.out.println("Enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strn=br.readLine();
        System.out.println("Result string is:");

        String newStrn = "";

        for(char c : strn.toCharArray()){
            newStrn = c + newStrn;
        }

        if(newStrn.equals(strn)){
            flag = 1;
        }

        if(flag==1)
            System.out.print("palindrome");
        else
            System.out.print("not a palindrome");

    }
}
