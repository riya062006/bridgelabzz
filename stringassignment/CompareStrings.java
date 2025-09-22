import java.util.Scanner;

public class CompareStrings {
    // User-defined method to compare strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean resultUserDefined = compareUsingCharAt(str1, str2);
        boolean resultBuiltIn = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + resultUserDefined);
        System.out.println("Comparison using equals(): " + resultBuiltIn);

        if (resultUserDefined == resultBuiltIn) {
            System.out.println("✅ Both methods give the same result");
        } else {
            System.out.println("❌ Results are different");
        }
    }
}
