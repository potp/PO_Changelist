package com.sap.xi.BASIS;

public class IntegratedConfigurationInProxy implements com.sap.xi.BASIS.IntegratedConfigurationIn {
  private String _endpoint = null;
  private com.sap.xi.BASIS.IntegratedConfigurationIn integratedConfigurationIn = null;
  
  public IntegratedConfigurationInProxy() {
    _initIntegratedConfigurationInProxy();
  }
  
  public IntegratedConfigurationInProxy(String endpoint) {
    _endpoint = endpoint;
    _initIntegratedConfigurationInProxy();
  }
  
  private void _initIntegratedConfigurationInProxy() {
    try {
      integratedConfigurationIn = (new com.sap.xi.BASIS.IntegratedConfigurationInServiceLocator()).getIntegratedConfigurationInPort();
      if (integratedConfigurationIn != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)integratedConfigurationIn)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)integratedConfigurationIn)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (integratedConfigurationIn != null)
      ((javax.xml.rpc.Stub)integratedConfigurationIn)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sap.xi.BASIS.IntegratedConfigurationIn getIntegratedConfigurationIn() {
    if (integratedConfigurationIn == null)
      _initIntegratedConfigurationInProxy();
    return integratedConfigurationIn;
  }
  
  public com.sap.xi.BASIS.LogMessageCollection check(com.sap.xi.BASIS.MessageHeaderID[] integratedConfigurationCheckRequest) throws java.rmi.RemoteException{
    if (integratedConfigurationIn == null)
      _initIntegratedConfigurationInProxy();
    return integratedConfigurationIn.check(integratedConfigurationCheckRequest);
  }
  
  public com.sap.xi.BASIS.ConfigurationObjectModifyOut change(com.sap.xi.BASIS.IntegratedConfigurationCreateChangeIn integratedConfigurationChangeRequest) throws java.rmi.RemoteException{
    if (integratedConfigurationIn == null)
      _initIntegratedConfigurationInProxy();
    return integratedConfigurationIn.change(integratedConfigurationChangeRequest);
  }
  
  public com.sap.xi.BASIS.IntegratedConfigurationQueryOut query(com.sap.xi.BASIS.IntegratedConfigurationQueryIn integratedConfigurationQueryRequest) throws java.rmi.RemoteException{
    if (integratedConfigurationIn == null)
      _initIntegratedConfigurationInProxy();
    return integratedConfigurationIn.query(integratedConfigurationQueryRequest);
  }
  
  public com.sap.xi.BASIS.ConfigurationObjectModifyOut create(com.sap.xi.BASIS.IntegratedConfigurationCreateChangeIn integratedConfigurationCreateRequest) throws java.rmi.RemoteException{
    if (integratedConfigurationIn == null)
      _initIntegratedConfigurationInProxy();
    return integratedConfigurationIn.create(integratedConfigurationCreateRequest);
  }
  
  public com.sap.xi.BASIS.LogMessageCollection revert(com.sap.xi.BASIS.MessageHeaderID[] integratedConfigurationRevertRequest) throws java.rmi.RemoteException{
    if (integratedConfigurationIn == null)
      _initIntegratedConfigurationInProxy();
    return integratedConfigurationIn.revert(integratedConfigurationRevertRequest);
  }
  
  public com.sap.xi.BASIS.IntegratedConfigurationReadOut read(com.sap.xi.BASIS.IntegratedConfigurationReadIn integratedConfigurationReadRequest) throws java.rmi.RemoteException{
    if (integratedConfigurationIn == null)
      _initIntegratedConfigurationInProxy();
    return integratedConfigurationIn.read(integratedConfigurationReadRequest);
  }
  
  public com.sap.xi.BASIS.ConfigurationObjectModifyOut delete(com.sap.xi.BASIS.IntegratedConfigurationDeleteOpenForEditIn integratedConfigurationDeleteRequest) throws java.rmi.RemoteException{
    if (integratedConfigurationIn == null)
      _initIntegratedConfigurationInProxy();
    return integratedConfigurationIn.delete(integratedConfigurationDeleteRequest);
  }
  
  public com.sap.xi.BASIS.IntegratedConfigurationOpenForEditOut openForEdit(com.sap.xi.BASIS.IntegratedConfigurationDeleteOpenForEditIn integratedConfigurationOpenForEditRequest) throws java.rmi.RemoteException{
    if (integratedConfigurationIn == null)
      _initIntegratedConfigurationInProxy();
    return integratedConfigurationIn.openForEdit(integratedConfigurationOpenForEditRequest);
  }
  
  
}