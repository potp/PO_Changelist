/**
 * IntegratedConfigurationDeleteOpenForEditIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class IntegratedConfigurationDeleteOpenForEditIn  implements java.io.Serializable {
    private org.apache.axis.types.Token changeListID;

    private com.sap.xi.BASIS.MessageHeaderID[] integratedConfigurationID;

    public IntegratedConfigurationDeleteOpenForEditIn() {
    }

    public IntegratedConfigurationDeleteOpenForEditIn(
           org.apache.axis.types.Token changeListID,
           com.sap.xi.BASIS.MessageHeaderID[] integratedConfigurationID) {
           this.changeListID = changeListID;
           this.integratedConfigurationID = integratedConfigurationID;
    }


    /**
     * Gets the changeListID value for this IntegratedConfigurationDeleteOpenForEditIn.
     * 
     * @return changeListID
     */
    public org.apache.axis.types.Token getChangeListID() {
        return changeListID;
    }


    /**
     * Sets the changeListID value for this IntegratedConfigurationDeleteOpenForEditIn.
     * 
     * @param changeListID
     */
    public void setChangeListID(org.apache.axis.types.Token changeListID) {
        this.changeListID = changeListID;
    }


    /**
     * Gets the integratedConfigurationID value for this IntegratedConfigurationDeleteOpenForEditIn.
     * 
     * @return integratedConfigurationID
     */
    public com.sap.xi.BASIS.MessageHeaderID[] getIntegratedConfigurationID() {
        return integratedConfigurationID;
    }


    /**
     * Sets the integratedConfigurationID value for this IntegratedConfigurationDeleteOpenForEditIn.
     * 
     * @param integratedConfigurationID
     */
    public void setIntegratedConfigurationID(com.sap.xi.BASIS.MessageHeaderID[] integratedConfigurationID) {
        this.integratedConfigurationID = integratedConfigurationID;
    }

    public com.sap.xi.BASIS.MessageHeaderID getIntegratedConfigurationID(int i) {
        return this.integratedConfigurationID[i];
    }

    public void setIntegratedConfigurationID(int i, com.sap.xi.BASIS.MessageHeaderID _value) {
        this.integratedConfigurationID[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratedConfigurationDeleteOpenForEditIn)) return false;
        IntegratedConfigurationDeleteOpenForEditIn other = (IntegratedConfigurationDeleteOpenForEditIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeListID==null && other.getChangeListID()==null) || 
             (this.changeListID!=null &&
              this.changeListID.equals(other.getChangeListID()))) &&
            ((this.integratedConfigurationID==null && other.getIntegratedConfigurationID()==null) || 
             (this.integratedConfigurationID!=null &&
              java.util.Arrays.equals(this.integratedConfigurationID, other.getIntegratedConfigurationID())));
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
        if (getChangeListID() != null) {
            _hashCode += getChangeListID().hashCode();
        }
        if (getIntegratedConfigurationID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntegratedConfigurationID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntegratedConfigurationID(), i);
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
        new org.apache.axis.description.TypeDesc(IntegratedConfigurationDeleteOpenForEditIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationDeleteOpenForEditIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeListID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integratedConfigurationID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IntegratedConfigurationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MessageHeaderID"));
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
