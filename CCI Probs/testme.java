import java.util.*;

public class testme{
	int a;
	public testme(int v){
		a=v;
	}
	public static void main(String[] args){
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		Integer a = new Integer(5);
		Integer b = new Integer(5);
		Character q = '1';
		Character w = '1';
		System.out.println("a==b? "+a.equals(b));
		System.out.println("q==w? "+q.equals(w));
		System.out.println("--------------------");
		testme t1 = new testme(1);
		testme t2 = new testme(1);
		System.out.println("t1==t2? "+t1.equals(t2));

	}
}