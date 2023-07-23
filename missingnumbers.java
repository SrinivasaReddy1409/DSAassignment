import java.util.*;
public class dsa2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    
    System.out.println("Enter the elements of the array");
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Missing numbers are"+missingnumbers(arr));
}
public static List<Integer> missingnumbers(int[] arr) {
    Arrays.sort(arr);
    List<Integer> numbers= new ArrayList<>();

    int start = arr[0];
    int end = arr[arr.length - 1];

    for (int i = start + 1; i < end; i++) {
        if (!contain(arr, i)) {
            numbers.add(i);
        }
    }

    return numbers;
}

public static boolean contain(int[] arr, int num) {
    for (int i=0;i<arr.length;i++) {
        if (i == num) {
            return true;
        }
    }
    return false;
}
}
