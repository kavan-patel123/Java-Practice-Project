
// Array માંથી ફક્ત બેકી સંખ્યા (Even Numbers) નો સરવાળો કરવો
public class Logic_1{
    public static void main(String[] args){

        int[] arr={12,5,21,8,10};
        int evensum=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                evensum=evensum + arr[i];
            }
        }

        System.out.println("sum of even no :"+evensum);
        
    }
}