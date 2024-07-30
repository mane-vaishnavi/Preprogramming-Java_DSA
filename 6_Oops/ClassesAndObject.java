
import java.util.*;
 public class ClassesAndObject {
       public static void main(String[] args) {       
           Pen p1 = new Pen();                    // Constructor. -- Created a pen object p1. -- Objects are created in heap.
           p1.setColor("Blue");     
           System.out.println(p1.color);
           p1.setTip(5);
           System.out.println(p1.tip);
       }
    } 
       
       class Pen {              
        //property & function

        //property
        String color;
        int tip;

        //function
        void setColor(String newColor){
            color = newColor;
        }

        void setTip(int newTip){
            tip = newTip;
        }
       }

       class Student {                    
        //property & function

        //property
        String name;
        int age;
        Float percentage; //cgpa

        //function
        void calcPercentage(Float phy, Float math, Float chem){
           percentage = (phy + math + chem) /3;
        }
       }














    


  













