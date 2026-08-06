class Student
{
    int rollno;

    Student(int r){

        rollno = r;

        System.out.println("called cons");

    }
    public void display()
    {
        System.out.println("roll no is : "+rollno);
    }
}

class Myprogram10{
    public static void main(String [] args)
    {
        Student s1 = new Student(128);

        s1.display();
    }
}