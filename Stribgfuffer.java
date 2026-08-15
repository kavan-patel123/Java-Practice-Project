

public class Stribgfuffer{
    public static void main(String [] args)
    {

        String s = new String("kavan sitapara");
        StringBuffer sb = new StringBuffer(s);

    sb.append(5);
    System.out.println(sb);

    sb.insert(5, "kavan");
    System.out.println(sb);

    sb.reverse();
    System.out.println(sb);

    sb.replace(1,2 , s);
    System.out.println(sb);

    sb.delete(7, 8);
    System.out.println(sb);

        
    }
}