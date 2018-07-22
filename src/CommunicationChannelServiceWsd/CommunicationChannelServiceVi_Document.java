/**
 * CommunicationChannelServiceVi_Document.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CommunicationChannelServiceWsd;

public interface CommunicationChannelServiceVi_Document extends java.rmi.Remote {
    public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut change(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn communicationChannelChangeRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.LogMessageCollection check(types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelCheckRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut create(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn communicationChannelCreateRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut createFromTemplate(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateFromTemplateIn communicationChannelCreateFromTemplateRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut delete(types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn communicationChannelDeleteRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.CommunicationChannelOpenForEditOut openForEdit(types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn communicationChannelOpenForEditRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryOut query(types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryIn communicationChannelQueryRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.CommunicationChannelReadOut read(types.api.server.ibdir.aii.sap.com.CommunicationChannelReadIn communicationChannelReadRequest) throws java.rmi.RemoteException;
    public types.api.server.ibdir.aii.sap.com.LogMessageCollection revert(types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelRevertRequest) throws java.rmi.RemoteException;
}
