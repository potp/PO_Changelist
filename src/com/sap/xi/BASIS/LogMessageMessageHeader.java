/**
 * LogMessageMessageHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class LogMessageMessageHeader  implements java.io.Serializable {
    private com.sap.xi.BASIS.MessageHeaderID messageHeader;

    private com.sap.xi.BASIS.LogMessageItem logMessageItem;

    public LogMessageMessageHeader() {
    }

    public LogMessageMessageHeader(
           com.sap.xi.BASIS.MessageHeaderID messageHeader,
           com.sap.xi.BASIS.LogMessageItem logMessageItem) {
           this.messageHeader = messageHeader;
           this.logMessageItem = logMessageItem;
    }


    /**
     * Gets the messageHeader value for this LogMessageMessageHeader.
     * 
     * @return messageHeader
     */
    public com.sap.xi.BASIS.MessageHeaderID getMessageHeader() {
        return messageHeader;
    }


    /**
     * Sets the messageHeader value for this LogMessageMessageHeader.
     * 
     * @param messageHeader
     */
    public void setMessageHeader(com.sap.xi.BASIS.MessageHeaderID messageHeader) {
        this.messageHeader = messageHeader;
    }


    /**
     * Gets the logMessageItem value for this LogMessageMessageHeader.
     * 
     * @return logMessageItem
     */
    public com.sap.xi.BASIS.LogMessageItem getLogMessageItem() {
        return logMessageItem;
    }


    /**
     * Sets the logMessageItem value for this LogMessageMessageHeader.
     * 
     * @param logMessageItem
     */
    public void setLogMessageItem(com.sap.xi.BASIS.LogMessageItem logMessageItem) {
        this.logMessageItem = logMessageItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogMessageMessageHeader)) return false;
        LogMessageMessageHeader other = (LogMessageMessageHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageHeader==null && other.getMessageHeader()==null) || 
             (this.messageHeader!=null &&
              this.messageHeader.equals(other.getMessageHeader()))) &&
            ((this.logMessageItem==null && other.getLogMessageItem()==null) || 
             (this.logMessageItem!=null &&
              this.logMessageItem.equals(other.getLogMessageItem())));
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
        if (getMessageHeader() != null) {
            _hashCode += getMessageHeader().hashCode();
        }
        if (getLogMessageItem() != null) {
            _hashCode += getLogMessageItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogMessageMessageHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageMessageHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MessageHeaderID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageItem"));
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
