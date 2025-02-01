import java.lang.String;
import java.util.Scanner;

class Stringexc {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String os = obj.nextLine();
        System.out.print("Enter the starting position (n): ");
        int n = obj.nextInt();
        System.out.print("Enter the number of characters to extract (m): ");
        int m = obj.nextInt();
        if (n > 0 && n <= os.length() && (n + m - 1) <= os.length()) 
        {
            String es = os.substring(n - 1, n - 1 + m);
            System.out.println("Extracted string: " + es);
        } else {
            System.out.println("Invalid starting position or number of characters to extract.");
        }

        obj.close();
    }
}