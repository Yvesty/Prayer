package Test;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo {
	public void Execute(List<String> list,String type) {
		LinkedList<String> linked_list = (LinkedList) list;
		
		try {
			if (type.equals("0")) {
				linked_list.addFirst("U0");
			} else if (type.equals("1")) {
				linked_list.addFirst("U1");
			}else if (type.equals("2")) {
				linked_list.addFirst("U2");
			}else if (type.equals("3")) {
				linked_list.addFirst("U3");
			}else if (type.equals("4")) {
				linked_list.addFirst("U4");
			}
		} catch (Exception e) {

		}
		List arrayList = Arrays.asList("U5","U6","U7");
		arrayList.add("U8");
	}
}
