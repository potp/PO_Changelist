/**
 * CommunicationPartnerExtractor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class CommunicationPartnerExtractor  implements java.io.Serializable {
    private com.sap.xi.BASIS.Extractor communicationParty;

    private com.sap.xi.BASIS.Extractor communicationPartySchema;

    private com.sap.xi.BASIS.Extractor communicationPartyAgency;

    private com.sap.xi.BASIS.Extractor communicationComponent;

    public CommunicationPartnerExtractor() {
    }

    public CommunicationPartnerExtractor(
           com.sap.xi.BASIS.Extractor communicationParty,
           com.sap.xi.BASIS.Extractor communicationPartySchema,
           com.sap.xi.BASIS.Extractor communicationPartyAgency,
           com.sap.xi.BASIS.Extractor communicationComponent) {
           this.communicationParty = communicationParty;
           this.communicationPartySchema = communicationPartySchema;
           this.communicationPartyAgency = communicationPartyAgency;
           this.communicationComponent = communicationComponent;
    }


    /**
     * Gets the communicationParty value for this CommunicationPartnerExtractor.
     * 
     * @return communicationParty
     */
    public com.sap.xi.BASIS.Extractor getCommunicationParty() {
        return communicationParty;
    }


    /**
     * Sets the communicationParty value for this CommunicationPartnerExtractor.
     * 
     * @param communicationParty
     */
    public void setCommunicationParty(com.sap.xi.BASIS.Extractor communicationParty) {
        this.communicationParty = communicationParty;
    }


    /**
     * Gets the communicationPartySchema value for this CommunicationPartnerExtractor.
     * 
     * @return communicationPartySchema
     */
    public com.sap.xi.BASIS.Extractor getCommunicationPartySchema() {
        return communicationPartySchema;
    }


    /**
     * Sets the communicationPartySchema value for this CommunicationPartnerExtractor.
     * 
     * @param communicationPartySchema
     */
    public void setCommunicationPartySchema(com.sap.xi.BASIS.Extractor communicationPartySchema) {
        this.communicationPartySchema = communicationPartySchema;
    }


    /**
     * Gets the communicationPartyAgency value for this CommunicationPartnerExtractor.
     * 
     * @return communicationPartyAgency
     */
    public com.sap.xi.BASIS.Extractor getCommunicationPartyAgency() {
        return communicationPartyAgency;
    }


    /**
     * Sets the communicationPartyAgency value for this CommunicationPartnerExtractor.
     * 
     * @param communicationPartyAgency
     */
    public void setCommunicationPartyAgency(com.sap.xi.BASIS.Extractor communicationPartyAgency) {
        this.communicationPartyAgency = communicationPartyAgency;
    }


    /**
     * Gets the communicationComponent value for this CommunicationPartnerExtractor.
     * 
     * @return communicationComponent
     */
    public com.sap.xi.BASIS.Extractor getCommunicationComponent() {
        return communicationComponent;
    }


    /**
     * Sets the communicationComponent value for this CommunicationPartnerExtractor.
     * 
     * @param communicationComponent
     */
    public void setCommunicationComponent(com.sap.xi.BASIS.Extractor communicationComponent) {
        this.communicationComponent = communicationComponent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunicationPartnerExtractor)) return false;
        CommunicationPartnerExtractor other = (CommunicationPartnerExtractor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.communicationParty==null && other.getCommunicationParty()==null) || 
             (this.communicationParty!=null &&
              this.communicationParty.equals(other.getCommunicationParty()))) &&
            ((this.communicationPartySchema==null && other.getCommunicationPartySchema()==null) || 
             (this.communicationPartySchema!=null &&
              this.communicationPartySchema.equals(other.getCommunicationPartySchema()))) &&
            ((this.communicationPartyAgency==null && other.getCommunicationPartyAgency()==null) || 
             (this.communicationPartyAgency!=null &&
              this.communicationPartyAgency.equals(other.getCommunicationPartyAgency()))) &&
            ((this.communicationComponent==null && other.getCommunicationComponent()==null) || 
             (this.communicationComponent!=null &&
              this.communicationComponent.equals(other.getCommunicationComponent())));
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
        if (getCommunicationParty() != null) {
            _hashCode += getCommunicationParty().hashCode();
        }
        if (getCommunicationPartySchema() != null) {
            _hashCode += getCommunicationPartySchema().hashCode();
        }
        if (getCommunicationPartyAgency() != null) {
            _hashCode += getCommunicationPartyAgency().hashCode();
        }
        if (getCommunicationComponent() != null) {
            _hashCode += getCommunicationComponent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommunicationPartnerExtractor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationPartnerExtractor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationParty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CommunicationParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Extractor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationPartySchema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CommunicationPartySchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Extractor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationPartyAgency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CommunicationPartyAgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Extractor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CommunicationComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Extractor"));
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
