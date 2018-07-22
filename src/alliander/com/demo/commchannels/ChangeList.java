package alliander.com.demo.commchannels;

import ChangeListServiceWsd.*;
import ChangeListServiceWsd.HTTPBasicAuthBindingStub;
import CommunicationChannelServiceWsd.*;
import types.api.server.ibdir.aii.sap.com.*;
import types.api.server.ib.aii.sap.com.*;

import java.util.List;
import java.util.Vector;
import java.net.*;

public class ChangeList {
     private static String apiURL = "/ChangeListService/HTTPBasicAuth?wsdl&style=document&mode=standard";
     private static String apiCommChanURL = "/CommunicationChannelService/HTTPBasicAuth?wsdl&style=document&mode=standard";
     private String url = new String();
     
     
     public String activateChangelist(String changelist, CommunicationChannelCreateChangeIn crtChan)
     {
    	 String okValue="";
    	 Vector<String> vMsg = new Vector<String>();
         vMsg.add(new String(changelist).concat(" – Activate"));

         try {
             ChangeListService service = new ChangeListServiceLocator();
             ChangeListServiceVi document = null;
             if (this.url.length() == 0)
                  document = service.getHTTPBasicAuthPort();
             else {
                  URL docUrl = new URL(this.url);
                  document = service.getHTTPBasicAuthPort(docUrl);
             }
             HTTPBasicAuthBindingStub stub = (HTTPBasicAuthBindingStub)document;
             stub.setUsername(Parameters.getUserid());
             stub.setPassword(Parameters.getPassword()); 

             LogMessageCollection cLogMsg = document.activate(changelist);
             LogMessageCommunicationChannel[] logMsg = cLogMsg.getLogMessageCommunicationChannel();
             if (logMsg != null && logMsg.length > 0) {
                 for (int i=0; i<logMsg.length; i++) {
                	 LogMessageItem msgItem = logMsg[i].getLogMessageItem();
                     Text msgTxt = msgItem.getMessage();
                     vMsg.add(msgTxt.getValue());
                     System.out.println("Channel: " + logMsg[i].getCommunicationChannelID().getChannelID());
                     System.out.println("msg: " + msgTxt.getValue());
                 }
                 okValue = "Fouten bij activatie ";
             }
             else okValue = "OK";
             
         }
         catch(Exception ActivateEx)
         {
        	 System.out.println(ActivateEx);
        	 okValue = "ERROR " + ActivateEx.getMessage();
         }    
         return okValue;
     }

     
     public void setURL(String serverPort) {
          if (serverPort == null) return;
          this.url = this.url.concat("http://").concat(serverPort).concat(apiURL);
     }
     
   
     public ChangeListGetObjectIdentifiersOut getChangelistDetails(String changelistID)
     {
    	 ChangeListGetObjectIdentifiersOut chObjOut = null;
         Vector<String> vMsg = new Vector<String>();
         try 
         {
        	 
             ChangeListService service = new ChangeListServiceLocator();
             ChangeListServiceVi document = null; 
			 if (this.url.length() == 0)
			 	{
			     document = service.getHTTPBasicAuthPort();
			 	}
			 else 
			 	{
			     URL docUrl = new URL(this.url);
			     document = service.getHTTPBasicAuthPort(docUrl);
			 	}

			 HTTPBasicAuthBindingStub stub = (HTTPBasicAuthBindingStub)document;
			 
			 stub.setUsername(Parameters.getUserid());
			 stub.setPassword(Parameters.getPassword());
             
			 chObjOut = document.getObjectIdentifiers(changelistID);

        }
        catch (Exception e) 
         {
             vMsg.add(e.getMessage());
             e.printStackTrace();
        }
        return chObjOut;    	 
     }
     
/*     
     public String createChangeList(String name) 
     {
		Vector<String> vMsg = new Vector<String>();
		String changeListID = "";
		String changeListName = "";
		try 
		{
			// Opzetten url /  verbinding naar Changelist API
			ChangeListService service = new ChangeListServiceLocator();
			ChangeListServiceVi document = null;
			if (this.url.length() == 0)
				document = service.getHTTPBasicAuthPort();
			else 
			{
				URL docUrl = new URL(this.url);
				document = service.getHTTPBasicAuthPort(docUrl);
			}
			HTTPBasicAuthBindingStub stub = (HTTPBasicAuthBindingStub)document;
			stub.setUsername(Parameters.getUserid());
			stub.setPassword(Parameters.getPassword());
			// Einde opzetten verbinding Changelist API
			
			
			LONG_Description description = new LONG_Description();
			description.setLanguageCode("EN");
			description.setValue(name);
			
			ChangeListIDRestricted changeListCreateRequest = new ChangeListIDRestricted();
			changeListCreateRequest.setDescription(description);
			changeListCreateRequest.setName(name);
			
			ChangeListCreateOut changeListCreateOut = document.create(changeListCreateRequest);
			
			ChangeListID changeList = changeListCreateOut.getChangeListID();
			changeListID = changeList.getChangeListID();
			changeListName = changeList.getName();
			vMsg.add(new String(changeListID).concat("(").concat(changeListName).concat(")").concat(" – Create ChangeList"));
		}
		catch (Exception e) {
			vMsg.add(e.getMessage());
			e.printStackTrace();
		}
		return changeListID;
     }
     */
     
     /*
     public String createChangeList(String name) {
          Vector<String> vMsg = new Vector<String>();
          String changeListID = "";
          String changeListName = "";
          try {
               ChangeListService service = new ChangeListServiceLocator();

               ChangeListServiceVi document = null;
               if (this.url.length() == 0)
                    document = service.getHTTPBasicAuthPort();
               else {
                    URL docUrl = new URL(this.url);
                    document = service.getHTTPBasicAuthPort(docUrl);
               }
               HTTPBasicAuthBindingStub stub = (HTTPBasicAuthBindingStub)document;
               stub.setUsername(Parameters.getUserid());
               stub.setPassword(Parameters.getPassword());
               ChangeListID chgID = new ChangeListID();
               ChangeListIDRestricted changeListCreateRequest = new ChangeListIDRestricted();

               LONG_Description description = new LONG_Description();
               description.setLanguageCode("EN");
               description.setValue(name);
               changeListCreateRequest.setDescription(description);
               changeListCreateRequest.setName(name);

               
               String ChangelistID = "d997b6f227c211e682d000000175521e";
               ChangeListGetObjectIdentifiersOut chObjOut = document.getObjectIdentifiers(ChangelistID);
               
               if(chObjOut.getCommunicationChannelID().length>0)
               {
                   for(int q=0;q<chObjOut.getCommunicationChannelID().length;q++)
                   {
                	   System.out.println("ChannelID " + chObjOut.getCommunicationChannelID(q));
                	   System.out.println("Comm Channel name " + chObjOut.getCommunicationChannelID(q).getChannelID());
                	   System.out.println("Comm Channel name " + chObjOut.getCommunicationChannelID(q).getComponentID());
                	   //System.out.println("Scenario name " + chObjOut.getConfigurationScenarioID(q));
//                	   CommunicationChannelRestricted ccrestr = new CommunicationChannelRestricted();
//                	   System.out.println("CommChannelRestricted " + ccrestr.getAdapterMetadata());
//                	   changeListID = chObjOut.getCommunicationChannelID(q).getChannelID();
                   }   
               }
               else
               {
            	   System.out.println("Er is geen data gevonden voor ChangelistID " + ChangelistID);
               }

               
           //    ChangeListCreateOut changeListCreateOut = document.create(changeListCreateRequest);
           //    ChangeListID changeList = changeListCreateOut.getChangeListID();
           //    changeListID = changeList.getChangeListID();
           //    changeListName = changeList.getName();
           //    vMsg.add(new String(changeListID).concat("(").concat(changeListName).concat(")").concat(" – Create ChangeList"));
          }
          catch (Exception e) {
               vMsg.add(e.getMessage());
               e.printStackTrace();
          }
          return changeListID;
     }
     */
     /*
     public static void main(String[] args) {
          ChangeList changeList = new ChangeList();
          changeList.setURL("dbp-a01.rdc.local:50200");
          String name = "ChangeList Demo";
          String changeID = changeList.createChangeList(name);
          System.out.println(changeID);
          System.out.println("Done");
     }
*/
     
     
     /*
     public String[] activate(String chgList) {
          Vector<String> vMsg = new Vector<String>();
          vMsg.add(new String(chgList).concat(" – Activate"));
          try {
               ChangeListService service = new ChangeListServiceLocator();
               ChangeListServiceVi document = null;
               // check for server to execute the webservice
               if (this.url.length() == 0)
                    document = service.getHTTPBasicAuthPort();
               else {
                    URL docUrl = new URL(this.url);
                    document = service.getHTTPBasicAuthPort(docUrl);
               }
               HTTPBasicAuthBindingStub stub = (HTTPBasicAuthBindingStub)document;
               stub.setUsername(Parameters.getUserid());
               stub.setPassword(Parameters.getPassword());
               LogMessageCollection cLogMsg = document.activate(chgList);
               LogMessageCommunicationChannel[] logMsg = cLogMsg.getLogMessageCommunicationChannel();
               if (logMsg != null && logMsg.length > 0) {
                    for (int i=0; i<logMsg.length; i++) {
                         LogMessageItem msgItem = logMsg[i].getLogMessageItem();
                         Text msgTxt = msgItem.getMessage();
                         vMsg.add(msgTxt.getValue());
                         System.out.println(" msg: " + msgTxt.getValue());
                    }
               }
               cLogMsg = document.revert(chgList);
          }
          catch (Exception e) {
               vMsg.add(e.getMessage());
               e.printStackTrace();
          }
          return (String[])vMsg.toArray((String[])new String[1]);
     }
     */
     
}