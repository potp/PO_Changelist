/**
 * MessageHeaderID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class MessageHeaderID  implements java.io.Serializable {
    private org.apache.axis.types.Token senderPartyID;

    private org.apache.axis.types.Token senderComponentID;

    private java.lang.String interfaceName;

    private org.apache.axis.types.Token interfaceNamespace;

    private org.apache.axis.types.Token receiverPartyID;

    private org.apache.axis.types.Token receiverComponentID;

    public MessageHeaderID() {
    }

    public MessageHeaderID(
           org.apache.axis.types.Token senderPartyID,
           org.apache.axis.types.Token senderComponentID,
           java.lang.String interfaceName,
           org.apache.axis.types.Token interfaceNamespace,
           org.apache.axis.types.Token receiverPartyID,
           org.apache.axis.types.Token receiverComponentID) {
           this.senderPartyID = senderPartyID;
           this.senderComponentID = senderComponentID;
           this.interfaceName = interfaceName;
           this.interfaceNamespace = interfaceNamespace;
           this.receiverPartyID = receiverPartyID;
           this.receiverComponentID = receiverComponentID;
    }


    /**
     * Gets the senderPartyID value for this MessageHeaderID.
     * 
     * @return senderPartyID
     */
    public org.apache.axis.types.Token getSenderPartyID() {
        return senderPartyID;
    }


    /**
     * Sets the senderPartyID value for this MessageHeaderID.
     * 
     * @param senderPartyID
     */
    public void setSenderPartyID(org.apache.axis.types.Token senderPartyID) {
        this.senderPartyID = senderPartyID;
    }


    /**
     * Gets the senderComponentID value for this MessageHeaderID.
     * 
     * @return senderComponentID
     */
    public org.apache.axis.types.Token getSenderComponentID() {
        return senderComponentID;
    }


    /**
     * Sets the senderComponentID value for this MessageHeaderID.
     * 
     * @param senderComponentID
     */
    public void setSenderComponentID(org.apache.axis.types.Token senderComponentID) {
        this.senderComponentID = senderComponentID;
    }


    /**
     * Gets the interfaceName value for this MessageHeaderID.
     * 
     * @return interfaceName
     */
    public java.lang.String getInterfaceName() {
        return interfaceName;
    }


    /**
     * Sets the interfaceName value for this MessageHeaderID.
     * 
     * @param interfaceName
     */
    public void setInterfaceName(java.lang.String interfaceName) {
        this.interfaceName = interfaceName;
    }


    /**
     * Gets the interfaceNamespace value for this MessageHeaderID.
     * 
     * @return interfaceNamespace
     */
    public org.apache.axis.types.Token getInterfaceNamespace() {
        return interfaceNamespace;
    }


    /**
     * Sets the interfaceNamespace value for this MessageHeaderID.
     * 
     * @param interfaceNamespace
     */
    public void setInterfaceNamespace(org.apache.axis.types.Token interfaceNamespace) {
        this.interfaceNamespace = interfaceNamespace;
    }


    /**
     * Gets the receiverPartyID value for this MessageHeaderID.
     * 
     * @return receiverPartyID
     */
    public org.apache.axis.types.Token getReceiverPartyID() {
        return receiverPartyID;
    }


    /**
     * Sets the receiverPartyID value for this MessageHeaderID.
     * 
     * @param receiverPartyID
     */
    public void setReceiverPartyID(org.apache.axis.types.Token receiverPartyID) {
        this.receiverPartyID = receiverPartyID;
    }


    /**
     * Gets the receiverComponentID value for this MessageHeaderID.
     * 
     * @return receiverComponentID
     */
    public org.apache.axis.types.Token getReceiverComponentID() {
        return receiverComponentID;
    }


    /**
     * Sets the receiverComponentID value for this MessageHeaderID.
     * 
     * @param receiverComponentID
     */
    public void setReceiverComponentID(org.apache.axis.types.Token receiverComponentID) {
        this.receiverComponentID = receiverComponentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageHeaderID)) return false;
        MessageHeaderID other = (MessageHeaderID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.senderPartyID==null && other.getSenderPartyID()==null) || 
             (this.senderPartyID!=null &&
              this.senderPartyID.equals(other.getSenderPartyID()))) &&
            ((this.senderComponentID==null && other.getSenderComponentID()==null) || 
             (this.senderComponentID!=null &&
              this.senderComponentID.equals(other.getSenderComponentID()))) &&
            ((this.interfaceName==null && other.getInterfaceName()==null) || 
             (this.interfaceName!=null &&
              this.interfaceName.equals(other.getInterfaceName()))) &&
            ((this.interfaceNamespace==null && other.getInterfaceNamespace()==null) || 
             (this.interfaceNamespace!=null &&
              this.interfaceNamespace.equals(other.getInterfaceNamespace()))) &&
            ((this.receiverPartyID==null && other.getReceiverPartyID()==null) || 
             (this.receiverPartyID!=null &&
              this.receiverPartyID.equals(other.getReceiverPartyID()))) &&
            ((this.receiverComponentID==null && other.getReceiverComponentID()==null) || 
             (this.receiverComponentID!=null &&
              this.receiverComponentID.equals(other.getReceiverComponentID())));
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
        if (getSenderPartyID() != null) {
            _hashCode += getSenderPartyID().hashCode();
        }
        if (getSenderComponentID() != null) {
            _hashCode += getSenderComponentID().hashCode();
        }
        if (getInterfaceName() != null) {
            _hashCode += getInterfaceName().hashCode();
        }
        if (getInterfaceNamespace() != null) {
            _hashCode += getInterfaceNamespace().hashCode();
        }
        if (getReceiverPartyID() != null) {
            _hashCode += getReceiverPartyID().hashCode();
        }
        if (getReceiverComponentID() != null) {
            _hashCode += getReceiverComponentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageHeaderID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "MessageHeaderID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPartyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SenderPartyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderComponentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SenderComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InterfaceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InterfaceNamespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPartyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReceiverPartyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverComponentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReceiverComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
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
