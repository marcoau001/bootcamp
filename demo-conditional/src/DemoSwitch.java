public class DemoSwitch {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int age =18;
        boolean isAdult = false;
        if (age >= 18) {
            isAdult = true;
        }
        System.out.println("isAult=" +isAdult);

        // 1. if you do not "break" the switch case, the flow will go through all cases.
        // 2. "Switch" statement is only for finite scenario
        //3. for case, you can only define one value for checking.. No range checking.
        // 4. for "Switch", Java will check your case value, it alerts when tere is duplication.

        switch (age) {
            case 18:
            isAdult = true; //
            System.out.println("18");
            break;
            case 17:
            isAdult = true; //
            System.out.println("17");
            break;
            case 16:
            isAdult = true; //
            System.out.println("16");
            break;
        }

        //
        String day = "Monday";
        switch (day) {
            case "Monday":
            System.out.println("It is weekday");
            break;
            case "Tuesday":
            System.out.println("It is weekday");
            break;
            case "Wednesday":
            System.out.println("It is weekday");
            break;
            case "Thusday":
            System.out.println("It is weekday");
            break;
            case "Friday":
            System.out.println("It is weekday");
            break;
        default:
        System.out.println("it is weekend");
        }


    }
}
