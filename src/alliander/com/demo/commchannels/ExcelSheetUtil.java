package alliander.com.demo.commchannels;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
         
 
      public final class ExcelSheetUtil {   
              
            /**
             * DEFAULT CONSTRUCTOR.
             */
            public ExcelSheetUtil() {}
             
            public void cloneWorkSheet(XSSFWorkbook WorkbookOld, XSSFWorkbook WorkbookNew, String Sheetname)
            {
            	XSSFWorkbook oldWB = WorkbookOld;
            	XSSFWorkbook newWB = WorkbookNew;
            	try
            	{
//	            	CellStyle newStyle = newWB.createCellStyle();
	            	for (int x = 0; x < oldWB.getNumberOfSheets(); x++) 
	            	{
	            		
	            	}
	            	
	            }
            	catch(Exception ex) 
            	{
            		
            	}
            }
            
            
            public XSSFWorkbook copySheet(XSSFWorkbook WorkbookOld, XSSFWorkbook WorkbookNew, String Sheetname)
            {
            	XSSFWorkbook oldWB = WorkbookOld;
            	XSSFWorkbook newWB = WorkbookNew;
            	try
            	{
	            	CellStyle newStyle = newWB.createCellStyle();
	            	for (int x = 0; x < oldWB.getNumberOfSheets(); x++) 
	            	{
	            		System.out.println("Loop in ExcelSheetUtil voor ophalen Sheets " + oldWB.getSheetAt(x).getSheetName());
	            	    XSSFSheet first = oldWB.getSheetAt(x);
	            	    XSSFSheet added = newWB.createSheet(first.getSheetName());            		
	            		
	            	    
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
	        		            		org.apache.poi.ss.usermodel.Drawing drawing = cell1.getSheet().createDrawingPatriarch();
	        		        		    org.apache.poi.ss.usermodel.CreationHelper fac = newWB.getCreationHelper();
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
	            	}

	        	}
	        	catch (Exception e )
	    		{
	        		System.out.println("Exception in Copysheet " + e);
	        	}
            	return newWB;
            }
      
      } 
