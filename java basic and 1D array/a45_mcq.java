// MCQ
// What is the output of the following snippet?
// int course = 2;
// switch(course) {

// case 1:
// System.out.print("java "); case 2:
// System.out.print("python "); default:
// System.out.print("cpp"); }
// a. java
// b. python
// c. cpp
// d. None
public class a45_mcq {
    public static void main(String[] args) {
        int course=2;
switch(course){
case 1:System.out.println("python"); 
case 2:System.out.println("java"); 
default : System.out.print("cpp"); 
}
    }
}
//option d is correct bcause break statement is not add after case 2