
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void display() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}

class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        pair1.display();

        Pair<Double, Character> pair2 = new Pair<>(3.14, 'A');
        pair2.display();
    }
}
