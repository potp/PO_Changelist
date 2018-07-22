/**
 * CommunicationChannelQueryOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class CommunicationChannelQueryOut  implements java.io.Serializable {
    private types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelID;

    private types.api.server.ibdir.aii.sap.com.LogMessageCollection logMessageCollection;

    public CommunicationChannelQueryOut() {
    }

    public CommunicationChannelQueryOut(
           types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelID,
           types.api.server.ibdir.aii.sap.com.LogMessageCollection logMessageCollection) {
           this.communicationChannelID = communicationChannelID;
           this.logMessageCollection = logMessageCollection;
    }


    /**
     * Gets the communicationChannelID value for this CommunicationChannelQueryOut.
     * 
     * @return communicationChannelID
     */
    public types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] getCommunicationChannelID() {
        return communicationChannelID;
    }


    /**
     * Sets the communicationChannelID value for this CommunicationChannelQueryOut.
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


    /**
     * Gets the logMessageCollection value for this CommunicationChannelQueryOut.
     * 
     * @return logMessageCollection
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageCollection getLogMessageCollection() {
        return logMessageCollection;
    }


    /**
     * Sets the logMessageCollection value for this CommunicationChannelQueryOut.
     * 
     * @param logMessageCollection
     */
    public void setLogMessageCollection(types.api.server.ibdir.aii.sap.com.LogMessageCollection logMessageCollection) {
        this.logMessageCollection = logMessageCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunicationChannelQueryOut)) return false;
        CommunicationChannelQueryOut other = (CommunicationChannelQueryOut) obj;
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
              java.util.Arrays.equals(this.communicationChannelID, other.getCommunicationChannelID()))) &&
            ((this.logMessageCollection==null && other.getLogMessageCollection()==null) || 
             (this.logMessageCollection!=null &&
              this.logMessageCollection.equals(other.getLogMessageCollection())));
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
        if (getLogMessageCollection() != null) {
            _hashCode += getLogMessageCollection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommunicationChannelQueryOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelQueryOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationChannelID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCollection"));
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
