package JAVA;

class exception {
    public static void main(String args[]) {
        int num = 10;
        int r;
        try {
            r = num % 2;
            if (r != 0) {
                System.out.println("Number is not Even");
            } else {
                System.out.println("Given Number is Even!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}