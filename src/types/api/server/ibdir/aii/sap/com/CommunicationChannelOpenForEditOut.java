/**
 * CommunicationChannelOpenForEditOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class CommunicationChannelOpenForEditOut  implements java.io.Serializable {
    private types.api.server.ib.aii.sap.com.ChangeListID changeListID;

    private types.api.server.ibdir.aii.sap.com.CommunicationChannel[] communicationChannel;

    private types.api.server.ibdir.aii.sap.com.LogMessageCollection logMessageCollection;

    public CommunicationChannelOpenForEditOut() {
    }

    public CommunicationChannelOpenForEditOut(
           types.api.server.ib.aii.sap.com.ChangeListID changeListID,
           types.api.server.ibdir.aii.sap.com.CommunicationChannel[] communicationChannel,
           types.api.server.ibdir.aii.sap.com.LogMessageCollection logMessageCollection) {
           this.changeListID = changeListID;
           this.communicationChannel = communicationChannel;
           this.logMessageCollection = logMessageCollection;
    }


    /**
     * Gets the changeListID value for this CommunicationChannelOpenForEditOut.
     * 
     * @return changeListID
     */
    public types.api.server.ib.aii.sap.com.ChangeListID getChangeListID() {
        return changeListID;
    }


    /**
     * Sets the changeListID value for this CommunicationChannelOpenForEditOut.
     * 
     * @param changeListID
     */
    public void setChangeListID(types.api.server.ib.aii.sap.com.ChangeListID changeListID) {
        this.changeListID = changeListID;
    }


    /**
     * Gets the communicationChannel value for this CommunicationChannelOpenForEditOut.
     * 
     * @return communicationChannel
     */
    public types.api.server.ibdir.aii.sap.com.CommunicationChannel[] getCommunicationChannel() {
        return communicationChannel;
    }


    /**
     * Sets the communicationChannel value for this CommunicationChannelOpenForEditOut.
     * 
     * @param communicationChannel
     */
    public void setCommunicationChannel(types.api.server.ibdir.aii.sap.com.CommunicationChannel[] communicationChannel) {
        this.communicationChannel = communicationChannel;
    }

    public types.api.server.ibdir.aii.sap.com.CommunicationChannel getCommunicationChannel(int i) {
        return this.communicationChannel[i];
    }

    public void setCommunicationChannel(int i, types.api.server.ibdir.aii.sap.com.CommunicationChannel _value) {
        this.communicationChannel[i] = _value;
    }


    /**
     * Gets the logMessageCollection value for this CommunicationChannelOpenForEditOut.
     * 
     * @return logMessageCollection
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageCollection getLogMessageCollection() {
        return logMessageCollection;
    }


    /**
     * Sets the logMessageCollection value for this CommunicationChannelOpenForEditOut.
     * 
     * @param logMessageCollection
     */
    public void setLogMessageCollection(types.api.server.ibdir.aii.sap.com.LogMessageCollection logMessageCollection) {
        this.logMessageCollection = logMessageCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunicationChannelOpenForEditOut)) return false;
        CommunicationChannelOpenForEditOut other = (CommunicationChannelOpenForEditOut) obj;
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
            ((this.communicationChannel==null && other.getCommunicationChannel()==null) || 
             (this.communicationChannel!=null &&
              java.util.Arrays.equals(this.communicationChannel, other.getCommunicationChannel()))) &&
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
        if (getChangeListID() != null) {
            _hashCode += getChangeListID().hashCode();
        }
        if (getCommunicationChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommunicationChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommunicationChannel(), i);
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
        new org.apache.axis.description.TypeDesc(CommunicationChannelOpenForEditOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelOpenForEditOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeListID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "ChangeListID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannel"));
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
