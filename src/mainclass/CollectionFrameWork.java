package mainclass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionFrameWork {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);

		System.out.println(" list " + list);

		for (int i = 0; i < list.size(); i++) {

			System.out.println("list for loop  " + list.get(i));

		}
		
		
		Iterator iterateList = list.iterator();
		
		while(iterateList.hasNext()){
			
			System.out.println(iterateList.next());
			
		}
		

		List<Object> allTypeList = new ArrayList<>();

		allTypeList.add("parth");
		allTypeList.add("parth");
		allTypeList.add("parth");
		allTypeList.add(1);

		allTypeList.add(1);
		allTypeList.add(1);
		allTypeList.add(true);

		System.out.println(" allTypeList " + allTypeList);

		Set unorderSet = new HashSet();

		unorderSet.add("parth");
		unorderSet.add("Parth");
		unorderSet.add("parth");
		unorderSet.add(1);
		unorderSet.add(1);
		unorderSet.add(1);
		unorderSet.add(true);

		Set Orderedset = new LinkedHashSet();

		Orderedset.add("parth");
		Orderedset.add("Parth");
		Orderedset.add("parth");
		Orderedset.add(1);
		Orderedset.add(1);
		Orderedset.add(1);
		Orderedset.add(true);

		System.out.println(" set " + Orderedset);

		Iterator getSetValues = Orderedset.iterator();

		while (getSetValues.hasNext()) {

			System.out.println(" values " + getSetValues.next());
		}

	}

}
