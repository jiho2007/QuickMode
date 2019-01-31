package io.github.jiho2007.quickmode.data;

import io.github.jiho2007.quickmode.data.Mode;

public class ModeMY extends Mode {
	
	@Override
	public void init() {
		add("1", "murder_classic");
		add("2", "murder_assassins");
		add("3", "murder_showdown");
		add("4", "murder_infection");
	}
	
}