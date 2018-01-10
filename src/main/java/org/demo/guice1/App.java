package org.demo.guice1;

import com.google.inject.Guice;

public class App {

	public static void main(String[] args) {
		MyApplet mainApplet = Guice.createInjector(new MainModule())
				.getInstance(MyApplet.class);
		mainApplet.run();
	}

}
