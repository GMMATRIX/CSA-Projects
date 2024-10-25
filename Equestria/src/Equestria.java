public class Equestria {
    public static void main(String[] args) {
        double diameter = 22;
        System.out.println(roadTrip(diameter));
        System.out.println(distance(25, 24, 16, 14));
        System.out.println(threeWayStop(18, 20, 19, 10, 14, 7));
        System.out.println(totalTrip(18, 20, 19, 10, 14, 7));
    }  
 
    public static double roadTrip(double diameter) {
        double circumference = Math.PI*diameter;
        return circumference;
    }
 
    public static double distance(double x1, double y1, double x2, double y2){
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return d;
    }
 
 
    public static double threeWayStop(double x1, double y1, double x2, double y2, double x3, double y3){
        double d1 = distance(x1, y1, x2, y2);
        double d2 = distance(x2, y2, x3, y3);
        return (d1 + d2);
    }
 
    public static double totalTrip(double x1, double y1, double x2, double y2, double x3, double y3){
        double d1 = distance(x1, y1, x2, y2);
        double d2 = distance(x1, y1, x3, y3);
        double d3 = distance(x2, y2, x3, y3);
        double totaldistance = d1 + d2 + d3;
        return totaldistance;
    }
}
 


