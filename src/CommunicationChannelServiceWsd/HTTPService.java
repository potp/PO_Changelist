/**
 * HTTPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CommunicationChannelServiceWsd;

public interface HTTPService extends javax.xml.rpc.Service {
    public java.lang.String getHTTPPortAddress();

    public CommunicationChannelServiceWsd.CommunicationChannelServiceVi_Document getHTTPPort() throws javax.xml.rpc.ServiceException;

    public CommunicationChannelServiceWsd.CommunicationChannelServiceVi_Document getHTTPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
