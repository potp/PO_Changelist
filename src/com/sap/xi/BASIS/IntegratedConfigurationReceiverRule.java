/**
 * IntegratedConfigurationReceiverRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class IntegratedConfigurationReceiverRule  implements java.io.Serializable {
    private org.apache.axis.types.Token operation;

    private com.sap.xi.BASIS.AtomicCondition[][] condition;

    private com.sap.xi.BASIS.CommunicationComponentID[] receiver;

    public IntegratedConfigurationReceiverRule() {
    }

    public IntegratedConfigurationReceiverRule(
           org.apache.axis.types.Token operation,
           com.sap.xi.BASIS.AtomicCondition[][] condition,
           com.sap.xi.BASIS.CommunicationComponentID[] receiver) {
           this.operation = operation;
           this.condition = condition;
           this.receiver = receiver;
    }


    /**
     * Gets the operation value for this IntegratedConfigurationReceiverRule.
     * 
     * @return operation
     */
    public org.apache.axis.types.Token getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this IntegratedConfigurationReceiverRule.
     * 
     * @param operation
     */
    public void setOperation(org.apache.axis.types.Token operation) {
        this.operation = operation;
    }


    /**
     * Gets the condition value for this IntegratedConfigurationReceiverRule.
     * 
     * @return condition
     */
    public com.sap.xi.BASIS.AtomicCondition[][] getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this IntegratedConfigurationReceiverRule.
     * 
     * @param condition
     */
    public void setCondition(com.sap.xi.BASIS.AtomicCondition[][] condition) {
        this.condition = condition;
    }


    /**
     * Gets the receiver value for this IntegratedConfigurationReceiverRule.
     * 
     * @return receiver
     */
    public com.sap.xi.BASIS.CommunicationComponentID[] getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this IntegratedConfigurationReceiverRule.
     * 
     * @param receiver
     */
    public void setReceiver(com.sap.xi.BASIS.CommunicationComponentID[] receiver) {
        this.receiver = receiver;
    }

    public com.sap.xi.BASIS.CommunicationComponentID getReceiver(int i) {
        return this.receiver[i];
    }

    public void setReceiver(int i, com.sap.xi.BASIS.CommunicationComponentID _value) {
        this.receiver[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratedConfigurationReceiverRule)) return false;
        IntegratedConfigurationReceiverRule other = (IntegratedConfigurationReceiverRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              java.util.Arrays.equals(this.condition, other.getCondition()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              java.util.Arrays.equals(this.receiver, other.getReceiver())));
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
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getCondition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCondition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCondition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiver(), i);
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
        new org.apache.axis.description.TypeDesc(IntegratedConfigurationReceiverRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReceiverRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "AtomicConditionBlock"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AtomicConditionBlock"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationComponentID"));
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
