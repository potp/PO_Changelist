package alliander.com.demo.commchannels;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Parameters {
    private static String USERID = "";
    private static String PASSWORD = "";
    private static String FILENAME = "";
    
    public static String getUserid() 
    {
    	return USERID;
    }
    public static String getPassword()
    {
    	return PASSWORD;
    }
    public static String getFilename()
    {
    	return FILENAME;
    }

    static {
	    Properties prop = null;
	    try {
	       InputStream input = new FileInputStream("C:\\Data\\config.properties");
	       prop = new Properties();
	       prop.load(input);
	       USERID = prop.getProperty("user");
	       PASSWORD =  prop.getProperty("password");
	       FILENAME = prop.getProperty("excelsheet");
	    }
	    catch (Exception e) {
	       e.printStackTrace();
	    }
    }

}

