/**
 * Create.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ChangeListServiceVi;

public class Create  implements java.io.Serializable {
    private types.api.server.ib.aii.sap.com.ChangeListIDRestricted changeListCreateRequest;

    public Create() {
    }

    public Create(
           types.api.server.ib.aii.sap.com.ChangeListIDRestricted changeListCreateRequest) {
           this.changeListCreateRequest = changeListCreateRequest;
    }


    /**
     * Gets the changeListCreateRequest value for this Create.
     * 
     * @return changeListCreateRequest
     */
    public types.api.server.ib.aii.sap.com.ChangeListIDRestricted getChangeListCreateRequest() {
        return changeListCreateRequest;
    }


    /**
     * Sets the changeListCreateRequest value for this Create.
     * 
     * @param changeListCreateRequest
     */
    public void setChangeListCreateRequest(types.api.server.ib.aii.sap.com.ChangeListIDRestricted changeListCreateRequest) {
        this.changeListCreateRequest = changeListCreateRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Create)) return false;
        Create other = (Create) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeListCreateRequest==null && other.getChangeListCreateRequest()==null) || 
             (this.changeListCreateRequest!=null &&
              this.changeListCreateRequest.equals(other.getChangeListCreateRequest())));
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
        if (getChangeListCreateRequest() != null) {
            _hashCode += getChangeListCreateRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Create.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ChangeListServiceVi", ">create"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeListCreateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ChangeListServiceVi", "ChangeListCreateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ChangeListIDRestricted"));
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
