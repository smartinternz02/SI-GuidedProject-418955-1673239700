package com.admin.flightaware.controllers;

import java.util.HashMap;
public class cityCode {
	
	//API Call to get leagues of the different games
	public String codes(String city) 
	{
		
		String code = null;
		HashMap<String, String> citycode = new HashMap<String, String>();
		citycode.put("delhi","DEL");
		citycode.put("mumbai","BOM");
		citycode.put("india","IN");
		citycode.put("bengaluru","BLR"); 
		citycode.put("hyderabad","HYD");
		citycode.put("chennai","MAA");
		citycode.put("kolkata","CCU");
		citycode.put("ahmedabad","AMD");
		citycode.put("kochi","COK");
		citycode.put("pune","PNQ");
		citycode.put("fort wayne","FWA");
		citycode.put("united states","US");
		citycode.put("concord regional","USA");
		citycode.put("koh samui","USM");
		citycode.put("samui island","USM");
		citycode.put("us virgin islands","VI");
		citycode.put("st augustine","UST");
		citycode.put("busuanga","USU");
		citycode.put("ushuaia","USH");
		citycode.put("saint thomas cyril e king","STT");
		citycode.put("ust-kamenogorsk","UKK");
		citycode.put("ulsan","USN");
		citycode.put("uk","UK");
		citycode.put("ukraine","UA");
		citycode.put("kyiv","KIEV");
		citycode.put("kiev borispol","KBP");
		citycode.put("kiev zhulhany","IEV");
		citycode.put("lviv","LWO");
		citycode.put("odesa central","ODS");
		citycode.put("kharkiv","HRK");
		citycode.put("kobe","UKB");
		citycode.put("ukunda","UKA");
		code=citycode.get(city.toLowerCase());
		return code;
		
	}
}