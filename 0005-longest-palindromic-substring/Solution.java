import java.util.*;
class Solution {
    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i));
            sb.append("#");
        }
        String t = sb.toString();
        int n = t.length();
        int[] p = new int[n];
        int center = 0, right = 0;
        int maxLen = 0, centerIndex = 0;
        for(int i = 0; i < n; i++){
            int mirror = 2 * center - i;
            if(i < right)
                p[i] = Math.min(right - i, p[mirror]);
            int a = i + p[i] + 1;
            int b = i - p[i] - 1;
            while(a < n && b >= 0 && t.charAt(a) == t.charAt(b)){
                p[i]++;
                a++;
                b--;
            }
            if(i + p[i] > right){
                center = i;
                right = i + p[i];
            }
            if(p[i] > maxLen){
                maxLen = p[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestPalindrome(s));
    }
}