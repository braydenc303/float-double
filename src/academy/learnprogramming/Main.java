package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        //There will be no error if float or double are given a whole number value. However, if they are given a decimal value you should to specify whether it is a float or a double by adding an f or a d following the number. If not, java assumes double for the type of any decimal number. Of course you can also use casting though it is not recommended as you can more simply convey the data type with the f following the number.
        float myFloatValue = 5f / 3f;
        //Double is the recommended format for floating point numbers at present for a few reasons. Though they take up more space, because of current chip architecture, modern computers are able to process the double faster than an equivalent float, and many of the libraries that are built for java also default to double, so in order to take advantage of the libraries, it is better to use double in general. Therefore floats will not be used for the remainder of this course.
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println(("myDoubleValue: " + myDoubleValue));

        double myPounds = 200d;
        double myKilos = myPounds * 0.45359237d;
        System.out.println("myKilos: " + myKilos);
        
        //Float and decimal are prone to error where precise calculations are reqired. When precise calculations are required, such as when performing currency calculations, floating point types should not be used.
    }
}