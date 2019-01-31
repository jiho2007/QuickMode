package io.github.jiho2007.quickmode.data;

import io.github.jiho2007.quickmode.data.Mode;

public class ModeSW extends Mode {
	
	@Override
	public void init() {
		add("1", "solo_normal");
		add("2", "teams_normal");
		add("3", "solo_insane");
		add("4", "teams_insane");
		add("5", "mega_normal");
		add("6", "mega_doubles");
		add("7", "solo_insane_rush");
		add("8", "teams_insane_rush");
		add("9", "solo_insane_hunters_vs_beasts");
		add("0", "ranked_normal");
	}
	
}