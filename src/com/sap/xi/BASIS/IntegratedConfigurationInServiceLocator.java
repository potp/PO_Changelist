/**
 * IntegratedConfigurationInServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class IntegratedConfigurationInServiceLocator extends org.apache.axis.client.Service implements com.sap.xi.BASIS.IntegratedConfigurationInService {

    public IntegratedConfigurationInServiceLocator() {
    }


    public IntegratedConfigurationInServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IntegratedConfigurationInServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IntegratedConfigurationInPort
    private java.lang.String IntegratedConfigurationInPort_address = "http://dbp-a01.rdc.local:50200/IntegratedConfigurationInService/IntegratedConfigurationInImplBean";

    public java.lang.String getIntegratedConfigurationInPortAddress() {
        return IntegratedConfigurationInPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IntegratedConfigurationInPortWSDDServiceName = "IntegratedConfigurationInPort";

    public java.lang.String getIntegratedConfigurationInPortWSDDServiceName() {
        return IntegratedConfigurationInPortWSDDServiceName;
    }

    public void setIntegratedConfigurationInPortWSDDServiceName(java.lang.String name) {
        IntegratedConfigurationInPortWSDDServiceName = name;
    }

    public com.sap.xi.BASIS.IntegratedConfigurationIn getIntegratedConfigurationInPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IntegratedConfigurationInPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIntegratedConfigurationInPort(endpoint);
    }

    public com.sap.xi.BASIS.IntegratedConfigurationIn getIntegratedConfigurationInPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sap.xi.BASIS.IntegratedConfigurationInBindingStub _stub = new com.sap.xi.BASIS.IntegratedConfigurationInBindingStub(portAddress, this);
            _stub.setPortName(getIntegratedConfigurationInPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIntegratedConfigurationInPortEndpointAddress(java.lang.String address) {
        IntegratedConfigurationInPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sap.xi.BASIS.IntegratedConfigurationIn.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sap.xi.BASIS.IntegratedConfigurationInBindingStub _stub = new com.sap.xi.BASIS.IntegratedConfigurationInBindingStub(new java.net.URL(IntegratedConfigurationInPort_address), this);
                _stub.setPortName(getIntegratedConfigurationInPortWSDDServiceName());
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
        if ("IntegratedConfigurationInPort".equals(inputPortName)) {
            return getIntegratedConfigurationInPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationInService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationInPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IntegratedConfigurationInPort".equals(portName)) {
            setIntegratedConfigurationInPortEndpointAddress(address);
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
