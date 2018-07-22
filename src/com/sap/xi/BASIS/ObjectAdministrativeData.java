/**
 * ObjectAdministrativeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;


/**
 * ObjectAdministrativeData
 */
public class ObjectAdministrativeData  implements java.io.Serializable {
    private org.apache.axis.types.Token responsibleUserAccountID;

    private org.apache.axis.types.Token lastChangeUserAccountID;

    private java.util.Calendar lastChangeDateTime;

    private java.lang.String folderPathID;

    public ObjectAdministrativeData() {
    }

    public ObjectAdministrativeData(
           org.apache.axis.types.Token responsibleUserAccountID,
           org.apache.axis.types.Token lastChangeUserAccountID,
           java.util.Calendar lastChangeDateTime,
           java.lang.String folderPathID) {
           this.responsibleUserAccountID = responsibleUserAccountID;
           this.lastChangeUserAccountID = lastChangeUserAccountID;
           this.lastChangeDateTime = lastChangeDateTime;
           this.folderPathID = folderPathID;
    }


    /**
     * Gets the responsibleUserAccountID value for this ObjectAdministrativeData.
     * 
     * @return responsibleUserAccountID
     */
    public org.apache.axis.types.Token getResponsibleUserAccountID() {
        return responsibleUserAccountID;
    }


    /**
     * Sets the responsibleUserAccountID value for this ObjectAdministrativeData.
     * 
     * @param responsibleUserAccountID
     */
    public void setResponsibleUserAccountID(org.apache.axis.types.Token responsibleUserAccountID) {
        this.responsibleUserAccountID = responsibleUserAccountID;
    }


    /**
     * Gets the lastChangeUserAccountID value for this ObjectAdministrativeData.
     * 
     * @return lastChangeUserAccountID
     */
    public org.apache.axis.types.Token getLastChangeUserAccountID() {
        return lastChangeUserAccountID;
    }


    /**
     * Sets the lastChangeUserAccountID value for this ObjectAdministrativeData.
     * 
     * @param lastChangeUserAccountID
     */
    public void setLastChangeUserAccountID(org.apache.axis.types.Token lastChangeUserAccountID) {
        this.lastChangeUserAccountID = lastChangeUserAccountID;
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
     * Gets the folderPathID value for this ObjectAdministrativeData.
     * 
     * @return folderPathID
     */
    public java.lang.String getFolderPathID() {
        return folderPathID;
    }


    /**
     * Sets the folderPathID value for this ObjectAdministrativeData.
     * 
     * @param folderPathID
     */
    public void setFolderPathID(java.lang.String folderPathID) {
        this.folderPathID = folderPathID;
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
            ((this.lastChangeUserAccountID==null && other.getLastChangeUserAccountID()==null) || 
             (this.lastChangeUserAccountID!=null &&
              this.lastChangeUserAccountID.equals(other.getLastChangeUserAccountID()))) &&
            ((this.lastChangeDateTime==null && other.getLastChangeDateTime()==null) || 
             (this.lastChangeDateTime!=null &&
              this.lastChangeDateTime.equals(other.getLastChangeDateTime()))) &&
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
        if (getLastChangeUserAccountID() != null) {
            _hashCode += getLastChangeUserAccountID().hashCode();
        }
        if (getLastChangeDateTime() != null) {
            _hashCode += getLastChangeDateTime().hashCode();
        }
        if (getFolderPathID() != null) {
            _hashCode += getFolderPathID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectAdministrativeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "ObjectAdministrativeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleUserAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponsibleUserAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastChangeUserAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastChangeUserAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastChangeDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastChangeDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
