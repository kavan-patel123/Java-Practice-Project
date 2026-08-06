
public class Sumofevenarray
{
    public static void main(String [] args)
    {

        int [] arr={12,23,45,2,4,6,8,80,45,67,45,67};

        int sum=0;

        for(int i=0;i<arr.length;i++)
{

        if(arr[i]%2==0)
        {
            sum=sum+arr[i];
        }
}
        System.out.println("sum of even array - "+sum);
        
    }
}