/**
 * CommunicationChannelQueryIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class CommunicationChannelQueryIn  implements java.io.Serializable {
    private types.api.server.ibdir.aii.sap.com.CommunicationChannelID communicationChannelID;

    private types.api.server.ib.aii.sap.com.LONG_Description description;

    private types.api.server.ib.aii.sap.com.ObjectAdministrativeData administrativeData;

    public CommunicationChannelQueryIn() {
    }

    public CommunicationChannelQueryIn(
           types.api.server.ibdir.aii.sap.com.CommunicationChannelID communicationChannelID,
           types.api.server.ib.aii.sap.com.LONG_Description description,
           types.api.server.ib.aii.sap.com.ObjectAdministrativeData administrativeData) {
           this.communicationChannelID = communicationChannelID;
           this.description = description;
           this.administrativeData = administrativeData;
    }


    /**
     * Gets the communicationChannelID value for this CommunicationChannelQueryIn.
     * 
     * @return communicationChannelID
     */
    public types.api.server.ibdir.aii.sap.com.CommunicationChannelID getCommunicationChannelID() {
        return communicationChannelID;
    }


    /**
     * Sets the communicationChannelID value for this CommunicationChannelQueryIn.
     * 
     * @param communicationChannelID
     */
    public void setCommunicationChannelID(types.api.server.ibdir.aii.sap.com.CommunicationChannelID communicationChannelID) {
        this.communicationChannelID = communicationChannelID;
    }


    /**
     * Gets the description value for this CommunicationChannelQueryIn.
     * 
     * @return description
     */
    public types.api.server.ib.aii.sap.com.LONG_Description getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CommunicationChannelQueryIn.
     * 
     * @param description
     */
    public void setDescription(types.api.server.ib.aii.sap.com.LONG_Description description) {
        this.description = description;
    }


    /**
     * Gets the administrativeData value for this CommunicationChannelQueryIn.
     * 
     * @return administrativeData
     */
    public types.api.server.ib.aii.sap.com.ObjectAdministrativeData getAdministrativeData() {
        return administrativeData;
    }


    /**
     * Sets the administrativeData value for this CommunicationChannelQueryIn.
     * 
     * @param administrativeData
     */
    public void setAdministrativeData(types.api.server.ib.aii.sap.com.ObjectAdministrativeData administrativeData) {
        this.administrativeData = administrativeData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunicationChannelQueryIn)) return false;
        CommunicationChannelQueryIn other = (CommunicationChannelQueryIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.communicationChannelID==null && other.getCommunicationChannelID()==null) || 
             (this.communicationChannelID!=null &&
              this.communicationChannelID.equals(other.getCommunicationChannelID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.administrativeData==null && other.getAdministrativeData()==null) || 
             (this.administrativeData!=null &&
              this.administrativeData.equals(other.getAdministrativeData())));
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
        if (getCommunicationChannelID() != null) {
            _hashCode += getCommunicationChannelID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAdministrativeData() != null) {
            _hashCode += getAdministrativeData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommunicationChannelQueryIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelQueryIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationChannelID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "LONG_Description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administrativeData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "AdministrativeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ObjectAdministrativeData"));
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
