package MobileShop;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MobileList {

	public List<Mobile> mob() {
		Mobile ob = new Mobile( "redmi",   "note 12",     2022,  "4gb",  128,   16000,  10000283);
		Mobile ob1 = new Mobile("redmi",   "note 12 pro", 2022,  "8gb",  256,   26000,  13001982);
		Mobile ob2 = new Mobile("vivo",    "v22",         2023,  "6gb",  128,   17000,  12421880);
		Mobile ob3 = new Mobile("oppo",    "f12",         2022,  "6gb",  128,   19000,  12412583);
		Mobile ob4 = new Mobile("vivo",    "v32",         2023,  "8gb",  256,   48000,  23545432);
		Mobile ob5 = new Mobile("apple",   "xi",          2023,  "6gb",  128,  140000,  23532590);
		Mobile ob6 = new Mobile("samsung", "m35",         2022,  "8gb",  256,   42000,  90892132);
		Mobile ob7 = new Mobile("samsung", "m12",         2021,  "4gb",  64,    10000,  12148312);
		Mobile ob8 = new Mobile("redmi",   "note 12",     2022,  "4gb",  128,   18000,  10008023);
		Mobile ob9 = new Mobile("mi",   "note 11",     2021,  "6gb",  256,   28000,  100028023);
		List<Mobile> mobileorder = new LinkedList<>();
	   
		mobileorder.add(ob);
		mobileorder.add(ob1);
		mobileorder.add(ob2);
		mobileorder.add(ob3);
		mobileorder.add(ob4);
		mobileorder.add(ob5);
		mobileorder.add(ob6);
		mobileorder.add(ob7);
		mobileorder.add(ob8);
		mobileorder.add(ob9);
		
		for(int i=0;i<mobileorder.size();i++)
		{
			for(int j=i+1;j<mobileorder.size();j++) {
			if(mobileorder.get(i).equals(mobileorder.get(j)))
			{
				mobileorder.remove(j);
			}
			}
		}
		return mobileorder;

	}

	public Set number(List<Mobile> ob) {
		Set<Integer> n = new LinkedHashSet<Integer>();
		for (int i = 1; i < ob.size(); i++) {
			n.add(i);
		}

		return n;

	}

	public Map<Integer, Mobile> join(Set<Integer> num, List<Mobile> list) {
		Map<Integer, Mobile> detail = new LinkedHashMap<>();
		Iterator<Integer> noGet = num.iterator();
		Iterator<Mobile> listGet = list.iterator();
		while (noGet.hasNext()) {

			detail.put(noGet.next(), listGet.next());
		}

		return detail;

	}

	public void display(Map<Integer, Mobile> total) {
		System.out.println("list.no -- mobilename -- model-- year -- ram -- capacity -- price -- imei.no");
		total.forEach((k, v) -> {
			System.out.print(k + " =        ");
			System.out.print(v + "\n");
		});
	}

}