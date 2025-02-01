import java.lang.*;
class Task implements Runnable {//Runnable interface
    public void run() {
        System.out.println("Task is running");
    }
}

class main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();
    }
}
