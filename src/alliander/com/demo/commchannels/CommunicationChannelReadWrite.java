package alliander.com.demo.commchannels;

import CommunicationChannelServiceWsd.*;
import CommunicationChannelServiceWsd.CommunicationChannelServiceLocator;
import CommunicationChannelServiceWsd.CommunicationChannelService;
import CommunicationChannelServiceWsd.HTTPBasicAuthBindingStub;

import types.api.server.ibdir.aii.sap.com.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.net.*;

public class CommunicationChannelReadWrite {
	
	private static String apiURL = "/CommunicationChannelService/HTTPBasicAuth?wsdl&style=document&mode=standard";
	private static String url = new String();
    ExcelSheet excel = new ExcelSheet("C:\\Data\\ReleaseNotes template.xlsx"); //_2
    private static String env = new String();
    
//    public String[] getExcelData = excel.createComponentsArray("TST");
//    public String[] pis = excel.getPIdetails("TST");
    public int Startcell=0;
    public int endCell=0;
    public int StartRow=0;
    public int headerRow=3;
    
    public void setEnv(String env)
    {
    	CommunicationChannelReadWrite.env = env;	
    }
    
    public void setURL(String serverPort) {
        if (serverPort == null) return;
        CommunicationChannelReadWrite.url = CommunicationChannelReadWrite.url.concat("http://").concat(serverPort).concat(apiURL);
    }
    
    
    public CommunicationChannelID[] getCommuncationChannels(String env)
    {
    	CommunicationChannelService cService = new CommunicationChannelServiceLocator();
        CommunicationChannelServiceVi commDocument = null;
    	CommunicationChannelID[] comChannels=null;
    	try
    	{
            if (CommunicationChannelReadWrite.url.length() == 0)
            	commDocument = cService.getHTTPBasicAuthPort();
            else {
            	
                URL docUrl = new URL(CommunicationChannelReadWrite.url);
                commDocument = cService.getHTTPBasicAuthPort(docUrl);
            }
         
            HTTPBasicAuthBindingStub stub = (HTTPBasicAuthBindingStub)commDocument;
            stub.setUsername(Parameters.getUserid());
            stub.setPassword(Parameters.getPassword()); 
            
            CommunicationChannelQueryIn communicationChannelQueryRequest = new CommunicationChannelQueryIn();
            CommunicationChannelQueryOut ccQueryOut =commDocument.query(communicationChannelQueryRequest);
            comChannels = ccQueryOut.getCommunicationChannelID();
            
/*            
            communicationChannelQueryRequest.getCommunicationChannelID().setComponentID("*");
            CommunicationChannelQueryOut ccQueryOut = commDocument.query(communicationChannelQueryRequest);
            comChannels = ccQueryOut.getCommunicationChannelID();
*/
    	}
    	catch(Exception e)
    	{
    		System.out.println("ERROR Excel initialize getCommuncationChannels " + e);
    	}
    	return comChannels;
    }
    
    
    
    public CommunicationChannelRestricted getChannelDetails(CommunicationChannelID[] comChIDArr,String changelist)
    {
    	
    	CommunicationChannelOpenForEditOut outChan = new CommunicationChannelOpenForEditOut();
		CommunicationChannelDeleteOpenForEditIn comChEdit = new CommunicationChannelDeleteOpenForEditIn();
    	CommunicationChannelRestricted ComChRestr = new CommunicationChannelRestricted();
    	CommunicationChannelService cService = new CommunicationChannelServiceLocator();
    	CommunicationChannelCreateChangeIn createIn = new CommunicationChannelCreateChangeIn();
        CommunicationChannelServiceVi commDocument = null;
        
        String[] ChannelRijDetails =null;

    	try
    	{
    		
            if (CommunicationChannelReadWrite.url.length() == 0)
            	commDocument = cService.getHTTPBasicAuthPort();
            else {
                URL docUrl = new URL(CommunicationChannelReadWrite.url);
                commDocument = cService.getHTTPBasicAuthPort(docUrl);
            }
            HTTPBasicAuthBindingStub stub = (HTTPBasicAuthBindingStub)commDocument;
            stub.setUsername(Parameters.getUserid());
            stub.setPassword(Parameters.getPassword()); 
    		
            /*
             * Changelist ophalen voor wegschrijven Comm Channel
             */
    		createIn.setChangeListID(changelist);
            
            /*
             * Channel gereed maken voor het doorvoeren van aanpassingen.
             */
    		comChEdit.setCommunicationChannelID(comChIDArr);
    		comChEdit.setChangeListID(changelist);
    		outChan = commDocument.openForEdit(comChEdit);
    		CommunicationChannel[] comChannelArray = outChan.getCommunicationChannel();
    		CommunicationChannel comChannel = comChannelArray[0];
    		/*
    		 *  Waarden zetten voor de ExcelSheet gegevens op te halen
    		 */
    		setExcelCellLocation(comChannel);   		

    		/*
    		 * Properties ophalen vanuit de bestaande Metadate
    		 */
    		GenericProperty[] genProp = comChannel.getAdapterSpecificAttribute(); 	

    		String[] detailExcelsheet = excel.getRowDetails(""+StartRow); 
    		if(detailExcelsheet.length > Startcell-1 )
    		{
    			ChannelRijDetails = Arrays.copyOfRange(detailExcelsheet, Startcell-1, endCell);
    		}
    		else
    		{
    			ChannelRijDetails = detailExcelsheet;
    		}
    		
    		String[] HeaderRijDetails = Arrays.copyOfRange(excel.getRowDetails(""+headerRow), Startcell-1, endCell);
    		String[] elementsTotal= new String[HeaderRijDetails.length];
    		
    		Vector<String> headerString = new Vector<String>(Arrays.asList(HeaderRijDetails));
    		Vector<String> elementenString = new Vector<String>(Arrays.asList(elementsTotal));
//    		Vector<String> detailsString = new Vector<String>(Arrays.asList(ChannelRijDetails));  
    		Vector<GenericProperty> genPropt = new Vector<GenericProperty>(Arrays.asList(genProp)); 
    		int currentProperties = genPropt.size();
    		int totaalHeadersinExcel = HeaderRijDetails.length;
    		int ElementenNaUpdate = 0;
    		boolean updatedAttributes = false;

    		
 /*
         	System.out.println(comChannel.getCommunicationChannelID().getChannelID());		
    		System.out.println("Properties " + genPropt);
    		System.out.println("PropHeader " + headerString);
*/
    		/*
    		 * Loop over de bestaande properties en waar deze niet gevuld zijn maar wel voorkomen in de Excel worden de Excel waarden overgenomen
    		 * wanneer de properties wel al gevuld zijn skippen we deze. 
    		 * Rekening houdend met het wachtwoorden, deze worden als leeg weergegeven terwijl deze mogelijk wel al gevuld zijn in de Directory
    		 */
    		for(int z=0;z<currentProperties;z++)
    		{
    			if(headerString.contains(genPropt.get(z).getName()))
    			{
    				updatedAttributes = true;
//    				System.out.println("in de lijst " + genPropt.get(z).getName() + " - " + genPropt.get(z).getValue());
    				if(genPropt.get(z).getValue().length()== 0)
    				{
    					for(int test=0;test<ChannelRijDetails.length;test++)
		                {
	        				if(HeaderRijDetails[test].equals(genPropt.get(z).getName()))
	        				{
	        					genPropt.get(z).setValue(ChannelRijDetails[test]);
	        				}
		                }
    					genProp = (GenericProperty[])genPropt.toArray(new GenericProperty[1]);
    					comChannel.setAdapterSpecificAttribute(genProp);
    					//changelist.elementenString.add(genPropt.get(z).getName());
    				}
    				elementenString.set(ElementenNaUpdate, genPropt.get(z).getName());
    				ElementenNaUpdate++;
    			}
    			
    		}
    		
    		
/*
    		System.out.println("Header Rij " + HeaderRijDetails.length);
    		System.out.println("currentProperties " + currentProperties);
    		System.out.println("Aantal Updates " + ElementenNaUpdate);
    		System.out.println("HeaderString Vector size " + headerString.size());
*/  		
    		
    		if(ElementenNaUpdate < headerString.size() && updatedAttributes)
    		{
    			for(int g=0;g<ChannelRijDetails.length;g++)
    			{
    				if(!elementenString.contains(HeaderRijDetails[g]))
    				{
//    					System.out.println("Niet in lijst wel in Excel " + HeaderRijDetails[g] + " - " + ChannelRijDetails[g]  );
    					GenericProperty prop = new GenericProperty(HeaderRijDetails[g],ChannelRijDetails[g]);
    					genPropt.add(prop);
    					genProp = (GenericProperty[])genPropt.toArray(new GenericProperty[1]);
    					comChannel.setAdapterSpecificAttribute(genProp);
    				}
    				
    			}
    		}
//    		genProp = (GenericProperty[])genPropt.toArray(new GenericProperty[1]);
    		
    		/*
    		 * Channel metadata gegevens opbouwen
    		 */
    		
    		ComChRestr.setCommunicationChannelID(comChannel.getCommunicationChannelID());   		
    		ComChRestr.setAdapterEngineName(comChannel.getAdapterEngineName());   	

    		ComChRestr.setAdapterMetadata(comChannel.getAdapterMetadata());
    		ComChRestr.setCommunicationChannelID(comChannel.getCommunicationChannelID());
            ComChRestr.setDirection(comChannel.getDirection());
            ComChRestr.setMasterLanguage(comChannel.getMasterLanguage());
            ComChRestr.setMessageProtocol(comChannel.getMessageProtocol());
            ComChRestr.setMessageProtocolVersion(comChannel.getMessageProtocolVersion());
            ComChRestr.setModuleProcess(comChannel.getModuleProcess());
            ComChRestr.setReceiverIdentifier(comChannel.getReceiverIdentifier());
            ComChRestr.setSenderIdentifier(comChannel.getSenderIdentifier());
            ComChRestr.setTransportProtocol(comChannel.getTransportProtocol());
            ComChRestr.setTransportProtocolVersion(comChannel.getTransportProtocolVersion()); 
            ComChRestr.setAdapterSpecificAttribute(comChannel.getAdapterSpecificAttribute());         
            ComChRestr.setAdapterSpecificTableAttribute(comChannel.getAdapterSpecificTableAttribute());
            ComChRestr.setDescription(comChannel.getDescription());
            
            /*
             * Updaten van Channel
             */
            CommunicationChannelRestricted[] comRestrArray = new  CommunicationChannelRestricted[1];
            comRestrArray[0] = ComChRestr; 
 
            createIn.setCommunicationChannel(comRestrArray);
            ConfigurationObjectModifyOut updatedCommChan = commDocument.change(createIn);
            System.out.println(ComChRestr.getCommunicationChannelID().getChannelID() + " uit Changelist " + updatedCommChan.getChangeListID().getChangeListID() + " is ge-update.");

    	}
    	catch(Exception ex)
    	{
    		System.out.println("Exception getChannelDetails " + ex);
    	}  
    	
    	return ComChRestr;
    }
     
    public void setExcelCellLocation(CommunicationChannel comChIn)
    		//String inAdapterTypeString, String inAdapterDirection)
    {
    	switch (comChIn.getAdapterMetadata().getName().toUpperCase()) 
		{
			case "SOAP":
				if(comChIn.getCommunicationChannelID().getChannelID().toUpperCase().contains("PROXY") )
				{
					Startcell = 31;
					endCell=35;
				}
				else
				{
					Startcell = 13;
					endCell=14;
				}
				break;
			case "REST":
				Startcell = 12;
				endCell = 12;
				break;
			case "FILE":
				Startcell = 8;
				endCell = 11;
				break;
			case "RFC":
				if(comChIn.getDirection().toUpperCase().equals("RECEIVER"))
					{
						Startcell = 25;
						endCell=30;
					}
					else
					{
						Startcell = 15;
						endCell=24;
					}		            	
					break;
			case "IDOC":
				Startcell = 36;
				endCell = 36;
				break;
		}
    }
    

    public CommunicationChannelRestricted[] updateCommunicationChannels(CommunicationChannelID[] communicationChannelIDs, String changelist)//, ExcelSheet excel)
    {
    	Vector<CommunicationChannelRestricted> ComChRestrVect = null; 
    	CommunicationChannelRestricted ComChRestr=null;
    	CommunicationChannelRestricted[] ComChRestrArr = new CommunicationChannelRestricted[0]; 

    	ComChRestrArr = new CommunicationChannelRestricted[communicationChannelIDs.length]; 
    	ComChRestrVect = new Vector<CommunicationChannelRestricted>(Arrays.asList(ComChRestrArr));
    	try
    	{
    		String[] getExcelData = excel.createComponentsArray(env);

        	for(int x=0;x<communicationChannelIDs.length;x++)
        	{
        		CommunicationChannelID cchID = communicationChannelIDs[x];
        		CommunicationChannelID communicationChannelID[] = {communicationChannelIDs[x]};		           		
           		
        		String sourceString = cchID.getComponentID() + ":" +cchID.getChannelID();
        		
        		for(int b=0;b<getExcelData.length;b++)
        		{
        			if(getExcelData[b].contains(sourceString))
        			{
        				int lastIndex = getExcelData[b].lastIndexOf(":");
        				String rowIndex = getExcelData[b].substring(lastIndex+1);
        				StartRow = Integer.parseInt(rowIndex);	
        				ComChRestr = getChannelDetails(communicationChannelID, changelist);	
        				break;
        			}
        		}
        		ComChRestrVect.add(x, ComChRestr);
        		ComChRestrArr[x] = ComChRestr;
        	}
    	}
    	catch(Exception x)
    	{
    		System.out.println(" Error getCommunicationChannels "+ x);

    	}  	
     return ComChRestrArr;
    }
    
    
    
    
    
    
    public void getChannelDetailsNoChangelist(CommunicationChannelID[] comChIDArr, XSSFWorkbook readworkbook, XSSFWorkbook writeworkbook)
    {
    	CommunicationChannelService cService = new CommunicationChannelServiceLocator();
        CommunicationChannelServiceVi commDocument = null;

    	try
    	{
            if (CommunicationChannelReadWrite.url.length() == 0)
            	commDocument = cService.getHTTPBasicAuthPort();
            else {
                URL docUrl = new URL(CommunicationChannelReadWrite.url);
                commDocument = cService.getHTTPBasicAuthPort(docUrl);
            }
         
            HTTPBasicAuthBindingStub stub = (HTTPBasicAuthBindingStub)commDocument;
            stub.setUsername(Parameters.getUserid());
            stub.setPassword(Parameters.getPassword()); 
            List<String> errorChans = new ArrayList<String>();

            for(int z=0;z<comChIDArr.length;z++)//comChIDArr.length
            {
            	CommunicationChannelID ccid = comChIDArr[z];
            	CommunicationChannelID[] ccids = new CommunicationChannelID[1];
            	ccids[0] = ccid;         	
            	try
            	{
	            	CommunicationChannelReadIn readCommChan = new CommunicationChannelReadIn();
	            	readCommChan.setCommunicationChannelID(ccids);
	
	            	System.out.println(z + " arrayentry " + ccid.getChannelID() +  "  " + ccid.getComponentID());
	            	CommunicationChannelReadOut readCommChanOut = new CommunicationChannelReadOut();
					readCommChanOut = stub.read(readCommChan);
					
					GenericProperty[] genProp = readCommChanOut.getCommunicationChannel()[0].getAdapterSpecificAttribute();
							
		    		System.out.println("Aantal attributen: " + genProp.length);
		    		System.out.println(readCommChanOut.getCommunicationChannel()[0].getAdapterMetadata().getName());
		    		
		    		excel.writeNewCells(readCommChanOut.getCommunicationChannel()[0], writeworkbook, writeworkbook);  	
            	}
            	catch(Exception exSingle)
            	{
            		System.out.println("FOUT : " + z + " arrayentry " + ccid.getChannelID() +  "  " + ccid.getComponentID());
            		errorChans.add(ccid.getComponentID() +  ":" + ccid.getChannelID());
            	}
            }


        System.out.println("totaal errors: " + errorChans.size());    
  		System.out.println("Alle errors: " + errorChans);
  		
  		String[] totalError = new String[errorChans.size()];
  		totalError = errorChans.toArray(totalError);
  		
    	}
    	catch(Exception ex)
    	{
    		System.out.println("Exception getChannelDetails NO Changelist " + ex);
    	}
    }

}
