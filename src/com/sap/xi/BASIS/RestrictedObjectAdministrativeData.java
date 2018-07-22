/**
 * RestrictedObjectAdministrativeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;


/**
 * ObjectAdministrativeData
 */
public class RestrictedObjectAdministrativeData  implements java.io.Serializable {
    private org.apache.axis.types.Token responsibleUserAccountID;

    private java.lang.String folderPathID;

    public RestrictedObjectAdministrativeData() {
    }

    public RestrictedObjectAdministrativeData(
           org.apache.axis.types.Token responsibleUserAccountID,
           java.lang.String folderPathID) {
           this.responsibleUserAccountID = responsibleUserAccountID;
           this.folderPathID = folderPathID;
    }


    /**
     * Gets the responsibleUserAccountID value for this RestrictedObjectAdministrativeData.
     * 
     * @return responsibleUserAccountID
     */
    public org.apache.axis.types.Token getResponsibleUserAccountID() {
        return responsibleUserAccountID;
    }


    /**
     * Sets the responsibleUserAccountID value for this RestrictedObjectAdministrativeData.
     * 
     * @param responsibleUserAccountID
     */
    public void setResponsibleUserAccountID(org.apache.axis.types.Token responsibleUserAccountID) {
        this.responsibleUserAccountID = responsibleUserAccountID;
    }


    /**
     * Gets the folderPathID value for this RestrictedObjectAdministrativeData.
     * 
     * @return folderPathID
     */
    public java.lang.String getFolderPathID() {
        return folderPathID;
    }


    /**
     * Sets the folderPathID value for this RestrictedObjectAdministrativeData.
     * 
     * @param folderPathID
     */
    public void setFolderPathID(java.lang.String folderPathID) {
        this.folderPathID = folderPathID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RestrictedObjectAdministrativeData)) return false;
        RestrictedObjectAdministrativeData other = (RestrictedObjectAdministrativeData) obj;
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
            ((this.folderPathID==null && other.getFolderPathID()==null) || 
             (this.folderPathID!=null &&
              this.folderPathID.equals(other.getFolderPathID())));
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
        if (getFolderPathID() != null) {
            _hashCode += getFolderPathID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RestrictedObjectAdministrativeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "RestrictedObjectAdministrativeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleUserAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponsibleUserAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderPathID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FolderPathID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
