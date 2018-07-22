/**
 * GetObjectIdentifiers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ChangeListServiceVi;

public class GetObjectIdentifiers  implements java.io.Serializable {
    private java.lang.String changeListGetObjectIdentifiersRequest;

    public GetObjectIdentifiers() {
    }

    public GetObjectIdentifiers(
           java.lang.String changeListGetObjectIdentifiersRequest) {
           this.changeListGetObjectIdentifiersRequest = changeListGetObjectIdentifiersRequest;
    }


    /**
     * Gets the changeListGetObjectIdentifiersRequest value for this GetObjectIdentifiers.
     * 
     * @return changeListGetObjectIdentifiersRequest
     */
    public java.lang.String getChangeListGetObjectIdentifiersRequest() {
        return changeListGetObjectIdentifiersRequest;
    }


    /**
     * Sets the changeListGetObjectIdentifiersRequest value for this GetObjectIdentifiers.
     * 
     * @param changeListGetObjectIdentifiersRequest
     */
    public void setChangeListGetObjectIdentifiersRequest(java.lang.String changeListGetObjectIdentifiersRequest) {
        this.changeListGetObjectIdentifiersRequest = changeListGetObjectIdentifiersRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetObjectIdentifiers)) return false;
        GetObjectIdentifiers other = (GetObjectIdentifiers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeListGetObjectIdentifiersRequest==null && other.getChangeListGetObjectIdentifiersRequest()==null) || 
             (this.changeListGetObjectIdentifiersRequest!=null &&
              this.changeListGetObjectIdentifiersRequest.equals(other.getChangeListGetObjectIdentifiersRequest())));
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
        if (getChangeListGetObjectIdentifiersRequest() != null) {
            _hashCode += getChangeListGetObjectIdentifiersRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetObjectIdentifiers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ChangeListServiceVi", ">getObjectIdentifiers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeListGetObjectIdentifiersRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListGetObjectIdentifiersRequest"));
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
