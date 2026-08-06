class Student
{
    int num;

    void display(int num){

        this.num=num;

        System.out.println(+num);
    }
}

class Name{
    public static void main(String [] args)
    {

        Student s1 =new Student();
        s1.display(20);
    }
}