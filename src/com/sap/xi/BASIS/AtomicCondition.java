/**
 * AtomicCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class AtomicCondition  implements java.io.Serializable {
    private org.apache.axis.types.Token operator;

    private com.sap.xi.BASIS.Extractor leftExtractor;

    private com.sap.xi.BASIS.Extractor rightExtractor;

    public AtomicCondition() {
    }

    public AtomicCondition(
           org.apache.axis.types.Token operator,
           com.sap.xi.BASIS.Extractor leftExtractor,
           com.sap.xi.BASIS.Extractor rightExtractor) {
           this.operator = operator;
           this.leftExtractor = leftExtractor;
           this.rightExtractor = rightExtractor;
    }


    /**
     * Gets the operator value for this AtomicCondition.
     * 
     * @return operator
     */
    public org.apache.axis.types.Token getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this AtomicCondition.
     * 
     * @param operator
     */
    public void setOperator(org.apache.axis.types.Token operator) {
        this.operator = operator;
    }


    /**
     * Gets the leftExtractor value for this AtomicCondition.
     * 
     * @return leftExtractor
     */
    public com.sap.xi.BASIS.Extractor getLeftExtractor() {
        return leftExtractor;
    }


    /**
     * Sets the leftExtractor value for this AtomicCondition.
     * 
     * @param leftExtractor
     */
    public void setLeftExtractor(com.sap.xi.BASIS.Extractor leftExtractor) {
        this.leftExtractor = leftExtractor;
    }


    /**
     * Gets the rightExtractor value for this AtomicCondition.
     * 
     * @return rightExtractor
     */
    public com.sap.xi.BASIS.Extractor getRightExtractor() {
        return rightExtractor;
    }


    /**
     * Sets the rightExtractor value for this AtomicCondition.
     * 
     * @param rightExtractor
     */
    public void setRightExtractor(com.sap.xi.BASIS.Extractor rightExtractor) {
        this.rightExtractor = rightExtractor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomicCondition)) return false;
        AtomicCondition other = (AtomicCondition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.leftExtractor==null && other.getLeftExtractor()==null) || 
             (this.leftExtractor!=null &&
              this.leftExtractor.equals(other.getLeftExtractor()))) &&
            ((this.rightExtractor==null && other.getRightExtractor()==null) || 
             (this.rightExtractor!=null &&
              this.rightExtractor.equals(other.getRightExtractor())));
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
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getLeftExtractor() != null) {
            _hashCode += getLeftExtractor().hashCode();
        }
        if (getRightExtractor() != null) {
            _hashCode += getRightExtractor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtomicCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "AtomicCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftExtractor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LeftExtractor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Extractor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightExtractor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RightExtractor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Extractor"));
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
