package CommunicationChannelServiceWsd;

public class CommunicationChannelServiceViProxy implements CommunicationChannelServiceWsd.CommunicationChannelServiceVi {
  private String _endpoint = null;
  private CommunicationChannelServiceWsd.CommunicationChannelServiceVi communicationChannelServiceVi = null;
  
  public CommunicationChannelServiceViProxy() {
    _initCommunicationChannelServiceViProxy();
  }
  
  public CommunicationChannelServiceViProxy(String endpoint) {
    _endpoint = endpoint;
    _initCommunicationChannelServiceViProxy();
  }
  
  private void _initCommunicationChannelServiceViProxy() {
    try {
      communicationChannelServiceVi = (new CommunicationChannelServiceWsd.CommunicationChannelServiceLocator()).getHTTPSBasicAuthPort();
      if (communicationChannelServiceVi != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)communicationChannelServiceVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)communicationChannelServiceVi)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (communicationChannelServiceVi != null)
      ((javax.xml.rpc.Stub)communicationChannelServiceVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public CommunicationChannelServiceWsd.CommunicationChannelServiceVi getCommunicationChannelServiceVi() {
    if (communicationChannelServiceVi == null)
      _initCommunicationChannelServiceViProxy();
    return communicationChannelServiceVi;
  }
  
  public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut change(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn communicationChannelChangeRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi == null)
      _initCommunicationChannelServiceViProxy();
    return communicationChannelServiceVi.change(communicationChannelChangeRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.LogMessageCollection check(types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelCheckRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi == null)
      _initCommunicationChannelServiceViProxy();
    return communicationChannelServiceVi.check(communicationChannelCheckRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut create(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn communicationChannelCreateRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi == null)
      _initCommunicationChannelServiceViProxy();
    return communicationChannelServiceVi.create(communicationChannelCreateRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut createFromTemplate(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateFromTemplateIn communicationChannelCreateFromTemplateRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi == null)
      _initCommunicationChannelServiceViProxy();
    return communicationChannelServiceVi.createFromTemplate(communicationChannelCreateFromTemplateRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut delete(types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn communicationChannelDeleteRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi == null)
      _initCommunicationChannelServiceViProxy();
    return communicationChannelServiceVi.delete(communicationChannelDeleteRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.CommunicationChannelOpenForEditOut openForEdit(types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn communicationChannelOpenForEditRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi == null)
      _initCommunicationChannelServiceViProxy();
    return communicationChannelServiceVi.openForEdit(communicationChannelOpenForEditRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryOut query(types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryIn communicationChannelQueryRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi == null)
      _initCommunicationChannelServiceViProxy();
    return communicationChannelServiceVi.query(communicationChannelQueryRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.CommunicationChannelReadOut read(types.api.server.ibdir.aii.sap.com.CommunicationChannelReadIn communicationChannelReadRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi == null)
      _initCommunicationChannelServiceViProxy();
    return communicationChannelServiceVi.read(communicationChannelReadRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.LogMessageCollection revert(types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelRevertRequest) throws java.rmi.RemoteException{
    if (communicationChannelServiceVi == null)
      _initCommunicationChannelServiceViProxy();
    return communicationChannelServiceVi.revert(communicationChannelRevertRequest);
  }
  
  
}