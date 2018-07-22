/**
 * AdvancedSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class AdvancedSettings  implements java.io.Serializable {
    private java.lang.Boolean useGlobal;

    private java.lang.String specificConfiguration;

    public AdvancedSettings() {
    }

    public AdvancedSettings(
           java.lang.Boolean useGlobal,
           java.lang.String specificConfiguration) {
           this.useGlobal = useGlobal;
           this.specificConfiguration = specificConfiguration;
    }


    /**
     * Gets the useGlobal value for this AdvancedSettings.
     * 
     * @return useGlobal
     */
    public java.lang.Boolean getUseGlobal() {
        return useGlobal;
    }


    /**
     * Sets the useGlobal value for this AdvancedSettings.
     * 
     * @param useGlobal
     */
    public void setUseGlobal(java.lang.Boolean useGlobal) {
        this.useGlobal = useGlobal;
    }


    /**
     * Gets the specificConfiguration value for this AdvancedSettings.
     * 
     * @return specificConfiguration
     */
    public java.lang.String getSpecificConfiguration() {
        return specificConfiguration;
    }


    /**
     * Sets the specificConfiguration value for this AdvancedSettings.
     * 
     * @param specificConfiguration
     */
    public void setSpecificConfiguration(java.lang.String specificConfiguration) {
        this.specificConfiguration = specificConfiguration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvancedSettings)) return false;
        AdvancedSettings other = (AdvancedSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.useGlobal==null && other.getUseGlobal()==null) || 
             (this.useGlobal!=null &&
              this.useGlobal.equals(other.getUseGlobal()))) &&
            ((this.specificConfiguration==null && other.getSpecificConfiguration()==null) || 
             (this.specificConfiguration!=null &&
              this.specificConfiguration.equals(other.getSpecificConfiguration())));
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
        if (getUseGlobal() != null) {
            _hashCode += getUseGlobal().hashCode();
        }
        if (getSpecificConfiguration() != null) {
            _hashCode += getSpecificConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvancedSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "AdvancedSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useGlobal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseGlobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SpecificConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
