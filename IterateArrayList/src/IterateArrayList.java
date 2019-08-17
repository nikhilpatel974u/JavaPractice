
import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		int size = l.size();

		System.out.println("While loop : ");
		Iterator itr = l.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Advanced For Loop : ");
		for (Object obj : l)
		{
			System.out.println(obj);
		}

		System.out.println("For Loop : ");
		for (int i = 0; i < size; i++)
		{
			System.out.println(l.get(i));
		}
	}
}
