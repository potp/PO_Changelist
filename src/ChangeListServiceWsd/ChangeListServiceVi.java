/**
 * ChangeListServiceVi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ChangeListServiceWsd;

public interface ChangeListServiceVi extends java.rmi.Remote {
    public types.api.server.ibdir.aii.sap.com.LogMessageCollection activate(java.lang.String changeListActivateRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.LogMessageCollection checkContent(java.lang.String changeListCheckContentRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.ChangeListCreateOut create(types.api.server.ib.aii.sap.com.ChangeListIDRestricted changeListCreateRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.ChangeListGetCacheStateOut getCacheState(java.lang.String changeListGetCacheStateRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.ChangeListGetObjectIdentifiersOut getObjectIdentifiers(java.lang.String changeListGetObjectIdentifiersRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.ChangeListGetStateOut getState(java.lang.String changeListGetStateRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.LogMessageCollection revert(java.lang.String changeListRevertRequest) throws java.rmi.RemoteException;
}
