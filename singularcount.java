import java.util.*;
public class dsa3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array of similar socks pairs: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the number of similar socks pairs: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int singular_count=0;
        for(int i=0;i<n;i++){
        int count=0;
        for(int j=i+1;j<n;j++){
            if(a[j]==a[i]){
                count++;
                a[j]=0;
            }
        }
        if(count%2!=0){
            singular_count++;
        }
        }
        System.out.println("Total number of Singular socks = "+singular_count);
    }
}
