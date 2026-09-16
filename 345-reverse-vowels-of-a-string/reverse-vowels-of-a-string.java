class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int l = 0, r = a.length - 1;

        while (l < r) {
            while (l < r && !"aeiouAEIOU".contains("" + a[l])) l++;
            while (l < r && !"aeiouAEIOU".contains("" + a[r])) r--;

            char temp = a[l];
            a[l++] = a[r];
            a[r--] = temp;
        }

        return new String(a);
    }
}