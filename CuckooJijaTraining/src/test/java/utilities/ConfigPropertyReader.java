package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropertyReader {
    private static final ConfigPropertyReader CONFIG_PROPERTY_READER = new ConfigPropertyReader();

    private static final String FILE_LOCATION = "src/test/resources/config.properties";
    private static Properties properties;

    public static String environment;
    public static String userName;
    public static String password;
    public static String testDataFileLocation;
    public static String testSheetName;

    private ConfigPropertyReader(){
        initPropertiesObject();
        initConfigProperties();
    }

    private static void initPropertiesObject(){
        try {
            File file = new File(FILE_LOCATION);
            FileInputStream fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void initConfigProperties(){
        environment = properties.getProperty("environment");
        userName = properties.getProperty("user");
        password = properties.getProperty("password");
        testDataFileLocation = properties.getProperty("testDataFileLocation");
        testSheetName = properties.getProperty("testDataSheetName");
    }
}
