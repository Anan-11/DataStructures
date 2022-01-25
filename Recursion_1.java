//abaca = xbxcx
import java.util.Scanner;

public class Rec7 {
    static int i=0;
    static String s1="";
    public static String dis(String s,char tc,char re) //abaca = xbxcx
    {
        if(i==s.length())
            return s1;
        char cc=s.charAt(i++);
        if(cc==tc)
            s1=s1+re;
        else
            s1=s1+cc;
        return dis(s,tc,re);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        System.out.println(dis(s,c1,c2));
    }
}
