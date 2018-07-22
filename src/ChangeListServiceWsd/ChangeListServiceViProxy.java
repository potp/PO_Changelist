package ChangeListServiceWsd;

public class ChangeListServiceViProxy implements ChangeListServiceWsd.ChangeListServiceVi {
  private String _endpoint = null;
  private ChangeListServiceWsd.ChangeListServiceVi changeListServiceVi = null;
  
  public ChangeListServiceViProxy() {
    _initChangeListServiceViProxy();
  }
  
  public ChangeListServiceViProxy(String endpoint) {
    _endpoint = endpoint;
    _initChangeListServiceViProxy();
  }
  
  private void _initChangeListServiceViProxy() {
    try {
      changeListServiceVi = (new ChangeListServiceWsd.ChangeListServiceLocator()).getHTTPSBasicAuthPort();
      if (changeListServiceVi != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)changeListServiceVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)changeListServiceVi)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (changeListServiceVi != null)
      ((javax.xml.rpc.Stub)changeListServiceVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ChangeListServiceWsd.ChangeListServiceVi getChangeListServiceVi() {
    if (changeListServiceVi == null)
      _initChangeListServiceViProxy();
    return changeListServiceVi;
  }
  
  public types.api.server.ibdir.aii.sap.com.LogMessageCollection activate(java.lang.String changeListActivateRequest) throws java.rmi.RemoteException{
    if (changeListServiceVi == null)
      _initChangeListServiceViProxy();
    return changeListServiceVi.activate(changeListActivateRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.LogMessageCollection checkContent(java.lang.String changeListCheckContentRequest) throws java.rmi.RemoteException{
    if (changeListServiceVi == null)
      _initChangeListServiceViProxy();
    return changeListServiceVi.checkContent(changeListCheckContentRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.ChangeListCreateOut create(types.api.server.ib.aii.sap.com.ChangeListIDRestricted changeListCreateRequest) throws java.rmi.RemoteException{
    if (changeListServiceVi == null)
      _initChangeListServiceViProxy();
    return changeListServiceVi.create(changeListCreateRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.ChangeListGetCacheStateOut getCacheState(java.lang.String changeListGetCacheStateRequest) throws java.rmi.RemoteException{
    if (changeListServiceVi == null)
      _initChangeListServiceViProxy();
    return changeListServiceVi.getCacheState(changeListGetCacheStateRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.ChangeListGetObjectIdentifiersOut getObjectIdentifiers(java.lang.String changeListGetObjectIdentifiersRequest) throws java.rmi.RemoteException{
    if (changeListServiceVi == null)
      _initChangeListServiceViProxy();
    return changeListServiceVi.getObjectIdentifiers(changeListGetObjectIdentifiersRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.ChangeListGetStateOut getState(java.lang.String changeListGetStateRequest) throws java.rmi.RemoteException{
    if (changeListServiceVi == null)
      _initChangeListServiceViProxy();
    return changeListServiceVi.getState(changeListGetStateRequest);
  }
  
  public types.api.server.ibdir.aii.sap.com.LogMessageCollection revert(java.lang.String changeListRevertRequest) throws java.rmi.RemoteException{
    if (changeListServiceVi == null)
      _initChangeListServiceViProxy();
    return changeListServiceVi.revert(changeListRevertRequest);
  }
  
  
}