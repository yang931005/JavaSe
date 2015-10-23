package cn.zucc.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyMap {
	
	
	
	Set<MyEntry> set = new HashSet<MyEntry>();
	public class MyEntry{
	private	String key;
	private	String value;
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public  void put(String key, String value) {
			this.key = key;
			this.value = value;
		}
		public MyEntry() {
			super();
		}
		@Override
		public String toString() {
			return "key=" + key + ", value=" + value ;
		}
		
		
	}
}
