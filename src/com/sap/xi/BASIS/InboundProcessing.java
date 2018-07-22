/**
 * InboundProcessing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class InboundProcessing  implements java.io.Serializable {
    private org.apache.axis.types.Token senderInterfaceSoftwareComponentVersion;

    private com.sap.xi.BASIS.CommunicationChannelID communicationChannel;

    private java.lang.Boolean schemaValidationIndicator;

    private com.sap.xi.BASIS.VirusScanCode virusScan;

    private com.sap.xi.BASIS.GenericProperty[] adapterSpecificAttribute;

    private com.sap.xi.BASIS.GenericPropertyTable[] adapterSpecificTableAttribute;

    private org.apache.axis.types.Token[] assignedUser;

    public InboundProcessing() {
    }

    public InboundProcessing(
           org.apache.axis.types.Token senderInterfaceSoftwareComponentVersion,
           com.sap.xi.BASIS.CommunicationChannelID communicationChannel,
           java.lang.Boolean schemaValidationIndicator,
           com.sap.xi.BASIS.VirusScanCode virusScan,
           com.sap.xi.BASIS.GenericProperty[] adapterSpecificAttribute,
           com.sap.xi.BASIS.GenericPropertyTable[] adapterSpecificTableAttribute,
           org.apache.axis.types.Token[] assignedUser) {
           this.senderInterfaceSoftwareComponentVersion = senderInterfaceSoftwareComponentVersion;
           this.communicationChannel = communicationChannel;
           this.schemaValidationIndicator = schemaValidationIndicator;
           this.virusScan = virusScan;
           this.adapterSpecificAttribute = adapterSpecificAttribute;
           this.adapterSpecificTableAttribute = adapterSpecificTableAttribute;
           this.assignedUser = assignedUser;
    }


    /**
     * Gets the senderInterfaceSoftwareComponentVersion value for this InboundProcessing.
     * 
     * @return senderInterfaceSoftwareComponentVersion
     */
    public org.apache.axis.types.Token getSenderInterfaceSoftwareComponentVersion() {
        return senderInterfaceSoftwareComponentVersion;
    }


    /**
     * Sets the senderInterfaceSoftwareComponentVersion value for this InboundProcessing.
     * 
     * @param senderInterfaceSoftwareComponentVersion
     */
    public void setSenderInterfaceSoftwareComponentVersion(org.apache.axis.types.Token senderInterfaceSoftwareComponentVersion) {
        this.senderInterfaceSoftwareComponentVersion = senderInterfaceSoftwareComponentVersion;
    }


    /**
     * Gets the communicationChannel value for this InboundProcessing.
     * 
     * @return communicationChannel
     */
    public com.sap.xi.BASIS.CommunicationChannelID getCommunicationChannel() {
        return communicationChannel;
    }


    /**
     * Sets the communicationChannel value for this InboundProcessing.
     * 
     * @param communicationChannel
     */
    public void setCommunicationChannel(com.sap.xi.BASIS.CommunicationChannelID communicationChannel) {
        this.communicationChannel = communicationChannel;
    }


    /**
     * Gets the schemaValidationIndicator value for this InboundProcessing.
     * 
     * @return schemaValidationIndicator
     */
    public java.lang.Boolean getSchemaValidationIndicator() {
        return schemaValidationIndicator;
    }


    /**
     * Sets the schemaValidationIndicator value for this InboundProcessing.
     * 
     * @param schemaValidationIndicator
     */
    public void setSchemaValidationIndicator(java.lang.Boolean schemaValidationIndicator) {
        this.schemaValidationIndicator = schemaValidationIndicator;
    }


    /**
     * Gets the virusScan value for this InboundProcessing.
     * 
     * @return virusScan
     */
    public com.sap.xi.BASIS.VirusScanCode getVirusScan() {
        return virusScan;
    }


    /**
     * Sets the virusScan value for this InboundProcessing.
     * 
     * @param virusScan
     */
    public void setVirusScan(com.sap.xi.BASIS.VirusScanCode virusScan) {
        this.virusScan = virusScan;
    }


    /**
     * Gets the adapterSpecificAttribute value for this InboundProcessing.
     * 
     * @return adapterSpecificAttribute
     */
    public com.sap.xi.BASIS.GenericProperty[] getAdapterSpecificAttribute() {
        return adapterSpecificAttribute;
    }


    /**
     * Sets the adapterSpecificAttribute value for this InboundProcessing.
     * 
     * @param adapterSpecificAttribute
     */
    public void setAdapterSpecificAttribute(com.sap.xi.BASIS.GenericProperty[] adapterSpecificAttribute) {
        this.adapterSpecificAttribute = adapterSpecificAttribute;
    }

    public com.sap.xi.BASIS.GenericProperty getAdapterSpecificAttribute(int i) {
        return this.adapterSpecificAttribute[i];
    }

    public void setAdapterSpecificAttribute(int i, com.sap.xi.BASIS.GenericProperty _value) {
        this.adapterSpecificAttribute[i] = _value;
    }


    /**
     * Gets the adapterSpecificTableAttribute value for this InboundProcessing.
     * 
     * @return adapterSpecificTableAttribute
     */
    public com.sap.xi.BASIS.GenericPropertyTable[] getAdapterSpecificTableAttribute() {
        return adapterSpecificTableAttribute;
    }


    /**
     * Sets the adapterSpecificTableAttribute value for this InboundProcessing.
     * 
     * @param adapterSpecificTableAttribute
     */
    public void setAdapterSpecificTableAttribute(com.sap.xi.BASIS.GenericPropertyTable[] adapterSpecificTableAttribute) {
        this.adapterSpecificTableAttribute = adapterSpecificTableAttribute;
    }

    public com.sap.xi.BASIS.GenericPropertyTable getAdapterSpecificTableAttribute(int i) {
        return this.adapterSpecificTableAttribute[i];
    }

    public void setAdapterSpecificTableAttribute(int i, com.sap.xi.BASIS.GenericPropertyTable _value) {
        this.adapterSpecificTableAttribute[i] = _value;
    }


    /**
     * Gets the assignedUser value for this InboundProcessing.
     * 
     * @return assignedUser
     */
    public org.apache.axis.types.Token[] getAssignedUser() {
        return assignedUser;
    }


    /**
     * Sets the assignedUser value for this InboundProcessing.
     * 
     * @param assignedUser
     */
    public void setAssignedUser(org.apache.axis.types.Token[] assignedUser) {
        this.assignedUser = assignedUser;
    }

    public org.apache.axis.types.Token getAssignedUser(int i) {
        return this.assignedUser[i];
    }

    public void setAssignedUser(int i, org.apache.axis.types.Token _value) {
        this.assignedUser[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundProcessing)) return false;
        InboundProcessing other = (InboundProcessing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.senderInterfaceSoftwareComponentVersion==null && other.getSenderInterfaceSoftwareComponentVersion()==null) || 
             (this.senderInterfaceSoftwareComponentVersion!=null &&
              this.senderInterfaceSoftwareComponentVersion.equals(other.getSenderInterfaceSoftwareComponentVersion()))) &&
            ((this.communicationChannel==null && other.getCommunicationChannel()==null) || 
             (this.communicationChannel!=null &&
              this.communicationChannel.equals(other.getCommunicationChannel()))) &&
            ((this.schemaValidationIndicator==null && other.getSchemaValidationIndicator()==null) || 
             (this.schemaValidationIndicator!=null &&
              this.schemaValidationIndicator.equals(other.getSchemaValidationIndicator()))) &&
            ((this.virusScan==null && other.getVirusScan()==null) || 
             (this.virusScan!=null &&
              this.virusScan.equals(other.getVirusScan()))) &&
            ((this.adapterSpecificAttribute==null && other.getAdapterSpecificAttribute()==null) || 
             (this.adapterSpecificAttribute!=null &&
              java.util.Arrays.equals(this.adapterSpecificAttribute, other.getAdapterSpecificAttribute()))) &&
            ((this.adapterSpecificTableAttribute==null && other.getAdapterSpecificTableAttribute()==null) || 
             (this.adapterSpecificTableAttribute!=null &&
              java.util.Arrays.equals(this.adapterSpecificTableAttribute, other.getAdapterSpecificTableAttribute()))) &&
            ((this.assignedUser==null && other.getAssignedUser()==null) || 
             (this.assignedUser!=null &&
              java.util.Arrays.equals(this.assignedUser, other.getAssignedUser())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSenderInterfaceSoftwareComponentVersion() != null) {
            _hashCode += getSenderInterfaceSoftwareComponentVersion().hashCode();
        }
        if (getCommunicationChannel() != null) {
            _hashCode += getCommunicationChannel().hashCode();
        }
        if (getSchemaValidationIndicator() != null) {
            _hashCode += getSchemaValidationIndicator().hashCode();
        }
        if (getVirusScan() != null) {
            _hashCode += getVirusScan().hashCode();
        }
        if (getAdapterSpecificAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdapterSpecificAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdapterSpecificAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdapterSpecificTableAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdapterSpecificTableAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdapterSpecificTableAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssignedUser() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignedUser());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignedUser(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundProcessing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "InboundProcessing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderInterfaceSoftwareComponentVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SenderInterfaceSoftwareComponentVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CommunicationChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationChannelID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemaValidationIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SchemaValidationIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virusScan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VirusScan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "VirusScanCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapterSpecificAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdapterSpecificAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "GenericProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapterSpecificTableAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdapterSpecificTableAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "GenericPropertyTable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AssignedUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "UserID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
