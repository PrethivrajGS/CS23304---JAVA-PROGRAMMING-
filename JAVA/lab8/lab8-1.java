import java.util.*;
import java.io.*;
interface animal
{
    void sound();
    
}
interface bird
{
    void swim();
    void fly();
}
class dog implements animal//interface implement of first method
{
    public void sound()
    {
        System.out.println("the dog is barking");
    }
}
class duck implements animal,bird//second method
{
     public void sound()
    {
        System.out.println("the duck cannot bark");
    }
    public void swim()
    {
        System.out.println("Duck swims");
    }
    public void fly()
    {
        System.out.println("duck can fly");
    }
}
class Main
{
    public static void main(String[] arg)
    {
        animal d=new dog();
        bird b=new duck();
        d.sound();
        System.out.println("-----------------");
        b.swim();
        b.fly();
    }
}