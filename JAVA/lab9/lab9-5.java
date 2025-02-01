import java.util.Scanner;
class InvalidDiskCountException extends Exception {
    public InvalidDiskCountException(String message) {
        super(message);
    }
}

class TowerOfHanoi {

    public static void solveTowerOfHanoi(int n, char source, char target, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + target);
            return;
        }
        solveTowerOfHanoi(n - 1, source, auxiliary, target);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + target);
        solveTowerOfHanoi(n - 1, auxiliary, target, source);
    }

    public static void main(String[] args) {
        int n; // Number of disks
        Scanner obj=new Scanner(System.in);
        System.out.println("enter n:");
        n=obj.nextInt();

        try {
            if (n < 1) {
                throw new InvalidDiskCountException("Number of disks must be a positive integer.");
            }
            
            System.out.println("Moves required to solve Tower of Hanoi with " + n + " disks:");
            solveTowerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are the names of rods
        } catch (InvalidDiskCountException e) {
            System.out.println(e.getMessage());
        }
    }
}
