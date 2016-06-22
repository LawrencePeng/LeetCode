public class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] arr = s.toCharArray();

        while(left < right) {
            boolean leftIsVowel = isVowel(arr[left]);
            boolean rightIsVowel = isVowel(arr[right]);

            if (leftIsVowel && rightIsVowel) {
                exchange(arr, left, right);
                left++;
                right--;
            } else if (leftIsVowel && !rightIsVowel) {
                right--;
            } else if (!leftIsVowel && rightIsVowel) {
                left++;
            } else {
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U';
    }

    private void exchange(char[] charArray, int left, int right) {
        char tmp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = tmp;
    }
}
