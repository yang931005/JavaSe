package cn.zucc.test;

import java.util.Set;

import cn.zucc.test.MyMap.MyEntry;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMap myMap = new MyMap();
		MyMap.MyEntry myEntry1 = myMap.new MyEntry();
		MyMap.MyEntry myEntry2 = myMap.new MyEntry();
		MyMap.MyEntry myEntry3 = myMap.new MyEntry();
		MyMap.MyEntry myEntry4 = myMap.new MyEntry();
		
		myEntry1.put("1", "2");
		myEntry2.put("2", "2");
		myEntry3.put("3", "2");
		myEntry4.put("4", "2");
		myMap.set.add(myEntry1);
		myMap.set.add(myEntry2);
		myMap.set.add(myEntry3);
		myMap.set.add(myEntry4);
		
		for(MyMap.MyEntry entry:myMap.set){
			System.out.println(entry);
		}
	}

}
