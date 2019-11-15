/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

import java.util.*;
import java.lang.*;
import java.io.*;

class NewMain
{
         public static void main (String[] args) throws java.lang.Exception
         {
                   Scanner sc = new Scanner(System.in);
                   System.out.println("Zadej cislo: ");
                   int cislo=sc.nextInt();

                   //for (int i=1;i<=10;i++)
                      //   {
                           System.out.println();
                           for (int j=1;j<=10;j++)
                           System.out.print(/*i*/cislo*j+" ");
                        // }
         }

}
