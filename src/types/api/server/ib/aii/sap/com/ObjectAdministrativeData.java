/**
 * ObjectAdministrativeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ib.aii.sap.com;

public class ObjectAdministrativeData  implements java.io.Serializable {
    private java.lang.String responsibleUserAccountID;

    private java.util.Calendar lastChangeDateTime;

    private java.lang.String lastChangeUserAccountID;

    public ObjectAdministrativeData() {
    }

    public ObjectAdministrativeData(
           java.lang.String responsibleUserAccountID,
           java.util.Calendar lastChangeDateTime,
           java.lang.String lastChangeUserAccountID) {
           this.responsibleUserAccountID = responsibleUserAccountID;
           this.lastChangeDateTime = lastChangeDateTime;
           this.lastChangeUserAccountID = lastChangeUserAccountID;
    }


    /**
     * Gets the responsibleUserAccountID value for this ObjectAdministrativeData.
     * 
     * @return responsibleUserAccountID
     */
    public java.lang.String getResponsibleUserAccountID() {
        return responsibleUserAccountID;
    }


    /**
     * Sets the responsibleUserAccountID value for this ObjectAdministrativeData.
     * 
     * @param responsibleUserAccountID
     */
    public void setResponsibleUserAccountID(java.lang.String responsibleUserAccountID) {
        this.responsibleUserAccountID = responsibleUserAccountID;
    }


    /**
     * Gets the lastChangeDateTime value for this ObjectAdministrativeData.
     * 
     * @return lastChangeDateTime
     */
    public java.util.Calendar getLastChangeDateTime() {
        return lastChangeDateTime;
    }


    /**
     * Sets the lastChangeDateTime value for this ObjectAdministrativeData.
     * 
     * @param lastChangeDateTime
     */
    public void setLastChangeDateTime(java.util.Calendar lastChangeDateTime) {
        this.lastChangeDateTime = lastChangeDateTime;
    }


    /**
     * Gets the lastChangeUserAccountID value for this ObjectAdministrativeData.
     * 
     * @return lastChangeUserAccountID
     */
    public java.lang.String getLastChangeUserAccountID() {
        return lastChangeUserAccountID;
    }


    /**
     * Sets the lastChangeUserAccountID value for this ObjectAdministrativeData.
     * 
     * @param lastChangeUserAccountID
     */
    public void setLastChangeUserAccountID(java.lang.String lastChangeUserAccountID) {
        this.lastChangeUserAccountID = lastChangeUserAccountID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectAdministrativeData)) return false;
        ObjectAdministrativeData other = (ObjectAdministrativeData) obj;
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
              this.responsibleUserAccountID.equals(other.getResponsibleUserAccountID()))) &&
            ((this.lastChangeDateTime==null && other.getLastChangeDateTime()==null) || 
             (this.lastChangeDateTime!=null &&
              this.lastChangeDateTime.equals(other.getLastChangeDateTime()))) &&
            ((this.lastChangeUserAccountID==null && other.getLastChangeUserAccountID()==null) || 
             (this.lastChangeUserAccountID!=null &&
              this.lastChangeUserAccountID.equals(other.getLastChangeUserAccountID())));
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
        if (getLastChangeDateTime() != null) {
            _hashCode += getLastChangeDateTime().hashCode();
        }
        if (getLastChangeUserAccountID() != null) {
            _hashCode += getLastChangeUserAccountID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectAdministrativeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ObjectAdministrativeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleUserAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ResponsibleUserAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastChangeDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "LastChangeDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastChangeUserAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "LastChangeUserAccountID"));
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
