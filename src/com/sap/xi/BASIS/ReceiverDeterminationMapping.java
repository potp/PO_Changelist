/**
 * ReceiverDeterminationMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class ReceiverDeterminationMapping  implements java.io.Serializable {
    private org.apache.axis.types.Token operation;

    private com.sap.xi.BASIS.DesignObjectID mapping;

    private com.sap.xi.BASIS.MappingParameters mappingParamters;

    public ReceiverDeterminationMapping() {
    }

    public ReceiverDeterminationMapping(
           org.apache.axis.types.Token operation,
           com.sap.xi.BASIS.DesignObjectID mapping,
           com.sap.xi.BASIS.MappingParameters mappingParamters) {
           this.operation = operation;
           this.mapping = mapping;
           this.mappingParamters = mappingParamters;
    }


    /**
     * Gets the operation value for this ReceiverDeterminationMapping.
     * 
     * @return operation
     */
    public org.apache.axis.types.Token getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this ReceiverDeterminationMapping.
     * 
     * @param operation
     */
    public void setOperation(org.apache.axis.types.Token operation) {
        this.operation = operation;
    }


    /**
     * Gets the mapping value for this ReceiverDeterminationMapping.
     * 
     * @return mapping
     */
    public com.sap.xi.BASIS.DesignObjectID getMapping() {
        return mapping;
    }


    /**
     * Sets the mapping value for this ReceiverDeterminationMapping.
     * 
     * @param mapping
     */
    public void setMapping(com.sap.xi.BASIS.DesignObjectID mapping) {
        this.mapping = mapping;
    }


    /**
     * Gets the mappingParamters value for this ReceiverDeterminationMapping.
     * 
     * @return mappingParamters
     */
    public com.sap.xi.BASIS.MappingParameters getMappingParamters() {
        return mappingParamters;
    }


    /**
     * Sets the mappingParamters value for this ReceiverDeterminationMapping.
     * 
     * @param mappingParamters
     */
    public void setMappingParamters(com.sap.xi.BASIS.MappingParameters mappingParamters) {
        this.mappingParamters = mappingParamters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiverDeterminationMapping)) return false;
        ReceiverDeterminationMapping other = (ReceiverDeterminationMapping) obj;
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
            ((this.mapping==null && other.getMapping()==null) || 
             (this.mapping!=null &&
              this.mapping.equals(other.getMapping()))) &&
            ((this.mappingParamters==null && other.getMappingParamters()==null) || 
             (this.mappingParamters!=null &&
              this.mappingParamters.equals(other.getMappingParamters())));
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
        if (getMapping() != null) {
            _hashCode += getMapping().hashCode();
        }
        if (getMappingParamters() != null) {
            _hashCode += getMappingParamters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceiverDeterminationMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverDeterminationMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Mapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "DesignObjectID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingParamters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MappingParamters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MappingParameters"));
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
