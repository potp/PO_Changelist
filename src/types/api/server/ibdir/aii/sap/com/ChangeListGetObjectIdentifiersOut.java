/**
 * ChangeListGetObjectIdentifiersOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class ChangeListGetObjectIdentifiersOut  implements java.io.Serializable {
    private java.lang.String[] partyID;

    private types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] businessSystemID;

    private types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] businessComponentID;

    private types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] integrationProcessID;

    private types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelID;

    private types.api.server.ibdir.aii.sap.com.MessageHeaderID[] senderAgreementID;

    private types.api.server.ibdir.aii.sap.com.MessageHeaderID[] receiverAgreementID;

    private types.api.server.ibdir.aii.sap.com.MessageHeaderID[] receiverDeterminationID;

    private types.api.server.ibdir.aii.sap.com.MessageHeaderID[] interfaceDeterminationID;

    private java.lang.String[] valueMappingID;

    private java.lang.String[] configurationScenarioID;

    private types.api.server.ibdir.aii.sap.com.LogMessageCollection logMessageCollection;

    public ChangeListGetObjectIdentifiersOut() {
    }

    public ChangeListGetObjectIdentifiersOut(
           java.lang.String[] partyID,
           types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] businessSystemID,
           types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] businessComponentID,
           types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] integrationProcessID,
           types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] communicationChannelID,
           types.api.server.ibdir.aii.sap.com.MessageHeaderID[] senderAgreementID,
           types.api.server.ibdir.aii.sap.com.MessageHeaderID[] receiverAgreementID,
           types.api.server.ibdir.aii.sap.com.MessageHeaderID[] receiverDeterminationID,
           types.api.server.ibdir.aii.sap.com.MessageHeaderID[] interfaceDeterminationID,
           java.lang.String[] valueMappingID,
           java.lang.String[] configurationScenarioID,
           types.api.server.ibdir.aii.sap.com.LogMessageCollection logMessageCollection) {
           this.partyID = partyID;
           this.businessSystemID = businessSystemID;
           this.businessComponentID = businessComponentID;
           this.integrationProcessID = integrationProcessID;
           this.communicationChannelID = communicationChannelID;
           this.senderAgreementID = senderAgreementID;
           this.receiverAgreementID = receiverAgreementID;
           this.receiverDeterminationID = receiverDeterminationID;
           this.interfaceDeterminationID = interfaceDeterminationID;
           this.valueMappingID = valueMappingID;
           this.configurationScenarioID = configurationScenarioID;
           this.logMessageCollection = logMessageCollection;
    }


    /**
     * Gets the partyID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return partyID
     */
    public java.lang.String[] getPartyID() {
        return partyID;
    }


    /**
     * Sets the partyID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param partyID
     */
    public void setPartyID(java.lang.String[] partyID) {
        this.partyID = partyID;
    }

    public java.lang.String getPartyID(int i) {
        return this.partyID[i];
    }

    public void setPartyID(int i, java.lang.String _value) {
        this.partyID[i] = _value;
    }


    /**
     * Gets the businessSystemID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return businessSystemID
     */
    public types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] getBusinessSystemID() {
        return businessSystemID;
    }


    /**
     * Sets the businessSystemID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param businessSystemID
     */
    public void setBusinessSystemID(types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] businessSystemID) {
        this.businessSystemID = businessSystemID;
    }

    public types.api.server.ibdir.aii.sap.com.CommunicationComponentID getBusinessSystemID(int i) {
        return this.businessSystemID[i];
    }

    public void setBusinessSystemID(int i, types.api.server.ibdir.aii.sap.com.CommunicationComponentID _value) {
        this.businessSystemID[i] = _value;
    }


    /**
     * Gets the businessComponentID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return businessComponentID
     */
    public types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] getBusinessComponentID() {
        return businessComponentID;
    }


    /**
     * Sets the businessComponentID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param businessComponentID
     */
    public void setBusinessComponentID(types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] businessComponentID) {
        this.businessComponentID = businessComponentID;
    }

    public types.api.server.ibdir.aii.sap.com.CommunicationComponentID getBusinessComponentID(int i) {
        return this.businessComponentID[i];
    }

    public void setBusinessComponentID(int i, types.api.server.ibdir.aii.sap.com.CommunicationComponentID _value) {
        this.businessComponentID[i] = _value;
    }


    /**
     * Gets the integrationProcessID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return integrationProcessID
     */
    public types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] getIntegrationProcessID() {
        return integrationProcessID;
    }


    /**
     * Sets the integrationProcessID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param integrationProcessID
     */
    public void setIntegrationProcessID(types.api.server.ibdir.aii.sap.com.CommunicationComponentID[] integrationProcessID) {
        this.integrationProcessID = integrationProcessID;
    }

    public types.api.server.ibdir.aii.sap.com.CommunicationComponentID getIntegrationProcessID(int i) {
        return this.integrationProcessID[i];
    }

    public void setIntegrationProcessID(int i, types.api.server.ibdir.aii.sap.com.CommunicationComponentID _value) {
        this.integrationProcessID[i] = _value;
    }


    /**
     * Gets the communicationChannelID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return communicationChannelID
     */
    public types.api.server.ibdir.aii.sap.com.CommunicationChannelID[] getCommunicationChannelID() {
        return communicationChannelID;
    }


    /**
     * Sets the communicationChannelID value for this ChangeListGetObjectIdentifiersOut.
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
     * Gets the senderAgreementID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return senderAgreementID
     */
    public types.api.server.ibdir.aii.sap.com.MessageHeaderID[] getSenderAgreementID() {
        return senderAgreementID;
    }


    /**
     * Sets the senderAgreementID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param senderAgreementID
     */
    public void setSenderAgreementID(types.api.server.ibdir.aii.sap.com.MessageHeaderID[] senderAgreementID) {
        this.senderAgreementID = senderAgreementID;
    }

    public types.api.server.ibdir.aii.sap.com.MessageHeaderID getSenderAgreementID(int i) {
        return this.senderAgreementID[i];
    }

    public void setSenderAgreementID(int i, types.api.server.ibdir.aii.sap.com.MessageHeaderID _value) {
        this.senderAgreementID[i] = _value;
    }


    /**
     * Gets the receiverAgreementID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return receiverAgreementID
     */
    public types.api.server.ibdir.aii.sap.com.MessageHeaderID[] getReceiverAgreementID() {
        return receiverAgreementID;
    }


    /**
     * Sets the receiverAgreementID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param receiverAgreementID
     */
    public void setReceiverAgreementID(types.api.server.ibdir.aii.sap.com.MessageHeaderID[] receiverAgreementID) {
        this.receiverAgreementID = receiverAgreementID;
    }

    public types.api.server.ibdir.aii.sap.com.MessageHeaderID getReceiverAgreementID(int i) {
        return this.receiverAgreementID[i];
    }

    public void setReceiverAgreementID(int i, types.api.server.ibdir.aii.sap.com.MessageHeaderID _value) {
        this.receiverAgreementID[i] = _value;
    }


    /**
     * Gets the receiverDeterminationID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return receiverDeterminationID
     */
    public types.api.server.ibdir.aii.sap.com.MessageHeaderID[] getReceiverDeterminationID() {
        return receiverDeterminationID;
    }


    /**
     * Sets the receiverDeterminationID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param receiverDeterminationID
     */
    public void setReceiverDeterminationID(types.api.server.ibdir.aii.sap.com.MessageHeaderID[] receiverDeterminationID) {
        this.receiverDeterminationID = receiverDeterminationID;
    }

    public types.api.server.ibdir.aii.sap.com.MessageHeaderID getReceiverDeterminationID(int i) {
        return this.receiverDeterminationID[i];
    }

    public void setReceiverDeterminationID(int i, types.api.server.ibdir.aii.sap.com.MessageHeaderID _value) {
        this.receiverDeterminationID[i] = _value;
    }


    /**
     * Gets the interfaceDeterminationID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return interfaceDeterminationID
     */
    public types.api.server.ibdir.aii.sap.com.MessageHeaderID[] getInterfaceDeterminationID() {
        return interfaceDeterminationID;
    }


    /**
     * Sets the interfaceDeterminationID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param interfaceDeterminationID
     */
    public void setInterfaceDeterminationID(types.api.server.ibdir.aii.sap.com.MessageHeaderID[] interfaceDeterminationID) {
        this.interfaceDeterminationID = interfaceDeterminationID;
    }

    public types.api.server.ibdir.aii.sap.com.MessageHeaderID getInterfaceDeterminationID(int i) {
        return this.interfaceDeterminationID[i];
    }

    public void setInterfaceDeterminationID(int i, types.api.server.ibdir.aii.sap.com.MessageHeaderID _value) {
        this.interfaceDeterminationID[i] = _value;
    }


    /**
     * Gets the valueMappingID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return valueMappingID
     */
    public java.lang.String[] getValueMappingID() {
        return valueMappingID;
    }


    /**
     * Sets the valueMappingID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param valueMappingID
     */
    public void setValueMappingID(java.lang.String[] valueMappingID) {
        this.valueMappingID = valueMappingID;
    }

    public java.lang.String getValueMappingID(int i) {
        return this.valueMappingID[i];
    }

    public void setValueMappingID(int i, java.lang.String _value) {
        this.valueMappingID[i] = _value;
    }


    /**
     * Gets the configurationScenarioID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return configurationScenarioID
     */
    public java.lang.String[] getConfigurationScenarioID() {
        return configurationScenarioID;
    }


    /**
     * Sets the configurationScenarioID value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param configurationScenarioID
     */
    public void setConfigurationScenarioID(java.lang.String[] configurationScenarioID) {
        this.configurationScenarioID = configurationScenarioID;
    }

    public java.lang.String getConfigurationScenarioID(int i) {
        return this.configurationScenarioID[i];
    }

    public void setConfigurationScenarioID(int i, java.lang.String _value) {
        this.configurationScenarioID[i] = _value;
    }


    /**
     * Gets the logMessageCollection value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @return logMessageCollection
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageCollection getLogMessageCollection() {
        return logMessageCollection;
    }


    /**
     * Sets the logMessageCollection value for this ChangeListGetObjectIdentifiersOut.
     * 
     * @param logMessageCollection
     */
    public void setLogMessageCollection(types.api.server.ibdir.aii.sap.com.LogMessageCollection logMessageCollection) {
        this.logMessageCollection = logMessageCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeListGetObjectIdentifiersOut)) return false;
        ChangeListGetObjectIdentifiersOut other = (ChangeListGetObjectIdentifiersOut) obj;
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
              java.util.Arrays.equals(this.partyID, other.getPartyID()))) &&
            ((this.businessSystemID==null && other.getBusinessSystemID()==null) || 
             (this.businessSystemID!=null &&
              java.util.Arrays.equals(this.businessSystemID, other.getBusinessSystemID()))) &&
            ((this.businessComponentID==null && other.getBusinessComponentID()==null) || 
             (this.businessComponentID!=null &&
              java.util.Arrays.equals(this.businessComponentID, other.getBusinessComponentID()))) &&
            ((this.integrationProcessID==null && other.getIntegrationProcessID()==null) || 
             (this.integrationProcessID!=null &&
              java.util.Arrays.equals(this.integrationProcessID, other.getIntegrationProcessID()))) &&
            ((this.communicationChannelID==null && other.getCommunicationChannelID()==null) || 
             (this.communicationChannelID!=null &&
              java.util.Arrays.equals(this.communicationChannelID, other.getCommunicationChannelID()))) &&
            ((this.senderAgreementID==null && other.getSenderAgreementID()==null) || 
             (this.senderAgreementID!=null &&
              java.util.Arrays.equals(this.senderAgreementID, other.getSenderAgreementID()))) &&
            ((this.receiverAgreementID==null && other.getReceiverAgreementID()==null) || 
             (this.receiverAgreementID!=null &&
              java.util.Arrays.equals(this.receiverAgreementID, other.getReceiverAgreementID()))) &&
            ((this.receiverDeterminationID==null && other.getReceiverDeterminationID()==null) || 
             (this.receiverDeterminationID!=null &&
              java.util.Arrays.equals(this.receiverDeterminationID, other.getReceiverDeterminationID()))) &&
            ((this.interfaceDeterminationID==null && other.getInterfaceDeterminationID()==null) || 
             (this.interfaceDeterminationID!=null &&
              java.util.Arrays.equals(this.interfaceDeterminationID, other.getInterfaceDeterminationID()))) &&
            ((this.valueMappingID==null && other.getValueMappingID()==null) || 
             (this.valueMappingID!=null &&
              java.util.Arrays.equals(this.valueMappingID, other.getValueMappingID()))) &&
            ((this.configurationScenarioID==null && other.getConfigurationScenarioID()==null) || 
             (this.configurationScenarioID!=null &&
              java.util.Arrays.equals(this.configurationScenarioID, other.getConfigurationScenarioID()))) &&
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
        if (getPartyID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartyID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartyID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBusinessSystemID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessSystemID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessSystemID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBusinessComponentID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessComponentID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessComponentID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntegrationProcessID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntegrationProcessID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntegrationProcessID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getSenderAgreementID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSenderAgreementID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSenderAgreementID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiverAgreementID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverAgreementID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverAgreementID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiverDeterminationID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverDeterminationID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverDeterminationID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInterfaceDeterminationID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterfaceDeterminationID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterfaceDeterminationID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValueMappingID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueMappingID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueMappingID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfigurationScenarioID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigurationScenarioID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigurationScenarioID(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeListGetObjectIdentifiersOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListGetObjectIdentifiersOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "PartyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessSystemID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "BusinessSystemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationComponentID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessComponentID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "BusinessComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationComponentID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrationProcessID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "IntegrationProcessID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "CommunicationComponentID"));
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
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAgreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "SenderAgreementID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "MessageHeaderID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverAgreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ReceiverAgreementID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "MessageHeaderID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverDeterminationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ReceiverDeterminationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "MessageHeaderID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceDeterminationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "InterfaceDeterminationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "MessageHeaderID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueMappingID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ValueMappingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationScenarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ConfigurationScenarioID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
