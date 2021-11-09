// Java program to count the uppercase,
// lowercase, special characters 
// and numeric values

import java.io.*;
import java.math.*;
import java.util.*;

class Count
{
public static int check(String str)
{
	 int upper = 0, lower = 0, number = 0, special = 0;
 for(int i = 0; i < str.length(); i++)
{
            char ch = str.charAt(i);
            int numscore=0,alphlow=0,alphup=0,spechar=0,fin=0;
            if (ch >= 'A' && ch <= 'Z')
            upper++;
            else if (ch >= 'a' && ch <= 'z')
            lower++;
            else if (ch >= '0' && ch <= '9')
            number++;
            else
            special++;
                

        }
 System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
System.out.println("Number : " + number);
System.out.println("Special characters : " + special);
        int us=0,ls=0,ns=0,sps=0;
        if (upper>0)
        {
          us= 26;
        }
  if (lower>0)
  {
  	ls = 26;
  }
  if (number>0)
  {
  	ns = 10;
  }
  if (special>0)
  {
  	sps=32;
  }
 
  int fin;
  fin= us+ls+ns+sps;
  System.out.println(fin);
  return fin;
    }

    public static void main(String args[])

    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        check(str);

       
}}