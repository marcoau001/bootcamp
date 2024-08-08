public class DemoForLoop {
    public static void main(String[] args)  {
        int x = 3;
        x *=3;
        x *=3;
        x *=3;
        System.out.println(x); //81


        int y=3;
        for (int i = 0; i < 3; i++) { // (counter initialization ; continue condition; counter + 1)
            y = y*3;
            System.out.println(y);

        }
        // step 1: int i=0
        // step 2: i < 3 -> true
        // step 3: y= y*3
        // step 4: i++ -> 1
        // step 5: i < 3 -> true
        // step 6: y = y * 3
        // step 7: i++ -> 2
        // step 8: i < 3 -> true
        // step 9: y = y * 3
        // step 10: i++ -> 3
        // step 11: i < 3 -> false
        // step 12: Exit the loop

        //Example 1
        //Print 5 times Hello World
        for(int i = 0 ; i<5 ; i++){
            System.out.println("Hello world");
        }

        //Example 2
        //we can use i for other purpose
        for( int i=0; i<6; i++) {
            System.out.println(i);
        }

        //Ecample 3
        // print all odd numbers between 0-10
        // loop and if 
        for (int i=0; i<11 ; i++){
            if  (i%2 == 1){ 
                System.out.println(i); 
}
        }

        //Example 4
        //10
        //8
        //6
        //4
        //2

        // Approach 1

        for (int i=11; i>0 ; i--) {
            if (i % 2==0) {
                System.out.println(i);
            }}

            // Approach 2
            for (int i = 0; i<10 ; i++) {
                if (i %2 ==0){
                System.out.println( 10 -i);
            }
               }

               //Example 5
               //
               String str = "abcdefghijk";  //the index of the last character 'k' is length() -1
               //"acegik"
               //loop, if, charAt, length

        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
               str2 += str.charAt(i);
            }
        }
       System.out.println(str2);

       // Example 6
       String s2 = "bbaaaacceeef";
       //
       char target = 'e';
       // the number of charater e is 3
        int count = 0;

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("The number of character '" + target + "' is: " + count);


        // the number of character e is 3

        // Example 7 -counting
        // 1-100
        //divided 3 or divided 4

        count = 0;
        for (int i = 1 ; i<101 ; i++) {
            if (i%3 ==0 || i%4 ==0) {
                count++;
            }
        }
        System.out.println("count="+count);

        // Example 8
        //Find the total number, which sum all odd numbers 
        // and subtratct all even numbers between 1-50


        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i < 51; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        int total = oddSum - evenSum;

        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Total (Sum of odd numbers - Sum of even numbers): " + total);

        //Example 9
        String s3 = "abcdxyzijk";
        //print the index of j. If j is not found, print -1.

        boolean found = false;
        int pos= -1;
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == 'j') {
               found = true;
               pos = i;
            }
        }
        int idx = -1;
        if (found) {
            idx = pos;
        }
        System.out.println("Position of j=" + idx);

        // Alternative
        System.out.println(s3.indexOf('j')); //8

        //Example 10
        String s4 = "hello";
        //check if the last character is o -> true
        char targetEndWith = 'o';

        boolean endsWithTarget = s4.charAt(s4.length() - 1) == targetEndWith;

        System.out.println("Does the string end with '" + targetEndWith + "'? " + endsWithTarget);

        // endsWith(), startsWith()
        System.out.println(s4.endsWith("o"));
        System.out.println(s4.startsWith("he"));
        System.out.println(s4.startsWith("eh"));

        //substring
        String s5 = "abcdefghik";
        // Find "def"
        System.out.println(s5.contains("def"));
        // find the index between 2 and 4
        System.out.println(s5.substring(2, 5)); //cde
        System.out.println(s5.indexOf("abc"));//0
        System.out.println(s5.substring(0,3));//abc

        //example 11
         String s6 = "abcdefghik";
         String substring = "def";
         // Don't use indexof() or contains()
         // for loop
         // Found or not found

         // Nested Loop
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j< 2; j++){
                System.out.println("i=" + i + ",j=" +j);
         }
        }
        // i=0, j=0
        // i=0, j=1
        // i=1, j=0
        // i=1, j=1
        // i=2, j=0
        // i=2, j=1

        //Example 12
        // break
        for( int i=0; i<5; i++){
            System.out.println("hello");
            if( i >=3) {
                break;
            }
        }
        //hello
        //hello
        //hello
        //hello
        
        //Example 13
        // break - searching
        String s7 ="ijkdef";
        found = false;
        for (int i= 0; i< s7.length(); i++) {
            if (s7.charAt(i) == 'k') {
                found = true;
                break; //break the loop
            }
        }

        //Example 14
        // continue - skip some pattern
        for (int i = 0; i< 50; i++) { //0-49
            //if (i % 2 ==1) {}
            if (i % 2 ==0) {
                continue; //skip the rest of code for current iteration
            }
            if (i> 30){
                break;
            }
            System.out.println(i); //odd number
        }

        //Example 15
        // *****
        for (int i = 0; i< 5; i++) {
            System.out.println("*");
        }
        System.out.println("");

        //Example 16
        //***** 
        //****
        //***
        //**
        //*
        
        //Nested Loop (i and j)
        //
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

     






    }
}
