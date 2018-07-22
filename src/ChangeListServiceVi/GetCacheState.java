/**
 * GetCacheState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ChangeListServiceVi;

public class GetCacheState  implements java.io.Serializable {
    private java.lang.String changeListGetCacheStateRequest;

    public GetCacheState() {
    }

    public GetCacheState(
           java.lang.String changeListGetCacheStateRequest) {
           this.changeListGetCacheStateRequest = changeListGetCacheStateRequest;
    }


    /**
     * Gets the changeListGetCacheStateRequest value for this GetCacheState.
     * 
     * @return changeListGetCacheStateRequest
     */
    public java.lang.String getChangeListGetCacheStateRequest() {
        return changeListGetCacheStateRequest;
    }


    /**
     * Sets the changeListGetCacheStateRequest value for this GetCacheState.
     * 
     * @param changeListGetCacheStateRequest
     */
    public void setChangeListGetCacheStateRequest(java.lang.String changeListGetCacheStateRequest) {
        this.changeListGetCacheStateRequest = changeListGetCacheStateRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCacheState)) return false;
        GetCacheState other = (GetCacheState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeListGetCacheStateRequest==null && other.getChangeListGetCacheStateRequest()==null) || 
             (this.changeListGetCacheStateRequest!=null &&
              this.changeListGetCacheStateRequest.equals(other.getChangeListGetCacheStateRequest())));
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
        if (getChangeListGetCacheStateRequest() != null) {
            _hashCode += getChangeListGetCacheStateRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCacheState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ChangeListServiceVi", ">getCacheState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeListGetCacheStateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListGetCacheStateRequest"));
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
