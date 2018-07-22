/**
 * IntegratedConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class IntegratedConfiguration  implements java.io.Serializable {
    private org.apache.axis.types.Language masterLanguage;

    private com.sap.xi.BASIS.ObjectAdministrativeData administrativeData;

    private com.sap.xi.BASIS.Global.LONG_Description[] description;

    private com.sap.xi.BASIS.MessageHeaderID integratedConfigurationID;

    private com.sap.xi.BASIS.InboundProcessing inboundProcessing;

    private com.sap.xi.BASIS.Receivers receivers;

    private com.sap.xi.BASIS.ReceiverInterfaces[] receiverInterfaces;

    private com.sap.xi.BASIS.OutboundProcessing[] outboundProcessing;

    private com.sap.xi.BASIS.PrefixNamespaceMapping[] prefixNamespaceMapping;

    private com.sap.xi.BASIS.AdvancedSettings logging;

    private com.sap.xi.BASIS.AdvancedSettings staging;

    public IntegratedConfiguration() {
    }

    public IntegratedConfiguration(
           org.apache.axis.types.Language masterLanguage,
           com.sap.xi.BASIS.ObjectAdministrativeData administrativeData,
           com.sap.xi.BASIS.Global.LONG_Description[] description,
           com.sap.xi.BASIS.MessageHeaderID integratedConfigurationID,
           com.sap.xi.BASIS.InboundProcessing inboundProcessing,
           com.sap.xi.BASIS.Receivers receivers,
           com.sap.xi.BASIS.ReceiverInterfaces[] receiverInterfaces,
           com.sap.xi.BASIS.OutboundProcessing[] outboundProcessing,
           com.sap.xi.BASIS.PrefixNamespaceMapping[] prefixNamespaceMapping,
           com.sap.xi.BASIS.AdvancedSettings logging,
           com.sap.xi.BASIS.AdvancedSettings staging) {
           this.masterLanguage = masterLanguage;
           this.administrativeData = administrativeData;
           this.description = description;
           this.integratedConfigurationID = integratedConfigurationID;
           this.inboundProcessing = inboundProcessing;
           this.receivers = receivers;
           this.receiverInterfaces = receiverInterfaces;
           this.outboundProcessing = outboundProcessing;
           this.prefixNamespaceMapping = prefixNamespaceMapping;
           this.logging = logging;
           this.staging = staging;
    }


    /**
     * Gets the masterLanguage value for this IntegratedConfiguration.
     * 
     * @return masterLanguage
     */
    public org.apache.axis.types.Language getMasterLanguage() {
        return masterLanguage;
    }


    /**
     * Sets the masterLanguage value for this IntegratedConfiguration.
     * 
     * @param masterLanguage
     */
    public void setMasterLanguage(org.apache.axis.types.Language masterLanguage) {
        this.masterLanguage = masterLanguage;
    }


    /**
     * Gets the administrativeData value for this IntegratedConfiguration.
     * 
     * @return administrativeData
     */
    public com.sap.xi.BASIS.ObjectAdministrativeData getAdministrativeData() {
        return administrativeData;
    }


    /**
     * Sets the administrativeData value for this IntegratedConfiguration.
     * 
     * @param administrativeData
     */
    public void setAdministrativeData(com.sap.xi.BASIS.ObjectAdministrativeData administrativeData) {
        this.administrativeData = administrativeData;
    }


    /**
     * Gets the description value for this IntegratedConfiguration.
     * 
     * @return description
     */
    public com.sap.xi.BASIS.Global.LONG_Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this IntegratedConfiguration.
     * 
     * @param description
     */
    public void setDescription(com.sap.xi.BASIS.Global.LONG_Description[] description) {
        this.description = description;
    }

    public com.sap.xi.BASIS.Global.LONG_Description getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.sap.xi.BASIS.Global.LONG_Description _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the integratedConfigurationID value for this IntegratedConfiguration.
     * 
     * @return integratedConfigurationID
     */
    public com.sap.xi.BASIS.MessageHeaderID getIntegratedConfigurationID() {
        return integratedConfigurationID;
    }


    /**
     * Sets the integratedConfigurationID value for this IntegratedConfiguration.
     * 
     * @param integratedConfigurationID
     */
    public void setIntegratedConfigurationID(com.sap.xi.BASIS.MessageHeaderID integratedConfigurationID) {
        this.integratedConfigurationID = integratedConfigurationID;
    }


    /**
     * Gets the inboundProcessing value for this IntegratedConfiguration.
     * 
     * @return inboundProcessing
     */
    public com.sap.xi.BASIS.InboundProcessing getInboundProcessing() {
        return inboundProcessing;
    }


    /**
     * Sets the inboundProcessing value for this IntegratedConfiguration.
     * 
     * @param inboundProcessing
     */
    public void setInboundProcessing(com.sap.xi.BASIS.InboundProcessing inboundProcessing) {
        this.inboundProcessing = inboundProcessing;
    }


    /**
     * Gets the receivers value for this IntegratedConfiguration.
     * 
     * @return receivers
     */
    public com.sap.xi.BASIS.Receivers getReceivers() {
        return receivers;
    }


    /**
     * Sets the receivers value for this IntegratedConfiguration.
     * 
     * @param receivers
     */
    public void setReceivers(com.sap.xi.BASIS.Receivers receivers) {
        this.receivers = receivers;
    }


    /**
     * Gets the receiverInterfaces value for this IntegratedConfiguration.
     * 
     * @return receiverInterfaces
     */
    public com.sap.xi.BASIS.ReceiverInterfaces[] getReceiverInterfaces() {
        return receiverInterfaces;
    }


    /**
     * Sets the receiverInterfaces value for this IntegratedConfiguration.
     * 
     * @param receiverInterfaces
     */
    public void setReceiverInterfaces(com.sap.xi.BASIS.ReceiverInterfaces[] receiverInterfaces) {
        this.receiverInterfaces = receiverInterfaces;
    }

    public com.sap.xi.BASIS.ReceiverInterfaces getReceiverInterfaces(int i) {
        return this.receiverInterfaces[i];
    }

    public void setReceiverInterfaces(int i, com.sap.xi.BASIS.ReceiverInterfaces _value) {
        this.receiverInterfaces[i] = _value;
    }


    /**
     * Gets the outboundProcessing value for this IntegratedConfiguration.
     * 
     * @return outboundProcessing
     */
    public com.sap.xi.BASIS.OutboundProcessing[] getOutboundProcessing() {
        return outboundProcessing;
    }


    /**
     * Sets the outboundProcessing value for this IntegratedConfiguration.
     * 
     * @param outboundProcessing
     */
    public void setOutboundProcessing(com.sap.xi.BASIS.OutboundProcessing[] outboundProcessing) {
        this.outboundProcessing = outboundProcessing;
    }

    public com.sap.xi.BASIS.OutboundProcessing getOutboundProcessing(int i) {
        return this.outboundProcessing[i];
    }

    public void setOutboundProcessing(int i, com.sap.xi.BASIS.OutboundProcessing _value) {
        this.outboundProcessing[i] = _value;
    }


    /**
     * Gets the prefixNamespaceMapping value for this IntegratedConfiguration.
     * 
     * @return prefixNamespaceMapping
     */
    public com.sap.xi.BASIS.PrefixNamespaceMapping[] getPrefixNamespaceMapping() {
        return prefixNamespaceMapping;
    }


    /**
     * Sets the prefixNamespaceMapping value for this IntegratedConfiguration.
     * 
     * @param prefixNamespaceMapping
     */
    public void setPrefixNamespaceMapping(com.sap.xi.BASIS.PrefixNamespaceMapping[] prefixNamespaceMapping) {
        this.prefixNamespaceMapping = prefixNamespaceMapping;
    }

    public com.sap.xi.BASIS.PrefixNamespaceMapping getPrefixNamespaceMapping(int i) {
        return this.prefixNamespaceMapping[i];
    }

    public void setPrefixNamespaceMapping(int i, com.sap.xi.BASIS.PrefixNamespaceMapping _value) {
        this.prefixNamespaceMapping[i] = _value;
    }


    /**
     * Gets the logging value for this IntegratedConfiguration.
     * 
     * @return logging
     */
    public com.sap.xi.BASIS.AdvancedSettings getLogging() {
        return logging;
    }


    /**
     * Sets the logging value for this IntegratedConfiguration.
     * 
     * @param logging
     */
    public void setLogging(com.sap.xi.BASIS.AdvancedSettings logging) {
        this.logging = logging;
    }


    /**
     * Gets the staging value for this IntegratedConfiguration.
     * 
     * @return staging
     */
    public com.sap.xi.BASIS.AdvancedSettings getStaging() {
        return staging;
    }


    /**
     * Sets the staging value for this IntegratedConfiguration.
     * 
     * @param staging
     */
    public void setStaging(com.sap.xi.BASIS.AdvancedSettings staging) {
        this.staging = staging;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratedConfiguration)) return false;
        IntegratedConfiguration other = (IntegratedConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.masterLanguage==null && other.getMasterLanguage()==null) || 
             (this.masterLanguage!=null &&
              this.masterLanguage.equals(other.getMasterLanguage()))) &&
            ((this.administrativeData==null && other.getAdministrativeData()==null) || 
             (this.administrativeData!=null &&
              this.administrativeData.equals(other.getAdministrativeData()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.integratedConfigurationID==null && other.getIntegratedConfigurationID()==null) || 
             (this.integratedConfigurationID!=null &&
              this.integratedConfigurationID.equals(other.getIntegratedConfigurationID()))) &&
            ((this.inboundProcessing==null && other.getInboundProcessing()==null) || 
             (this.inboundProcessing!=null &&
              this.inboundProcessing.equals(other.getInboundProcessing()))) &&
            ((this.receivers==null && other.getReceivers()==null) || 
             (this.receivers!=null &&
              this.receivers.equals(other.getReceivers()))) &&
            ((this.receiverInterfaces==null && other.getReceiverInterfaces()==null) || 
             (this.receiverInterfaces!=null &&
              java.util.Arrays.equals(this.receiverInterfaces, other.getReceiverInterfaces()))) &&
            ((this.outboundProcessing==null && other.getOutboundProcessing()==null) || 
             (this.outboundProcessing!=null &&
              java.util.Arrays.equals(this.outboundProcessing, other.getOutboundProcessing()))) &&
            ((this.prefixNamespaceMapping==null && other.getPrefixNamespaceMapping()==null) || 
             (this.prefixNamespaceMapping!=null &&
              java.util.Arrays.equals(this.prefixNamespaceMapping, other.getPrefixNamespaceMapping()))) &&
            ((this.logging==null && other.getLogging()==null) || 
             (this.logging!=null &&
              this.logging.equals(other.getLogging()))) &&
            ((this.staging==null && other.getStaging()==null) || 
             (this.staging!=null &&
              this.staging.equals(other.getStaging())));
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
        if (getMasterLanguage() != null) {
            _hashCode += getMasterLanguage().hashCode();
        }
        if (getAdministrativeData() != null) {
            _hashCode += getAdministrativeData().hashCode();
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntegratedConfigurationID() != null) {
            _hashCode += getIntegratedConfigurationID().hashCode();
        }
        if (getInboundProcessing() != null) {
            _hashCode += getInboundProcessing().hashCode();
        }
        if (getReceivers() != null) {
            _hashCode += getReceivers().hashCode();
        }
        if (getReceiverInterfaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverInterfaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverInterfaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutboundProcessing() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutboundProcessing());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutboundProcessing(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrefixNamespaceMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrefixNamespaceMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrefixNamespaceMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogging() != null) {
            _hashCode += getLogging().hashCode();
        }
        if (getStaging() != null) {
            _hashCode += getStaging().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegratedConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MasterLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "language"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administrativeData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdministrativeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ObjectAdministrativeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "LONG_Description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integratedConfigurationID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IntegratedConfigurationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MessageHeaderID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundProcessing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InboundProcessing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "InboundProcessing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Receivers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Receivers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverInterfaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReceiverInterfaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverInterfaces"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundProcessing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutboundProcessing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "OutboundProcessing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixNamespaceMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrefixNamespaceMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "PrefixNamespaceMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logging");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Logging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "AdvancedSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staging");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Staging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "AdvancedSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
