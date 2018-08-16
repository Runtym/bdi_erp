package com.bdi.erp.servlet;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("uiName", "박경훈");
		
		System.out.println(map.get("uiname"));
	}
}
