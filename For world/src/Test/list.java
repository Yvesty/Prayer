package Test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			if ("abc2".equals(str)) {
				list.add("itcast");
			}
		}
		System.out.println(list);
	}
}
