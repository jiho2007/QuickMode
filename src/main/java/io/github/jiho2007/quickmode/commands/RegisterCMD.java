package io.github.jiho2007.quickmode.commands;

import io.github.jiho2007.quickmode.commands.Command;

import net.minecraftforge.client.ClientCommandHandler;
import java.util.Scanner;
import java.net.URL;
import java.io.IOException;

public class RegisterCMD {
	
	public static void register() {
		try {
			URL f = new URL(
				"https://raw.githubusercontent.com/jiho2007/QuickMode/master/mode/ListMode.txt"
			);
			Scanner s = new Scanner(f.openStream());
			while(s.hasNext()) {
				String[] q = s.nextLine().split(":");
				ClientCommandHandler.instance.registerCommand(new Command(q[0], q[1]));
			}
		} catch(IOException e) {}
	}
	
}
