/**
 * HTTPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CommunicationChannelServiceWsd;

public class HTTPServiceLocator extends org.apache.axis.client.Service implements CommunicationChannelServiceWsd.HTTPService {

    public HTTPServiceLocator() {
    }


    public HTTPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HTTPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HTTPPort
    private java.lang.String HTTPPort_address = "http://dbp-a01.rdc.local:50200/CommunicationChannelService/HTTPBasicAuth?wsdl&style=document";

    public java.lang.String getHTTPPortAddress() {
        return HTTPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HTTPPortWSDDServiceName = "HTTPPort";

    public java.lang.String getHTTPPortWSDDServiceName() {
        return HTTPPortWSDDServiceName;
    }

    public void setHTTPPortWSDDServiceName(java.lang.String name) {
        HTTPPortWSDDServiceName = name;
    }

    public CommunicationChannelServiceWsd.CommunicationChannelServiceVi_Document getHTTPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HTTPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHTTPPort(endpoint);
    }

    public CommunicationChannelServiceWsd.CommunicationChannelServiceVi_Document getHTTPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            CommunicationChannelServiceWsd.HTTPBindingStub _stub = new CommunicationChannelServiceWsd.HTTPBindingStub(portAddress, this);
            _stub.setPortName(getHTTPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHTTPPortEndpointAddress(java.lang.String address) {
        HTTPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CommunicationChannelServiceWsd.CommunicationChannelServiceVi_Document.class.isAssignableFrom(serviceEndpointInterface)) {
                CommunicationChannelServiceWsd.HTTPBindingStub _stub = new CommunicationChannelServiceWsd.HTTPBindingStub(new java.net.URL(HTTPPort_address), this);
                _stub.setPortName(getHTTPPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HTTPPort".equals(inputPortName)) {
            return getHTTPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:CommunicationChannelServiceWsd/CommunicationChannelServiceVi/document", "HTTPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:CommunicationChannelServiceWsd/CommunicationChannelServiceVi/document", "HTTPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HTTPPort".equals(portName)) {
            setHTTPPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
