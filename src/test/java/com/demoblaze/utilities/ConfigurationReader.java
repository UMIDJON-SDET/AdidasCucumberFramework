package com.demoblaze.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;


    static {

        try {
            // what files to read
            String path = "configuration.properties";
            // read the file into java, finds the file using string path
            FileInputStream input = new FileInputStream(path);
            // properties --> class that store properties in key / value format
            properties = new Properties();
            // the values from the file input is loaded / fed in to the properties object
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String get(String keyName) {

        return properties.getProperty(keyName);
    }
}
