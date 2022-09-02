package MyPackage;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int MinInt = Integer.MIN_VALUE;
        int MaxInt = 2_147_4836_47;
        System.out.println("Minimum Int = " + (MinInt/2.1));
        System.out.println("Maximum Int = " + (MaxInt/2.1));

        byte MinByte;
        MinByte = Byte.MIN_VALUE;
        byte MaxByte = Byte.MAX_VALUE;
        System.out.println("Minimum Byte = " + (MinByte/2.1));
        System.out.println("Maximum Byte = " + (MaxByte/2.1));

        long MinLong = Long.MIN_VALUE;
        long MaxLong = Long.MAX_VALUE;
        System.out.println("Minimum Long = " + MinLong);
        System.out.println("Maximum Long = " + MaxLong);

        short MinShort = Short.MIN_VALUE;
        short MaxShort = Short.MAX_VALUE;
        System.out.println("Minimum Short = " + (MinShort/2.1));
        System.out.println("Maximum Short = " + (MaxShort/2.1));

        float MinFloat = Float.MIN_VALUE;
        float MaxFloat = Float.MAX_VALUE;
        System.out.println("Minimum float = " + (MinFloat/2.1));
        System.out.println("Maximum float = " + (MaxFloat)/2.1);

        double MinDouble = Double.MIN_VALUE;
        double MaxDouble = Double.MAX_VALUE;
        System.out.println("Minimum double = " + (MinDouble)/2);
        System.out.println("Maximum double = " + (MaxDouble)/2);

        //---------------------------------------------------------
        double poundWeight = 200d;
        double poundKilogram = 0.45359237;

        System.out.println(poundWeight + " Pound, is equivalent to "+ poundWeight*poundKilogram + " Kilogram");
    }
}