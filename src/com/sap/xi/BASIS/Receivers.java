/**
 * Receivers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class Receivers  implements java.io.Serializable {
    private com.sap.xi.BASIS.IntegratedConfigurationReceiverRule[] receiverRule;

    private com.sap.xi.BASIS.ReceiverDeterminationInclude[] externalReceiverRule;

    private com.sap.xi.BASIS.ReceiverDeterminationMapping[] dynamicReceiverRule;

    private com.sap.xi.BASIS.NoReceiverBehaviour noReceiverBehaviour;

    private com.sap.xi.BASIS.CommunicationComponentID noReceiverReceiver;

    public Receivers() {
    }

    public Receivers(
           com.sap.xi.BASIS.IntegratedConfigurationReceiverRule[] receiverRule,
           com.sap.xi.BASIS.ReceiverDeterminationInclude[] externalReceiverRule,
           com.sap.xi.BASIS.ReceiverDeterminationMapping[] dynamicReceiverRule,
           com.sap.xi.BASIS.NoReceiverBehaviour noReceiverBehaviour,
           com.sap.xi.BASIS.CommunicationComponentID noReceiverReceiver) {
           this.receiverRule = receiverRule;
           this.externalReceiverRule = externalReceiverRule;
           this.dynamicReceiverRule = dynamicReceiverRule;
           this.noReceiverBehaviour = noReceiverBehaviour;
           this.noReceiverReceiver = noReceiverReceiver;
    }


    /**
     * Gets the receiverRule value for this Receivers.
     * 
     * @return receiverRule
     */
    public com.sap.xi.BASIS.IntegratedConfigurationReceiverRule[] getReceiverRule() {
        return receiverRule;
    }


    /**
     * Sets the receiverRule value for this Receivers.
     * 
     * @param receiverRule
     */
    public void setReceiverRule(com.sap.xi.BASIS.IntegratedConfigurationReceiverRule[] receiverRule) {
        this.receiverRule = receiverRule;
    }

    public com.sap.xi.BASIS.IntegratedConfigurationReceiverRule getReceiverRule(int i) {
        return this.receiverRule[i];
    }

    public void setReceiverRule(int i, com.sap.xi.BASIS.IntegratedConfigurationReceiverRule _value) {
        this.receiverRule[i] = _value;
    }


    /**
     * Gets the externalReceiverRule value for this Receivers.
     * 
     * @return externalReceiverRule
     */
    public com.sap.xi.BASIS.ReceiverDeterminationInclude[] getExternalReceiverRule() {
        return externalReceiverRule;
    }


    /**
     * Sets the externalReceiverRule value for this Receivers.
     * 
     * @param externalReceiverRule
     */
    public void setExternalReceiverRule(com.sap.xi.BASIS.ReceiverDeterminationInclude[] externalReceiverRule) {
        this.externalReceiverRule = externalReceiverRule;
    }

    public com.sap.xi.BASIS.ReceiverDeterminationInclude getExternalReceiverRule(int i) {
        return this.externalReceiverRule[i];
    }

    public void setExternalReceiverRule(int i, com.sap.xi.BASIS.ReceiverDeterminationInclude _value) {
        this.externalReceiverRule[i] = _value;
    }


    /**
     * Gets the dynamicReceiverRule value for this Receivers.
     * 
     * @return dynamicReceiverRule
     */
    public com.sap.xi.BASIS.ReceiverDeterminationMapping[] getDynamicReceiverRule() {
        return dynamicReceiverRule;
    }


    /**
     * Sets the dynamicReceiverRule value for this Receivers.
     * 
     * @param dynamicReceiverRule
     */
    public void setDynamicReceiverRule(com.sap.xi.BASIS.ReceiverDeterminationMapping[] dynamicReceiverRule) {
        this.dynamicReceiverRule = dynamicReceiverRule;
    }

    public com.sap.xi.BASIS.ReceiverDeterminationMapping getDynamicReceiverRule(int i) {
        return this.dynamicReceiverRule[i];
    }

    public void setDynamicReceiverRule(int i, com.sap.xi.BASIS.ReceiverDeterminationMapping _value) {
        this.dynamicReceiverRule[i] = _value;
    }


    /**
     * Gets the noReceiverBehaviour value for this Receivers.
     * 
     * @return noReceiverBehaviour
     */
    public com.sap.xi.BASIS.NoReceiverBehaviour getNoReceiverBehaviour() {
        return noReceiverBehaviour;
    }


    /**
     * Sets the noReceiverBehaviour value for this Receivers.
     * 
     * @param noReceiverBehaviour
     */
    public void setNoReceiverBehaviour(com.sap.xi.BASIS.NoReceiverBehaviour noReceiverBehaviour) {
        this.noReceiverBehaviour = noReceiverBehaviour;
    }


    /**
     * Gets the noReceiverReceiver value for this Receivers.
     * 
     * @return noReceiverReceiver
     */
    public com.sap.xi.BASIS.CommunicationComponentID getNoReceiverReceiver() {
        return noReceiverReceiver;
    }


    /**
     * Sets the noReceiverReceiver value for this Receivers.
     * 
     * @param noReceiverReceiver
     */
    public void setNoReceiverReceiver(com.sap.xi.BASIS.CommunicationComponentID noReceiverReceiver) {
        this.noReceiverReceiver = noReceiverReceiver;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Receivers)) return false;
        Receivers other = (Receivers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiverRule==null && other.getReceiverRule()==null) || 
             (this.receiverRule!=null &&
              java.util.Arrays.equals(this.receiverRule, other.getReceiverRule()))) &&
            ((this.externalReceiverRule==null && other.getExternalReceiverRule()==null) || 
             (this.externalReceiverRule!=null &&
              java.util.Arrays.equals(this.externalReceiverRule, other.getExternalReceiverRule()))) &&
            ((this.dynamicReceiverRule==null && other.getDynamicReceiverRule()==null) || 
             (this.dynamicReceiverRule!=null &&
              java.util.Arrays.equals(this.dynamicReceiverRule, other.getDynamicReceiverRule()))) &&
            ((this.noReceiverBehaviour==null && other.getNoReceiverBehaviour()==null) || 
             (this.noReceiverBehaviour!=null &&
              this.noReceiverBehaviour.equals(other.getNoReceiverBehaviour()))) &&
            ((this.noReceiverReceiver==null && other.getNoReceiverReceiver()==null) || 
             (this.noReceiverReceiver!=null &&
              this.noReceiverReceiver.equals(other.getNoReceiverReceiver())));
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
        if (getReceiverRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalReceiverRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalReceiverRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalReceiverRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDynamicReceiverRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicReceiverRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicReceiverRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoReceiverBehaviour() != null) {
            _hashCode += getNoReceiverBehaviour().hashCode();
        }
        if (getNoReceiverReceiver() != null) {
            _hashCode += getNoReceiverReceiver().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Receivers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Receivers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReceiverRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegratedConfigurationReceiverRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalReceiverRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExternalReceiverRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverDeterminationInclude"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicReceiverRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DynamicReceiverRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ReceiverDeterminationMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noReceiverBehaviour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NoReceiverBehaviour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "NoReceiverBehaviour"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noReceiverReceiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NoReceiverReceiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationComponentID"));
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
