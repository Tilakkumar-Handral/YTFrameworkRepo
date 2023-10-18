package org.testng.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogCapture {

	public static void takeLogs(String className, String message) {
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger log = Logger.getLogger(className);
		log.info(message);
	}
}
