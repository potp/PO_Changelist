/**
 * IntegratedConfigurationReadOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class IntegratedConfigurationReadOut  implements java.io.Serializable {
    private com.sap.xi.BASIS.IntegratedConfiguration[] integratedConfiguration;

    private com.sap.xi.BASIS.LogMessageCollection logMessageCollection;

    public IntegratedConfigurationReadOut() {
    }

    public IntegratedConfigurationReadOut(
           com.sap.xi.BASIS.IntegratedConfiguration[] integratedConfiguration,
           com.sap.xi.BASIS.LogMessageCollection logMessageCollection) {
           this.integratedConfiguration = integratedConfiguration;
           this.logMessageCollection = logMessageCollection;
    }


    /**
     * Gets the integratedConfiguration value for this IntegratedConfigurationReadOut.
     * 
     * @return integratedConfiguration
     */
    public com.sap.xi.BASIS.IntegratedConfiguration[] getIntegratedConfiguration() {
        return integratedConfiguration;
    }


    /**
     * Sets the integratedConfiguration value for this IntegratedConfigurationReadOut.
     * 
     * @param integratedConfiguration
     */
    public void setIntegratedConfiguration(com.sap.xi.BASIS.IntegratedConfiguration[] integratedConfiguration) {
        this.integratedConfiguration = integratedConfiguration;
    }

    public com.sap.xi.BASIS.IntegratedConfiguration getIntegratedConfiguration(int i) {
        return this.integratedConfiguration[i];
    }

    public void setIntegratedConfiguration(int i, com.sap.xi.BASIS.IntegratedConfiguration _value) {
        this.integratedConfiguration[i] = _value;
    }


    /**
     * Gets the logMessageCollection value for this IntegratedConfigurationReadOut.
     * 
     * @return logMessageCollection
     */
    public com.sap.xi.BASIS.LogMessageCollection getLogMessageCollection() {
        return logMessageCollection;
    }


    /**
     * Sets the logMessageCollection value for this IntegratedConfigurationReadOut.
     * 
     * @param logMessageCollection
     */
    public void setLogMessageCollection(com.sap.xi.BASIS.LogMessageCollection logMessageCollection) {
        this.logMessageCollection = logMessageCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratedConfigurationReadOut)) return false;
        IntegratedConfigurationReadOut other = (IntegratedConfigurationReadOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.integratedConfiguration==null && other.getIntegratedConfiguration()==null) || 
             (this.integratedConfiguration!=null &&
              java.util.Arrays.equals(this.integratedConfiguration, other.getIntegratedConfiguration()))) &&
            ((this.logMessageCollection==null && other.getLogMessageCollection()==null) || 
             (this.logMessageCollection!=null &&
              this.logMessageCollection.equals(other.getLogMessageCollection())));
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
        if (getIntegratedConfiguration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntegratedConfiguration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntegratedConfiguration(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageCollection() != null) {
            _hashCode += getLogMessageCollection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegratedConfigurationReadOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReadOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integratedConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IntegratedConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfiguration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCollection"));
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
