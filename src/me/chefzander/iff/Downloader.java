package me.chefzander.iff;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Downloader {
	public static void download(URL url, String filename) {
		Main.p("Downloading .. " + filename);
		try {
			InputStream in = new BufferedInputStream(url.openStream());
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			int n = 0;
			while (-1!=(n=in.read(buf)))
			{
			   out.write(buf, 0, n);
			}
			out.close();
			in.close();
			byte[] response = out.toByteArray();
			FileOutputStream fos = new FileOutputStream(filename);
			fos.write(response);
			fos.close();
			Main.p("Downloaded .. " + filename);
		} catch (IOException e) {
			Main.abort("Download Failed .. " + filename);
		}
		
	}
}
