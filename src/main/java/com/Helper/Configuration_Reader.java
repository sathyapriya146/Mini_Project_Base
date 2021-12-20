package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"D:\\sathyapriya\\Dec_Mini_Project\\src\\main\\java\\com\\configuration_properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		p.load(fis);
	}

	public String getUrl()  {

		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() {
			String username = p.getProperty("username");
			return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
		public String getCcnumber() {
		String ccnumber = p.getProperty("ccnumber");
		return ccnumber;
	}
	public String getCcType() {
		String cctype = p.getProperty("cctype");
		return cctype;
	}
	public String getCvvnumber() {
		String cvvnumber = p.getProperty("cvvnumber");
		return cvvnumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
