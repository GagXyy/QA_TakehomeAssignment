package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties properties;

    public ConfigReader() {

        properties = new Properties();

        try {

            FileInputStream file = new FileInputStream(
                    System.getProperty("user.dir")
                    + "/resources/config.properties");

            properties.load(file);

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public String getBaseUrl() {

        return properties.getProperty("baseUrl");

    }

}