
public class AccessModifier {
    public static void main(String[] args) {
        Pen p1 = new Pen(); 
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());                    

        BankAccount myAcc = new BankAccount();
        myAcc.username = "vaishnaviMane";
        myAcc.setPassword("dhkjhdkasa");
    }
}
// Make other classes below Public Class.

class BankAccount{
    public String username;  //access modifirer
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen {
    // properties and functions

    private String color;
    private int tip;

    String getColor() {
        return this.color; // Getter
    }

    void setColor(String newColor) {
        this.color = newColor; // Setter
    }

    int getTip() {
        return this.tip; // Getter
    }

    void setTip(int newTip) {
        this.tip = newTip; // Setter
    }
}