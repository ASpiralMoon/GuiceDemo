package org.demo.guice1.helloworldDemo;

import com.google.inject.Provider;
import org.demo.guice1.MyApplet;

import javax.inject.Inject;

public class StringWritingApplet implements MyApplet{

    private MyDestination destination;
    private Provider<String> stringProvider;

    @Inject
    public StringWritingApplet(MyDestination destination,
                               @Output Provider<String> stringProvider) {
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void writeString() {
        destination.write(stringProvider.get());
    }

    public void run() {
        writeString();
    }

}
