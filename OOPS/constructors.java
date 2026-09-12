public class constructors {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "shradha";
        s1.rollno = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

// use of constructors
    class Student {
        String name;
        int rollno;
        String password;
        int marks[];

        //shallow  Copy Constructor
        // Student(Student s1) {
        //     marks = new int[3];
        //     this.name = s1.name;
        //     this.rollno = s1.rollno;
        //     this.marks = s1.marks;
        // }

        //shallow  Copy Constructor
        Student(Student s1) {
            marks = new int[3];
            this.name = s1.name;
            this.rollno = s1.rollno;
            for(int i=0; i<marks.length; i++) {
                this.marks[i] = s1.marks[i];
            }
        }

        Student() {
            marks = new int[3];
            System.out.println("Constructor is called ...");
        }
        Student(String name) {
            marks = new int[3];
            this.name = name;
        }
    }
