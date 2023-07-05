package MobileShop;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MobileList {

	public List<Mobile> mob()
	{
		Mobile ob= new Mobile("redmi","note 12",2022,"4gb",128,"black",16000);
		Mobile ob1= new Mobile("redmi","note 12 pro",2022,"8gb",256,"blue",26000);
		Mobile ob2= new Mobile("vivo","v22",2023,"6gb",128,"skyblue",17000);
		Mobile ob3= new Mobile("oppo"," f12",2022,"6gb",128,"white",19000);
		Mobile ob4= new Mobile("vivo","v32",2023,"8gb",256,"black",48000);
		Mobile ob5= new Mobile("apple","xi",2023,"6gb",128,"black",140000);
		Mobile ob6= new Mobile("samsung","m35",2022,"8gb",256,"blue",42000);
		Mobile ob7= new Mobile("samsung","m12",2022,"4gb",64,"white",10000);
         List<Mobile>  mobileorder= new LinkedList<>();
         mobileorder.add(ob);
         mobileorder.add(ob1);
         mobileorder.add(ob2);
         mobileorder.add(ob3);
         mobileorder.add(ob4);
         mobileorder.add(ob5);
         mobileorder.add(ob6);
         mobileorder.add(ob7);
        return mobileorder;	
       
	}
	
	public Set<Integer> imeinumber()
	{
		Set<Integer> imei= new LinkedHashSet<>();
		
		imei.add(100000);
		imei.add(112324);
		imei.add(143234);
		imei.add(165433);
		imei.add(135234);
		imei.add(123566);
		imei.add(195657);
		return  imei;
	}
	
	
	public Map<Set<Integer>, List<Mobile>> join(Set<Integer> num, List<Mobile> list )
	{
		
		Map<Set<Integer>,List<Mobile>> detail= new TreeMap<>();
		
		for(int i=0;i<num.size();i++)
		{
			detail.put( num,list);
		}
		return detail;
		
	}
}