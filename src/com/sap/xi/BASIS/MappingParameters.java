/**
 * MappingParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class MappingParameters  implements java.io.Serializable {
    private com.sap.xi.BASIS.IntegerProperty[] integer;

    private com.sap.xi.BASIS.RestrictedGenericProperty[] string;

    private com.sap.xi.BASIS.ChannelProperty[] channel;

    public MappingParameters() {
    }

    public MappingParameters(
           com.sap.xi.BASIS.IntegerProperty[] integer,
           com.sap.xi.BASIS.RestrictedGenericProperty[] string,
           com.sap.xi.BASIS.ChannelProperty[] channel) {
           this.integer = integer;
           this.string = string;
           this.channel = channel;
    }


    /**
     * Gets the integer value for this MappingParameters.
     * 
     * @return integer
     */
    public com.sap.xi.BASIS.IntegerProperty[] getInteger() {
        return integer;
    }


    /**
     * Sets the integer value for this MappingParameters.
     * 
     * @param integer
     */
    public void setInteger(com.sap.xi.BASIS.IntegerProperty[] integer) {
        this.integer = integer;
    }

    public com.sap.xi.BASIS.IntegerProperty getInteger(int i) {
        return this.integer[i];
    }

    public void setInteger(int i, com.sap.xi.BASIS.IntegerProperty _value) {
        this.integer[i] = _value;
    }


    /**
     * Gets the string value for this MappingParameters.
     * 
     * @return string
     */
    public com.sap.xi.BASIS.RestrictedGenericProperty[] getString() {
        return string;
    }


    /**
     * Sets the string value for this MappingParameters.
     * 
     * @param string
     */
    public void setString(com.sap.xi.BASIS.RestrictedGenericProperty[] string) {
        this.string = string;
    }

    public com.sap.xi.BASIS.RestrictedGenericProperty getString(int i) {
        return this.string[i];
    }

    public void setString(int i, com.sap.xi.BASIS.RestrictedGenericProperty _value) {
        this.string[i] = _value;
    }


    /**
     * Gets the channel value for this MappingParameters.
     * 
     * @return channel
     */
    public com.sap.xi.BASIS.ChannelProperty[] getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this MappingParameters.
     * 
     * @param channel
     */
    public void setChannel(com.sap.xi.BASIS.ChannelProperty[] channel) {
        this.channel = channel;
    }

    public com.sap.xi.BASIS.ChannelProperty getChannel(int i) {
        return this.channel[i];
    }

    public void setChannel(int i, com.sap.xi.BASIS.ChannelProperty _value) {
        this.channel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MappingParameters)) return false;
        MappingParameters other = (MappingParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.integer==null && other.getInteger()==null) || 
             (this.integer!=null &&
              java.util.Arrays.equals(this.integer, other.getInteger()))) &&
            ((this.string==null && other.getString()==null) || 
             (this.string!=null &&
              java.util.Arrays.equals(this.string, other.getString()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              java.util.Arrays.equals(this.channel, other.getChannel())));
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
        if (getInteger() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInteger());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInteger(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getString() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getString());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getString(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannel(), i);
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
        new org.apache.axis.description.TypeDesc(MappingParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MappingParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Integer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "IntegerProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string");
        elemField.setXmlName(new javax.xml.namespace.QName("", "String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "RestrictedGenericProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ChannelProperty"));
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
