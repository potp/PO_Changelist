/**
 * IntegratedConfigurationReceiverInterfaceRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class IntegratedConfigurationReceiverInterfaceRule  implements java.io.Serializable {
    private org.apache.axis.types.Token operation;

    private com.sap.xi.BASIS.AtomicCondition[][] condition;

    private com.sap.xi.BASIS.DesignObjectID mapping;

    private com.sap.xi.BASIS.MappingParameters mappingParameters;

    private com.sap.xi.BASIS.DesignObjectID[] _interface;

    public IntegratedConfigurationReceiverInterfaceRule() {
    }

    public IntegratedConfigurationReceiverInterfaceRule(
           org.apache.axis.types.Token operation,
           com.sap.xi.BASIS.AtomicCondition[][] condition,
           com.sap.xi.BASIS.DesignObjectID mapping,
           com.sap.xi.BASIS.MappingParameters mappingParameters,
           com.sap.xi.BASIS.DesignObjectID[] _interface) {
           this.operation = operation;
           this.condition = condition;
           this.mapping = mapping;
           this.mappingParameters = mappingParameters;
           this._interface = _interface;
    }


    /**
     * Gets the operation value for this IntegratedConfigurationReceiverInterfaceRule.
     * 
     * @return operation
     */
    public org.apache.axis.types.Token getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this IntegratedConfigurationReceiverInterfaceRule.
     * 
     * @param operation
     */
    public void setOperation(org.apache.axis.types.Token operation) {
        this.operation = operation;
    }


    /**
     * Gets the condition value for this IntegratedConfigurationReceiverInterfaceRule.
     * 
     * @return condition
     */
    public com.sap.xi.BASIS.AtomicCondition[][] getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this IntegratedConfigurationReceiverInterfaceRule.
     * 
     * @param condition
     */
    public void setCondition(com.sap.xi.BASIS.AtomicCondition[][] condition) {
        this.condition = condition;
    }


    /**
     * Gets the mapping value for this IntegratedConfigurationReceiverInterfaceRule.
     * 
     * @return mapping
     */
    public com.sap.xi.BASIS.DesignObjectID getMapping() {
        return mapping;
    }


    /**
     * Sets the mapping value for this IntegratedConfigurationReceiverInterfaceRule.
     * 
     * @param mapping
     */
    public void setMapping(com.sap.xi.BASIS.DesignObjectID mapping) {
        this.mapping = mapping;
    }


    /**
     * Gets the mappingParameters value for this IntegratedConfigurationReceiverInterfaceRule.
     * 
     * @return mappingParameters
     */
    public com.sap.xi.BASIS.MappingParameters getMappingParameters() {
        return mappingParameters;
    }


    /**
     * Sets the mappingParameters value for this IntegratedConfigurationReceiverInterfaceRule.
     * 
     * @param mappingParameters
     */
    public void setMappingParameters(com.sap.xi.BASIS.MappingParameters mappingParameters) {
        this.mappingParameters = mappingParameters;
    }


    /**
     * Gets the _interface value for this IntegratedConfigurationReceiverInterfaceRule.
     * 
     * @return _interface
     */
    public com.sap.xi.BASIS.DesignObjectID[] get_interface() {
        return _interface;
    }


    /**
     * Sets the _interface value for this IntegratedConfigurationReceiverInterfaceRule.
     * 
     * @param _interface
     */
    public void set_interface(com.sap.xi.BASIS.DesignObjectID[] _interface) {
        this._interface = _interface;
    }

    public com.sap.xi.BASIS.DesignObjectID get_interface(int i) {
        return this._interface[i];
    }

    public void set_interface(int i, com.sap.xi.BASIS.DesignObjectID _value) {
        this._interface[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratedConfigurationReceiverInterfaceRule)) return false;
        IntegratedConfigurationReceiverInterfaceRule other = (IntegratedConfigurationReceiverInterfaceRule) obj;
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
            ((this.mapping==null && other.getMapping()==null) || 
             (this.mapping!=null &&
              this.mapping.equals(other.getMapping()))) &&
            ((this.mappingParameters==null && other.getMappingParameters()==null) || 
             (this.mappingParameters!=null &&
              this.mappingParameters.equals(other.getMappingParameters()))) &&
            ((this._interface==null && other.get_interface()==null) || 
             (this._interface!=null &&
              java.util.Arrays.equals(this._interface, other.get_interface())));
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
        if (getMapping() != null) {
            _hashCode += getMapping().hashCode();
        }
        if (getMappingParameters() != null) {
            _hashCode += getMappingParameters().hashCode();
        }
        if (get_interface() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_interface());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_interface(), i);
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
        new org.apache.axis.description.TypeDesc(IntegratedConfigurationReceiverInterfaceRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReceiverInterfaceRule"));
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
        elemField.setFieldName("mapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Mapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "DesignObjectID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MappingParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MappingParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_interface");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Interface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "DesignObjectID"));
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
