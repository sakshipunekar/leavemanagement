package com.repository;

import java.util.HashMap;
import java.util.Map;

public class HRPolicy {
	
	public static Map<String, Integer> totalLeavesnumber = new HashMap<>();  // number and totalLeavesnumber

	public Integer casualleave= 8;
	public Integer sickleave= 6;
	public Integer earnedleave= 4;
	public Integer paidleave= 3;
	
	public HRPolicy()
	{
		totalLeavesnumber.put("casual", casualleave);
		totalLeavesnumber.put("sick", sickleave);
		totalLeavesnumber.put("earned", earnedleave);
		totalLeavesnumber.put("paid", paidleave);
	}
	
	public Map<String, Integer> returnPolicy()
	{
		return totalLeavesnumber;
	}
}
