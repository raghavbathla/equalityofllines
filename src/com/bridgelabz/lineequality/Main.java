package com.bridgelabz.lineequality;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
Line line = new Line();


        System.out.println("Enter Cordinates of First line ");
        System.out.println(" Enter x1 and x2");
        int line1x1 = sc.nextInt();
        int line1x2  =  sc.nextInt();
        System.out.println(" Enter y1  and y2 ");
        int line1y1 = sc.nextInt();
        int line1y2  =  sc.nextInt();

        System.out.println("Enter Cordinates of Second line ");
        System.out.println(" Enter x1 and x2");
        int line2x1 = sc.nextInt();
        int line2x2  =  sc.nextInt();
        System.out.println(" Enter y1  and y2 ");
        int line2y1 = sc.nextInt();
        int line2y2  =  sc.nextInt();

        double lengthOfLine1 = line.line1(line1x1,line1y1,line1x2,line1y2);
        double lengthOfLine2 = line.line2(line2x1,line2y1,line2x2,line2y2);

        if  (lengthOfLine1 == lengthOfLine2)
            System.out.println("Lines are equal");
        else if (lengthOfLine1>lengthOfLine2)
            System.out.println("First Line is greater than Second line");
        else
            System.out.println("First Line is smaller than Second line");
    }
}
