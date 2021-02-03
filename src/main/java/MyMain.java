public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        // YOUR CODE HERE
        if (x % 10 == x){
            return x;
        }
        else {
        return x % 10 + addDigits(x/10);
        }
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        // YOUR CODE HERE
        String new_str = "";
        for (int i = str.length() - 1; i > -1 ;i --){
            new_str += str.charAt(i);
        }
        return str.equals(new_str);

    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        // YOUR CODE HERE
        if (str.length() == 0)
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
        
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
