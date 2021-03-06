package com.tas.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author venmaum
 *		This class is a utility class for reading a Properties File 
 */
public class PropertiesLoader 
{
	FileInputStream proFileName;
	String sValue;
	Properties objproperties = new Properties();

	/**
	 * This method is used to upload a properties file and basing on key value it returns a value from a properties file.
	 * @param sKey
	 * @return string
	 * @throws IOException
	 */
	public String getProperty(String sKey) throws IOException
	{
		proFileName = new FileInputStream("./config/TASFrameworkProperties.properties");
		objproperties.load(proFileName);
		sValue = objproperties.getProperty(sKey);
		return sValue;
	}
	public void setProperty(String caseId,String sValue) throws IOException
	{
		proFileName = new FileInputStream("./config/TASFrameworkProperties.properties");
		objproperties.load(proFileName);
		if(caseId=="1")
		{
	    objproperties.setProperty("API.Store.ProductId.1", sValue);
		}
		else if(caseId=="2")
		{
	    objproperties.setProperty("API.Store.ProductId.2", sValue);
		}
		else if(caseId=="5")
		{
	    objproperties.setProperty("API.Store.ProductId.5", sValue);
		}
	}
	}
