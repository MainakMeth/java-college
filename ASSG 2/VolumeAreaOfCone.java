import java.util.*;

class VolumeAreaOfCone
{

   public static void main(String[] args)
    {


         Scanner sc= new Scanner(System.in);
         	 System.out.println("Enter the radius of cone:");
         	double r=sc.nextDouble();
          System.out.println("Enter the height of cone:");
         	double h=sc.nextDouble();
	      	System.out.println("Enter the length of cone:");
          double l=sc.nextDouble();
                 double  volume=(22*r*r*h)/(3*7);
                 double curvedsurfacearea=(3.14)*(r*l);
                 double totalarea=(3.14*r*r) + curvedsurfacearea;

             System.out.println("Volume Of Cone is:" +volume);
           System.out.println("curvedsurfacearea Of Cone is:" +curvedsurfacearea);
           System.out.println("totalarea Of Cone is:" +totalarea);
   }
}
