import java.util.Scanner;
class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

class match {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter string");
        String s= obj.next();

        try {
            check(s);
            System.out.println("Matched: " + s);
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void check(String str) throws NoMatchException {
        if (!"India".equals(str)) {
            throw new NoMatchException("NoMatchException: The string is not equal to 'India'.");
        }
    }
}
