class Solution {
    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        int i = 0;

        while (i + k <= arr.length) {

            reverse(arr, i, i + k - 1);

            i = i + 2 * k;
        }

        // Fewer than k characters remain
        if (i < arr.length) {
            reverse(arr, i, arr.length - 1);
        }

        return new String(arr);
    }

    private static void reverse(char[] s, int start, int end) {

        for (int i = start, j = end; i < j; i++, j--) {

            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
    }
}
