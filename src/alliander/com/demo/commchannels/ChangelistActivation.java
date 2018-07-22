package alliander.com.demo.commchannels;


import java.applet.*;
import java.awt.*;
import java.util.*;

import javax.swing.JLabel;

import java.lang.*;
import java.text.*;
import java.awt.event.*; 
import java.io.*;

public class ChangelistActivation extends Applet{
	
		private String messages;
	   private Frame mainFrame;
	   private Panel spacerFrame;
	   
	   private Label headerLabel;
	   private Label statusLabel;
	   private Panel controlPanel;
	   
	   private Panel omgevingPanel;
	   private Panel filePanel;
	   private Panel textFieldPanel;
	   private Panel activerenPanel;
	   private Panel ExecutePanel;
	   
	   private CheckboxGroup ChangelistActivate  = new CheckboxGroup();
	   private Checkbox activateChangelist = new Checkbox("Activeren", ChangelistActivate,false); 
	   private Checkbox  UpdateChangelist = new Checkbox("NIET Activeren", ChangelistActivate,true); 
	   private TextField ChangelistID = new TextField("",20);
	   private Label ChangelistIDLabel = new Label("Changelist ID:");
	   private Choice omgeving = new Choice();
	   
 
	public ChangelistActivation() {
		   prepareGUI();
		   showFileDialog();

	   }
	
	private void prepareGUI(){
	      mainFrame = new Frame("Changelist Aciveren");
	      mainFrame.setSize(400,400);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      
	      spacerFrame = new Panel();
	      spacerFrame.setSize(400,10);
	      
			omgeving.add("DEV");
			omgeving.add("TST");
			omgeving.add("ACC");
			omgeving.add("PRD");
     
	      headerLabel = new Label();
	      headerLabel.setAlignment(Label.CENTER);
	      statusLabel = new Label();        
	      statusLabel.setAlignment(Label.CENTER);
	      statusLabel.setSize(350,100);

	      controlPanel = new Panel();
	      controlPanel.setLayout(new GridLayout(5,1));
	      
	      omgevingPanel = new Panel();
	      omgevingPanel.setLayout(new FlowLayout());
	      omgevingPanel.add(omgeving);

		  filePanel = new Panel();
		  filePanel.setLayout(new FlowLayout());
		  
		  ExecutePanel = new Panel();
		  ExecutePanel.setLayout(new FlowLayout());
		  
		  textFieldPanel  = new Panel();
		  textFieldPanel.setLayout(new GridLayout(1,2));
		  ChangelistIDLabel.setAlignment(Label.RIGHT);
		  JLabel label = new JLabel("Changelist ID: ");
		  label.setHorizontalAlignment(Label.RIGHT);
	      label.setLabelFor(ChangelistID);
	      
		  textFieldPanel.add(ChangelistIDLabel);
		  //textFieldPanel.add(label);
		  textFieldPanel.add(ChangelistID);
		  
		  activerenPanel = new Panel();
		  activerenPanel.setLayout(new FlowLayout());
		  activerenPanel.add(activateChangelist);
		  activerenPanel.add(UpdateChangelist);

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	   }
	
	
	private void showFileDialog(){
      headerLabel.setText("Selecteer de Excelsheet"); 

      final FileDialog fileDialog = new FileDialog(mainFrame,"Selecteer ExcelSheet");
      Button showFileDialogButton = new Button("Excelsheet");
      showFileDialogButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            fileDialog.setVisible(true);
            statusLabel.setText("File Selected :" 
            + fileDialog.getDirectory() + fileDialog.getFile());
         }
      });
      Button uitvoerenUpdateButton = new Button("Changelist Activeren / Updaten");
      uitvoerenUpdateButton.addActionListener(new ActionListener() {
    	  @Override
          public void actionPerformed(ActionEvent e) { 
    		  setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    		  String chgListID = ChangelistID.getText();
    		  String env = omgeving.getSelectedItem();
    		  boolean activate = activateChangelist.getState();
    		  
    		  String[] FileLocation = new String[1];
    		  FileLocation[0] = fileDialog.getDirectory() + fileDialog.getFile();
    		  
    		  CreateSoapChannel crSoapChan = new CreateSoapChannel(chgListID);
    		  String succes = crSoapChan.ChangelistActivate(FileLocation[0], activate, env, chgListID);
    		  //messages
    		  statusLabel.setText(succes + " Changelist : " + ChangelistID.getText() + " Omgeving " + env + " File Locatie " +  FileLocation[0]); 
    		  setCursor(null); 
    	  }
      });
	   
	   
      ExecutePanel.add(uitvoerenUpdateButton); 
      filePanel.add(showFileDialogButton);
      
      controlPanel.add(omgevingPanel);
      controlPanel.add(textFieldPanel);
      controlPanel.add(activerenPanel);
      controlPanel.add(filePanel);
      controlPanel.add(ExecutePanel);
      
      mainFrame.setVisible(true);  
   }

}

