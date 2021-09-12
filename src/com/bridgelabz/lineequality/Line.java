package com.bridgelabz.lineequality;

public class Line
{

    public double line1(int x1, int y1, int x2, int y2)
    {
double lengthOfLine = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
System.out.println("Length of Line one = " + lengthOfLine);
return  lengthOfLine;
}

    public double line2(int x1, int y1, int x2, int y2)
    {
        double lengthOfLine = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Length of Line two = " + lengthOfLine);
        return  lengthOfLine;
    }
}
