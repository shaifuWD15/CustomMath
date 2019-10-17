package saif.dev.myutils;

/**
 * Created by Admin on 10/17/2019.
 */

public class MyMath {

    public static int Plus(int a, int b)
    {
        return a+b;
    }

    public static int Minus(int a, int b)
    {
        return a-b;
    }

    public static int Multiply(int a, int b)
    {
        return a*b;
    }

    public static int Divide(int a, int b)
    {
        if(b == 0)
            throw new IllegalArgumentException("Divided by zero error");
        else
            return a/b;
    }
}
