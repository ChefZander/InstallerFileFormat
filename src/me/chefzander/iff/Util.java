package me.chefzander.iff;

import java.io.File;
import java.io.IOException;

public class Util {
	public static boolean exists(String file, boolean create) {
		File f = new File(file);
		if(f.exists() && !f.isDirectory()) { 
		    return true;
		}
		if(create) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
}
