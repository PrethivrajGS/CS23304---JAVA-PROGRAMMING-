import java.util.Vector;

 class MIX {
    public static void main(String[] args) {

        System.out.println("Difference between String and StringBuffer:");

        String str1 = "Hello";
        String str2 = str1;  
        str1 = str1.concat(" World!");  
        System.out.println("String Example:");
        System.out.println("str1 after concatenation: " + str1); 
        System.out.println("str2 remains unchanged: " + str2);   

        StringBuffer buffer1= new StringBuffer("Hello");
        StringBuffer buffer2 = buffer1; 
        buffer1.append(" World!");  
        System.out.println("\nStringBuffer Example:");
        System.out.println("stringBuffer after append: " + buffer1);  
        System.out.println("buffer2 reflects the change: " + buffer2);    
      
        System.out.println("\nDifference between Vector and Array:");

        int[] arr = new int[5]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; 
        }
        System.out.println("Array Example (fixed size):");
        for (int i : arr) {
            System.out.print(i + " "); 
        }

       
        Vector<Integer> vector = new Vector<>(); 
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5); 
        System.out.println("\n\nVector Example (dynamic size):");
        for (Integer num : vector) {
            System.out.print(num + " ");
        }
    }
}