



    class Student
    {
        String name;
        int roll_no;
        static String  univercityname = "du";
        static int  count=0;

        public void getter(String name,int roll_no)
        {
            this.name=name;
            this.roll_no=roll_no;

            // System.out.println("name is"+name);
            // System.out.println("roll no is"+roll_no);

        }


        static void display()
        {
            System.out.println("univercity name = "+univercityname);
        }


            Student(){

                count++;

            }
        
            void setter()
            {

            System.out.println("name "+name);
            System.out.println("roll no "+roll_no);
            System.out.println(Student.univercityname);
        


        }
    }

    class Studinfo
    {
        public static void main(String [] args)
        {
            Student s1 =new Student();
            Student s2=new Student();

            s1.getter("kavan",128);
            s2.getter("savan",122);

            s1.setter();
            s2.setter();

    

           // System.out.println(Student.univercityname);

        System.out.println("total student =   "+Student.count);



        

        
        }
    }