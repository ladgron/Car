/**
 * Created by LG
 * Date: 2020-10-23
 * Time: 12:01
 * Project: myTry
 * Copyright: MIT
 * To change this template use File | Settings | File Templates.
 */
public class PointDemo {
    public static void main(String[] args) {

        // Skapa några punkter
        Point p1 = new Point();
        Point p2 = new Point();

        // Skriv ut referensvariabler
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        System.out.println("-------------");

        //Skriv ut punkterna
        System.out.println("p1(" + p1.x + "," + p1.y + ")");
        System.out.println("p2(" + p2.x + "," + p2.y + ")");

        System.out.println("-------------");

        //Flytta punkt 1 (p1)
        p1.x = 5; // Flytta 5 steg till höger
        p1.y = -5; // Flytta 5 steg neråt

        //Skriv ut p2 och flyttade p1 koordinats
        System.out.println("p1(" + p1.x + "," + p1.y + ")");
        System.out.println("p2(" + p2.x + "," + p2.y + ")");

        // Beräkna avståndet mellan p1 och p2
        double d = Point.distance(p1,p2);
        System.out.printf("Avståndet = %.2f" , Point.distance(p1, p2));

        return;
    }
}
