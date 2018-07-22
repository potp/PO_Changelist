/**
 * IntegratedConfigurationInBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class IntegratedConfigurationInBindingStub extends org.apache.axis.client.Stub implements com.sap.xi.BASIS.IntegratedConfigurationIn {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Check");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationCheckRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationIdentifierCollection"), com.sap.xi.BASIS.MessageHeaderID[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "IntegratedConfigurationID"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCollection"));
        oper.setReturnClass(com.sap.xi.BASIS.LogMessageCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCollection"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Change");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationChangeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationCreateChangeIn"), com.sap.xi.BASIS.IntegratedConfigurationCreateChangeIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ConfigurationObjectModifyOut"));
        oper.setReturnClass(com.sap.xi.BASIS.ConfigurationObjectModifyOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ConfigurationObjectModifyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationQueryIn"), com.sap.xi.BASIS.IntegratedConfigurationQueryIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationQueryOut"));
        oper.setReturnClass(com.sap.xi.BASIS.IntegratedConfigurationQueryOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationCreateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationCreateChangeIn"), com.sap.xi.BASIS.IntegratedConfigurationCreateChangeIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ConfigurationObjectModifyOut"));
        oper.setReturnClass(com.sap.xi.BASIS.ConfigurationObjectModifyOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ConfigurationObjectModifyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Revert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationRevertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationIdentifierCollection"), com.sap.xi.BASIS.MessageHeaderID[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "IntegratedConfigurationID"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCollection"));
        oper.setReturnClass(com.sap.xi.BASIS.LogMessageCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCollection"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Read");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReadRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReadIn"), com.sap.xi.BASIS.IntegratedConfigurationReadIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReadOut"));
        oper.setReturnClass(com.sap.xi.BASIS.IntegratedConfigurationReadOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReadResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationDeleteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationDeleteOpenForEditIn"), com.sap.xi.BASIS.IntegratedConfigurationDeleteOpenForEditIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ConfigurationObjectModifyOut"));
        oper.setReturnClass(com.sap.xi.BASIS.ConfigurationObjectModifyOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ConfigurationObjectModifyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpenForEdit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationOpenForEditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationDeleteOpenForEditIn"), com.sap.xi.BASIS.IntegratedConfigurationDeleteOpenForEditIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationOpenForEditOut"));
        oper.setReturnClass(com.sap.xi.BASIS.IntegratedConfigurationOpenForEditOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationOpenForEditResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

    }

    public IntegratedConfigurationInBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IntegratedConfigurationInBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IntegratedConfigurationInBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "CompareOperatorCode");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "GLOBAL_DateTime");
            cachedSerQNames.add(qName);
            cls = java.util.Calendar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "Indicator");
            cachedSerQNames.add(qName);
            cls = boolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "IntegerValue");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "LanguageCode");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Language.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "LANGUAGEINDEPENDENT_LONG_Name");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "LANGUAGEINDEPENDENT_Name");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "LANGUAGEINDEPENDENT_Text");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "LogItemSeverityCode");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.Global.LogItemSeverityCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "LONG_Description");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.Global.LONG_Description.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "LONG_Description.Content");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "Text");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.Global.Text.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "AdvancedSettings");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.AdvancedSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "AtomicCondition");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.AtomicCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "AtomicConditionBlock");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.AtomicCondition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "AtomicCondition");
            qName2 = new javax.xml.namespace.QName("", "AtomicCondition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ChangeListChangeListID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ChangeListID");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.ChangeListID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ChannelProperty");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.ChannelProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationChannelChannelID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationChannelID");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.CommunicationChannelID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationComponentComponentID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationComponentID");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.CommunicationComponentID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationPartnerExtractor");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.CommunicationPartnerExtractor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationPartyID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Condition");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.AtomicCondition[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "AtomicConditionBlock");
            qName2 = new javax.xml.namespace.QName("", "AtomicConditionBlock");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ConfigurationObjectModifyOut");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.ConfigurationObjectModifyOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ConfigurationScenarioID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "DesignObjectID");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.DesignObjectID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "DesignObjectName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "DesignObjectNamespace");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Extractor");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.Extractor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ExtractorTypeCode");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.ExtractorTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "GenericProperty");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.GenericProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "GenericPropertyID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "GenericPropertyTable");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.GenericPropertyTable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "GenericTableRow");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.GenericTableRowTableCell[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "GenericTableRowTableCell");
            qName2 = new javax.xml.namespace.QName("", "ValueTableCell");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "GenericTableRowTableCell");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.GenericTableRowTableCell.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "HeaderMapping");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.HeaderMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "InboundProcessing");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.InboundProcessing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegerProperty");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegerProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfiguration");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegratedConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationCreateChangeIn");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegratedConfigurationCreateChangeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationDeleteOpenForEditIn");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegratedConfigurationDeleteOpenForEditIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationIdentifierCollection");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.MessageHeaderID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MessageHeaderID");
            qName2 = new javax.xml.namespace.QName("", "IntegratedConfigurationID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationOpenForEditOut");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegratedConfigurationOpenForEditOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationQueryIn");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegratedConfigurationQueryIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationQueryOut");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegratedConfigurationQueryOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReadIn");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegratedConfigurationReadIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReadOut");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegratedConfigurationReadOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReceiverInterfaceRule");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegratedConfigurationReceiverInterfaceRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReceiverRule");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.IntegratedConfigurationReceiverRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LANGUAGEINDEPENDENT_Text");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessage");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageChangeList");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageChangeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageClassificationCode");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCollection");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCommunicationChannel");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageCommunicationChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCommunicationComponent");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageCommunicationComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCommunicationParty");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageCommunicationParty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageConfigurationScenario");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageConfigurationScenario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageItem");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageMessageHeader");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageMessageHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageProcessComponent");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageProcessComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageReceiverRule");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageReceiverRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageValueMapping");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.LogMessageValueMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MappingParameters");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.MappingParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MessageHeaderID");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.MessageHeaderID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "NamespaceURI");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.URI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "NoReceiverBehaviour");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.NoReceiverBehaviour.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ObjectAdministrativeData");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.ObjectAdministrativeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Operation");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "OutboundProcessing");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.OutboundProcessing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Prefix");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "PrefixNamespaceMapping");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.PrefixNamespaceMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ProcessComponentID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "PropertyName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "QualityOfService");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.QualityOfService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReadContextCode");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.ReadContextCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverDeterminationInclude");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.ReceiverDeterminationInclude.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverDeterminationMapping");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.ReceiverDeterminationMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverInterfaces");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.ReceiverInterfaces.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverRuleID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Receivers");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.Receivers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "RestrictedGenericProperty");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.RestrictedGenericProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "RestrictedIntegratedConfiguration");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.RestrictedIntegratedConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "RestrictedObjectAdministrativeData");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.RestrictedObjectAdministrativeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "SoftwareComponentVersionID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "UserID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ValueMappingID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "VirusScanCode");
            cachedSerQNames.add(qName);
            cls = com.sap.xi.BASIS.VirusScanCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public com.sap.xi.BASIS.LogMessageCollection check(com.sap.xi.BASIS.MessageHeaderID[] integratedConfigurationCheckRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Check"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {integratedConfigurationCheckRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sap.xi.BASIS.LogMessageCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sap.xi.BASIS.LogMessageCollection) org.apache.axis.utils.JavaUtils.convert(_resp, com.sap.xi.BASIS.LogMessageCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sap.xi.BASIS.ConfigurationObjectModifyOut change(com.sap.xi.BASIS.IntegratedConfigurationCreateChangeIn integratedConfigurationChangeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Change"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {integratedConfigurationChangeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sap.xi.BASIS.ConfigurationObjectModifyOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sap.xi.BASIS.ConfigurationObjectModifyOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.sap.xi.BASIS.ConfigurationObjectModifyOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sap.xi.BASIS.IntegratedConfigurationQueryOut query(com.sap.xi.BASIS.IntegratedConfigurationQueryIn integratedConfigurationQueryRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {integratedConfigurationQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sap.xi.BASIS.IntegratedConfigurationQueryOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sap.xi.BASIS.IntegratedConfigurationQueryOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.sap.xi.BASIS.IntegratedConfigurationQueryOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sap.xi.BASIS.ConfigurationObjectModifyOut create(com.sap.xi.BASIS.IntegratedConfigurationCreateChangeIn integratedConfigurationCreateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {integratedConfigurationCreateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sap.xi.BASIS.ConfigurationObjectModifyOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sap.xi.BASIS.ConfigurationObjectModifyOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.sap.xi.BASIS.ConfigurationObjectModifyOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sap.xi.BASIS.LogMessageCollection revert(com.sap.xi.BASIS.MessageHeaderID[] integratedConfigurationRevertRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Revert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {integratedConfigurationRevertRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sap.xi.BASIS.LogMessageCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sap.xi.BASIS.LogMessageCollection) org.apache.axis.utils.JavaUtils.convert(_resp, com.sap.xi.BASIS.LogMessageCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sap.xi.BASIS.IntegratedConfigurationReadOut read(com.sap.xi.BASIS.IntegratedConfigurationReadIn integratedConfigurationReadRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Read"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {integratedConfigurationReadRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sap.xi.BASIS.IntegratedConfigurationReadOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sap.xi.BASIS.IntegratedConfigurationReadOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.sap.xi.BASIS.IntegratedConfigurationReadOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sap.xi.BASIS.ConfigurationObjectModifyOut delete(com.sap.xi.BASIS.IntegratedConfigurationDeleteOpenForEditIn integratedConfigurationDeleteRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {integratedConfigurationDeleteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sap.xi.BASIS.ConfigurationObjectModifyOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sap.xi.BASIS.ConfigurationObjectModifyOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.sap.xi.BASIS.ConfigurationObjectModifyOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sap.xi.BASIS.IntegratedConfigurationOpenForEditOut openForEdit(com.sap.xi.BASIS.IntegratedConfigurationDeleteOpenForEditIn integratedConfigurationOpenForEditRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpenForEdit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {integratedConfigurationOpenForEditRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sap.xi.BASIS.IntegratedConfigurationOpenForEditOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sap.xi.BASIS.IntegratedConfigurationOpenForEditOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.sap.xi.BASIS.IntegratedConfigurationOpenForEditOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
