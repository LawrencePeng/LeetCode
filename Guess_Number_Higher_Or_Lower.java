/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long left = 1;
        long right = n;
        for(;;) {
            long mid = (left + right) / 2;
            int result = guess((int) mid);
            if (result == 0) return (int) mid;

            if (result == 1) left = mid + 1;
            else right = mid - 1;
        }
    }
}
