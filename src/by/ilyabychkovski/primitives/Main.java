package by.ilyabychkovski.primitives;

public class Main {

    public static void main(String[] args) {

        int i = 100;
        byte b = (byte) i; //4
        long l = i + 948; //64
        short s = (short) l; //16
        double d = i + 45.754; //64
        char c = '!'; //16

        int i2 = 180;
        long l2 = i2;
        boolean isAdult = true;

        if (!isAdult) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println(2<2);
        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("long " + l);
        System.out.println("double " + d);
        System.out.println("char " + d * l + c);
    }
}
