package demo.pac;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesTrial {
	// Java program to read and write properties file
		public static void main(String[] args) throws Exception {
			createEmailProperties();
			Map<String, String> props = loadEmailProperties();
			printPropertiesInConsole(props);
		}

		// Write a new properties file in Java
		private static void createEmailProperties() throws Exception {
			Properties p = new Properties();
			p.setProperty("host", "smtp.mail.yahoo.com");
			p.setProperty("port", "465");
			p.setProperty("username", "testuser");
			p.setProperty("password", "testpassword");

			FileWriter writer = new FileWriter("email.properties");
			p.store(writer, "email server configuration");
			writer.close();
		}

		// Read a properties file in Java
		private static Map<String, String> loadEmailProperties() throws Exception {
			Map<String, String> propertyMap = new HashMap();

			FileReader reader = new FileReader("email.properties");
			Properties p = new Properties();
			p.load(reader);

			Enumeration keys = p.propertyNames();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				propertyMap.put(key, p.getProperty(key));
			}

			reader.close();
			return propertyMap;
		}

		// Print all properties to the console
		private static void printPropertiesInConsole(Map<String, String> props) {
			for (String key : props.keySet()) {
				System.out.println(key + ":" + props.get(key));
			}
		}
	}
