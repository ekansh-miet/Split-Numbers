import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[2*n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int c=0,d=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==1)
            c++;
            else if(a[i]%2==0)
            d++;
        }
        if(c==d)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}