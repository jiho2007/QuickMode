package io.github.jiho2007.quickmode.data;

import io.github.jiho2007.quickmode.data.Mode;

public class ModeBW extends Mode {
	
	@Override
	public void init() {
		add("1", "bedwars_eight_one");
		add("2", "bedwars_eight_two");
		add("3", "bedwars_four_three");
		add("4", "bedwars_four_four");
		add("5", "bedwars_eight_two_rush");
		add("6", "bedwars_four_four_rush");
		add("7", "bedwars_eight_two_ultimate");
		add("8", "bedwars_four_four_ultimate");
		add("9", "bedwars_capture");
		add("0", "bedwars_castle");
	}
	
}