// Program Name      Project1.java
//Course:            CSE1301J(Java)-section 002
//Student Name:      Juan Aguirre
//Assignment#        Project1
//Due Date:          9/11/2014        
// Purpose:          Create a program that will calculate the time for someone to cut the a yard in minutes. 

import java.util.*;

public class Project1{

   public static void main(String args []){
      calculate(1500, 1600, 500, 700);
      System.out.println("");
      calculate(4850, 6000, 1000, 2000);     
      System.out.println("");
      calculate(1400,900,600,300);
      System.out.println("");
   }
   
  public static void calculate  int yardLength int yardWidth int houseLength int houseWidth
      System.out.println ("Length: "+yardLength+" Width: "+yardWidth+" area of yard");

      System.out.println ("Length: " +houseLength+" Width: "+houseWidth+" area of house");

      int areaToCut = (yardLength  * yardWidth)-(houseLength * houseWidth);
      System.out.println("Area to be cut in square feet:"+areaToCut);

      double timeToMow= areaToCut/2.0/60.0;
      System.out.println ("Time to mow the yard in minutes: "+timeToMow);
   }
   
}