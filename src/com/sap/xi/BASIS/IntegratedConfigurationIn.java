/**
 * IntegratedConfigurationIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public interface IntegratedConfigurationIn extends java.rmi.Remote {
    public com.sap.xi.BASIS.LogMessageCollection check(com.sap.xi.BASIS.MessageHeaderID[] integratedConfigurationCheckRequest) throws java.rmi.RemoteException;
    public com.sap.xi.BASIS.ConfigurationObjectModifyOut change(com.sap.xi.BASIS.IntegratedConfigurationCreateChangeIn integratedConfigurationChangeRequest) throws java.rmi.RemoteException;
    public com.sap.xi.BASIS.IntegratedConfigurationQueryOut query(com.sap.xi.BASIS.IntegratedConfigurationQueryIn integratedConfigurationQueryRequest) throws java.rmi.RemoteException;
    public com.sap.xi.BASIS.ConfigurationObjectModifyOut create(com.sap.xi.BASIS.IntegratedConfigurationCreateChangeIn integratedConfigurationCreateRequest) throws java.rmi.RemoteException;
    public com.sap.xi.BASIS.LogMessageCollection revert(com.sap.xi.BASIS.MessageHeaderID[] integratedConfigurationRevertRequest) throws java.rmi.RemoteException;
    public com.sap.xi.BASIS.IntegratedConfigurationReadOut read(com.sap.xi.BASIS.IntegratedConfigurationReadIn integratedConfigurationReadRequest) throws java.rmi.RemoteException;
    public com.sap.xi.BASIS.ConfigurationObjectModifyOut delete(com.sap.xi.BASIS.IntegratedConfigurationDeleteOpenForEditIn integratedConfigurationDeleteRequest) throws java.rmi.RemoteException;
    public com.sap.xi.BASIS.IntegratedConfigurationOpenForEditOut openForEdit(com.sap.xi.BASIS.IntegratedConfigurationDeleteOpenForEditIn integratedConfigurationOpenForEditRequest) throws java.rmi.RemoteException;
}
