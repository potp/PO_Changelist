/**
 * IntegratedConfigurationQueryIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class IntegratedConfigurationQueryIn  implements java.io.Serializable {
    private com.sap.xi.BASIS.MessageHeaderID integratedConfigurationID;

    private com.sap.xi.BASIS.Global.LONG_Description description;

    private com.sap.xi.BASIS.ObjectAdministrativeData administrativeData;

    public IntegratedConfigurationQueryIn() {
    }

    public IntegratedConfigurationQueryIn(
           com.sap.xi.BASIS.MessageHeaderID integratedConfigurationID,
           com.sap.xi.BASIS.Global.LONG_Description description,
           com.sap.xi.BASIS.ObjectAdministrativeData administrativeData) {
           this.integratedConfigurationID = integratedConfigurationID;
           this.description = description;
           this.administrativeData = administrativeData;
    }


    /**
     * Gets the integratedConfigurationID value for this IntegratedConfigurationQueryIn.
     * 
     * @return integratedConfigurationID
     */
    public com.sap.xi.BASIS.MessageHeaderID getIntegratedConfigurationID() {
        return integratedConfigurationID;
    }


    /**
     * Sets the integratedConfigurationID value for this IntegratedConfigurationQueryIn.
     * 
     * @param integratedConfigurationID
     */
    public void setIntegratedConfigurationID(com.sap.xi.BASIS.MessageHeaderID integratedConfigurationID) {
        this.integratedConfigurationID = integratedConfigurationID;
    }


    /**
     * Gets the description value for this IntegratedConfigurationQueryIn.
     * 
     * @return description
     */
    public com.sap.xi.BASIS.Global.LONG_Description getDescription() {
        return description;
    }


    /**
     * Sets the description value for this IntegratedConfigurationQueryIn.
     * 
     * @param description
     */
    public void setDescription(com.sap.xi.BASIS.Global.LONG_Description description) {
        this.description = description;
    }


    /**
     * Gets the administrativeData value for this IntegratedConfigurationQueryIn.
     * 
     * @return administrativeData
     */
    public com.sap.xi.BASIS.ObjectAdministrativeData getAdministrativeData() {
        return administrativeData;
    }


    /**
     * Sets the administrativeData value for this IntegratedConfigurationQueryIn.
     * 
     * @param administrativeData
     */
    public void setAdministrativeData(com.sap.xi.BASIS.ObjectAdministrativeData administrativeData) {
        this.administrativeData = administrativeData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratedConfigurationQueryIn)) return false;
        IntegratedConfigurationQueryIn other = (IntegratedConfigurationQueryIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.integratedConfigurationID==null && other.getIntegratedConfigurationID()==null) || 
             (this.integratedConfigurationID!=null &&
              this.integratedConfigurationID.equals(other.getIntegratedConfigurationID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.administrativeData==null && other.getAdministrativeData()==null) || 
             (this.administrativeData!=null &&
              this.administrativeData.equals(other.getAdministrativeData())));
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
        if (getIntegratedConfigurationID() != null) {
            _hashCode += getIntegratedConfigurationID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAdministrativeData() != null) {
            _hashCode += getAdministrativeData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegratedConfigurationQueryIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationQueryIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integratedConfigurationID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IntegratedConfigurationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MessageHeaderID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS/Global", "LONG_Description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administrativeData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdministrativeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ObjectAdministrativeData"));
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
