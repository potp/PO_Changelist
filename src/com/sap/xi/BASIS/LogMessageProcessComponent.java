/**
 * LogMessageProcessComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class LogMessageProcessComponent  implements java.io.Serializable {
    private org.apache.axis.types.Token processComponentID;

    private com.sap.xi.BASIS.LogMessageItem logMessageItem;

    public LogMessageProcessComponent() {
    }

    public LogMessageProcessComponent(
           org.apache.axis.types.Token processComponentID,
           com.sap.xi.BASIS.LogMessageItem logMessageItem) {
           this.processComponentID = processComponentID;
           this.logMessageItem = logMessageItem;
    }


    /**
     * Gets the processComponentID value for this LogMessageProcessComponent.
     * 
     * @return processComponentID
     */
    public org.apache.axis.types.Token getProcessComponentID() {
        return processComponentID;
    }


    /**
     * Sets the processComponentID value for this LogMessageProcessComponent.
     * 
     * @param processComponentID
     */
    public void setProcessComponentID(org.apache.axis.types.Token processComponentID) {
        this.processComponentID = processComponentID;
    }


    /**
     * Gets the logMessageItem value for this LogMessageProcessComponent.
     * 
     * @return logMessageItem
     */
    public com.sap.xi.BASIS.LogMessageItem getLogMessageItem() {
        return logMessageItem;
    }


    /**
     * Sets the logMessageItem value for this LogMessageProcessComponent.
     * 
     * @param logMessageItem
     */
    public void setLogMessageItem(com.sap.xi.BASIS.LogMessageItem logMessageItem) {
        this.logMessageItem = logMessageItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogMessageProcessComponent)) return false;
        LogMessageProcessComponent other = (LogMessageProcessComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processComponentID==null && other.getProcessComponentID()==null) || 
             (this.processComponentID!=null &&
              this.processComponentID.equals(other.getProcessComponentID()))) &&
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
        if (getProcessComponentID() != null) {
            _hashCode += getProcessComponentID().hashCode();
        }
        if (getLogMessageItem() != null) {
            _hashCode += getLogMessageItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogMessageProcessComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageProcessComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processComponentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProcessComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
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
