/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Cheryl Ng
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(1, 2, 3, 4));
        System.out.println(morningGreeting("Cheryl"));
        System.out.println(afternoonGreeting("Cheryl"));
        System.out.println(triple("Hi"));
        System.out.println(half(7));
        System.out.println(roundPositiveValueToNearestInteger(9.49));
        System.out.println(roundNegativeValueToNearestInteger(-9.49));
    }

    // 1. add
    public static int add(int a, int b) {
        return (a + b);
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        int e = add(a, b);
        return e + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!"; // Added space after "Hello"
    }


    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name +"!";
    }

    // 5. triple
    public static String triple(String word) {
        return word + word + word;
    }

    // 6. half
    public static double half(int a) {
        return a / 2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double value) {
        return (int) Math.round(value);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double value) {
        if (value<0){
            return (int) ( value - 0.5);
        }
        else{
            return (int) ( value + 0.5);
        }
    }

}

