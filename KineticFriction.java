


import java.util.Scanner;
import java.lang.Math;

class KineticFriction {
       
        public static void main(String[] args)
         {
            Scanner scan = new Scanner(System.in);

            char Continue = 'Y'; //Repeat flag

            double theta;
            double Tension;
            double acceleration;
            double mass;
            double gravity = 9.8;
            double KineticFriction;
            String mu = "\u03BC";
            String subscript_k = "\u2096";

            System.out.println("\nThis program calculates kinetic friction of an object being pulled uphill on a slope at angle theta.");

            while (Continue == 'Y')
            {

              System.out.println("\nEnter theta (degrees)");
              theta = scan.nextDouble();

              System.out.println("\nEnter Tension (N).");
              Tension = scan.nextDouble();
            
              System.out.println("\nEnter average X AXIS acceleration (m/s^2) of object.");
              acceleration = scan.nextDouble();
            
              System.out.println("\nEnter mass (kg) of object.");
              mass = scan.nextDouble();
            
            
              gravity = 9.8;

              KineticFriction = ((Tension-(mass*acceleration))/(mass*gravity*Math.cos(Math.toRadians(theta))))-Math.tan(Math.toRadians(theta));

            
              System.out.println("Kinetic Friction (" +mu +subscript_k + "): "+KineticFriction);

              System.out.println("\nContinue? (Y/N)");
              Continue = scan.next().charAt(0);
            }

            System.out.println("OK, stopping");
         }
}
