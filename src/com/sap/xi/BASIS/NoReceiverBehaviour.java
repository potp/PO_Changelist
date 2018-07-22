/**
 * NoReceiverBehaviour.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class NoReceiverBehaviour implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NoReceiverBehaviour(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("Error Message");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("Specified Receiver");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("Ignore");
    public static final NoReceiverBehaviour value1 = new NoReceiverBehaviour(_value1);
    public static final NoReceiverBehaviour value2 = new NoReceiverBehaviour(_value2);
    public static final NoReceiverBehaviour value3 = new NoReceiverBehaviour(_value3);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static NoReceiverBehaviour fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        NoReceiverBehaviour enumeration = (NoReceiverBehaviour)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NoReceiverBehaviour fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.Token(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NoReceiverBehaviour.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "NoReceiverBehaviour"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
