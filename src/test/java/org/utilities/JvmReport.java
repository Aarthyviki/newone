package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String Jsonpath) {

		File f=new File(System.getProperty( "user.dir"+"\\target\\Report"));
		
		Configuration con =new Configuration(f,"facebook application");
		con.addClassifications("Browser", "chrome");
		con.addClassifications("chrome", "95");
		con.addClassifications("platform", "windows");
		con.addClassifications("windows", "10");
		con.addClassifications("sprint", "23");
		
		List<String> li=new ArrayList<String>();
	
		li.add(Jsonpath);
		
		ReportBuilder r=new ReportBuilder(li,con);
		
		r.generateReports();
	}
	

}
