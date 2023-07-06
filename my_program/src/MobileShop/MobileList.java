package MobileShop;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MobileList {

	public Set<Mobile> mob() {
		Mobile ob = new Mobile("redmi", "note 12", 2022, "4gb", 128, "black", 16000, 1000023);
		Mobile ob1 = new Mobile("redmi", "note 12 pro", 2022, "8gb", 256, "blue", 26000, 130012);
		Mobile ob2 = new Mobile("vivo", "v22", 2023, "6gb", 128, "skyblue", 17000, 1242180);
		Mobile ob3 = new Mobile("oppo", " f12", 2022, "6gb", 128, "white", 19000, 1241253);
		Mobile ob4 = new Mobile("vivo", "v32", 2023, "8gb", 256, "black", 48000, 23545432);
		Mobile ob5 = new Mobile("apple", "xi", 2023, "6gb", 128, "black", 140000, 23532590);
		Mobile ob6 = new Mobile("samsung", "m35", 2022, "8gb", 256, "blue", 42000, 90892132);
		Mobile ob7 = new Mobile("samsung", "m12", 2022, "4gb", 64, "white", 10000, 1214312);
		Mobile ob8 = new Mobile("redmi", "note 12", 2022, "4gb", 128, "black", 16000, 1000023);

		Set<Mobile> mobileorder = new LinkedHashSet<>();
	
		mobileorder.add(ob);
		mobileorder.add(ob1);
		mobileorder.add(ob2);
		mobileorder.add(ob3);
		mobileorder.add(ob4);
		mobileorder.add(ob5);
		mobileorder.add(ob6);
		mobileorder.add(ob7);
		mobileorder.add(ob8);
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
		total.forEach((k, v) -> {
			System.out.print(k + " =  ");
			System.out.print(v + "\n");
		});
	}

}