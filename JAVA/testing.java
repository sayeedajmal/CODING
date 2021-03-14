package JAVA;

import java.util.HashSet;

class testing
{
    public static void main( String args[])
    {
        //creating array
         HashSet<String>hset=new HashSet<String>();
         //add element to hashset
         hset.add("FATHER ");
         hset.add("MOTHER");
         hset.add("SAJIDA");
         hset.add("SHOAIB");
         hset.add("RAHEEM");
         hset.add("SAJIDA");
         hset.add("AJMAL");
       //displaying the hashest elements
       System.out.println("Hashset contains:"+hset);
       //creating tthe array
        String[] array=new String[hset.size()];
       hset.toArray(array);
       //display the array elements
       System.out.println("Array elements:");
       for(String temp : array)
       {
           System.out.println(temp);
       }
    }
}