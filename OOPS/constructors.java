public class constructors {
    public static void main(String args[]) {
        Student s1 = new Student();
    }
}

// use of constructors
    class Student {
        String name;
        int rollno;

        Student() {
            System.out.println("Constructor is called ...");
        }
    }
