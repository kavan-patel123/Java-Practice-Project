// 45 age is precent in this array

class Array_max{

    public void precentarrayvalue()
    {

        int [] age={23,34,56,45,78,43,23,67,77};
        
        int ans =-1;
        for(int i=0;i<age.length;i++)
        {
            if(45==age[i])
            {
                
                System.out.println("present");

                ans=i;
            
            }
        
        }
                System.out.println("index no :"+ans);
    
    }
}


public class Pracent_value_array{
    public static void main(String [] args)
    {

        Array_max a1 =new Array_max();

        a1.precentarrayvalue();

        

    }
}