package sampeTesting;

import utilities.ConfigPropertyReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestCode {
    public static void main(String args[]) throws IOException {
        File file = new File("src/test/resources/config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        String userName = properties.getProperty("user");
        System.out.println(userName);

        String password = properties.getProperty("password");
        System.out.println(password);

        System.out.println(ConfigPropertyReader.environment);
    }
}
