//• પ્રશ્ન 1 (Number Reverse): એક નંબર લો (જેમ કે 1234), % અને / નો લૂપમાં ઉપયોગ કરીને તેને આખો ઉલટો (4321) કરીને પ્રિન્ટ કરો.


public class Logic_2{
    public static void main(String []args)
    {
        int n=1234;

        while(n>0)
        {
            int ld=n%10;
            n=n/10;
            System.out.print(ld);
            
        }
    }
}