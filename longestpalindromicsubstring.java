import java.util.*;
class Solution {

    public static String longestPalindrome(String s) {
        int count = -1;
        String ans = "";
 
        int n = s.length();
        boolean[][] a= new boolean[n][n];
 
        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    a[i][j] = true;
                }
                else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        a[i][j] = true;
                    }
                    else {
                        a[i][j] = false;
                    }
                }
                else {
                    if (s.charAt(i) == s.charAt(j)
                        && a[i + 1][j - 1] == true) {
                        a[i][j] = true;
                    }
                    else {
                        a[i][j] = false;
                    }
                                   }
 
                if (a[i][j] == true
                    && count < s.substring(i, j + 1)
                                   .length()) {
                    ans = s.substring(i, j + 1);
                    count = ans.length();
                }
            }
        }
        return ans;
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String:");
    String s=sc.nextLine();
    System.out.println(longestPalindrome(s));
}
}
