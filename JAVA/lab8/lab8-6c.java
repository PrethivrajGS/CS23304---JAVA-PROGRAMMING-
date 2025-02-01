import java.util.Iterator;

class MyIterable implements Iterable<Integer> {
    private int[] numbers = {1, 2, 3};

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            public boolean hasNext() {
                return index < numbers.length;
            }

            public Integer next() {
                return numbers[index++];
            }
        };
    }
}

class main {
    public static void main(String[] args) {
        MyIterable myIterable = new MyIterable();
        for (int number : myIterable) {
            System.out.println(number);
        }
    }
}
