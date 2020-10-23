/**
 * Created by LG
 * Date: 2020-10-23
 * Time: 11:51
 * Project: myTry
 * Copyright: MIT
 * To change this template use File | Settings | File Templates.
 */

// Point är en klass som beskriver punkter.
//i ett vanligt tvådimensionellt koordinatsystem. (en punkt i 2D koordinats)


public class Point {

    // Instansvariabler
    double x;  // x-koordinat
    double y;  // y-koordinat

    /**
    Referensvariabler som parametrar

     * En metod som beräknar avståndet mellan två punkter
     * @param p1 är den första punkten
     * @param p2 är den andra punkten
     * @return avståndet

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(
                (p2.x – p1.x) * (p2.x – p1.x) +
                (p2.y – p1.y) * (p2.y – p1.y)
);
    }*/

    public static double distance(Point p1, Point p2) {

        /**
         *         not necessary
         *         double x1 = p1.x;
         *         double y1 = p1.y;
         *         double x2 = p2.x;
         *         double y2 = p1.y;
         */

        // Beräkna avståndet
        double distance = Math.sqrt(Math.pow(p2.x - p1.x, 2) + (p2.y - p1.y) * (p2.y - p1.y));

    }
}
