package com.fk;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class HelloMsg {
    private final String name;

    public HelloMsg() {
        name = "Mr. Anonymous";
    }

    public HelloMsg(String key) {
        Properties properties = loadProperties();
        this.name = properties.get(key).toString();
    }

    private Properties loadProperties() {
        Properties properties = new Properties();
        InputStream resource = null;
        try {
            resource = getClass().getClassLoader().getResourceAsStream("msg.properties");
            properties.load(resource);
            resource.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (resource != null) try {
                resource.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return properties;
    }

    public String getMsg() {
        return "Hello " + name + "!";
    }
}
