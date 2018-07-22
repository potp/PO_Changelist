/**
 * HTTPBasicAuthBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CommunicationChannelServiceWsd;

public class HTTPBasicAuthBindingStub extends org.apache.axis.client.Stub implements CommunicationChannelServiceWsd.CommunicationChannelServiceVi {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("change");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "CommunicationChannelChangeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelCreateChangeIn"), types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ConfigurationObjectModifyOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("check");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "CommunicationChannelCheckRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelIdentifierCollection"), types.api.server.ibdir.aii.sap.com.CommunicationChannelID[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID"));
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCollection"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.LogMessageCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "CommunicationChannelCreateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelCreateChangeIn"), types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ConfigurationObjectModifyOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createFromTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "CommunicationChannelCreateFromTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelCreateFromTemplateIn"), types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateFromTemplateIn.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ConfigurationObjectModifyOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "CommunicationChannelDeleteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelDeleteOpenForEditIn"), types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ConfigurationObjectModifyOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("openForEdit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "CommunicationChannelOpenForEditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelDeleteOpenForEditIn"), types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelOpenForEditOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.CommunicationChannelOpenForEditOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "CommunicationChannelQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelQueryIn"), types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryIn.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelQueryOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("read");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "CommunicationChannelReadRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelReadIn"), types.api.server.ibdir.aii.sap.com.CommunicationChannelReadIn.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelReadOut"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.CommunicationChannelReadOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("revert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "CommunicationChannelRevertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelIdentifierCollection"), types.api.server.ibdir.aii.sap.com.CommunicationChannelID[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID"));
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCollection"));
        oper.setReturnClass(types.api.server.ibdir.aii.sap.com.LogMessageCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

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

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "LONG_Description");
            cachedSerQNames.add(qName);
            cls = types.api.server.ib.aii.sap.com.LONG_Description.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ObjectAdministrativeData");
            cachedSerQNames.add(qName);
            cls = types.api.server.ib.aii.sap.com.ObjectAdministrativeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ObjectAdministrativeDataRestricted");
            cachedSerQNames.add(qName);
            cls = types.api.server.ib.aii.sap.com.ObjectAdministrativeDataRestricted.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChannelAdditionalIdentifier");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.ChannelAdditionalIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannel");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelCreateChangeIn");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelCreateFromTemplateIn");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateFromTemplateIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelDeleteOpenForEditIn");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelIdentifierCollection");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelOpenForEditOut");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelOpenForEditOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelQueryIn");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelQueryOut");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelReadIn");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelReadIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelReadOut");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelReadOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelRestricted");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelRestricted.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelTemplateBased");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationChannelTemplateBased.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationComponentID");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.CommunicationComponentID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ConfigurationObjectModifyOut");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "DesignObjectID");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.DesignObjectID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericProperty");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.GenericProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericPropertyRestricted");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.GenericPropertyRestricted.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericPropertyTable");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.GenericPropertyTable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericTableRow");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.GenericTableRowTableCell[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericTableRowTableCell");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ValueTableCell");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericTableRowTableCell");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.GenericTableRowTableCell.class;
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

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ModuleProcess");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.ModuleProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ParameterGroup");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.ParameterGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ProcessStep");
            cachedSerQNames.add(qName);
            cls = types.api.server.ibdir.aii.sap.com.ProcessStep.class;
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

    public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut change(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn communicationChannelChangeRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "change"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {communicationChannelChangeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageCollection check(types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelCheckRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "check"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {communicationChannelCheckRequest});

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

    public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut create(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateChangeIn communicationChannelCreateRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {communicationChannelCreateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut createFromTemplate(types.api.server.ibdir.aii.sap.com.CommunicationChannelCreateFromTemplateIn communicationChannelCreateFromTemplateRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "createFromTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {communicationChannelCreateFromTemplateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut delete(types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn communicationChannelDeleteRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {communicationChannelDeleteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.ConfigurationObjectModifyOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.CommunicationChannelOpenForEditOut openForEdit(types.api.server.ibdir.aii.sap.com.CommunicationChannelDeleteOpenForEditIn communicationChannelOpenForEditRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "openForEdit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {communicationChannelOpenForEditRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.CommunicationChannelOpenForEditOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.CommunicationChannelOpenForEditOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.CommunicationChannelOpenForEditOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryOut query(types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryIn communicationChannelQueryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {communicationChannelQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.CommunicationChannelQueryOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.CommunicationChannelReadOut read(types.api.server.ibdir.aii.sap.com.CommunicationChannelReadIn communicationChannelReadRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "read"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {communicationChannelReadRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (types.api.server.ibdir.aii.sap.com.CommunicationChannelReadOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (types.api.server.ibdir.aii.sap.com.CommunicationChannelReadOut) org.apache.axis.utils.JavaUtils.convert(_resp, types.api.server.ibdir.aii.sap.com.CommunicationChannelReadOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageCollection revert(types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelRevertRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:CommunicationChannelServiceVi", "revert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {communicationChannelRevertRequest});

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
