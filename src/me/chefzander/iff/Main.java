package me.chefzander.iff;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		String linktoifff = "";
		for(String s:args) {
			if(s.startsWith("-f:")) {
				linktoifff = s.replaceAll("-f:", "");
			}
		}

		p("Parsing URL: " + linktoifff);
		
		try {
			IFFParser.parse(new URL(linktoifff));
		} catch (MalformedURLException e) {
			abort("Malformed URL, URL Is Invalid");
		}
	}
	
	public static void abort(String reason) {
		System.out.println("ABORT: " + reason);
		System.exit(-1);
	}
	
	public static void p(String t) {
		System.out.println("[info] " + t);
	}

}
