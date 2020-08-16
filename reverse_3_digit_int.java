class Solution {
    public int reverse(int x) {

        int lastDigit = x % 10;
        int secondDigit = (x/10)%10;
        int firstDigit = x/100;
        int result = lastDigit*100+secondDigit*10+firstDigit;
        return result;
    }
}