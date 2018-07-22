/**
 * Extractor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class Extractor  implements java.io.Serializable {
    private com.sap.xi.BASIS.ExtractorTypeCode typeID;

    private java.lang.String value;

    private java.lang.String datatype;

    private java.lang.String contextObjectName;

    private org.apache.axis.types.Token contextObjectNamespace;

    public Extractor() {
    }

    public Extractor(
           com.sap.xi.BASIS.ExtractorTypeCode typeID,
           java.lang.String value,
           java.lang.String datatype,
           java.lang.String contextObjectName,
           org.apache.axis.types.Token contextObjectNamespace) {
           this.typeID = typeID;
           this.value = value;
           this.datatype = datatype;
           this.contextObjectName = contextObjectName;
           this.contextObjectNamespace = contextObjectNamespace;
    }


    /**
     * Gets the typeID value for this Extractor.
     * 
     * @return typeID
     */
    public com.sap.xi.BASIS.ExtractorTypeCode getTypeID() {
        return typeID;
    }


    /**
     * Sets the typeID value for this Extractor.
     * 
     * @param typeID
     */
    public void setTypeID(com.sap.xi.BASIS.ExtractorTypeCode typeID) {
        this.typeID = typeID;
    }


    /**
     * Gets the value value for this Extractor.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Extractor.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the datatype value for this Extractor.
     * 
     * @return datatype
     */
    public java.lang.String getDatatype() {
        return datatype;
    }


    /**
     * Sets the datatype value for this Extractor.
     * 
     * @param datatype
     */
    public void setDatatype(java.lang.String datatype) {
        this.datatype = datatype;
    }


    /**
     * Gets the contextObjectName value for this Extractor.
     * 
     * @return contextObjectName
     */
    public java.lang.String getContextObjectName() {
        return contextObjectName;
    }


    /**
     * Sets the contextObjectName value for this Extractor.
     * 
     * @param contextObjectName
     */
    public void setContextObjectName(java.lang.String contextObjectName) {
        this.contextObjectName = contextObjectName;
    }


    /**
     * Gets the contextObjectNamespace value for this Extractor.
     * 
     * @return contextObjectNamespace
     */
    public org.apache.axis.types.Token getContextObjectNamespace() {
        return contextObjectNamespace;
    }


    /**
     * Sets the contextObjectNamespace value for this Extractor.
     * 
     * @param contextObjectNamespace
     */
    public void setContextObjectNamespace(org.apache.axis.types.Token contextObjectNamespace) {
        this.contextObjectNamespace = contextObjectNamespace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Extractor)) return false;
        Extractor other = (Extractor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.typeID==null && other.getTypeID()==null) || 
             (this.typeID!=null &&
              this.typeID.equals(other.getTypeID()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.datatype==null && other.getDatatype()==null) || 
             (this.datatype!=null &&
              this.datatype.equals(other.getDatatype()))) &&
            ((this.contextObjectName==null && other.getContextObjectName()==null) || 
             (this.contextObjectName!=null &&
              this.contextObjectName.equals(other.getContextObjectName()))) &&
            ((this.contextObjectNamespace==null && other.getContextObjectNamespace()==null) || 
             (this.contextObjectNamespace!=null &&
              this.contextObjectNamespace.equals(other.getContextObjectNamespace())));
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
        if (getTypeID() != null) {
            _hashCode += getTypeID().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getDatatype() != null) {
            _hashCode += getDatatype().hashCode();
        }
        if (getContextObjectName() != null) {
            _hashCode += getContextObjectName().hashCode();
        }
        if (getContextObjectNamespace() != null) {
            _hashCode += getContextObjectNamespace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Extractor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "Extractor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ExtractorTypeCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datatype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Datatype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextObjectName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContextObjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextObjectNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContextObjectNamespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
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
