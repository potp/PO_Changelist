/**
 * CommunicationComponentID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class CommunicationComponentID  implements java.io.Serializable {
    private java.lang.String partyID;

    private java.lang.String componentID;

    public CommunicationComponentID() {
    }

    public CommunicationComponentID(
           java.lang.String partyID,
           java.lang.String componentID) {
           this.partyID = partyID;
           this.componentID = componentID;
    }


    /**
     * Gets the partyID value for this CommunicationComponentID.
     * 
     * @return partyID
     */
    public java.lang.String getPartyID() {
        return partyID;
    }


    /**
     * Sets the partyID value for this CommunicationComponentID.
     * 
     * @param partyID
     */
    public void setPartyID(java.lang.String partyID) {
        this.partyID = partyID;
    }


    /**
     * Gets the componentID value for this CommunicationComponentID.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this CommunicationComponentID.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunicationComponentID)) return false;
        CommunicationComponentID other = (CommunicationComponentID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partyID==null && other.getPartyID()==null) || 
             (this.partyID!=null &&
              this.partyID.equals(other.getPartyID()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID())));
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
        if (getPartyID() != null) {
            _hashCode += getPartyID().hashCode();
        }
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommunicationComponentID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationComponentID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "PartyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ComponentID"));
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
