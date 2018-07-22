/**
 * LogMessageCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class LogMessageCollection  implements java.io.Serializable {
    private types.api.server.ibdir.aii.sap.com.LogMessage[] logMessage;

    private types.api.server.ibdir.aii.sap.com.LogMessageChangeList[] logMessageChangeList;

    private types.api.server.ibdir.aii.sap.com.LogMessageParty[] logMessageParty;

    private types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] logMessageBusinessSystem;

    private types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] logMessageBusinessComponent;

    private types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] logMessageIntegrationProcess;

    private types.api.server.ibdir.aii.sap.com.LogMessageCommunicationChannel[] logMessageCommunicationChannel;

    private types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageSenderAgreement;

    private types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageReceiverAgreement;

    private types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageInterfaceDetermination;

    private types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageReceiverDetermination;

    private types.api.server.ibdir.aii.sap.com.LogMessageValueMapping[] logMessageValueMapping;

    private types.api.server.ibdir.aii.sap.com.LogMessageConfigurationScenario[] logMessageConfigurationScenario;

    public LogMessageCollection() {
    }

    public LogMessageCollection(
           types.api.server.ibdir.aii.sap.com.LogMessage[] logMessage,
           types.api.server.ibdir.aii.sap.com.LogMessageChangeList[] logMessageChangeList,
           types.api.server.ibdir.aii.sap.com.LogMessageParty[] logMessageParty,
           types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] logMessageBusinessSystem,
           types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] logMessageBusinessComponent,
           types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] logMessageIntegrationProcess,
           types.api.server.ibdir.aii.sap.com.LogMessageCommunicationChannel[] logMessageCommunicationChannel,
           types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageSenderAgreement,
           types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageReceiverAgreement,
           types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageInterfaceDetermination,
           types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageReceiverDetermination,
           types.api.server.ibdir.aii.sap.com.LogMessageValueMapping[] logMessageValueMapping,
           types.api.server.ibdir.aii.sap.com.LogMessageConfigurationScenario[] logMessageConfigurationScenario) {
           this.logMessage = logMessage;
           this.logMessageChangeList = logMessageChangeList;
           this.logMessageParty = logMessageParty;
           this.logMessageBusinessSystem = logMessageBusinessSystem;
           this.logMessageBusinessComponent = logMessageBusinessComponent;
           this.logMessageIntegrationProcess = logMessageIntegrationProcess;
           this.logMessageCommunicationChannel = logMessageCommunicationChannel;
           this.logMessageSenderAgreement = logMessageSenderAgreement;
           this.logMessageReceiverAgreement = logMessageReceiverAgreement;
           this.logMessageInterfaceDetermination = logMessageInterfaceDetermination;
           this.logMessageReceiverDetermination = logMessageReceiverDetermination;
           this.logMessageValueMapping = logMessageValueMapping;
           this.logMessageConfigurationScenario = logMessageConfigurationScenario;
    }


    /**
     * Gets the logMessage value for this LogMessageCollection.
     * 
     * @return logMessage
     */
    public types.api.server.ibdir.aii.sap.com.LogMessage[] getLogMessage() {
        return logMessage;
    }


    /**
     * Sets the logMessage value for this LogMessageCollection.
     * 
     * @param logMessage
     */
    public void setLogMessage(types.api.server.ibdir.aii.sap.com.LogMessage[] logMessage) {
        this.logMessage = logMessage;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessage getLogMessage(int i) {
        return this.logMessage[i];
    }

    public void setLogMessage(int i, types.api.server.ibdir.aii.sap.com.LogMessage _value) {
        this.logMessage[i] = _value;
    }


    /**
     * Gets the logMessageChangeList value for this LogMessageCollection.
     * 
     * @return logMessageChangeList
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageChangeList[] getLogMessageChangeList() {
        return logMessageChangeList;
    }


    /**
     * Sets the logMessageChangeList value for this LogMessageCollection.
     * 
     * @param logMessageChangeList
     */
    public void setLogMessageChangeList(types.api.server.ibdir.aii.sap.com.LogMessageChangeList[] logMessageChangeList) {
        this.logMessageChangeList = logMessageChangeList;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageChangeList getLogMessageChangeList(int i) {
        return this.logMessageChangeList[i];
    }

    public void setLogMessageChangeList(int i, types.api.server.ibdir.aii.sap.com.LogMessageChangeList _value) {
        this.logMessageChangeList[i] = _value;
    }


    /**
     * Gets the logMessageParty value for this LogMessageCollection.
     * 
     * @return logMessageParty
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageParty[] getLogMessageParty() {
        return logMessageParty;
    }


    /**
     * Sets the logMessageParty value for this LogMessageCollection.
     * 
     * @param logMessageParty
     */
    public void setLogMessageParty(types.api.server.ibdir.aii.sap.com.LogMessageParty[] logMessageParty) {
        this.logMessageParty = logMessageParty;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageParty getLogMessageParty(int i) {
        return this.logMessageParty[i];
    }

    public void setLogMessageParty(int i, types.api.server.ibdir.aii.sap.com.LogMessageParty _value) {
        this.logMessageParty[i] = _value;
    }


    /**
     * Gets the logMessageBusinessSystem value for this LogMessageCollection.
     * 
     * @return logMessageBusinessSystem
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] getLogMessageBusinessSystem() {
        return logMessageBusinessSystem;
    }


    /**
     * Sets the logMessageBusinessSystem value for this LogMessageCollection.
     * 
     * @param logMessageBusinessSystem
     */
    public void setLogMessageBusinessSystem(types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] logMessageBusinessSystem) {
        this.logMessageBusinessSystem = logMessageBusinessSystem;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent getLogMessageBusinessSystem(int i) {
        return this.logMessageBusinessSystem[i];
    }

    public void setLogMessageBusinessSystem(int i, types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent _value) {
        this.logMessageBusinessSystem[i] = _value;
    }


    /**
     * Gets the logMessageBusinessComponent value for this LogMessageCollection.
     * 
     * @return logMessageBusinessComponent
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] getLogMessageBusinessComponent() {
        return logMessageBusinessComponent;
    }


    /**
     * Sets the logMessageBusinessComponent value for this LogMessageCollection.
     * 
     * @param logMessageBusinessComponent
     */
    public void setLogMessageBusinessComponent(types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] logMessageBusinessComponent) {
        this.logMessageBusinessComponent = logMessageBusinessComponent;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent getLogMessageBusinessComponent(int i) {
        return this.logMessageBusinessComponent[i];
    }

    public void setLogMessageBusinessComponent(int i, types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent _value) {
        this.logMessageBusinessComponent[i] = _value;
    }


    /**
     * Gets the logMessageIntegrationProcess value for this LogMessageCollection.
     * 
     * @return logMessageIntegrationProcess
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] getLogMessageIntegrationProcess() {
        return logMessageIntegrationProcess;
    }


    /**
     * Sets the logMessageIntegrationProcess value for this LogMessageCollection.
     * 
     * @param logMessageIntegrationProcess
     */
    public void setLogMessageIntegrationProcess(types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent[] logMessageIntegrationProcess) {
        this.logMessageIntegrationProcess = logMessageIntegrationProcess;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent getLogMessageIntegrationProcess(int i) {
        return this.logMessageIntegrationProcess[i];
    }

    public void setLogMessageIntegrationProcess(int i, types.api.server.ibdir.aii.sap.com.LogMessageCommunicationComponent _value) {
        this.logMessageIntegrationProcess[i] = _value;
    }


    /**
     * Gets the logMessageCommunicationChannel value for this LogMessageCollection.
     * 
     * @return logMessageCommunicationChannel
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageCommunicationChannel[] getLogMessageCommunicationChannel() {
        return logMessageCommunicationChannel;
    }


    /**
     * Sets the logMessageCommunicationChannel value for this LogMessageCollection.
     * 
     * @param logMessageCommunicationChannel
     */
    public void setLogMessageCommunicationChannel(types.api.server.ibdir.aii.sap.com.LogMessageCommunicationChannel[] logMessageCommunicationChannel) {
        this.logMessageCommunicationChannel = logMessageCommunicationChannel;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageCommunicationChannel getLogMessageCommunicationChannel(int i) {
        return this.logMessageCommunicationChannel[i];
    }

    public void setLogMessageCommunicationChannel(int i, types.api.server.ibdir.aii.sap.com.LogMessageCommunicationChannel _value) {
        this.logMessageCommunicationChannel[i] = _value;
    }


    /**
     * Gets the logMessageSenderAgreement value for this LogMessageCollection.
     * 
     * @return logMessageSenderAgreement
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] getLogMessageSenderAgreement() {
        return logMessageSenderAgreement;
    }


    /**
     * Sets the logMessageSenderAgreement value for this LogMessageCollection.
     * 
     * @param logMessageSenderAgreement
     */
    public void setLogMessageSenderAgreement(types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageSenderAgreement) {
        this.logMessageSenderAgreement = logMessageSenderAgreement;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader getLogMessageSenderAgreement(int i) {
        return this.logMessageSenderAgreement[i];
    }

    public void setLogMessageSenderAgreement(int i, types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader _value) {
        this.logMessageSenderAgreement[i] = _value;
    }


    /**
     * Gets the logMessageReceiverAgreement value for this LogMessageCollection.
     * 
     * @return logMessageReceiverAgreement
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] getLogMessageReceiverAgreement() {
        return logMessageReceiverAgreement;
    }


    /**
     * Sets the logMessageReceiverAgreement value for this LogMessageCollection.
     * 
     * @param logMessageReceiverAgreement
     */
    public void setLogMessageReceiverAgreement(types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageReceiverAgreement) {
        this.logMessageReceiverAgreement = logMessageReceiverAgreement;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader getLogMessageReceiverAgreement(int i) {
        return this.logMessageReceiverAgreement[i];
    }

    public void setLogMessageReceiverAgreement(int i, types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader _value) {
        this.logMessageReceiverAgreement[i] = _value;
    }


    /**
     * Gets the logMessageInterfaceDetermination value for this LogMessageCollection.
     * 
     * @return logMessageInterfaceDetermination
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] getLogMessageInterfaceDetermination() {
        return logMessageInterfaceDetermination;
    }


    /**
     * Sets the logMessageInterfaceDetermination value for this LogMessageCollection.
     * 
     * @param logMessageInterfaceDetermination
     */
    public void setLogMessageInterfaceDetermination(types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageInterfaceDetermination) {
        this.logMessageInterfaceDetermination = logMessageInterfaceDetermination;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader getLogMessageInterfaceDetermination(int i) {
        return this.logMessageInterfaceDetermination[i];
    }

    public void setLogMessageInterfaceDetermination(int i, types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader _value) {
        this.logMessageInterfaceDetermination[i] = _value;
    }


    /**
     * Gets the logMessageReceiverDetermination value for this LogMessageCollection.
     * 
     * @return logMessageReceiverDetermination
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] getLogMessageReceiverDetermination() {
        return logMessageReceiverDetermination;
    }


    /**
     * Sets the logMessageReceiverDetermination value for this LogMessageCollection.
     * 
     * @param logMessageReceiverDetermination
     */
    public void setLogMessageReceiverDetermination(types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader[] logMessageReceiverDetermination) {
        this.logMessageReceiverDetermination = logMessageReceiverDetermination;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader getLogMessageReceiverDetermination(int i) {
        return this.logMessageReceiverDetermination[i];
    }

    public void setLogMessageReceiverDetermination(int i, types.api.server.ibdir.aii.sap.com.LogMessageMessageHeader _value) {
        this.logMessageReceiverDetermination[i] = _value;
    }


    /**
     * Gets the logMessageValueMapping value for this LogMessageCollection.
     * 
     * @return logMessageValueMapping
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageValueMapping[] getLogMessageValueMapping() {
        return logMessageValueMapping;
    }


    /**
     * Sets the logMessageValueMapping value for this LogMessageCollection.
     * 
     * @param logMessageValueMapping
     */
    public void setLogMessageValueMapping(types.api.server.ibdir.aii.sap.com.LogMessageValueMapping[] logMessageValueMapping) {
        this.logMessageValueMapping = logMessageValueMapping;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageValueMapping getLogMessageValueMapping(int i) {
        return this.logMessageValueMapping[i];
    }

    public void setLogMessageValueMapping(int i, types.api.server.ibdir.aii.sap.com.LogMessageValueMapping _value) {
        this.logMessageValueMapping[i] = _value;
    }


    /**
     * Gets the logMessageConfigurationScenario value for this LogMessageCollection.
     * 
     * @return logMessageConfigurationScenario
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageConfigurationScenario[] getLogMessageConfigurationScenario() {
        return logMessageConfigurationScenario;
    }


    /**
     * Sets the logMessageConfigurationScenario value for this LogMessageCollection.
     * 
     * @param logMessageConfigurationScenario
     */
    public void setLogMessageConfigurationScenario(types.api.server.ibdir.aii.sap.com.LogMessageConfigurationScenario[] logMessageConfigurationScenario) {
        this.logMessageConfigurationScenario = logMessageConfigurationScenario;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageConfigurationScenario getLogMessageConfigurationScenario(int i) {
        return this.logMessageConfigurationScenario[i];
    }

    public void setLogMessageConfigurationScenario(int i, types.api.server.ibdir.aii.sap.com.LogMessageConfigurationScenario _value) {
        this.logMessageConfigurationScenario[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogMessageCollection)) return false;
        LogMessageCollection other = (LogMessageCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logMessage==null && other.getLogMessage()==null) || 
             (this.logMessage!=null &&
              java.util.Arrays.equals(this.logMessage, other.getLogMessage()))) &&
            ((this.logMessageChangeList==null && other.getLogMessageChangeList()==null) || 
             (this.logMessageChangeList!=null &&
              java.util.Arrays.equals(this.logMessageChangeList, other.getLogMessageChangeList()))) &&
            ((this.logMessageParty==null && other.getLogMessageParty()==null) || 
             (this.logMessageParty!=null &&
              java.util.Arrays.equals(this.logMessageParty, other.getLogMessageParty()))) &&
            ((this.logMessageBusinessSystem==null && other.getLogMessageBusinessSystem()==null) || 
             (this.logMessageBusinessSystem!=null &&
              java.util.Arrays.equals(this.logMessageBusinessSystem, other.getLogMessageBusinessSystem()))) &&
            ((this.logMessageBusinessComponent==null && other.getLogMessageBusinessComponent()==null) || 
             (this.logMessageBusinessComponent!=null &&
              java.util.Arrays.equals(this.logMessageBusinessComponent, other.getLogMessageBusinessComponent()))) &&
            ((this.logMessageIntegrationProcess==null && other.getLogMessageIntegrationProcess()==null) || 
             (this.logMessageIntegrationProcess!=null &&
              java.util.Arrays.equals(this.logMessageIntegrationProcess, other.getLogMessageIntegrationProcess()))) &&
            ((this.logMessageCommunicationChannel==null && other.getLogMessageCommunicationChannel()==null) || 
             (this.logMessageCommunicationChannel!=null &&
              java.util.Arrays.equals(this.logMessageCommunicationChannel, other.getLogMessageCommunicationChannel()))) &&
            ((this.logMessageSenderAgreement==null && other.getLogMessageSenderAgreement()==null) || 
             (this.logMessageSenderAgreement!=null &&
              java.util.Arrays.equals(this.logMessageSenderAgreement, other.getLogMessageSenderAgreement()))) &&
            ((this.logMessageReceiverAgreement==null && other.getLogMessageReceiverAgreement()==null) || 
             (this.logMessageReceiverAgreement!=null &&
              java.util.Arrays.equals(this.logMessageReceiverAgreement, other.getLogMessageReceiverAgreement()))) &&
            ((this.logMessageInterfaceDetermination==null && other.getLogMessageInterfaceDetermination()==null) || 
             (this.logMessageInterfaceDetermination!=null &&
              java.util.Arrays.equals(this.logMessageInterfaceDetermination, other.getLogMessageInterfaceDetermination()))) &&
            ((this.logMessageReceiverDetermination==null && other.getLogMessageReceiverDetermination()==null) || 
             (this.logMessageReceiverDetermination!=null &&
              java.util.Arrays.equals(this.logMessageReceiverDetermination, other.getLogMessageReceiverDetermination()))) &&
            ((this.logMessageValueMapping==null && other.getLogMessageValueMapping()==null) || 
             (this.logMessageValueMapping!=null &&
              java.util.Arrays.equals(this.logMessageValueMapping, other.getLogMessageValueMapping()))) &&
            ((this.logMessageConfigurationScenario==null && other.getLogMessageConfigurationScenario()==null) || 
             (this.logMessageConfigurationScenario!=null &&
              java.util.Arrays.equals(this.logMessageConfigurationScenario, other.getLogMessageConfigurationScenario())));
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
        if (getLogMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageChangeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageChangeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageChangeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageParty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageParty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageParty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageBusinessSystem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageBusinessSystem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageBusinessSystem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageBusinessComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageBusinessComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageBusinessComponent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageIntegrationProcess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageIntegrationProcess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageIntegrationProcess(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageCommunicationChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageCommunicationChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageCommunicationChannel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageSenderAgreement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageSenderAgreement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageSenderAgreement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageReceiverAgreement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageReceiverAgreement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageReceiverAgreement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageInterfaceDetermination() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageInterfaceDetermination());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageInterfaceDetermination(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageReceiverDetermination() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageReceiverDetermination());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageReceiverDetermination(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageValueMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageValueMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageValueMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageConfigurationScenario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageConfigurationScenario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageConfigurationScenario(), i);
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
        new org.apache.axis.description.TypeDesc(LogMessageCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageChangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageChangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageChangeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageParty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageParty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageBusinessSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageBusinessSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCommunicationComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageBusinessComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageBusinessComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCommunicationComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageIntegrationProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageIntegrationProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCommunicationComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageCommunicationChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCommunicationChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageCommunicationChannel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageSenderAgreement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageSenderAgreement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageMessageHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageReceiverAgreement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageReceiverAgreement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageMessageHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageInterfaceDetermination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageInterfaceDetermination"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageMessageHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageReceiverDetermination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageReceiverDetermination"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageMessageHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageValueMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageValueMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageValueMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageConfigurationScenario");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageConfigurationScenario"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageConfigurationScenario"));
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
