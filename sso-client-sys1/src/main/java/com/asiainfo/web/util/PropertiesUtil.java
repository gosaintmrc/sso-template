package com.asiainfo.web.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Parsing The Configuration File
 * 
 */
public final class PropertiesUtil {
	private static final String BUNDLE_NAME = "sso/config";
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private PropertiesUtil() {
	}

	/**
	 * Get a value based on key , if key does not exist , null is returned
	 * 
	 * @param key
	 * @return
	 */
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return null;
		}
	}

	public static void main(String[] args) {
		String url_sso_login = getString("URL_SSO_LOGIN");

		System.out.println(url_sso_login);
	}


}