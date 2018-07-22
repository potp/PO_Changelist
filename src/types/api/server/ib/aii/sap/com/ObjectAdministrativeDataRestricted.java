/**
 * ObjectAdministrativeDataRestricted.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ib.aii.sap.com;

public class ObjectAdministrativeDataRestricted  implements java.io.Serializable {
    private java.lang.String responsibleUserAccountID;

    public ObjectAdministrativeDataRestricted() {
    }

    public ObjectAdministrativeDataRestricted(
           java.lang.String responsibleUserAccountID) {
           this.responsibleUserAccountID = responsibleUserAccountID;
    }


    /**
     * Gets the responsibleUserAccountID value for this ObjectAdministrativeDataRestricted.
     * 
     * @return responsibleUserAccountID
     */
    public java.lang.String getResponsibleUserAccountID() {
        return responsibleUserAccountID;
    }


    /**
     * Sets the responsibleUserAccountID value for this ObjectAdministrativeDataRestricted.
     * 
     * @param responsibleUserAccountID
     */
    public void setResponsibleUserAccountID(java.lang.String responsibleUserAccountID) {
        this.responsibleUserAccountID = responsibleUserAccountID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectAdministrativeDataRestricted)) return false;
        ObjectAdministrativeDataRestricted other = (ObjectAdministrativeDataRestricted) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responsibleUserAccountID==null && other.getResponsibleUserAccountID()==null) || 
             (this.responsibleUserAccountID!=null &&
              this.responsibleUserAccountID.equals(other.getResponsibleUserAccountID())));
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
        if (getResponsibleUserAccountID() != null) {
            _hashCode += getResponsibleUserAccountID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectAdministrativeDataRestricted.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ObjectAdministrativeDataRestricted"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleUserAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ResponsibleUserAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
