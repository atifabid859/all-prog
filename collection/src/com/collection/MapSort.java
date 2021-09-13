package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapSort {

	public static void main(String[] args) {
Map<Integer,String> map=new HashMap<Integer,String>();

map.put(74,"NurulIslam");
map.put(7,"Sakib khan");
map.put(4,"Rehan khan");
map.put(34,"Zaid Khan");
map.put(23,"Kaif Khan");
map.put( 64,"Faisl khan");
map.put(67,"Atif Abid");
Iterator<Integer> itr=map.keySet().iterator();

while (itr.hasNext()) {
int num=(int)itr.next();	

	System.out.println("RollNo"+num+"name"+map.get(num));
}
Map<Integer,String> map1=new HashMap<Integer,String>();
System.out.println("\n");
System.out.println("After sorting");
TreeMap<Integer,String> hm=new TreeMap<Integer,String>(map);
Iterator<Integer> it=hm.keySet().iterator();
while (it.hasNext()) {
int key=(int)it.next();
System.out.println("roll"+key+"name"+map.get(key));
}

}

	
}
