import java.util.Scanner;


public class Assignment {

    public static void main(String[] args) {
        double g=9.8;
        double speed;
        double distance;
        double t;
        Scanner scan=new Scanner(System.in);
        t=scan.nextDouble();
        distance=g*t;
        speed = (g*t*t)/2;
        System.out.println("The speed of the object at " + t + " seconds after its release is " + speed + " and the distance the object has travelled in the " + t + " seconds after the relase is " +distance);
    }



}
