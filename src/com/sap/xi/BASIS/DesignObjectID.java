/**
 * DesignObjectID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class DesignObjectID  implements java.io.Serializable {
    private java.lang.String name;

    private org.apache.axis.types.Token namespace;

    private org.apache.axis.types.Token softwareComponentVersionID;

    public DesignObjectID() {
    }

    public DesignObjectID(
           java.lang.String name,
           org.apache.axis.types.Token namespace,
           org.apache.axis.types.Token softwareComponentVersionID) {
           this.name = name;
           this.namespace = namespace;
           this.softwareComponentVersionID = softwareComponentVersionID;
    }


    /**
     * Gets the name value for this DesignObjectID.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DesignObjectID.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the namespace value for this DesignObjectID.
     * 
     * @return namespace
     */
    public org.apache.axis.types.Token getNamespace() {
        return namespace;
    }


    /**
     * Sets the namespace value for this DesignObjectID.
     * 
     * @param namespace
     */
    public void setNamespace(org.apache.axis.types.Token namespace) {
        this.namespace = namespace;
    }


    /**
     * Gets the softwareComponentVersionID value for this DesignObjectID.
     * 
     * @return softwareComponentVersionID
     */
    public org.apache.axis.types.Token getSoftwareComponentVersionID() {
        return softwareComponentVersionID;
    }


    /**
     * Sets the softwareComponentVersionID value for this DesignObjectID.
     * 
     * @param softwareComponentVersionID
     */
    public void setSoftwareComponentVersionID(org.apache.axis.types.Token softwareComponentVersionID) {
        this.softwareComponentVersionID = softwareComponentVersionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DesignObjectID)) return false;
        DesignObjectID other = (DesignObjectID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.namespace==null && other.getNamespace()==null) || 
             (this.namespace!=null &&
              this.namespace.equals(other.getNamespace()))) &&
            ((this.softwareComponentVersionID==null && other.getSoftwareComponentVersionID()==null) || 
             (this.softwareComponentVersionID!=null &&
              this.softwareComponentVersionID.equals(other.getSoftwareComponentVersionID())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamespace() != null) {
            _hashCode += getNamespace().hashCode();
        }
        if (getSoftwareComponentVersionID() != null) {
            _hashCode += getSoftwareComponentVersionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DesignObjectID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "DesignObjectID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Namespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softwareComponentVersionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SoftwareComponentVersionID"));
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
