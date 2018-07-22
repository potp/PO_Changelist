/**
 * CommunicationChannel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class CommunicationChannel  implements java.io.Serializable {
    private java.lang.String masterLanguage;

    private types.api.server.ib.aii.sap.com.ObjectAdministrativeData administrativeData;

    private types.api.server.ib.aii.sap.com.LONG_Description[] description;

    private types.api.server.ibdir.aii.sap.com.CommunicationChannelID communicationChannelID;

    private types.api.server.ibdir.aii.sap.com.DesignObjectID adapterMetadata;

    private java.lang.String direction;

    private java.lang.String transportProtocol;

    private java.lang.String transportProtocolVersion;

    private java.lang.String messageProtocol;

    private java.lang.String messageProtocolVersion;

    private java.lang.String adapterEngineName;

    private types.api.server.ibdir.aii.sap.com.GenericProperty[] adapterSpecificAttribute;

    private types.api.server.ibdir.aii.sap.com.GenericPropertyTable[] adapterSpecificTableAttribute;

    private types.api.server.ibdir.aii.sap.com.ModuleProcess moduleProcess;

    private types.api.server.ibdir.aii.sap.com.ChannelAdditionalIdentifier senderIdentifier;

    private types.api.server.ibdir.aii.sap.com.ChannelAdditionalIdentifier receiverIdentifier;

    public CommunicationChannel() {
    }

    public CommunicationChannel(
           java.lang.String masterLanguage,
           types.api.server.ib.aii.sap.com.ObjectAdministrativeData administrativeData,
           types.api.server.ib.aii.sap.com.LONG_Description[] description,
           types.api.server.ibdir.aii.sap.com.CommunicationChannelID communicationChannelID,
           types.api.server.ibdir.aii.sap.com.DesignObjectID adapterMetadata,
           java.lang.String direction,
           java.lang.String transportProtocol,
           java.lang.String transportProtocolVersion,
           java.lang.String messageProtocol,
           java.lang.String messageProtocolVersion,
           java.lang.String adapterEngineName,
           types.api.server.ibdir.aii.sap.com.GenericProperty[] adapterSpecificAttribute,
           types.api.server.ibdir.aii.sap.com.GenericPropertyTable[] adapterSpecificTableAttribute,
           types.api.server.ibdir.aii.sap.com.ModuleProcess moduleProcess,
           types.api.server.ibdir.aii.sap.com.ChannelAdditionalIdentifier senderIdentifier,
           types.api.server.ibdir.aii.sap.com.ChannelAdditionalIdentifier receiverIdentifier) {
           this.masterLanguage = masterLanguage;
           this.administrativeData = administrativeData;
           this.description = description;
           this.communicationChannelID = communicationChannelID;
           this.adapterMetadata = adapterMetadata;
           this.direction = direction;
           this.transportProtocol = transportProtocol;
           this.transportProtocolVersion = transportProtocolVersion;
           this.messageProtocol = messageProtocol;
           this.messageProtocolVersion = messageProtocolVersion;
           this.adapterEngineName = adapterEngineName;
           this.adapterSpecificAttribute = adapterSpecificAttribute;
           this.adapterSpecificTableAttribute = adapterSpecificTableAttribute;
           this.moduleProcess = moduleProcess;
           this.senderIdentifier = senderIdentifier;
           this.receiverIdentifier = receiverIdentifier;
    }


    /**
     * Gets the masterLanguage value for this CommunicationChannel.
     * 
     * @return masterLanguage
     */
    public java.lang.String getMasterLanguage() {
        return masterLanguage;
    }


    /**
     * Sets the masterLanguage value for this CommunicationChannel.
     * 
     * @param masterLanguage
     */
    public void setMasterLanguage(java.lang.String masterLanguage) {
        this.masterLanguage = masterLanguage;
    }


    /**
     * Gets the administrativeData value for this CommunicationChannel.
     * 
     * @return administrativeData
     */
    public types.api.server.ib.aii.sap.com.ObjectAdministrativeData getAdministrativeData() {
        return administrativeData;
    }


    /**
     * Sets the administrativeData value for this CommunicationChannel.
     * 
     * @param administrativeData
     */
    public void setAdministrativeData(types.api.server.ib.aii.sap.com.ObjectAdministrativeData administrativeData) {
        this.administrativeData = administrativeData;
    }


    /**
     * Gets the description value for this CommunicationChannel.
     * 
     * @return description
     */
    public types.api.server.ib.aii.sap.com.LONG_Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CommunicationChannel.
     * 
     * @param description
     */
    public void setDescription(types.api.server.ib.aii.sap.com.LONG_Description[] description) {
        this.description = description;
    }

    public types.api.server.ib.aii.sap.com.LONG_Description getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, types.api.server.ib.aii.sap.com.LONG_Description _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the communicationChannelID value for this CommunicationChannel.
     * 
     * @return communicationChannelID
     */
    public types.api.server.ibdir.aii.sap.com.CommunicationChannelID getCommunicationChannelID() {
        return communicationChannelID;
    }


    /**
     * Sets the communicationChannelID value for this CommunicationChannel.
     * 
     * @param communicationChannelID
     */
    public void setCommunicationChannelID(types.api.server.ibdir.aii.sap.com.CommunicationChannelID communicationChannelID) {
        this.communicationChannelID = communicationChannelID;
    }


    /**
     * Gets the adapterMetadata value for this CommunicationChannel.
     * 
     * @return adapterMetadata
     */
    public types.api.server.ibdir.aii.sap.com.DesignObjectID getAdapterMetadata() {
        return adapterMetadata;
    }


    /**
     * Sets the adapterMetadata value for this CommunicationChannel.
     * 
     * @param adapterMetadata
     */
    public void setAdapterMetadata(types.api.server.ibdir.aii.sap.com.DesignObjectID adapterMetadata) {
        this.adapterMetadata = adapterMetadata;
    }


    /**
     * Gets the direction value for this CommunicationChannel.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this CommunicationChannel.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the transportProtocol value for this CommunicationChannel.
     * 
     * @return transportProtocol
     */
    public java.lang.String getTransportProtocol() {
        return transportProtocol;
    }


    /**
     * Sets the transportProtocol value for this CommunicationChannel.
     * 
     * @param transportProtocol
     */
    public void setTransportProtocol(java.lang.String transportProtocol) {
        this.transportProtocol = transportProtocol;
    }


    /**
     * Gets the transportProtocolVersion value for this CommunicationChannel.
     * 
     * @return transportProtocolVersion
     */
    public java.lang.String getTransportProtocolVersion() {
        return transportProtocolVersion;
    }


    /**
     * Sets the transportProtocolVersion value for this CommunicationChannel.
     * 
     * @param transportProtocolVersion
     */
    public void setTransportProtocolVersion(java.lang.String transportProtocolVersion) {
        this.transportProtocolVersion = transportProtocolVersion;
    }


    /**
     * Gets the messageProtocol value for this CommunicationChannel.
     * 
     * @return messageProtocol
     */
    public java.lang.String getMessageProtocol() {
        return messageProtocol;
    }


    /**
     * Sets the messageProtocol value for this CommunicationChannel.
     * 
     * @param messageProtocol
     */
    public void setMessageProtocol(java.lang.String messageProtocol) {
        this.messageProtocol = messageProtocol;
    }


    /**
     * Gets the messageProtocolVersion value for this CommunicationChannel.
     * 
     * @return messageProtocolVersion
     */
    public java.lang.String getMessageProtocolVersion() {
        return messageProtocolVersion;
    }


    /**
     * Sets the messageProtocolVersion value for this CommunicationChannel.
     * 
     * @param messageProtocolVersion
     */
    public void setMessageProtocolVersion(java.lang.String messageProtocolVersion) {
        this.messageProtocolVersion = messageProtocolVersion;
    }


    /**
     * Gets the adapterEngineName value for this CommunicationChannel.
     * 
     * @return adapterEngineName
     */
    public java.lang.String getAdapterEngineName() {
        return adapterEngineName;
    }


    /**
     * Sets the adapterEngineName value for this CommunicationChannel.
     * 
     * @param adapterEngineName
     */
    public void setAdapterEngineName(java.lang.String adapterEngineName) {
        this.adapterEngineName = adapterEngineName;
    }


    /**
     * Gets the adapterSpecificAttribute value for this CommunicationChannel.
     * 
     * @return adapterSpecificAttribute
     */
    public types.api.server.ibdir.aii.sap.com.GenericProperty[] getAdapterSpecificAttribute() {
        return adapterSpecificAttribute;
    }


    /**
     * Sets the adapterSpecificAttribute value for this CommunicationChannel.
     * 
     * @param adapterSpecificAttribute
     */
    public void setAdapterSpecificAttribute(types.api.server.ibdir.aii.sap.com.GenericProperty[] adapterSpecificAttribute) {
        this.adapterSpecificAttribute = adapterSpecificAttribute;
    }

    public types.api.server.ibdir.aii.sap.com.GenericProperty getAdapterSpecificAttribute(int i) {
        return this.adapterSpecificAttribute[i];
    }

    public void setAdapterSpecificAttribute(int i, types.api.server.ibdir.aii.sap.com.GenericProperty _value) {
        this.adapterSpecificAttribute[i] = _value;
    }


    /**
     * Gets the adapterSpecificTableAttribute value for this CommunicationChannel.
     * 
     * @return adapterSpecificTableAttribute
     */
    public types.api.server.ibdir.aii.sap.com.GenericPropertyTable[] getAdapterSpecificTableAttribute() {
        return adapterSpecificTableAttribute;
    }


    /**
     * Sets the adapterSpecificTableAttribute value for this CommunicationChannel.
     * 
     * @param adapterSpecificTableAttribute
     */
    public void setAdapterSpecificTableAttribute(types.api.server.ibdir.aii.sap.com.GenericPropertyTable[] adapterSpecificTableAttribute) {
        this.adapterSpecificTableAttribute = adapterSpecificTableAttribute;
    }

    public types.api.server.ibdir.aii.sap.com.GenericPropertyTable getAdapterSpecificTableAttribute(int i) {
        return this.adapterSpecificTableAttribute[i];
    }

    public void setAdapterSpecificTableAttribute(int i, types.api.server.ibdir.aii.sap.com.GenericPropertyTable _value) {
        this.adapterSpecificTableAttribute[i] = _value;
    }


    /**
     * Gets the moduleProcess value for this CommunicationChannel.
     * 
     * @return moduleProcess
     */
    public types.api.server.ibdir.aii.sap.com.ModuleProcess getModuleProcess() {
        return moduleProcess;
    }


    /**
     * Sets the moduleProcess value for this CommunicationChannel.
     * 
     * @param moduleProcess
     */
    public void setModuleProcess(types.api.server.ibdir.aii.sap.com.ModuleProcess moduleProcess) {
        this.moduleProcess = moduleProcess;
    }


    /**
     * Gets the senderIdentifier value for this CommunicationChannel.
     * 
     * @return senderIdentifier
     */
    public types.api.server.ibdir.aii.sap.com.ChannelAdditionalIdentifier getSenderIdentifier() {
        return senderIdentifier;
    }


    /**
     * Sets the senderIdentifier value for this CommunicationChannel.
     * 
     * @param senderIdentifier
     */
    public void setSenderIdentifier(types.api.server.ibdir.aii.sap.com.ChannelAdditionalIdentifier senderIdentifier) {
        this.senderIdentifier = senderIdentifier;
    }


    /**
     * Gets the receiverIdentifier value for this CommunicationChannel.
     * 
     * @return receiverIdentifier
     */
    public types.api.server.ibdir.aii.sap.com.ChannelAdditionalIdentifier getReceiverIdentifier() {
        return receiverIdentifier;
    }


    /**
     * Sets the receiverIdentifier value for this CommunicationChannel.
     * 
     * @param receiverIdentifier
     */
    public void setReceiverIdentifier(types.api.server.ibdir.aii.sap.com.ChannelAdditionalIdentifier receiverIdentifier) {
        this.receiverIdentifier = receiverIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunicationChannel)) return false;
        CommunicationChannel other = (CommunicationChannel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.masterLanguage==null && other.getMasterLanguage()==null) || 
             (this.masterLanguage!=null &&
              this.masterLanguage.equals(other.getMasterLanguage()))) &&
            ((this.administrativeData==null && other.getAdministrativeData()==null) || 
             (this.administrativeData!=null &&
              this.administrativeData.equals(other.getAdministrativeData()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.communicationChannelID==null && other.getCommunicationChannelID()==null) || 
             (this.communicationChannelID!=null &&
              this.communicationChannelID.equals(other.getCommunicationChannelID()))) &&
            ((this.adapterMetadata==null && other.getAdapterMetadata()==null) || 
             (this.adapterMetadata!=null &&
              this.adapterMetadata.equals(other.getAdapterMetadata()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.transportProtocol==null && other.getTransportProtocol()==null) || 
             (this.transportProtocol!=null &&
              this.transportProtocol.equals(other.getTransportProtocol()))) &&
            ((this.transportProtocolVersion==null && other.getTransportProtocolVersion()==null) || 
             (this.transportProtocolVersion!=null &&
              this.transportProtocolVersion.equals(other.getTransportProtocolVersion()))) &&
            ((this.messageProtocol==null && other.getMessageProtocol()==null) || 
             (this.messageProtocol!=null &&
              this.messageProtocol.equals(other.getMessageProtocol()))) &&
            ((this.messageProtocolVersion==null && other.getMessageProtocolVersion()==null) || 
             (this.messageProtocolVersion!=null &&
              this.messageProtocolVersion.equals(other.getMessageProtocolVersion()))) &&
            ((this.adapterEngineName==null && other.getAdapterEngineName()==null) || 
             (this.adapterEngineName!=null &&
              this.adapterEngineName.equals(other.getAdapterEngineName()))) &&
            ((this.adapterSpecificAttribute==null && other.getAdapterSpecificAttribute()==null) || 
             (this.adapterSpecificAttribute!=null &&
              java.util.Arrays.equals(this.adapterSpecificAttribute, other.getAdapterSpecificAttribute()))) &&
            ((this.adapterSpecificTableAttribute==null && other.getAdapterSpecificTableAttribute()==null) || 
             (this.adapterSpecificTableAttribute!=null &&
              java.util.Arrays.equals(this.adapterSpecificTableAttribute, other.getAdapterSpecificTableAttribute()))) &&
            ((this.moduleProcess==null && other.getModuleProcess()==null) || 
             (this.moduleProcess!=null &&
              this.moduleProcess.equals(other.getModuleProcess()))) &&
            ((this.senderIdentifier==null && other.getSenderIdentifier()==null) || 
             (this.senderIdentifier!=null &&
              this.senderIdentifier.equals(other.getSenderIdentifier()))) &&
            ((this.receiverIdentifier==null && other.getReceiverIdentifier()==null) || 
             (this.receiverIdentifier!=null &&
              this.receiverIdentifier.equals(other.getReceiverIdentifier())));
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
        if (getMasterLanguage() != null) {
            _hashCode += getMasterLanguage().hashCode();
        }
        if (getAdministrativeData() != null) {
            _hashCode += getAdministrativeData().hashCode();
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommunicationChannelID() != null) {
            _hashCode += getCommunicationChannelID().hashCode();
        }
        if (getAdapterMetadata() != null) {
            _hashCode += getAdapterMetadata().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getTransportProtocol() != null) {
            _hashCode += getTransportProtocol().hashCode();
        }
        if (getTransportProtocolVersion() != null) {
            _hashCode += getTransportProtocolVersion().hashCode();
        }
        if (getMessageProtocol() != null) {
            _hashCode += getMessageProtocol().hashCode();
        }
        if (getMessageProtocolVersion() != null) {
            _hashCode += getMessageProtocolVersion().hashCode();
        }
        if (getAdapterEngineName() != null) {
            _hashCode += getAdapterEngineName().hashCode();
        }
        if (getAdapterSpecificAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdapterSpecificAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdapterSpecificAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdapterSpecificTableAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdapterSpecificTableAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdapterSpecificTableAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModuleProcess() != null) {
            _hashCode += getModuleProcess().hashCode();
        }
        if (getSenderIdentifier() != null) {
            _hashCode += getSenderIdentifier().hashCode();
        }
        if (getReceiverIdentifier() != null) {
            _hashCode += getReceiverIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommunicationChannel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "MasterLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ib.server.api.types", "LONG_Description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationChannelID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationChannelID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapterMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "AdapterMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "DesignObjectID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "Direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "TransportProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportProtocolVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "TransportProtocolVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "MessageProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageProtocolVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "MessageProtocolVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapterEngineName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "AdapterEngineName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapterSpecificAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "AdapterSpecificAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapterSpecificTableAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "AdapterSpecificTableAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericPropertyTable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ModuleProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ModuleProcess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "SenderIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChannelAdditionalIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ReceiverIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChannelAdditionalIdentifier"));
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
