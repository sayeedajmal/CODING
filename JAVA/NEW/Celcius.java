package JAVA.NEW;

import java.util.Scanner;
public class Celcius
{
    public static void main( String args[]) 
    {
        Scanner input = new Scanner(System.in);
        double temperature;
        System.out.println("Enter temperature in forhenhit::");
        temperature =input.nextDouble();
        input.close();
        //Converting Forhenhit into Celcius
        temperature=(temperature-32)*5/9;
        //Displaying the converted Temperature 
        System.out.println("Temperature in Celsius:"+temperature);
    }
}

class BC
{
    double pie;
    void find()
    {
        pie=22.0/7.0;
    }
}
class DC extends BC
{
    double a;
    void area( int r) {
        a = pie * r * r;
        System.out.println("Area of circle:" + a);
    }
}

class DD extends BC
{
    double Circum;
    void Circum( int r) 
    {
        Circum= 2 * pie * r;
        System.out.print("Circumference of circle:" +Circum);
    }
}

class EXTREME 
{
    public static void main( String args[])
    {
        DC i=new DC();
        i.find();
        i.area(5);
        DD ib=new DD();
        ib.find();
        ib.Circum(5);
    } 
}
