package io.github.jiho2007.quickmode.data;

import java.util.HashMap;
import java.util.Scanner;
import java.net.URL;
import java.io.IOException;

public class Mode {
	
	public HashMap<String, String> dict = new HashMap<String, String>();
	
	public Mode(String name) {
		try {
			URL f = new URL(
				"https://raw.githubusercontent.com/jiho2007/QuickMode/master/mode/" + name
			);
			Scanner s = new Scanner(f.openStream());
			while(s.hasNext()) {
				String[] q = s.nextLine().split(":");
				dict.put(q[0], q[1]);
			}
		} catch(IOException e) {}
	}
	
	public boolean have(String key) {
		return dict.containsKey(key);
	}
	
	public String get(String s) {
		return dict.get(s);
	}
	
}