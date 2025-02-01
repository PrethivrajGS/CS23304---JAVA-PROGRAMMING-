class Main
{
    public static void main(String[] arg)
    {
        System.out.println("OVERLOADING MAIN");
        main(30);
        main(23.7f);
        main("GSP");
    }
    public static void main(int num)
    {
        System.out.println("NUMBER IS:"+num);
    }
    public static void main(float number)
    {
        System.out.println("FLOAT NUMBER IS:"+number);
    }
    public static void main(String msg)
    {
        System.out.println("MESSAGE IS:"+msg);
    }
}