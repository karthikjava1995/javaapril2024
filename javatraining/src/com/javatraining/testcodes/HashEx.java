package com.javatraining.testcodes;

import java.util.HashMap;

public class HashEx {
	
	public static void main(String[] args)
	{
		
	HashMap<String,Integer> st=new HashMap<>();
	st.put("john", 101);
	st.put("gopu", 102);
	st.put("lios", 103);
	st.put("ferty", 104);
	st.put("mubarak", 105);
	System.out.println(st);
	
	Integer i = st.get("lios");
//	String  s = st.get('105');
	System.out.println(i);
	}

}

