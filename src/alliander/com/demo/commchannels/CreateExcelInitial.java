package alliander.com.demo.commchannels;

import types.api.server.ibdir.aii.sap.com.*;
import CommunicationChannelServiceWsd.*;
import types.api.server.ib.aii.sap.com.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.Vector;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelInitial {
    private static String apiURL = "/CommunicationChannelService/HTTPBasicAuth?wsdl&style=document&mode=standard";
    private String url = new String();
    private String serverPort = null;
    private boolean bActivate = true;
    private String docChangeID = null;
    public static String env = "TST";
    public static String filename = "C:\\Data\\ReleaseNotes_2a.xlsx";
    
	public static void main(String[] args) {
		ExcelSheetUtil excelSheet = new ExcelSheetUtil();	
		XSSFWorkbook readworkbook = null;
		XSSFWorkbook writeworkbook = null;
		
        ExcelSheet excel = new ExcelSheet("C:\\Data\\ReleaseNotes_3.xlsx");
        try
        {        
        	FileInputStream fis = new FileInputStream("C:\\Data\\ReleaseNotes_3.xlsx");
        	readworkbook = new XSSFWorkbook(fis);
        	fis.close();

	        // XSSFSheet first = readworkbook.getSheet(env.toString());
			writeworkbook = new XSSFWorkbook();
			
			
			//writeworkbook = excelSheet.copySheet(readworkbook, writeworkbook, env.toString());		
			writeworkbook = readworkbook;

	        String[] pis = excel.getPIdetails(env);

	        CommunicationChannelReadWrite commCh = new CommunicationChannelReadWrite();

	        commCh.setEnv(env);
	        commCh.setURL(pis[0]+":"+pis[1]);
	        String Changelist = pis[2];
	        System.out.println(Changelist);
	        
	        CommunicationChannelID[] commChanels = commCh.getCommuncationChannels(env);
	        System.out.println("Environment "+ env + " Aantal Communication Channels " + commChanels.length);
	       
	        commCh.getChannelDetailsNoChangelist(commChanels, readworkbook, writeworkbook);
        
	       /* 
	        for(int g=0;g<commChanels.length;g++)
	        {
	        	System.out.println(commChanels[g].getChannelID() + " | " + commChanels[g].getComponentID());     	
	        	
	        }
		    */
        	FileOutputStream fileOut = new FileOutputStream("C:\\Data\\ReleaseNotes_3.xlsx");     
	        writeworkbook.write(fileOut);
		    fileOut.close();
		   
		    System.out.println("Done :)");
        }
        catch (Exception e)
        {
        	System.out.println("Error in CreateExcelInitial " + e);
        }	    
	}
}
