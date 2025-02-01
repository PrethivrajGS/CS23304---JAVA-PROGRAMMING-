interface Greeting {//Anonymous class
    void sayHello();
}
class main{
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello!");
            }
        };
        greeting.sayHello();
    }
}
