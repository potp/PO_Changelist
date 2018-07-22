/**
 * CommunicationChannelDeleteOpenForEditIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class CommunicationChannelDeleteOpenForEditIn  implements java.io.Serializable {
    private java.lang.String changeListID;

    private types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelID;

    public CommunicationChannelDeleteOpenForEditIn() {
    }

    public CommunicationChannelDeleteOpenForEditIn(
           java.lang.String changeListID,
           types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelID) {
           this.changeListID = changeListID;
           this.communicationChannelID = communicationChannelID;
    }


    /**
     * Gets the changeListID value for this CommunicationChannelDeleteOpenForEditIn.
     * 
     * @return changeListID
     */
    public java.lang.String getChangeListID() {
        return changeListID;
    }


    /**
     * Sets the changeListID value for this CommunicationChannelDeleteOpenForEditIn.
     * 
     * @param changeListID
     */
    public void setChangeListID(java.lang.String changeListID) {
        this.changeListID = changeListID;
    }


    /**
     * Gets the communicationChannelID value for this CommunicationChannelDeleteOpenForEditIn.
     * 
     * @return communicationChannelID
     */
    public types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] getCommunicationChannelID() {
        return communicationChannelID;
    }


    /**
     * Sets the communicationChannelID value for this CommunicationChannelDeleteOpenForEditIn.
     * 
     * @param communicationChannelID
     */
    public void setCommunicationChannelID(types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelID) {
        this.communicationChannelID = communicationChannelID;
    }

    public types.api.server.ibdir.aii.sap.com.CommunicationChannelID getCommunicationChannelID(int i) {
        return this.communicationChannelID[i];
    }

    public void setCommunicationChannelID(int i, types.api.server.ibdir.aii.sap.com.CommunicationChannelID _value) {
        this.communicationChannelID[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunicationChannelDeleteOpenForEditIn)) return false;
        CommunicationChannelDeleteOpenForEditIn other = (CommunicationChannelDeleteOpenForEditIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeListID==null && other.getChangeListID()==null) || 
             (this.changeListID!=null &&
              this.changeListID.equals(other.getChangeListID()))) &&
            ((this.communicationChannelID==null && other.getCommunicationChannelID()==null) || 
             (this.communicationChannelID!=null &&
              java.util.Arrays.equals(this.communicationChannelID, other.getCommunicationChannelID())));
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
        if (getChangeListID() != null) {
            _hashCode += getChangeListID().hashCode();
        }
        if (getCommunicationChannelID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommunicationChannelID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommunicationChannelID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommunicationChannelDeleteOpenForEditIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelDeleteOpenForEditIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeListID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationChannelID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
