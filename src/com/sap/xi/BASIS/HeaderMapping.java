/**
 * HeaderMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class HeaderMapping  implements java.io.Serializable {
    private com.sap.xi.BASIS.CommunicationPartnerExtractor sender;

    private com.sap.xi.BASIS.CommunicationPartnerExtractor receiver;

    public HeaderMapping() {
    }

    public HeaderMapping(
           com.sap.xi.BASIS.CommunicationPartnerExtractor sender,
           com.sap.xi.BASIS.CommunicationPartnerExtractor receiver) {
           this.sender = sender;
           this.receiver = receiver;
    }


    /**
     * Gets the sender value for this HeaderMapping.
     * 
     * @return sender
     */
    public com.sap.xi.BASIS.CommunicationPartnerExtractor getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this HeaderMapping.
     * 
     * @param sender
     */
    public void setSender(com.sap.xi.BASIS.CommunicationPartnerExtractor sender) {
        this.sender = sender;
    }


    /**
     * Gets the receiver value for this HeaderMapping.
     * 
     * @return receiver
     */
    public com.sap.xi.BASIS.CommunicationPartnerExtractor getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this HeaderMapping.
     * 
     * @param receiver
     */
    public void setReceiver(com.sap.xi.BASIS.CommunicationPartnerExtractor receiver) {
        this.receiver = receiver;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HeaderMapping)) return false;
        HeaderMapping other = (HeaderMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver())));
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
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HeaderMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "HeaderMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationPartnerExtractor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationPartnerExtractor"));
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
