public class op {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        p1.setColor("Black");  // Access Modifiers
        System.out.println(p1.getColor());
        BankAccount myAcc = new BankAccount();
        myAcc.username = "shradhaKhapra";
        myAcc.setPassword("abcdefghi");
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) { // accessing a data that is using private keyword
        password = pwd;
    }
}
class Pen {  // class
    private String color; // object
    private int tip;

    int getTip() {
        return this.tip;
    }

    String getColor() {
        return this.color;
    }
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math)/3;
    }
}
