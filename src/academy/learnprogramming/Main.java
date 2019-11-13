package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1)); //overflow
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1)); //underflow

        int myMaxIntTest = 2147483647;

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myByteMinValue);
        System.out.println("Byte Maximum Value = " + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myShortMinValue);
        System.out.println("Short Maximum Value = " + myShortMaxValue);

        long myLongValue = 100L;

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myLongMinValue);
        System.out.println("Long Maximum Value = " + myLongMaxValue);

        long myBigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("MyBigLongLiteralValue: " + myBigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myByteMinValue / 2); //casting
        short myNewShortValue = (short) (myShortMinValue /2); //CASTING

        /* MY PRIMITIVE CHALLENGE */
        byte myPrimByte = 45;
        short myPrimShort = 777;
        int  myPrimInt = 111;
        long myPrimLong = 50000L + 10L * (myPrimByte + myPrimShort + myPrimInt);
        System.out.println("MyPrimLong Number is: " + myPrimLong );
        System.out.println("My Total variable has: "+ myTotal);
        System.out.println ("My New Byte Value contains: " + myNewByteValue);
        System.out.println("My New Short Value contains: " + myNewShortValue);
        System.out.println("My Long Value is: " + myLongValue);
        System.out.println("This is my Max Int Test number: " + myMaxIntTest);
        System.out.println("My value: " + myValue);

    }
}
