package com.emmabanuelos;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//1. Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
            int[] numArr = {1, 1, 2, 3, 5, 8};
            System.out.println(Arrays.toString(numArr));
//       the below code printed in a single line but multiple times.
//            for (int i : numArr) {
//                System.out.println(Arrays.toString(numArr));
//            }
//        for (int i = 0; i < 0; i++){
//            System.out.println(i);
//        }

//2. Loop through the array and print out each value, then modify the loop to only print the odd numbers.

//        int[] oddNumbers = new int [];
//        System.out.println("Odd Numbers:");
//        for (int i = 0; i < 0; i++)
//        {
//           if(oddNumbers[i] % 2 ==0){
//               System.out.print(oddNumbers[i]+" ");
//           }
//        }
        //having trouble with this one. number 2


//3.Use the split method to divide the given string at each space and store the individual words in an array. If you need to review the method syntax, look back at the String methods table.
       String drSeuss =  "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String []charArr = drSeuss.split(" "); /* the delimiter "\\." after split helps with the periods*/
        System.out.println(Arrays.toString(charArr));


        }
    }

