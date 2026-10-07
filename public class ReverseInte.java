public class ReverseInteger {
    public static int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;         
            reversed = reversed * 10 + digit; 
            num /= 10;                     
        }

        return reversed;
    }

    public static void main(String[] args) {
        int original = 12345;
        int result = reverseNumber(original);
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + result);
    }
}