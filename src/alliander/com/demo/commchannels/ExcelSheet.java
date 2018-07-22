package alliander.com.demo.commchannels;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.net.URL;

import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Comment;
//import org.apache.poi.ss.usermodel.RichTextString;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFCellStyle;
//import org.apache.poi.xssf.usermodel.XSSFComment;
//import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import types.api.server.ibdir.aii.sap.com.CommunicationChannel;
//import types.api.server.ibdir.aii.sap.com.CommunicationChannelID;
//import types.api.server.ibdir.aii.sap.com.CommunicationChannelRestricted;
import types.api.server.ibdir.aii.sap.com.GenericProperty;
//import types.api.server.ibdir.aii.sap.com.GenericTableRowTableCell;


public class ExcelSheet {
	public String filename;
  	private XSSFWorkbook writeworkbook;
  	private XSSFWorkbook readworkbook;
  	public static String env = new String();
  
  	public ExcelSheet() {}
  
  	public XSSFSheet inSheet()
  	{
  		XSSFSheet first = null;
  		try
  		{
  			FileInputStream fis = new FileInputStream(new File(filename));
  			readworkbook = new XSSFWorkbook(fis);
  			first = readworkbook.getSheet(env.toString());
  			fis.close();
  		}
  		catch(Exception e) {System.out.println("Error ophalen Sheet(s)" + e);}
		return first;
  	}
    public void setEnv(String env)
    {
    	ExcelSheet.env = env;
    }
  	
  	public ExcelSheet(String fname)
  	{
  		filename = fname;
  	}
  	
  	/*
	 * Ophalen van de standaard doelsysteen gegevens. hostname, poort en changelist.
	 */
	public String[] getPIdetails(String environment) 
	{
		this.env = environment;
		String[] ret = new String[3];
		if (readworkbook == null)
		{
		  try
		  {
		    readworkbook = new XSSFWorkbook(new FileInputStream(new File(filename)));  
		    // ophalen van hostname van het targetsysteem host + poort
		    ret[0]=readworkbook.getSheet(environment).getRow(0).getCell(1).getStringCellValue();
		    Double d = new Double(readworkbook.getSheet(environment).getRow(1).getCell(1).getNumericCellValue());
		    Integer i = new Integer(d.intValue());
		    ret[1] =i.toString();
		    // einde targetsysteem
		    // start uitlezen changelistKey
		    ret[2] = readworkbook.getSheet(environment).getRow(2).getCell(1).getStringCellValue();
		    
		  }
		  catch (Exception e)
		  {
		    System.out.println("Error during getPIdetails:" + e.getMessage());
		    System.exit(0);
		  }
		}
		
		return ret;
	}
	
	public String[] createComponentsArray(String environment)//String party, String component, String channel)
	  {
		String[] ret=null;
		XSSFSheet first=null;
		try
		{
//			System.out.println("fileName " + filename);
			int arrayLoc = 4;
			FileInputStream fis = new FileInputStream(new File(filename));
  			readworkbook = new XSSFWorkbook(fis);
  			first = readworkbook.getSheet(env.toString());
  			fis.close();
//  			System.out.println("totaal sheets " +readworkbook.getNumberOfSheets());
  			/*
  			for(int v=0;v<readworkbook.getNumberOfSheets();v++)
  			{
  				System.out.println("Sheet"+ v + " naam " + readworkbook.getSheetName(v));
  			}
  			*/

			
			int lastRow = first.getLastRowNum();
			ret = new String[lastRow-3];
			for (int i = 4; i <= first.getLastRowNum(); i++)
			{
				  int x = i-arrayLoc; 
				  ret[x] = first.getRow(i).getCell(1, XSSFRow.RETURN_NULL_AND_BLANK).getStringCellValue()+ ":" + first.getRow(i).getCell(2).getStringCellValue()+":"+i;// + ":"+ first.getRow(i).getCell(3).getStringCellValue();    	  
			}

		}
		catch(Exception e){System.out.println("Error Opgetreden create Array: " + e);}

		System.out.println("Spreadsheet gegevens ingelezen");

		return ret;
	  }
	
	public String[] getRowDetails(String rowIndex)
	{
		
		String[] resp = null;
		XSSFSheet first = null;

		int rowNr = Integer.parseInt(rowIndex);
		try{
  			FileInputStream fis = new FileInputStream(new File(filename));
  			readworkbook = new XSSFWorkbook(fis);
  			first = readworkbook.getSheet(env.toString());
  			fis.close();

			XSSFRow row = first.getRow(rowNr);
			resp = new String[] {""};
			if(row.getLastCellNum() > 6)
			{
				resp = new String[row.getLastCellNum()];
				for(int g=7;g<=row.getLastCellNum()-1;g++)
				{
				  XSSFCell c = row.getCell(g, XSSFRow.CREATE_NULL_AS_BLANK);

				  c.setCellType(Cell.CELL_TYPE_STRING);
				  switch (c.getCellType()) {
			        case XSSFCell.CELL_TYPE_STRING:
			        	resp[g]= row.getCell(g).getStringCellValue();
			        	break;
			        case XSSFCell.CELL_TYPE_NUMERIC:
			        	resp[g]= "" + row.getCell(g).getNumericCellValue();
			        	break;
					case XSSFCell.CELL_TYPE_BLANK:  
			        	resp[g]= "";
			        	break;
				  }
				
				  
				}				
			}
		}

		catch(Exception ex)
		{
			System.out.println("Error in getRow " + ex);
		}
		return resp;
	}
	
	public void writeCells(CommunicationChannel commChan)
	{
		XSSFSheet first = null;
		ExcelSheetUtil excelSheet = new ExcelSheetUtil();
		
		try{

  			first = readworkbook.getSheet(env.toString());
			writeworkbook = new XSSFWorkbook();
			XSSFSheet added = writeworkbook.createSheet(first.getSheetName());


		    int lastRow = first.getLastRowNum();
			XSSFRow row = added.createRow(lastRow+1); 
			int cellindex = 7;
		      for (int i = 0; i <= first.getLastRowNum(); i++)
		      {
		        XSSFRow row1 = added.createRow(i);
		        XSSFRow row2 = first.getRow(i);
		        if (row2 != null)
		        {
		          for (int j = 0; j <= row2.getLastCellNum(); j++)
		          {
		            XSSFCell cell1 = row1.createCell(j);
		            XSSFCell cell2 = row2.getCell(j);
		            
		            if (cell2 != null)
		            {
		            	if(cell2.getCellComment()!=null)
		            	{
		            	//	System.out.println(cell2.getCellComment().getString());
		            	//	cell1.setCellComment(cell2.getCellComment());
		            		org.apache.poi.ss.usermodel.Drawing drawing = cell1.getSheet().createDrawingPatriarch();
		        		    org.apache.poi.ss.usermodel.CreationHelper fac = writeworkbook.getCreationHelper();
		        		    Comment c = drawing.createCellComment(new org.apache.poi.xssf.usermodel.XSSFClientAnchor(0, 0, 0, 0, (short)cell1.getColumnIndex() + 2, cell1.getRowIndex() - 1, (short)cell1.getColumnIndex() + 5, cell1.getRowIndex() + 2));
		        		    c.setString(cell2.getCellComment().getString());
		        		    cell1.setCellComment(c);

		            	}
		            	Integer ct = Integer.valueOf(cell2.getCellType());
		              if (ct != null)
		              {
		                cell1.setCellType(cell2.getCellType());
		              }
		              else
		              {
		                cell1.setCellType(1);
		              }
		              if (cell2.getCellType() == 0)
		              {
		            	  
		                cell1.setCellValue(cell2.getNumericCellValue());
		              }
		              else
		              {
		            	  
		                String text = cell2.getStringCellValue();
		                if (text != null)
		                {
		                  cell1.setCellValue(text);
		                }
		              }
		            }
		          }
		        }
		      }
			GenericProperty[] genProp = commChan.getAdapterSpecificAttribute();
			
			row.createCell(0).setCellValue(commChan.getCommunicationChannelID().getPartyID());
			row.createCell(1).setCellValue(commChan.getCommunicationChannelID().getComponentID());
			row.createCell(2).setCellValue(commChan.getCommunicationChannelID().getChannelID());
			
			row.createCell(3).setCellValue(commChan.getAdapterMetadata().getName());
			row.createCell(4).setCellValue(commChan.getDirection());
			row.createCell(5).setCellValue(commChan.getTransportProtocol());
			row.createCell(6).setCellValue(commChan.getMessageProtocol());
			
			
			for(int x=0;x<genProp.length;x++)
			{
				createcells(row, cellindex++,genProp[x].getName(),genProp[x].getValue());
			//	System.out.println("--> " + row.getRowNum() + " " +  cellindex  + " " + genProp[x].getName() + " " + genProp[x].getValue());
				cellindex++;
			}
			

			// Set default Component values
			FileOutputStream fos = new FileOutputStream(new File(filename));
			writeworkbook.write(fos);
		     fos.close();
		}
		catch(Exception ex){System.out.println("Error in writeCells: "+ ex);}
	}
	
	public void writeNewCells(CommunicationChannel commChan, XSSFWorkbook readworkbook, XSSFWorkbook writeworkbook)
	{
		XSSFSheet first = null;
//		ExcelSheetUtil excelSheet = new ExcelSheetUtil();
		
		try{
//			System.out.println(readworkbook.getNumberOfSheets());
			
  			first = readworkbook.getSheet(env.toString());
//			writeworkbook = new XSSFWorkbook();

			XSSFSheet added =  writeworkbook.getSheet(first.getSheetName());
			if(added == null)
			{
				System.out.println("Er is geen sheet aanwezig......");
				 added = writeworkbook.createSheet(first.getSheetName());
			}
			
		    int lastRow = first.getPhysicalNumberOfRows();
//		    System.out.println("Laatste Rij van Sheet " + lastRow); 
			XSSFRow row = added.createRow(lastRow); 
			int cellindex = 7;
		      
					GenericProperty[] genProp = commChan.getAdapterSpecificAttribute();
					//System.out.println("writeNewCells lengte properties " + genProp.length);
					
					row.createCell(0).setCellValue(commChan.getCommunicationChannelID().getPartyID());
					row.createCell(1).setCellValue(commChan.getCommunicationChannelID().getComponentID());
					row.createCell(2).setCellValue(commChan.getCommunicationChannelID().getChannelID());
					
					row.createCell(3).setCellValue(commChan.getAdapterMetadata().getName());
					row.createCell(4).setCellValue(commChan.getDirection());
					row.createCell(5).setCellValue(commChan.getTransportProtocol());
					row.createCell(6).setCellValue(commChan.getMessageProtocol());
					
					int cellNo = cellindex;
					for(int x=0;x<genProp.length;x++)
					{
					//	createNewcells(row, cellindex++,genProp[x].getName(),genProp[x].getValue(), writeworkbook);
					//	System.out.println("--> " + row.getRowNum() + " " +  cellNo  + " " + genProp[x].getName() + " " + genProp[x].getValue());
					    XSSFCell cell = row.createCell(cellNo++);
					    cell.setCellType(1);
					    org.apache.poi.ss.usermodel.Drawing drawing = cell.getSheet().createDrawingPatriarch();
					    org.apache.poi.ss.usermodel.CreationHelper fac = writeworkbook.getCreationHelper();
					    Comment c = drawing.createCellComment(new org.apache.poi.xssf.usermodel.XSSFClientAnchor(0, 0, 0, 0, (short)cell.getColumnIndex() + 2, cell.getRowIndex() - 1, (short)cell.getColumnIndex() + 5, cell.getRowIndex() + 2));
					    c.setString(fac.createRichTextString(genProp[x].getName()));
					    cell.setCellComment(c);
					    cell.setCellValue(genProp[x].getValue());
					}
			

			// Set default Component values
	/*
		        	FileOutputStream fileOut = new FileOutputStream("C:\\Data\\ReleaseNotes_2a_update.xlsx");     
			        writeworkbook.write(fileOut);
				    fileOut.close();
		*/     
		}
		catch(Exception ex){System.out.println("Error in writeCells: "+ ex);}
	}
	
	  public void createNewcells(XSSFRow row, int index, String name, String value, XSSFWorkbook writeworkbook) {
		    XSSFCell cell = row.createCell(index);
		    cell.setCellType(1);
		    org.apache.poi.ss.usermodel.Drawing drawing = cell.getSheet().createDrawingPatriarch();
		    org.apache.poi.ss.usermodel.CreationHelper fac = writeworkbook.getCreationHelper();
		    Comment c = drawing.createCellComment(new org.apache.poi.xssf.usermodel.XSSFClientAnchor(0, 0, 0, 0, (short)cell.getColumnIndex() + 2, cell.getRowIndex() - 1, (short)cell.getColumnIndex() + 5, cell.getRowIndex() + 2));
		    c.setString(fac.createRichTextString(name));
		    cell.setCellComment(c);
		    cell.setCellValue(value);
		  }	
	
	  public void createcells(XSSFRow row, int index, String name, String value) {
		    XSSFCell cell = row.createCell(index);
		    cell.setCellType(1);
		    org.apache.poi.ss.usermodel.Drawing drawing = cell.getSheet().createDrawingPatriarch();
		    org.apache.poi.ss.usermodel.CreationHelper fac = writeworkbook.getCreationHelper();
		    Comment c = drawing.createCellComment(new org.apache.poi.xssf.usermodel.XSSFClientAnchor(0, 0, 0, 0, (short)cell.getColumnIndex() + 2, cell.getRowIndex() - 1, (short)cell.getColumnIndex() + 5, cell.getRowIndex() + 2));
		    c.setString(fac.createRichTextString(name));
		    cell.setCellComment(c);
		    cell.setCellValue(value);
		  }
}
