import java.util.Scanner;
public class MinMaxOfArray {
    static int minMaxArray(int[] array)
    {
        int size=array.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for (int i=0;i<size;i++)
        {
            if(array[i]>max)
                max=array[i];
        }
        for (int i=0;i<size;i++)
        {
            if(array[i]<min)
                min=array[i];
        }
        sum=min+max;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int A[]=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int result=minMaxArray(A);
        System.out.println(result);
    }
}
