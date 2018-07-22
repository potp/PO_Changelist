/**
 * HTTPBasicAuthBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ChangeListServiceWsd;

public class HTTPBasicAuthBindingStub extends org.apache.axis.client.Stub implements ChangeListServiceWsd.ChangeListServiceVi {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListActivateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCollection"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.LogMessageCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListCheckContentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCollection"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.LogMessageCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListCreateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ChangeListIDRestricted"), types.api.server.ib.aii.sap.com.ChangeListIDRestricted.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListCreateOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.ChangeListCreateOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCacheState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListGetCacheStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListGetCacheStateOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.ChangeListGetCacheStateOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getObjectIdentifiers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListGetObjectIdentifiersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListGetObjectIdentifiersOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.ChangeListGetObjectIdentifiersOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListGetStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListGetStateOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.ChangeListGetStateOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("revert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListRevertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCollection"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.LogMessageCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public HTTPBasicAuthBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public HTTPBasicAuthBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public HTTPBasicAuthBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ChangeListID");
            cachedSerQNames.add(qName);
            cls = types.api.server.ib.aii.sap.com.ChangeListID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ChangeListIDRestricted");
            cachedSerQNames.add(qName);
            cls = types.api.server.ib.aii.sap.com.ChangeListIDRestricted.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "LONG_Description");
            cachedSerQNames.add(qName);
            cls = types.api.server.ib.aii.sap.com.LONG_Description.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListCacheState");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.ChangeListCacheState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListCreateOut");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.ChangeListCreateOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListGetCacheStateOut");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.ChangeListGetCacheStateOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListGetObjectIdentifiersOut");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.ChangeListGetObjectIdentifiersOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListGetStateOut");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.ChangeListGetStateOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationComponentID");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationComponentID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessage");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.LogMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageChangeList");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.LogMessageChangeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCollection");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.LogMessageCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCommunicationChannel");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.LogMessageCommunicationChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCommunicationComponent");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageConfigurationScenario");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.LogMessageConfigurationScenario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageItem");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.LogMessageItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageMessageHeader");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageParty");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.LogMessageParty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageValueMapping");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.LogMessageValueMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "MessageHeaderID");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.MessageHeaderID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "Text");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.Text.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageCollection activate(java.lang.String changeListActivateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "activate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeListActivateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.LogMessageCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.LogMessageCollection) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.LogMessageCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageCollection checkContent(java.lang.String changeListCheckContentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "checkContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeListCheckContentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.LogMessageCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.LogMessageCollection) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.LogMessageCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.ChangeListCreateOut create(types.api.server.ib.aii.sap.com.ChangeListIDRestricted changeListCreateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeListCreateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.ChangeListCreateOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.ChangeListCreateOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.ChangeListCreateOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.ChangeListGetCacheStateOut getCacheState(java.lang.String changeListGetCacheStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "getCacheState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeListGetCacheStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.ChangeListGetCacheStateOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.ChangeListGetCacheStateOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.ChangeListGetCacheStateOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.ChangeListGetObjectIdentifiersOut getObjectIdentifiers(java.lang.String changeListGetObjectIdentifiersRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "getObjectIdentifiers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeListGetObjectIdentifiersRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.ChangeListGetObjectIdentifiersOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.ChangeListGetObjectIdentifiersOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.ChangeListGetObjectIdentifiersOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.ChangeListGetStateOut getState(java.lang.String changeListGetStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "getState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeListGetStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.ChangeListGetStateOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.ChangeListGetStateOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.ChangeListGetStateOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageCollection revert(java.lang.String changeListRevertRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "revert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeListRevertRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.LogMessageCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.LogMessageCollection) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.LogMessageCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
