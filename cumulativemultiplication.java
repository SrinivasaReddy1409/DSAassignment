import java.util.*;
public class dsa1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int product=1;
        System.out.println("Enter the elements of array: ");
        try{ for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();    
        }
        
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array Index exceeded out of bounds");
        return;
    }
    for(int j=1;j<n;j++){
        arr[j]*=arr[j-1];
    }
  
    System.out.println(Arrays.toString(arr));
    }
}
