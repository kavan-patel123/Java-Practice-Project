
//array delete in 1 index 11

public class Logic_14{
    public static void main(String []args)
    {

        int[] arr={10,11,20,30,40,50,60};
        
        int deleteindex=1;
        

        for(int i=deleteindex; i < arr.length-1 ; i++)
        {

            arr[i]=arr[i+1];
            
        }

        arr[arr.length-1]=0;
        
        for(int i=0; i < arr.length ;i++)
        {

            System.out.print(arr[i]+" ");
        }
    }
}