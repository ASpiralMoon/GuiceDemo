package org.demo.guice1;

import com.google.inject.AbstractModule;
import org.demo.guice1.helloworldDemo.HelloWorldModule;

public class MainModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new HelloWorldModule());
	}

}
