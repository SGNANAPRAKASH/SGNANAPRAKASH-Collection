package com.MavenTask.Collection;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner s=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<String>();
        String a[]= {"Gnana","Prakash","Chandra","Sekhar","Siva","Govinda","Kumar","Sai","Basava","Abdul"};
        for(int i=0;i<a.length;i++)
        {
        	al.add(a[i]);
        	System.out.println("After Adding:");
        	System.out.println(al);
        }
        System.out.println("Enter No.Of Strings to be Added:");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
        System.out.println("Enter String to be Added:");
        String b=s.next();
        al.add(b);
        System.out.println("After Adding:");
        System.out.println(al);
        }
        System.out.println("Enter No.Of Strings to be Removed:");
        int n1=s.nextInt();
        for(int i=0;i<n1;i++)
        {
        System.out.println("Enter index value to be Removed");
        int r=s.nextInt();
        al.remove(r);
        System.out.println("After Removing:");
        System.out.println(al);
        }
        System.out.println("Enter Index Value to be Getted:");
        int x = s.nextInt();
        System.out.println("After Getting, The Element are:"+al.get(x));
        s.close();
        
    }
}
