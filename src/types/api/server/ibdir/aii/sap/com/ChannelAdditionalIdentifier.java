/**
 * ChannelAdditionalIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class ChannelAdditionalIdentifier  implements java.io.Serializable {
    private java.lang.String schemeID;

    private java.lang.String schemeAgencyID;

    public ChannelAdditionalIdentifier() {
    }

    public ChannelAdditionalIdentifier(
           java.lang.String schemeID,
           java.lang.String schemeAgencyID) {
           this.schemeID = schemeID;
           this.schemeAgencyID = schemeAgencyID;
    }


    /**
     * Gets the schemeID value for this ChannelAdditionalIdentifier.
     * 
     * @return schemeID
     */
    public java.lang.String getSchemeID() {
        return schemeID;
    }


    /**
     * Sets the schemeID value for this ChannelAdditionalIdentifier.
     * 
     * @param schemeID
     */
    public void setSchemeID(java.lang.String schemeID) {
        this.schemeID = schemeID;
    }


    /**
     * Gets the schemeAgencyID value for this ChannelAdditionalIdentifier.
     * 
     * @return schemeAgencyID
     */
    public java.lang.String getSchemeAgencyID() {
        return schemeAgencyID;
    }


    /**
     * Sets the schemeAgencyID value for this ChannelAdditionalIdentifier.
     * 
     * @param schemeAgencyID
     */
    public void setSchemeAgencyID(java.lang.String schemeAgencyID) {
        this.schemeAgencyID = schemeAgencyID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChannelAdditionalIdentifier)) return false;
        ChannelAdditionalIdentifier other = (ChannelAdditionalIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.schemeID==null && other.getSchemeID()==null) || 
             (this.schemeID!=null &&
              this.schemeID.equals(other.getSchemeID()))) &&
            ((this.schemeAgencyID==null && other.getSchemeAgencyID()==null) || 
             (this.schemeAgencyID!=null &&
              this.schemeAgencyID.equals(other.getSchemeAgencyID())));
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
        if (getSchemeID() != null) {
            _hashCode += getSchemeID().hashCode();
        }
        if (getSchemeAgencyID() != null) {
            _hashCode += getSchemeAgencyID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChannelAdditionalIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChannelAdditionalIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "schemeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemeAgencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "schemeAgencyID"));
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
