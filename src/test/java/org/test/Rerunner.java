package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Rerunner {
/*public  static void jvmreport (String j) {
	
	File f=new File("C:\\Users\\DURKESH KUMAR\\eclipse-workspace\\CucumberTest\\target\\jvm");
     Configuration c=new Configuration(f, "cucumber repo");
     List<String>li=new ArrayList<String>();
     li.add(j);
     ReportBuilder r=new ReportBuilder(li, c);
     r.generateReports();*/
     
     
     

//}
public  static  	List<HashMap<String,String>>  read() throws IOException {
	String name;
	
	List<HashMap<String, String>>li=new ArrayList<HashMap<String, String>>();
File fil =new File("C:\\Users\\DURKESH KUMAR\\eclipse-workspace\\CucumberTest\\excel\\Book1.xlsx");
FileInputStream st=new FileInputStream(fil);
Workbook w=new XSSFWorkbook(st);

Sheet sh = w.getSheet("Sheet1");
Row headerrow = sh.getRow(0);

for(int i=1;i<sh.getPhysicalNumberOfRows();i++) {
	Row eachrow = sh.getRow(i);
	
	HashMap<String, String>mp=new HashMap<String,String>();
	HashMap<String, String> map=new HashMap<String,String>();
	for(int j=0;j<eachrow.getPhysicalNumberOfCells();j++) {
		Cell eachcell = eachrow.getCell(j);
		int type = eachcell.getCellType(); 
		
		if(type==1) {
			 name = eachcell.getStringCellValue();
			 map.put(headerrow.getCell(j).getStringCellValue(), name);
		}
		else {
			if(DateUtil.isCellDateFormatted(eachcell)){
				Date d = eachcell.getDateCellValue();
				SimpleDateFormat sin=new SimpleDateFormat("dd-MMM-yy");
				 name = sin.format(d);
			}
			
		
		else {
			double dd = eachcell.getNumericCellValue();
			long l=(long)dd;
			 name = String.valueOf(l);
			 map.put(headerrow.getCell(j).getStringCellValue(), name);
		}
	}
}
li.add(map);
}
return li;

}
}