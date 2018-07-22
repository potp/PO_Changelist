/**
 * ReceiverInterfaces.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class ReceiverInterfaces  implements java.io.Serializable {
    private com.sap.xi.BASIS.CommunicationComponentID receiver;

    private com.sap.xi.BASIS.IntegratedConfigurationReceiverInterfaceRule[] receiverInterfaceRule;

    private com.sap.xi.BASIS.QualityOfService qualityOfService;

    public ReceiverInterfaces() {
    }

    public ReceiverInterfaces(
           com.sap.xi.BASIS.CommunicationComponentID receiver,
           com.sap.xi.BASIS.IntegratedConfigurationReceiverInterfaceRule[] receiverInterfaceRule,
           com.sap.xi.BASIS.QualityOfService qualityOfService) {
           this.receiver = receiver;
           this.receiverInterfaceRule = receiverInterfaceRule;
           this.qualityOfService = qualityOfService;
    }


    /**
     * Gets the receiver value for this ReceiverInterfaces.
     * 
     * @return receiver
     */
    public com.sap.xi.BASIS.CommunicationComponentID getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this ReceiverInterfaces.
     * 
     * @param receiver
     */
    public void setReceiver(com.sap.xi.BASIS.CommunicationComponentID receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the receiverInterfaceRule value for this ReceiverInterfaces.
     * 
     * @return receiverInterfaceRule
     */
    public com.sap.xi.BASIS.IntegratedConfigurationReceiverInterfaceRule[] getReceiverInterfaceRule() {
        return receiverInterfaceRule;
    }


    /**
     * Sets the receiverInterfaceRule value for this ReceiverInterfaces.
     * 
     * @param receiverInterfaceRule
     */
    public void setReceiverInterfaceRule(com.sap.xi.BASIS.IntegratedConfigurationReceiverInterfaceRule[] receiverInterfaceRule) {
        this.receiverInterfaceRule = receiverInterfaceRule;
    }

    public com.sap.xi.BASIS.IntegratedConfigurationReceiverInterfaceRule getReceiverInterfaceRule(int i) {
        return this.receiverInterfaceRule[i];
    }

    public void setReceiverInterfaceRule(int i, com.sap.xi.BASIS.IntegratedConfigurationReceiverInterfaceRule _value) {
        this.receiverInterfaceRule[i] = _value;
    }


    /**
     * Gets the qualityOfService value for this ReceiverInterfaces.
     * 
     * @return qualityOfService
     */
    public com.sap.xi.BASIS.QualityOfService getQualityOfService() {
        return qualityOfService;
    }


    /**
     * Sets the qualityOfService value for this ReceiverInterfaces.
     * 
     * @param qualityOfService
     */
    public void setQualityOfService(com.sap.xi.BASIS.QualityOfService qualityOfService) {
        this.qualityOfService = qualityOfService;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiverInterfaces)) return false;
        ReceiverInterfaces other = (ReceiverInterfaces) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.receiverInterfaceRule==null && other.getReceiverInterfaceRule()==null) || 
             (this.receiverInterfaceRule!=null &&
              java.util.Arrays.equals(this.receiverInterfaceRule, other.getReceiverInterfaceRule()))) &&
            ((this.qualityOfService==null && other.getQualityOfService()==null) || 
             (this.qualityOfService!=null &&
              this.qualityOfService.equals(other.getQualityOfService())));
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
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getReceiverInterfaceRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverInterfaceRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverInterfaceRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQualityOfService() != null) {
            _hashCode += getQualityOfService().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceiverInterfaces.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverInterfaces"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationComponentID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverInterfaceRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReceiverInterfaceRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReceiverInterfaceRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityOfService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QualityOfService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "QualityOfService"));
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
