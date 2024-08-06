public class DemoPrimitive {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // every line of java code must end with;
    int x = 100;

    // Declaration
    int y;
    y = -13;
    System.out.println(-13);
    // Re-assignment
    y = 9;
    System.out.println(9);



    System.out.println(x);
    System.out.println(20);
    System.out.println(x);


    int age = 30;
    double q = 30.5;
    System.out.println(30.5);

    double i= 10.0;

    double d1 =3.3;
    double d2 = 3.3d;

    float f2 = 3.3f; // assign float value to float variable
    double d3 = 3.3f; // 3.3f is float value, lower value can be assigned to higher type

    int h = 4; // 4 is int value
    long l1 = 4; //long is a higher level than int: 4 int value -> 4 long value

    long l2 = 4L; // 4L is long value

    // primitives:
    // byte, short, int, long, 
    // float ,double
    // char
    // boolean

    // Integer: byte -> short -> int ->long
    byte b1=3; // from -128 to 127
// assign int value to byte variable
// int value -> byte value (implicity)

int i2 = 3;
//byte b2 = i2; // Java does not allow higher level type to lower level type

int i3 = b1; // ok
 b1 = -128; // ok
 b1 = -126; // out range
 b1 = 127; // ok
 b1 = 125; // out range



    short s1=3; // from -32xxx to 32xxx
    int i1=3 ; // from -2.1b to 2.1b
    long l3=3; // from -2^63 to 2^63

    // 3 is int value 

    s1 =3; // from -32768 to 32767
    // short vs int
    s1 = -32768;
    //s1= 32769;
    s1= 32767;
    // s1 =32768;

    // s1= i3; // i3 is higher level type

     i1 = 3; // from -2.1b to 2.1b
     l3 = 3; // from -2^63 to 2^63

     //int i4 = 3L; // explicity assign long value

     // 
     boolean b2 = false;
     
     System.out.println(b2); // true
     System.out.println(3>2); // true
     System.out.println(2>3); // false

     int i9 = 200;
     System.out.println(i9 > 199); // true

     int age2 = 66;
     boolean isElderly = age2 > 65; // event or definition
     System.out.println(isElderly); // true



}
}


