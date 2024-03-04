package RecursionLab;

public class RecursionLab {
    public static void main(String[] args) {

        printOdd1Ton(10);
        System.out.println();
        printOdd1Ton_v3(100);
        System.out.println();
        System.out.println(recursiveGcd(24, 60));
        System.out.println(divide(50, 10));
        System.out.println(log(16, 2));
        System.out.println(palindrome("abcdcba"));

    }

    // public static int gcd (int n, int m){
    // int smaller=(n<m?n:m);
    // for (int i = smaller; i >1; i--) {
    // if (n%i==0 && m%i==0) {
    // return i;
    // }
    // }
    // return 1;
    // }

    public static boolean palindrome(String x){
        if(x.length()==1 || x.length()==0){
            return true;
        }
            
            return (x.charAt(0)==x.charAt(x.length()-1)) && palindrome(x.substring(1, x.length()-1));
        }
    
        public static boolean isPalindrome(String str) {
            // Base case: if the string has 0 or 1 characters, it's a palindrome
            if (str.length() <= 1) {
                return true;
            }
    
            // Check if the first and last characters are the same
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                // If the first and last characters match, check the rest of the string
                // excluding the first and last characters
                return isPalindrome(str.substring(1, str.length() - 1));
            } else {
                // If the first and last characters do not match, it's not a palindrome
                return false;
            }
        }
    

    public static int log(int a, int base){
        if(a==1){
            return 0;
        }else if (a>0){
            return log(a/base , base)+1;
        }else {
            return 99999999;
        }
    }



    public static int recursiveGcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return recursiveGcd(m, n % m);

    }

    public static int divide(int a, int b) {
        if (a > 0 && b > 0 || a < 0 && b < 0) {
            return divide(a - b, b) + 1;
        } else if (a < 0 && b > 0 || a > 0 && b < 0) {
            return divide(a + b, b) - 1;
        } else if (b == 0) {
            return 999999999;
        } else {
            return 0;
        }

    }

    public static void printOdd1Ton(int n) {
        if (n > 0) {
            if (n % 2 == 1) {
                printOdd1Ton(n - 2);
                System.out.print(n + " ");
            } else {
                printOdd1Ton(n - 1);
            }
        }

    }

    public static void printOdd1Ton_v2(int n) {
        if (n > 0) {
            if (n % 2 == 0) {
                printOdd1Ton_v3(n - 1);
            } else {
                printOdd1Ton_v3(n);
            }
        }
    }

    public static void printOdd1Ton_v3(int n) {
        if (n > 0) {
            printOdd1Ton_v3(n - 2);
            System.out.print(n + " ");
        }
    }

}
