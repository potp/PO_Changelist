/**
 * Activate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ChangeListServiceVi;

public class Activate  implements java.io.Serializable {
    private java.lang.String changeListActivateRequest;

    public Activate() {
    }

    public Activate(
           java.lang.String changeListActivateRequest) {
           this.changeListActivateRequest = changeListActivateRequest;
    }


    /**
     * Gets the changeListActivateRequest value for this Activate.
     * 
     * @return changeListActivateRequest
     */
    public java.lang.String getChangeListActivateRequest() {
        return changeListActivateRequest;
    }


    /**
     * Sets the changeListActivateRequest value for this Activate.
     * 
     * @param changeListActivateRequest
     */
    public void setChangeListActivateRequest(java.lang.String changeListActivateRequest) {
        this.changeListActivateRequest = changeListActivateRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Activate)) return false;
        Activate other = (Activate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeListActivateRequest==null && other.getChangeListActivateRequest()==null) || 
             (this.changeListActivateRequest!=null &&
              this.changeListActivateRequest.equals(other.getChangeListActivateRequest())));
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
        if (getChangeListActivateRequest() != null) {
            _hashCode += getChangeListActivateRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Activate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ChangeListServiceVi", ">activate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeListActivateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListActivateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
