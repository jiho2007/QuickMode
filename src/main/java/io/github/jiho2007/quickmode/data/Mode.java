package io.github.jiho2007.quickmode.data;

import java.util.HashMap;

public class Mode {
	
	public HashMap<String, String> dict = new HashMap<String, String>();
	
	public Mode() {
		this.init();
	}
	
	public void add(String key, String val) {
		dict.put(key, val);
	}
	
	public boolean haveMode(String key) {
		return dict.containsKey(key);
	}
	
	public String getMode(String s) {
		return dict.get(s);
	}
	
	public void init() {}
	
}