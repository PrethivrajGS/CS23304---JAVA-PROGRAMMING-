
interface MinMax<T extends Comparable<T>> {
    T getMin();   
    T getMax();  
}

class NumberSet<T extends Comparable<T>> implements MinMax<T> {
    private T[] numbers;

    public NumberSet(T[] numbers) {
        this.numbers = numbers;
    }
    public T getMin() {
        T min = numbers[0];
        for (T num : numbers) {
            if (num.compareTo(min) < 0) {
                min = num;
            }
        }
        return min;
    }
    public T getMax() {
        T max = numbers[0];
        for (T num : numbers) {
            if (num.compareTo(max) > 0) {
                max = num;
            }
        }
        return max;
    }
}

class Main {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {10, 20, 30, 40, 5};
        NumberSet<Integer> intSet = new NumberSet<>(intArray);
        System.out.println("Integer Set - Min: " + intSet.getMin() + ", Max: " + intSet.getMax());

        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 0.5};
        NumberSet<Double> doubleSet = new NumberSet<>(doubleArray);
        System.out.println("Double Set - Min: " + doubleSet.getMin() + ", Max: " + doubleSet.getMax());

        // String array
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date"};
        NumberSet<String> stringSet = new NumberSet<>(stringArray);
        System.out.println("String Set - Min: " + stringSet.getMin() + ", Max: " + stringSet.getMax());
    }
}
