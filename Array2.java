import java.util.Scanner;
import java.util.ArrayList;


public class Array8 {
    public static void main(String[] args) {
       int[][] arr=new int[2][3];
       Scanner sc=new Scanner(System.in);
        ArrayList <Integer> list1=new ArrayList<>();
        ArrayList <Integer> list2=new ArrayList<>();
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<3;j++)
           {
               arr[i][j]=sc.nextInt();
               if(arr[i][j]%2==0)
               {
                   list1.add(arr[i][j]);
               }
               else
               {
                   list2.add(arr[i][j]);
               }
           }
       }
        System.out.println("even elements collection= "+ list1);
        System.out.println("odd elements collection= "+ list2);
    }
}
