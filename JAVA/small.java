package JAVA;

class small {
    public static void main( String args[]) {
        for (int i = 0; i < 10; i++) {
            System.out.println(">>>>: " + i);
        }
        System.out.println(">>>>>: "+Math.random());
        int a = 3;
        int b = 4;
        System.out.println(">>>>>: " + Math.max(a, b));
        int time = 12;
        String result = (time > 10) ? "Good morning " : "Good afternoon";
        System.out.println(">>>>>: "+result);
        //"THIS IS SWITCH STATEMENT"//
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }
        System.out.println(">>>>>: "+day);
    }
}