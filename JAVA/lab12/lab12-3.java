class Main {

    // Generic method to print an array of any type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Printing Integer Array:");
        printArray(intArray);  
        
        // String array
        String[] stringArray = {"Hello", "World", "Java"};
        System.out.println("\nPrinting String Array:");
        printArray(stringArray);  

        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("\nPrinting Double Array:");
        printArray(doubleArray); 
    }
}
