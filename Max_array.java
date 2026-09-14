//max array find 

class Array_max{

    public void maxArrayFind()
    {

        int [] age={23,45,34,56,78,43,23,23,45,67,77};
        int ans=0;

        for(int i=0;i<age.length;i++)
        {
            if(age[i]>ans)
            {
                
                ans=age[i];

            }

        }
        System.out.println("max value is :"+ans);
    }
}


public class Max_array{
    public static void main(String [] args)
    {

        Array_max a1=new Array_max();

        a1.maxArrayFind();

    }
}