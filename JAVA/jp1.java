package JAVA;

class javaprogram {
    int length, width;

    void getdata(int l, int w) {
        l = length;
        w = width;
    }

    void find() {
        int area = length * width;
        System.out.println("Area of Rectangle == " + area);
    }

    public void length(int i) {
    }

    public void width(int i) {
    }
}

class jp1 {
    public static void main(String args[]) {
        javaprogram i = new javaprogram();
        i.getdata(40, 80);
        i.find();
        i.length = 50;
        i.width = 90;
        int area2 = i.length + i.width;
        System.out.println("2nd test of javaprogram== " + area2);
    }
}