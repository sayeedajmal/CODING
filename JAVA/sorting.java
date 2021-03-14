package JAVA;

class sorting
{
    static String name []={"SAYEED AHMED","SHOAIB","SAJIDA","FATIMA","SYERA"};
    public static void main( String args[])
    {
         int size=name.length;
        String temp=null;
        for(int i=0;i<size;i++)
        {
            for (int j=i+1;j<size;j++)
            {
                if(name[j].compareTo(name[i])<0)
                {
                    temp=name[j];
                    name[j]=name[i];
                    name[i]=temp;
                }
            }
        }
        System.out.println("SORTED ORDER LIST:");
        for(int i=0;i<size;i++)
        {
            System.out.println(name[i]);
        }
    }
}