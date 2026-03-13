package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader{
   private final Properties properties;


    public ConfigReader() {
        try {
            properties=new Properties();
            FileInputStream fs=new FileInputStream("src/test/resources/config.properties");
            properties.load(fs);


        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String getBrowser() {
        return properties.getProperty("browser");

    }
    public String getUrl() {
        return properties.getProperty("url");
    }

    public String getHeadless() {
        return properties.getProperty("headless");
    }


}