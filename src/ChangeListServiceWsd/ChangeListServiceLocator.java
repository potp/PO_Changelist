/**
 * ChangeListServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ChangeListServiceWsd;

public class ChangeListServiceLocator extends org.apache.axis.client.Service implements ChangeListServiceWsd.ChangeListService {

    public ChangeListServiceLocator() {
    }


    public ChangeListServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChangeListServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HTTPSBasicAuthPort
    private java.lang.String HTTPSBasicAuthPort_address = "https://dbp-a01.rdc.local:50201/ChangeListService/HTTPSBasicAuth?style=document";

    public java.lang.String getHTTPSBasicAuthPortAddress() {
        return HTTPSBasicAuthPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HTTPSBasicAuthPortWSDDServiceName = "HTTPSBasicAuthPort";

    public java.lang.String getHTTPSBasicAuthPortWSDDServiceName() {
        return HTTPSBasicAuthPortWSDDServiceName;
    }

    public void setHTTPSBasicAuthPortWSDDServiceName(java.lang.String name) {
        HTTPSBasicAuthPortWSDDServiceName = name;
    }

    public ChangeListServiceWsd.ChangeListServiceVi getHTTPSBasicAuthPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HTTPSBasicAuthPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHTTPSBasicAuthPort(endpoint);
    }

    public ChangeListServiceWsd.ChangeListServiceVi getHTTPSBasicAuthPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ChangeListServiceWsd.HTTPSBasicAuthBindingStub _stub = new ChangeListServiceWsd.HTTPSBasicAuthBindingStub(portAddress, this);
            _stub.setPortName(getHTTPSBasicAuthPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHTTPSBasicAuthPortEndpointAddress(java.lang.String address) {
        HTTPSBasicAuthPort_address = address;
    }


    // Use to get a proxy class for HTTPBasicAuthPort
    private java.lang.String HTTPBasicAuthPort_address = "http://dbp-a01.rdc.local:50200/ChangeListService/HTTPBasicAuth?style=document";

    public java.lang.String getHTTPBasicAuthPortAddress() {
        return HTTPBasicAuthPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HTTPBasicAuthPortWSDDServiceName = "HTTPBasicAuthPort";

    public java.lang.String getHTTPBasicAuthPortWSDDServiceName() {
        return HTTPBasicAuthPortWSDDServiceName;
    }

    public void setHTTPBasicAuthPortWSDDServiceName(java.lang.String name) {
        HTTPBasicAuthPortWSDDServiceName = name;
    }

    public ChangeListServiceWsd.ChangeListServiceVi getHTTPBasicAuthPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HTTPBasicAuthPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHTTPBasicAuthPort(endpoint);
    }

    public ChangeListServiceWsd.ChangeListServiceVi getHTTPBasicAuthPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ChangeListServiceWsd.HTTPBasicAuthBindingStub _stub = new ChangeListServiceWsd.HTTPBasicAuthBindingStub(portAddress, this);
            _stub.setPortName(getHTTPBasicAuthPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHTTPBasicAuthPortEndpointAddress(java.lang.String address) {
        HTTPBasicAuthPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ChangeListServiceWsd.ChangeListServiceVi.class.isAssignableFrom(serviceEndpointInterface)) {
                ChangeListServiceWsd.HTTPSBasicAuthBindingStub _stub = new ChangeListServiceWsd.HTTPSBasicAuthBindingStub(new java.net.URL(HTTPSBasicAuthPort_address), this);
                _stub.setPortName(getHTTPSBasicAuthPortWSDDServiceName());
                return _stub;
            }
            if (ChangeListServiceWsd.ChangeListServiceVi.class.isAssignableFrom(serviceEndpointInterface)) {
                ChangeListServiceWsd.HTTPBasicAuthBindingStub _stub = new ChangeListServiceWsd.HTTPBasicAuthBindingStub(new java.net.URL(HTTPBasicAuthPort_address), this);
                _stub.setPortName(getHTTPBasicAuthPortWSDDServiceName());
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
        if ("HTTPSBasicAuthPort".equals(inputPortName)) {
            return getHTTPSBasicAuthPort();
        }
        else if ("HTTPBasicAuthPort".equals(inputPortName)) {
            return getHTTPBasicAuthPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ChangeListServiceWsd", "ChangeListService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ChangeListServiceWsd", "HTTPSBasicAuthPort"));
            ports.add(new javax.xml.namespace.QName("urn:ChangeListServiceWsd", "HTTPBasicAuthPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HTTPSBasicAuthPort".equals(portName)) {
            setHTTPSBasicAuthPortEndpointAddress(address);
        }
        else 
if ("HTTPBasicAuthPort".equals(portName)) {
            setHTTPBasicAuthPortEndpointAddress(address);
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
