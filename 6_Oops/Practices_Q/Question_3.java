
public class Question_3 {
    public static void main(String[] args) {
    Vehicle obj1 = new Car();
    obj1.print();    //for overloading (Derived class (car))

    Vehicle obj2 = new Vehicle();
    obj2.print();   //(Base class (Vehicle))
    }
}
class Vehicle{
    void print(){  //same function
        System.out.println("Base class(Vehicle)");       
    }                                                        
}
class Car extends Vehicle{
    void print(){  //same function
        System.out.println("Derived class(Car)");
    }
}