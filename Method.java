/*
 now class for students

*/

class Method

{
 
 private int rno;
private String name;
private int marks;
private static String pn="kamal sir";


public Student(int rno,String name, int marks)
   {
this.rno=rno;    
this.name=name;
this.marks=marks;
  
    }

public void display()
{
System.out.println("rno="+ rno);
System.out.println("name="+ name);
System.out.println("marks="+ marks);
System.out.println("prof name="+ pn);



}
public void findGrade()
{
if(marks>80)  System.out.println("Grade A");
else if(marks>60) System.out.println("Grade B");
else System.out.println("Grade C");
}
}




class P3
{
public static void main(String args[])

{
Student s= new Student(10,"tejas",95);

s.display();
s.findGrade();
}

}