//એક Array લો. તેમાં કેટલી સંખ્યા એકી (Odd) છે અને કેટલી બેકી (Even) છે, તેની ગણતરી (Count) કરીને પ્રિન્ટ કરો./

public class Logic_3{
    public static void main(String []args)
    {
        int[] arr={12,33,23,45,66,77,43,22,55,55,66};
        int evencount=0;
        int oddcount=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 ==0)
            {
                evencount++;
                //System.out.println("even :"+evencount);
            }
            else{
                oddcount++;
            }
        }

        System.out.println("even :"+evencount);
        System.out.println("odd  :"+oddcount);

    }
}