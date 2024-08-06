public class DemoMathOperation {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int x =10+3;
        System.out.println(x);

        x = x + 3 - 9;
        System.out.println(x);

        x=x-5*2;
        System.out.println(x);

        int remainder = 5%2;
        System.out.println(remainder);

        System.out.println(0/10); //0

        int j=2;
        System.out.println(10/j); //5
        // should avoid j become 0 ,before you decided to "10/j"

    // double 
    // +, -, *, /, %
    // / zero

    double ka = 2.2+3;
    double a = 2.5-4;
    double ab = 2.5*4;
    double ac = 2.5/4;
    double ad = 2.5/0;
    double kad = 2.5/4;

    System.out.println(ka);
    System.out.println (a);
    System.out.println(ab);
    System.out.println(ac);
    System.out.println(ad);
    System.out.println(kad);

    int apples = 3;
    int oranges = 10;
    double priceperApple=3.3;
    double priceperOrange=5.5;
    double totalAmount = (apples*priceperApple+oranges*priceperOrange);
    System.out.println(totalAmount);
     
    int maths = 90;
    int english = 78;
    int history = 62;
    double averageScore = (maths +english +history) /3;

    //(int+int+int) / int
    // int/ int
    // -> int
    // 230 /3 ->>76.6666

    System.out.println(averageScore); //76

    // ++x, x++, --x, x--
    int k=0;
    int o = k++ + 3;// k +3 -> result (after assignment , k+1)
    // k++ + 3
    // 1. k+3
    // 2. Assignment
    // 3. k+1
    System.out.println(o); // 3
    System.out.println(k); // 1

    int u = 0;
    int e = ++u + 3;
    // 1. u + 1
    // 2. u + 3
    // 3. Assignment (assign to e)
    System.out.println(e); //4
    System.out.println(u); //1

    // you practice x-- and --x yourself, same as above

    int u10 = 0;
    int e10 = --u10 + 3;
    System.out.println(u10); //-1
    System.out.println(e10); //2

    int u11 =0;
    int e11 = u11-- + 3;
    System.out.println(u11); //-1
    System.out.println(e11); // 3

    

}
}
