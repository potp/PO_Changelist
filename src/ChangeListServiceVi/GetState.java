/**
 * GetState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ChangeListServiceVi;

public class GetState  implements java.io.Serializable {
    private java.lang.String changeListGetStateRequest;

    public GetState() {
    }

    public GetState(
           java.lang.String changeListGetStateRequest) {
           this.changeListGetStateRequest = changeListGetStateRequest;
    }


    /**
     * Gets the changeListGetStateRequest value for this GetState.
     * 
     * @return changeListGetStateRequest
     */
    public java.lang.String getChangeListGetStateRequest() {
        return changeListGetStateRequest;
    }


    /**
     * Sets the changeListGetStateRequest value for this GetState.
     * 
     * @param changeListGetStateRequest
     */
    public void setChangeListGetStateRequest(java.lang.String changeListGetStateRequest) {
        this.changeListGetStateRequest = changeListGetStateRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetState)) return false;
        GetState other = (GetState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeListGetStateRequest==null && other.getChangeListGetStateRequest()==null) || 
             (this.changeListGetStateRequest!=null &&
              this.changeListGetStateRequest.equals(other.getChangeListGetStateRequest())));
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
        if (getChangeListGetStateRequest() != null) {
            _hashCode += getChangeListGetStateRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ChangeListServiceVi", ">getState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeListGetStateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListGetStateRequest"));
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
