import java.util.Random;
import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        //1. Get a random integer between 0 and 2000 and save in i
        int i = new Random().nextInt(2000);
        
        System.out.println("Random int: " + i);
        
        String binNumberString = Integer.toBinaryString(i);
        System.out.println("Bynary string length: " + binNumberString.length());

        //2. Count and save to n the number of the major significant bit of the
        //dropped number
        //Since the bits are numbered with 0, we subtract 1 from the length of 
        //the string.
        int n = binNumberString.length() - 1;
        System.out.println("The number of the highest significant bit of the dropped number: " + n);
        
        //3. Find all multiples of n numbers ranging from i to Short.MAX_VALUE
        //save to array m1
        int quantityMultipleNumbers = 0;
        
        //Because the number of array elements to create it is unknown.
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n == 0) {
                quantityMultipleNumbers++;
            }
        }
        //Create an array of integers. The array size is quantityMultipleNumbers. 
        int[] m1 = new int[quantityMultipleNumbers];


        //Write to the array m1 multiples of the number n values in the range 
        //(i; Short.MAX_VALUE)
        int index = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n == 0) {
                m1[index++] = j;
            }
        }

        System.out.println(Arrays.toString(m1));

        //4. Find all non-multiple n numbers in the range from Short.MIN_VALUE
        //to i and store in m2 array
        int quantityNotMultipleNumbers = 0;
        
        //Because the number of array elements to create it is unknown.
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%n != 0) {
                quantityNotMultipleNumbers++;
            }
        }
        //Create an array of integers. The array size is multiplesСounter. 
        int[] m2 = new int[quantityNotMultipleNumbers];


        //Write to the array m2 non-multiple number n values in the range 
        //(Short.MIN_VALUE; i)
        int counter = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%n != 0) {
                m2[counter++] = j;
            }
        }

        System.out.println(Arrays.toString(m2));
    }
}
