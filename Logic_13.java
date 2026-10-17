
//array insert in 1 index 11

public class Logic_13{
    public static void main(String []args)
    {

        int[] arr={10,20,30,40,50,60,0};
        
        int insertindex=1;
        int newvalue=11;

        for(int i=arr.length-1; i > insertindex ; i--)
        {

            arr[i]=arr[i-1];
            
        }

        arr[insertindex]=newvalue;
        
        for(int i=0; i < arr.length ;i++)
        {

            System.out.print(arr[i]+" ");
        }
    }
}