class SimpleSimplex {
    public static void main(String[] args) {
        double maxZ = 0;  // To store the maximum value of z
        int bestX1 = 0;   // To store the best value of x1
        int bestX2 = 0;   // To store the best value of x2

        // Try different values for x1 and x2
        for (int x1 = 0; x1 <= 3; x1++) {
            // Calculate the maximum possible value for x2 based on the first constraint
            for (int x2 = 0; x2 <= 3; x2++) {  // Limiting x2 to 3 as per the constraint
                // Check if the values satisfy the constraints
                if ((4 * x1 + 3 * x2 <= 12) && (2 * x1 + 4 * x2 <= 12)) {
                    // Calculate z = 4x1 + 7x2
                    double z = 4 * x1 + 7 * x2;
                    
                    // If this value of z is greater than maxZ, update maxZ and best x1, x2
                    if (z > maxZ) {
                        maxZ = z;
                        bestX1 = x1;
                        bestX2 = x2;
                    }
                }
            }
        }

        // Print the best result
        System.out.println("Best solution:");
        System.out.println("x1 = " + bestX1);
        System.out.println("x2 = " + bestX2);
        System.out.println("Maximum Z = " + maxZ);
    }
}