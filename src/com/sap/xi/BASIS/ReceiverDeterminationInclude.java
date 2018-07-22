/**
 * ReceiverDeterminationInclude.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class ReceiverDeterminationInclude  implements java.io.Serializable {
    private org.apache.axis.types.Token operation;

    private org.apache.axis.types.Token[] receiverRuleID;

    public ReceiverDeterminationInclude() {
    }

    public ReceiverDeterminationInclude(
           org.apache.axis.types.Token operation,
           org.apache.axis.types.Token[] receiverRuleID) {
           this.operation = operation;
           this.receiverRuleID = receiverRuleID;
    }


    /**
     * Gets the operation value for this ReceiverDeterminationInclude.
     * 
     * @return operation
     */
    public org.apache.axis.types.Token getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this ReceiverDeterminationInclude.
     * 
     * @param operation
     */
    public void setOperation(org.apache.axis.types.Token operation) {
        this.operation = operation;
    }


    /**
     * Gets the receiverRuleID value for this ReceiverDeterminationInclude.
     * 
     * @return receiverRuleID
     */
    public org.apache.axis.types.Token[] getReceiverRuleID() {
        return receiverRuleID;
    }


    /**
     * Sets the receiverRuleID value for this ReceiverDeterminationInclude.
     * 
     * @param receiverRuleID
     */
    public void setReceiverRuleID(org.apache.axis.types.Token[] receiverRuleID) {
        this.receiverRuleID = receiverRuleID;
    }

    public org.apache.axis.types.Token getReceiverRuleID(int i) {
        return this.receiverRuleID[i];
    }

    public void setReceiverRuleID(int i, org.apache.axis.types.Token _value) {
        this.receiverRuleID[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiverDeterminationInclude)) return false;
        ReceiverDeterminationInclude other = (ReceiverDeterminationInclude) obj;
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
            ((this.receiverRuleID==null && other.getReceiverRuleID()==null) || 
             (this.receiverRuleID!=null &&
              java.util.Arrays.equals(this.receiverRuleID, other.getReceiverRuleID())));
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
        if (getReceiverRuleID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverRuleID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverRuleID(), i);
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
        new org.apache.axis.description.TypeDesc(ReceiverDeterminationInclude.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverDeterminationInclude"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverRuleID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReceiverRuleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverRuleID"));
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
