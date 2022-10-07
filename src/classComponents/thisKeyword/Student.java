package classComponents.thisKeyword;

public class Student {
    int id;
    String name;

    //zero param
    public Student() {
        System.out.println("zero param");
    }

    public Student(int id) {
        this.id = id;
    }

    //parameterized con
    public Student(int id, String name) {
        //we are calling zero param con from param con
        //Now local variable and instance variable have the same name.
//        this();
        this(1);
        this.id = id;
        this.name = name;
    }
    void m1(){
        System.out.println("m1");
        this.m2();
    }
    void m2(){
        System.out.println("m2");
    }
    void m3(){
        printStudentDetails(this);//this as method argument
    }

    void printStudentDetails(Student student){
        System.out.println(student.id+"\t"+student.name);
    }
    Student getStudent(){
        return this;//this as method return
    }
}
/*
*
What this is ?
	It is keyword which is reference to the current class object

Why to use this?
1. With this keyword we can access current class
	instance variable, instance methods constructor
2. We can pass this as method argument
3. We return this from a method
4. We can differentiate between local variable and instance variable with the help of this keyword

We can call current class only one constructor from another constructor of the same class

** Call to the constructor must be the first line otherwise we get CTE

*** this cannot be used inside the static method or static block
*
* */
