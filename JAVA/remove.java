package JAVA;

import java.util.LinkedList;
public class remove
{
    public static void main( String args[]) 
    {
        // create an linklist
         LinkedList<String> c = new LinkedList<String>();
        c.add("yellow");
        c.add("red");
        c.add("green");
        c.add("pink");
        c.add("orange");
        c.remove("red");
         System.out.println(c);  
         
         // creating another list
          LinkedList<String> testing=new LinkedList <String>();
         testing.add("SAYEED AHMED");
         testing.add("ROLL NO: 18");
         testing.add("REG NO:307CS18031");
         testing.add("K.C.T. POLYTECHINC (AIDED)");
         for( String s : testing)
         {
             System.out.println(s);
         }
    }
}