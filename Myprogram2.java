import java.util.*;
 class Qube{
	public void Find(int l , int w, int h){
	
	int Find = l * w * h;
	System.out.println("qube is "+Find);

	
}

}

  class Myprogram2{
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);

	Qube c1 = new Qube();


	System.out.println("enter L");
	int l = sc.nextInt();

	System.out.println("enter w");
	int w = sc.nextInt();
	
	System.out.println("enter h");
	int h = sc.nextInt();

	c1.Find(l,w,h);
	sc.close();
	
	
        }
}