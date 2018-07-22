package CommunicationChannelServiceWsd;

public class CommunicationChannelServiceVi_DocumentProxy implements CommunicationChannelServiceWsd.CommunicationChannelServiceVi_Document {
  private String _endpoint = null;
  private CommunicationChannelServiceWsd.CommunicationChannelServiceVi_Document communicationChannelServiceVi_Document = null;
  
  public CommunicationChannelServiceVi_DocumentProxy() {
    _initCommunicationChannelServiceVi_DocumentProxy();
  }
  
  public CommunicationChannelServiceVi_DocumentProxy(String endpoint) {
    _endpoint = endpoint;
    _initCommunicationChannelServiceVi_DocumentProxy();
  }
  
  private void _initCommunicationChannelServiceVi_DocumentProxy() {
    try {
      communicationChannelServiceVi_Document = (new CommunicationChannelServiceWsd.HTTPServiceLocator()).getHTTPPort();
      if (communicationChannelServiceVi_Document != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)communicationChannelServiceVi_Document)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)communicationChannelServiceVi_Document)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (communicationChannelServiceVi_Document != null)
      ((javax.xml.rpc.Stub)communicationChannelServiceVi_Document)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public CommunicationChannelServiceWsd.CommunicationChannelServiceVi_Document getCommunicationChannelServiceVi_Document() {
    if (communicationChannelServiceVi_Document == null)
      _initCommunicationChannelServiceVi_DocumentProxy();
    return communicationChannelServiceVi_Document;
  }
  
  public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut change(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn communicationChannelChangeRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi_Document == null)
      _initCommunicationChannelServiceVi_DocumentProxy();
    return communicationChannelServiceVi_Document.change(communicationChannelChangeRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.LogMessageCollection check(types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelCheckRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi_Document == null)
      _initCommunicationChannelServiceVi_DocumentProxy();
    return communicationChannelServiceVi_Document.check(communicationChannelCheckRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut create(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn communicationChannelCreateRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi_Document == null)
      _initCommunicationChannelServiceVi_DocumentProxy();
    return communicationChannelServiceVi_Document.create(communicationChannelCreateRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut createFromTemplate(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateFromTemplateIn communicationChannelCreateFromTemplateRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi_Document == null)
      _initCommunicationChannelServiceVi_DocumentProxy();
    return communicationChannelServiceVi_Document.createFromTemplate(communicationChannelCreateFromTemplateRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut delete(types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn communicationChannelDeleteRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi_Document == null)
      _initCommunicationChannelServiceVi_DocumentProxy();
    return communicationChannelServiceVi_Document.delete(communicationChannelDeleteRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.CommunicationChannelOpenForEditOut openForEdit(types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn communicationChannelOpenForEditRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi_Document == null)
      _initCommunicationChannelServiceVi_DocumentProxy();
    return communicationChannelServiceVi_Document.openForEdit(communicationChannelOpenForEditRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryOut query(types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryIn communicationChannelQueryRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi_Document == null)
      _initCommunicationChannelServiceVi_DocumentProxy();
    return communicationChannelServiceVi_Document.query(communicationChannelQueryRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.CommunicationChannelReadOut read(types.api.server.ibdir.aii.sap.com.CommunicationChannelReadIn communicationChannelReadRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi_Document == null)
      _initCommunicationChannelServiceVi_DocumentProxy();
    return communicationChannelServiceVi_Document.read(communicationChannelReadRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.LogMessageCollection revert(types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelRevertRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi_Document == null)
      _initCommunicationChannelServiceVi_DocumentProxy();
    return communicationChannelServiceVi_Document.revert(communicationChannelRevertRequest);
  }
  
  
}