import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void displayValue() {
        System.out.println("Value: " + value);
    }

    // Method using an unbounded wildcard
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // Method using an upper-bounded wildcard
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    // Method using a lower-bounded wildcard
    public static void addIntegers(List<? super Integer> list) {
        list.add(10); 
    }
}

class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(100);
        integerBox.displayValue();

        Box<String> stringBox = new Box<>("Hello");
        stringBox.displayValue();

        // Wildcard with an unbounded type
        List<Object> objectList = new ArrayList<>();
        objectList.add(1);
        objectList.add("Hello");
        objectList.add(3.14);
        objectList.add('A');
        
        System.out.println("Printing list with unbounded wildcard:");
        Box.printList(objectList);

        // Wildcard with upper-bounded type
        List<Number> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20.5);
        numberList.add(3.14);

        System.out.println("\nPrinting list with upper-bounded wildcard:");
        Box.printNumbers(numberList);

        // Wildcard with lower-bounded type
        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("\nAdding integers using lower-bounded wildcard:");
        Box.addIntegers(numbers);
        System.out.println(numbers);
    }
}
