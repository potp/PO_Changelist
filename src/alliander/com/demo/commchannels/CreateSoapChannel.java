package alliander.com.demo.commchannels;


import types.api.server.ibdir.aii.sap.com.*;
import CommunicationChannelServiceWsd.*;
import types.api.server.ib.aii.sap.com.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.Vector;

import com.sun.xml.internal.txw2.Document;



public class CreateSoapChannel {
     private static String apiURL = "/CommunicationChannelService/HTTPBasicAuth?wsdl&style=document&mode=standard";
     private static String url = new String();
     private String serverPort = null;
     private boolean bActivate = true;
     private String docChangeID = null;

     public static String env = "TST";

     
     public CreateSoapChannel(String changeID) {
          this.docChangeID = changeID;
          this.setActivate(false);
     }
/*     
    public String[] createSoapChannelActivate(String[] party, String[] component, String[] channel, String[] url, String[] action, GenericProperty[] props) {
    	 Vector<String> vMsg = new Vector<String>();
    	 String[] msgs = null;
    	 CommunicationChannelRestricted[] chans = this.createSoapChan(party, component, channel, url, action, props);
    	 String[] msg = this.createChangeList(chans);
    	 for (int i=0; i<msg.length; i++) vMsg.add(msg[i]);
    	 if (bActivate) {
    	 ChangeList act = new ChangeList();
    	 act.setURL(serverPort);
    	 String changeID = (String)vMsg.get(0).substring(0, 36);
//    	 String[] msgs = act.activate(changeID);
    	 for (int i=0; i<msgs.length; i++) vMsg.add(msgs[i]);
    	 }
    	 return (String[])vMsg.toArray((String[])new String[1]);
    	}
     
     
     public String[] createChangeList (CommunicationChannelRestricted[] chans) {
          String changeID = null;
          Vector<String> vMsg = new Vector<String>();
          try {
               CommunicationChannelCreateChangeIn crtChan = new CommunicationChannelCreateChangeIn();
               crtChan.setCommunicationChannel(chans);
               // Changelist
               if (this.docChangeID != null) crtChan.setChangeListID(this.docChangeID);
               HTTPService service = new HTTPServiceLocator();
               CommunicationChannelServiceVi_Document document = null;
//               CommunicationChannelServiceVi document = null;
               if (url.length() == 0)
            	   document = service.getHTTPPort();
               else {
                    URL docUrl = new URL(url);
                    document = service.getHTTPPort(docUrl);
               }
               // Provide authorized userid
               HTTPBindingStub stub = (HTTPBindingStub)document;
               stub.setUsername(Parameters.getUserid());
               stub.setPassword(Parameters.getPassword());
               // Execute request 
               //create Changelist
               ConfigurationObjectModifyOut resp = document.create(crtChan);
               
               ChangeListID chgID = resp.getChangeListID();
               System.out.println(chgID);
               changeID = chgID.getChangeListID();
               vMsg.add(new String(changeID).concat(" – Create Comm Chan"));
               LogMessageCollection cLogMsg = resp.getLogMessageCollection();
               LogMessageCommunicationChannel[] logMsg = cLogMsg.getLogMessageCommunicationChannel();
               if (logMsg != null && logMsg.length > 0) {
                    for (int i=0; i<logMsg.length; i++) {
                         LogMessageItem msgItem = logMsg[i].getLogMessageItem();
                         Text msgTxt = msgItem.getMessage();
                         vMsg.add(msgTxt.getValue());
                    }
               }
          }
          catch (Exception ex){
               vMsg.add(ex.getMessage());
               ex.printStackTrace();
          }
          return (String[])vMsg.toArray((String[])new String[1]);
     }
     
     
     public CommunicationChannelRestricted[] createSoapChan(String[] party, String[] component, String[] channel, String[] url, String[] action, GenericProperty[] props) {
          Vector<CommunicationChannelRestricted> vChan = new Vector<CommunicationChannelRestricted>();
          for (int i=0; i<channel.length; i++) {
               CommunicationChannelRestricted commChan = this.build1SoapChan(party[i], component[i], channel[i], url[i], action[i], props);
               vChan.add(commChan);
          }
//          e1ef6c534a9a11e7a9b400000da3afae
          CommunicationChannelRestricted[] chans = (CommunicationChannelRestricted[])vChan.toArray(new CommunicationChannelRestricted[1]);
          return chans;
     }
     
     private CommunicationChannelRestricted build1SoapChan(String party, String component, String channel, String url, String action, GenericProperty[] props) {
          CommunicationChannelRestricted commChan = new CommunicationChannelRestricted();
          try {
               commChan.setMasterLanguage("EN");
               // Communication Channel ID info
               CommunicationChannelID commID = new CommunicationChannelID();
               commID.setChannelID(channel);
               commID.setComponentID(component);
               commID.setPartyID(party);
               commChan.setCommunicationChannelID(commID);
               
               
               // Adapter Type
               DesignObjectID adapter = new DesignObjectID();
               adapter.setName("SOAP");
               adapter.setNamespace("http://sap.com/xi/XI/System");     
               adapter.setSoftwareComponentVersionID("0050568f0aac1ed4a6e56926325e2eb3"); //1879eed0-7b4e-11d9-87c6-c81c0a114c15
      
               commChan.setAdapterMetadata(adapter);
             
               commChan.setDirection("Receiver");
               commChan.setTransportProtocol("HTTP");
               commChan.setTransportProtocolVersion("");
               commChan.setMessageProtocol("XI");
               commChan.setMessageProtocolVersion("");
               // Adapter Properties
              
               Vector<GenericProperty> vProp = new Vector<GenericProperty>();
               GenericProperty prop = new GenericProperty("XMBWS.TargetURL", url);
               vProp.add(prop);
               prop = new GenericProperty("XMBWS.DefaultSOAPAction", action);
               vProp.add(prop);
               prop = new GenericProperty("useAuth", "1");
               vProp.add(prop);
               prop = new GenericProperty("XMBWS.User", Parameters.getUserid());
               vProp.add(prop);
               prop = new GenericProperty("XMBWS.Password", Parameters.getPassword());
               vProp.add(prop);
               GenericProperty[] props = (GenericProperty[])vProp.toArray(new GenericProperty[1]);
              
               commChan.setAdapterSpecificAttribute(props);
          }
          catch (Exception ex){
               ex.printStackTrace();
          }
          return commChan;
     }
     */
     public void setURL(String serverPort) {
          if (serverPort == null) return;
          this.serverPort = serverPort;
          this.url = this.url.concat("http://").concat(serverPort).concat(apiURL);
     }
     public void setActivate(boolean yesno) {
          this.bActivate = yesno;
     }

     
     public String ChangelistActivate(String excelSheetFile, boolean ActivateChangelist, String environment, String ChangelistID)
     {
	     CommunicationChannelReadWrite commCh = new CommunicationChannelReadWrite();
	     ChangeList chg = new ChangeList(); 

		 ExcelSheet excel = new ExcelSheet(excelSheetFile);//"C:\\Data\\ReleaseNotes template.xlsx"
	     String[] pis = excel.getPIdetails(environment);

	     commCh.setEnv(environment);
	     commCh.setURL(pis[0]+":"+pis[1]);
	     chg.setURL(pis[0]+":"+pis[1]);
	     /*
	     System.out.println("Changelist Activeren: " + ActivateChangelist);
	     */

	     if(ChangelistID.length()<20)
	    	 ChangelistID = pis[2];

	     String Activation = "Niet geactiveerd !!";
	     
	     System.out.println("Start -->");
	     ChangeListGetObjectIdentifiersOut chObjOut = chg.getChangelistDetails(ChangelistID);
	     
	     CreateSoapChannel initSoap = new CreateSoapChannel(ChangelistID);
	     initSoap.setURL(pis[0]+":"+pis[1]);
	
	     if(chObjOut.getCommunicationChannelID().length>0)
	     {
	    	 CommunicationChannelRestricted[] CommChannelRestr=null;
	    	 CommunicationChannelReadWrite commChannel = new CommunicationChannelReadWrite();
	    	 
	    	 /*
	    	  * Update Channels met de juiste inhoud. Als er al inhoud in de channels staat dan wordt deze genegeerd
	    	  */
	    	 CommChannelRestr = commChannel.updateCommunicationChannels(chObjOut.getCommunicationChannelID(),ChangelistID);
	
	         CommunicationChannelCreateChangeIn crtChan = new CommunicationChannelCreateChangeIn();
	         crtChan.setChangeListID(pis[2]);
	    	 crtChan.setCommunicationChannel(CommChannelRestr);
	    	 
	    	 
	    	 if(ActivateChangelist)
	    	 {
	    		 Activation = chg.activateChangelist(ChangelistID, crtChan);
	    	 }
	         System.out.println(" --- Einde -----" + Activation );
	     }
	     else
	     {
	    	 System.out.println(" GEEN COMMUNICATION CHANNELS GEVONDEN IN CHANGELIST: " + ChangelistID);
	     }
	     return Activation;
     }
     
     
     public static void main(String[] args) {

    	 ExcelSheet excel = new ExcelSheet(Parameters.getFilename());//"C:\\Data\\ReleaseNotes template.xlsx"
         String[] pis = excel.getPIdetails(env);

         ChangeList chg = new ChangeList(); 
         chg.setURL(pis[0]+":"+pis[1]);
         
         
         CommunicationChannelReadWrite commCh = new CommunicationChannelReadWrite();
         commCh.setEnv(env);
         commCh.setURL(pis[0]+":"+pis[1]);
         
         
         System.out.println("Start -->");
         ChangeListGetObjectIdentifiersOut chObjOut = chg.getChangelistDetails(pis[2]);
         
         CreateSoapChannel initSoap = new CreateSoapChannel(pis[2]);
         initSoap.setURL(pis[0]+":"+pis[1]);

         if(chObjOut.getCommunicationChannelID().length>0)
         {
        	 CommunicationChannelRestricted[] CommChannelRestr=null;
        	 CommunicationChannelReadWrite commChannel = new CommunicationChannelReadWrite();
        	 
        	 /*
        	  * Update Channels met de juiste inhoud. Als er al inhoud in de channels staat dan wordt deze genegeerd
        	  */
        	 CommChannelRestr = commChannel.updateCommunicationChannels(chObjOut.getCommunicationChannelID(), pis[2]);

             CommunicationChannelCreateChangeIn crtChan = new CommunicationChannelCreateChangeIn();
             crtChan.setChangeListID(pis[2]);
        	 crtChan.setCommunicationChannel(CommChannelRestr);

             String Activation = chg.activateChangelist(pis[2], crtChan);
             
             System.out.println(" --- Einde -----" + Activation);
         }
         else
         {
        	 System.out.println(" GEEN COMMUNICATION CHANNELS GEVONDEN IN CHANGELIST: " + pis[2]);
         }

    }
}
                        