

package main;

import shapes.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        System.out.println("------->JAC 444 Assignment 1<-------\n" +
                "------->Task 1 ... <-------");

        Shape[] shapes = new Shape[32];
        int size = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("Shapes.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] tokens = s.split(",");

                String name = tokens[0];

                //Circle
                if (name.equals("Circle") && tokens.length == 2) {
                    try {
                        shapes[size] = new Circle(Double.parseDouble(tokens[1]));
                        size++;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                //Triangle
                if (name.equals("Triangle") && tokens.length == 4) {
                    try {
                        shapes[size] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
                        size++;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                //Square
                if (name.equals("Square") && tokens.length == 2) {
                    try {
                        shapes[size] = new Square(Double.parseDouble(tokens[1]));
                        size++;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                //Rectangle
                if (name.equals("Rectangle") && tokens.length == 3) {
                    try {
                        shapes[size] = new Rectangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                        size++;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                //Parallelogram
                if (name.equals("Parallelogram") && tokens.length == 3) {
                    try {
                        shapes[size] = new Parallelogram(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                        size++;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n" + shapes.length + " shapes were created:");

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                System.out.println(shapes[i]); //Calls toString() method
            }

        }

        System.out.println("------->Task 2 ... <-------");

        Shape min = null, max = null;
        int i = 0;

        while( i < shapes.length )
        {
            //Getting the Smallest Triangle
            if(shapes[i].getClass().getName().contains("Triangle"))
            {
                if(min == null)
                {
                    min = shapes[i];
                }
                else if (min.perimeter() > shapes[i].perimeter())
                {
                    min = shapes[i];
                }
            }

            //Getting the Biggest Circle
            else if (shapes[i].getClass().getName().contains("Circle"))
            {
                if(max == null)
                {
                    max = shapes[i];
                }
                else if(max.perimeter() < shapes[i].perimeter())
                {
                    max = shapes[i];
                }
            }

            i++;
        }

        i=0;

        while (i < shapes.length)
        {
            if(shapes[i].getClass().getName().contains("Triangle") && min.perimeter() == shapes[i].perimeter())
            {
                shapes[i] = null;
            }
            else if(shapes[i].getClass().getName().contains("Circle") && max.perimeter() == shapes[i].perimeter())
            {
                shapes[i] = null;
            }

            i++;
        }

        for (i = 0; i < shapes.length; i++)
        {
            if (shapes[i] != null)
            {
                System.out.println(shapes[i]); //Calls toString() method
            }

        }

        System.out.println("------->Task 3 ... <-------");

        //Calculating total perimeter of Triangle and Parallelogram

        double pTriangle = 0.0, pParallelogram = 0.0;

        for(i = 0; i < shapes.length; i++)
        {
            if(shapes[i] != null)
            {
                if(shapes[i].getClass().getName().contains("Triangle"))
                {
                    pTriangle += shapes[i].perimeter();
                }
                else if(shapes[i].getClass().getName().contains("Parallelogram"))
                {
                    pParallelogram += shapes[i].perimeter();
                }
            }
        }

        System.out.println("Total perimeter of Parallelogram is: " + pParallelogram + "\n" +
                "Total perimeter of Triangle is: " + pTriangle);
    }


}
