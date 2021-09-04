package me.chefzander.iff;

import java.io.IOException;
import java.net.URL;

public class IFFParser {
	public static void parse(URL url) {
		try {
			String file = SCNetworkLib.get(url);
			
			String[] lines = file.split(";");
			for(String line:lines) {
				String[] data = line.split("=");
				Main.p("Flushing .. " + data[0]);
				Util.exists(data[0], true);
				Downloader.download(new URL(data[1]), data[0]);
			}
			
			
		} catch (IOException e) {
			Main.abort("Error.");
		}
	}
}
