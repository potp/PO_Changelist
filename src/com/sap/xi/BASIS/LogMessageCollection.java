/**
 * LogMessageCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap.xi.BASIS;

public class LogMessageCollection  implements java.io.Serializable {
    private com.sap.xi.BASIS.LogMessage[] logMessage;

    private com.sap.xi.BASIS.LogMessageChangeList[] logMessageChangeList;

    private com.sap.xi.BASIS.LogMessageCommunicationParty[] logMessageParty;

    private com.sap.xi.BASIS.LogMessageProcessComponent[] logMessageProcessComponent;

    private com.sap.xi.BASIS.LogMessageCommunicationComponent[] logMessageBusinessSystem;

    private com.sap.xi.BASIS.LogMessageCommunicationComponent[] logMessageBusinessComponent;

    private com.sap.xi.BASIS.LogMessageCommunicationComponent[] logMessageIntegrationProcess;

    private com.sap.xi.BASIS.LogMessageCommunicationChannel[] logMessageCommunicationChannel;

    private com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageSenderAgreement;

    private com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageReceiverAgreement;

    private com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageDirectConnection;

    private com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageIntegratedConfiguration;

    private com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageReceiverDetermination;

    private com.sap.xi.BASIS.LogMessageReceiverRule[] logMessageReceiverRule;

    private com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageInterfaceDetermination;

    private com.sap.xi.BASIS.LogMessageValueMapping[] logMessageValueMapping;

    private com.sap.xi.BASIS.LogMessageConfigurationScenario[] logMessageConfigurationScenario;

    public LogMessageCollection() {
    }

    public LogMessageCollection(
           com.sap.xi.BASIS.LogMessage[] logMessage,
           com.sap.xi.BASIS.LogMessageChangeList[] logMessageChangeList,
           com.sap.xi.BASIS.LogMessageCommunicationParty[] logMessageParty,
           com.sap.xi.BASIS.LogMessageProcessComponent[] logMessageProcessComponent,
           com.sap.xi.BASIS.LogMessageCommunicationComponent[] logMessageBusinessSystem,
           com.sap.xi.BASIS.LogMessageCommunicationComponent[] logMessageBusinessComponent,
           com.sap.xi.BASIS.LogMessageCommunicationComponent[] logMessageIntegrationProcess,
           com.sap.xi.BASIS.LogMessageCommunicationChannel[] logMessageCommunicationChannel,
           com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageSenderAgreement,
           com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageReceiverAgreement,
           com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageDirectConnection,
           com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageIntegratedConfiguration,
           com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageReceiverDetermination,
           com.sap.xi.BASIS.LogMessageReceiverRule[] logMessageReceiverRule,
           com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageInterfaceDetermination,
           com.sap.xi.BASIS.LogMessageValueMapping[] logMessageValueMapping,
           com.sap.xi.BASIS.LogMessageConfigurationScenario[] logMessageConfigurationScenario) {
           this.logMessage = logMessage;
           this.logMessageChangeList = logMessageChangeList;
           this.logMessageParty = logMessageParty;
           this.logMessageProcessComponent = logMessageProcessComponent;
           this.logMessageBusinessSystem = logMessageBusinessSystem;
           this.logMessageBusinessComponent = logMessageBusinessComponent;
           this.logMessageIntegrationProcess = logMessageIntegrationProcess;
           this.logMessageCommunicationChannel = logMessageCommunicationChannel;
           this.logMessageSenderAgreement = logMessageSenderAgreement;
           this.logMessageReceiverAgreement = logMessageReceiverAgreement;
           this.logMessageDirectConnection = logMessageDirectConnection;
           this.logMessageIntegratedConfiguration = logMessageIntegratedConfiguration;
           this.logMessageReceiverDetermination = logMessageReceiverDetermination;
           this.logMessageReceiverRule = logMessageReceiverRule;
           this.logMessageInterfaceDetermination = logMessageInterfaceDetermination;
           this.logMessageValueMapping = logMessageValueMapping;
           this.logMessageConfigurationScenario = logMessageConfigurationScenario;
    }


    /**
     * Gets the logMessage value for this LogMessageCollection.
     * 
     * @return logMessage
     */
    public com.sap.xi.BASIS.LogMessage[] getLogMessage() {
        return logMessage;
    }


    /**
     * Sets the logMessage value for this LogMessageCollection.
     * 
     * @param logMessage
     */
    public void setLogMessage(com.sap.xi.BASIS.LogMessage[] logMessage) {
        this.logMessage = logMessage;
    }

    public com.sap.xi.BASIS.LogMessage getLogMessage(int i) {
        return this.logMessage[i];
    }

    public void setLogMessage(int i, com.sap.xi.BASIS.LogMessage _value) {
        this.logMessage[i] = _value;
    }


    /**
     * Gets the logMessageChangeList value for this LogMessageCollection.
     * 
     * @return logMessageChangeList
     */
    public com.sap.xi.BASIS.LogMessageChangeList[] getLogMessageChangeList() {
        return logMessageChangeList;
    }


    /**
     * Sets the logMessageChangeList value for this LogMessageCollection.
     * 
     * @param logMessageChangeList
     */
    public void setLogMessageChangeList(com.sap.xi.BASIS.LogMessageChangeList[] logMessageChangeList) {
        this.logMessageChangeList = logMessageChangeList;
    }

    public com.sap.xi.BASIS.LogMessageChangeList getLogMessageChangeList(int i) {
        return this.logMessageChangeList[i];
    }

    public void setLogMessageChangeList(int i, com.sap.xi.BASIS.LogMessageChangeList _value) {
        this.logMessageChangeList[i] = _value;
    }


    /**
     * Gets the logMessageParty value for this LogMessageCollection.
     * 
     * @return logMessageParty
     */
    public com.sap.xi.BASIS.LogMessageCommunicationParty[] getLogMessageParty() {
        return logMessageParty;
    }


    /**
     * Sets the logMessageParty value for this LogMessageCollection.
     * 
     * @param logMessageParty
     */
    public void setLogMessageParty(com.sap.xi.BASIS.LogMessageCommunicationParty[] logMessageParty) {
        this.logMessageParty = logMessageParty;
    }

    public com.sap.xi.BASIS.LogMessageCommunicationParty getLogMessageParty(int i) {
        return this.logMessageParty[i];
    }

    public void setLogMessageParty(int i, com.sap.xi.BASIS.LogMessageCommunicationParty _value) {
        this.logMessageParty[i] = _value;
    }


    /**
     * Gets the logMessageProcessComponent value for this LogMessageCollection.
     * 
     * @return logMessageProcessComponent
     */
    public com.sap.xi.BASIS.LogMessageProcessComponent[] getLogMessageProcessComponent() {
        return logMessageProcessComponent;
    }


    /**
     * Sets the logMessageProcessComponent value for this LogMessageCollection.
     * 
     * @param logMessageProcessComponent
     */
    public void setLogMessageProcessComponent(com.sap.xi.BASIS.LogMessageProcessComponent[] logMessageProcessComponent) {
        this.logMessageProcessComponent = logMessageProcessComponent;
    }

    public com.sap.xi.BASIS.LogMessageProcessComponent getLogMessageProcessComponent(int i) {
        return this.logMessageProcessComponent[i];
    }

    public void setLogMessageProcessComponent(int i, com.sap.xi.BASIS.LogMessageProcessComponent _value) {
        this.logMessageProcessComponent[i] = _value;
    }


    /**
     * Gets the logMessageBusinessSystem value for this LogMessageCollection.
     * 
     * @return logMessageBusinessSystem
     */
    public com.sap.xi.BASIS.LogMessageCommunicationComponent[] getLogMessageBusinessSystem() {
        return logMessageBusinessSystem;
    }


    /**
     * Sets the logMessageBusinessSystem value for this LogMessageCollection.
     * 
     * @param logMessageBusinessSystem
     */
    public void setLogMessageBusinessSystem(com.sap.xi.BASIS.LogMessageCommunicationComponent[] logMessageBusinessSystem) {
        this.logMessageBusinessSystem = logMessageBusinessSystem;
    }

    public com.sap.xi.BASIS.LogMessageCommunicationComponent getLogMessageBusinessSystem(int i) {
        return this.logMessageBusinessSystem[i];
    }

    public void setLogMessageBusinessSystem(int i, com.sap.xi.BASIS.LogMessageCommunicationComponent _value) {
        this.logMessageBusinessSystem[i] = _value;
    }


    /**
     * Gets the logMessageBusinessComponent value for this LogMessageCollection.
     * 
     * @return logMessageBusinessComponent
     */
    public com.sap.xi.BASIS.LogMessageCommunicationComponent[] getLogMessageBusinessComponent() {
        return logMessageBusinessComponent;
    }


    /**
     * Sets the logMessageBusinessComponent value for this LogMessageCollection.
     * 
     * @param logMessageBusinessComponent
     */
    public void setLogMessageBusinessComponent(com.sap.xi.BASIS.LogMessageCommunicationComponent[] logMessageBusinessComponent) {
        this.logMessageBusinessComponent = logMessageBusinessComponent;
    }

    public com.sap.xi.BASIS.LogMessageCommunicationComponent getLogMessageBusinessComponent(int i) {
        return this.logMessageBusinessComponent[i];
    }

    public void setLogMessageBusinessComponent(int i, com.sap.xi.BASIS.LogMessageCommunicationComponent _value) {
        this.logMessageBusinessComponent[i] = _value;
    }


    /**
     * Gets the logMessageIntegrationProcess value for this LogMessageCollection.
     * 
     * @return logMessageIntegrationProcess
     */
    public com.sap.xi.BASIS.LogMessageCommunicationComponent[] getLogMessageIntegrationProcess() {
        return logMessageIntegrationProcess;
    }


    /**
     * Sets the logMessageIntegrationProcess value for this LogMessageCollection.
     * 
     * @param logMessageIntegrationProcess
     */
    public void setLogMessageIntegrationProcess(com.sap.xi.BASIS.LogMessageCommunicationComponent[] logMessageIntegrationProcess) {
        this.logMessageIntegrationProcess = logMessageIntegrationProcess;
    }

    public com.sap.xi.BASIS.LogMessageCommunicationComponent getLogMessageIntegrationProcess(int i) {
        return this.logMessageIntegrationProcess[i];
    }

    public void setLogMessageIntegrationProcess(int i, com.sap.xi.BASIS.LogMessageCommunicationComponent _value) {
        this.logMessageIntegrationProcess[i] = _value;
    }


    /**
     * Gets the logMessageCommunicationChannel value for this LogMessageCollection.
     * 
     * @return logMessageCommunicationChannel
     */
    public com.sap.xi.BASIS.LogMessageCommunicationChannel[] getLogMessageCommunicationChannel() {
        return logMessageCommunicationChannel;
    }


    /**
     * Sets the logMessageCommunicationChannel value for this LogMessageCollection.
     * 
     * @param logMessageCommunicationChannel
     */
    public void setLogMessageCommunicationChannel(com.sap.xi.BASIS.LogMessageCommunicationChannel[] logMessageCommunicationChannel) {
        this.logMessageCommunicationChannel = logMessageCommunicationChannel;
    }

    public com.sap.xi.BASIS.LogMessageCommunicationChannel getLogMessageCommunicationChannel(int i) {
        return this.logMessageCommunicationChannel[i];
    }

    public void setLogMessageCommunicationChannel(int i, com.sap.xi.BASIS.LogMessageCommunicationChannel _value) {
        this.logMessageCommunicationChannel[i] = _value;
    }


    /**
     * Gets the logMessageSenderAgreement value for this LogMessageCollection.
     * 
     * @return logMessageSenderAgreement
     */
    public com.sap.xi.BASIS.LogMessageMessageHeader[] getLogMessageSenderAgreement() {
        return logMessageSenderAgreement;
    }


    /**
     * Sets the logMessageSenderAgreement value for this LogMessageCollection.
     * 
     * @param logMessageSenderAgreement
     */
    public void setLogMessageSenderAgreement(com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageSenderAgreement) {
        this.logMessageSenderAgreement = logMessageSenderAgreement;
    }

    public com.sap.xi.BASIS.LogMessageMessageHeader getLogMessageSenderAgreement(int i) {
        return this.logMessageSenderAgreement[i];
    }

    public void setLogMessageSenderAgreement(int i, com.sap.xi.BASIS.LogMessageMessageHeader _value) {
        this.logMessageSenderAgreement[i] = _value;
    }


    /**
     * Gets the logMessageReceiverAgreement value for this LogMessageCollection.
     * 
     * @return logMessageReceiverAgreement
     */
    public com.sap.xi.BASIS.LogMessageMessageHeader[] getLogMessageReceiverAgreement() {
        return logMessageReceiverAgreement;
    }


    /**
     * Sets the logMessageReceiverAgreement value for this LogMessageCollection.
     * 
     * @param logMessageReceiverAgreement
     */
    public void setLogMessageReceiverAgreement(com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageReceiverAgreement) {
        this.logMessageReceiverAgreement = logMessageReceiverAgreement;
    }

    public com.sap.xi.BASIS.LogMessageMessageHeader getLogMessageReceiverAgreement(int i) {
        return this.logMessageReceiverAgreement[i];
    }

    public void setLogMessageReceiverAgreement(int i, com.sap.xi.BASIS.LogMessageMessageHeader _value) {
        this.logMessageReceiverAgreement[i] = _value;
    }


    /**
     * Gets the logMessageDirectConnection value for this LogMessageCollection.
     * 
     * @return logMessageDirectConnection
     */
    public com.sap.xi.BASIS.LogMessageMessageHeader[] getLogMessageDirectConnection() {
        return logMessageDirectConnection;
    }


    /**
     * Sets the logMessageDirectConnection value for this LogMessageCollection.
     * 
     * @param logMessageDirectConnection
     */
    public void setLogMessageDirectConnection(com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageDirectConnection) {
        this.logMessageDirectConnection = logMessageDirectConnection;
    }

    public com.sap.xi.BASIS.LogMessageMessageHeader getLogMessageDirectConnection(int i) {
        return this.logMessageDirectConnection[i];
    }

    public void setLogMessageDirectConnection(int i, com.sap.xi.BASIS.LogMessageMessageHeader _value) {
        this.logMessageDirectConnection[i] = _value;
    }


    /**
     * Gets the logMessageIntegratedConfiguration value for this LogMessageCollection.
     * 
     * @return logMessageIntegratedConfiguration
     */
    public com.sap.xi.BASIS.LogMessageMessageHeader[] getLogMessageIntegratedConfiguration() {
        return logMessageIntegratedConfiguration;
    }


    /**
     * Sets the logMessageIntegratedConfiguration value for this LogMessageCollection.
     * 
     * @param logMessageIntegratedConfiguration
     */
    public void setLogMessageIntegratedConfiguration(com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageIntegratedConfiguration) {
        this.logMessageIntegratedConfiguration = logMessageIntegratedConfiguration;
    }

    public com.sap.xi.BASIS.LogMessageMessageHeader getLogMessageIntegratedConfiguration(int i) {
        return this.logMessageIntegratedConfiguration[i];
    }

    public void setLogMessageIntegratedConfiguration(int i, com.sap.xi.BASIS.LogMessageMessageHeader _value) {
        this.logMessageIntegratedConfiguration[i] = _value;
    }


    /**
     * Gets the logMessageReceiverDetermination value for this LogMessageCollection.
     * 
     * @return logMessageReceiverDetermination
     */
    public com.sap.xi.BASIS.LogMessageMessageHeader[] getLogMessageReceiverDetermination() {
        return logMessageReceiverDetermination;
    }


    /**
     * Sets the logMessageReceiverDetermination value for this LogMessageCollection.
     * 
     * @param logMessageReceiverDetermination
     */
    public void setLogMessageReceiverDetermination(com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageReceiverDetermination) {
        this.logMessageReceiverDetermination = logMessageReceiverDetermination;
    }

    public com.sap.xi.BASIS.LogMessageMessageHeader getLogMessageReceiverDetermination(int i) {
        return this.logMessageReceiverDetermination[i];
    }

    public void setLogMessageReceiverDetermination(int i, com.sap.xi.BASIS.LogMessageMessageHeader _value) {
        this.logMessageReceiverDetermination[i] = _value;
    }


    /**
     * Gets the logMessageReceiverRule value for this LogMessageCollection.
     * 
     * @return logMessageReceiverRule
     */
    public com.sap.xi.BASIS.LogMessageReceiverRule[] getLogMessageReceiverRule() {
        return logMessageReceiverRule;
    }


    /**
     * Sets the logMessageReceiverRule value for this LogMessageCollection.
     * 
     * @param logMessageReceiverRule
     */
    public void setLogMessageReceiverRule(com.sap.xi.BASIS.LogMessageReceiverRule[] logMessageReceiverRule) {
        this.logMessageReceiverRule = logMessageReceiverRule;
    }

    public com.sap.xi.BASIS.LogMessageReceiverRule getLogMessageReceiverRule(int i) {
        return this.logMessageReceiverRule[i];
    }

    public void setLogMessageReceiverRule(int i, com.sap.xi.BASIS.LogMessageReceiverRule _value) {
        this.logMessageReceiverRule[i] = _value;
    }


    /**
     * Gets the logMessageInterfaceDetermination value for this LogMessageCollection.
     * 
     * @return logMessageInterfaceDetermination
     */
    public com.sap.xi.BASIS.LogMessageMessageHeader[] getLogMessageInterfaceDetermination() {
        return logMessageInterfaceDetermination;
    }


    /**
     * Sets the logMessageInterfaceDetermination value for this LogMessageCollection.
     * 
     * @param logMessageInterfaceDetermination
     */
    public void setLogMessageInterfaceDetermination(com.sap.xi.BASIS.LogMessageMessageHeader[] logMessageInterfaceDetermination) {
        this.logMessageInterfaceDetermination = logMessageInterfaceDetermination;
    }

    public com.sap.xi.BASIS.LogMessageMessageHeader getLogMessageInterfaceDetermination(int i) {
        return this.logMessageInterfaceDetermination[i];
    }

    public void setLogMessageInterfaceDetermination(int i, com.sap.xi.BASIS.LogMessageMessageHeader _value) {
        this.logMessageInterfaceDetermination[i] = _value;
    }


    /**
     * Gets the logMessageValueMapping value for this LogMessageCollection.
     * 
     * @return logMessageValueMapping
     */
    public com.sap.xi.BASIS.LogMessageValueMapping[] getLogMessageValueMapping() {
        return logMessageValueMapping;
    }


    /**
     * Sets the logMessageValueMapping value for this LogMessageCollection.
     * 
     * @param logMessageValueMapping
     */
    public void setLogMessageValueMapping(com.sap.xi.BASIS.LogMessageValueMapping[] logMessageValueMapping) {
        this.logMessageValueMapping = logMessageValueMapping;
    }

    public com.sap.xi.BASIS.LogMessageValueMapping getLogMessageValueMapping(int i) {
        return this.logMessageValueMapping[i];
    }

    public void setLogMessageValueMapping(int i, com.sap.xi.BASIS.LogMessageValueMapping _value) {
        this.logMessageValueMapping[i] = _value;
    }


    /**
     * Gets the logMessageConfigurationScenario value for this LogMessageCollection.
     * 
     * @return logMessageConfigurationScenario
     */
    public com.sap.xi.BASIS.LogMessageConfigurationScenario[] getLogMessageConfigurationScenario() {
        return logMessageConfigurationScenario;
    }


    /**
     * Sets the logMessageConfigurationScenario value for this LogMessageCollection.
     * 
     * @param logMessageConfigurationScenario
     */
    public void setLogMessageConfigurationScenario(com.sap.xi.BASIS.LogMessageConfigurationScenario[] logMessageConfigurationScenario) {
        this.logMessageConfigurationScenario = logMessageConfigurationScenario;
    }

    public com.sap.xi.BASIS.LogMessageConfigurationScenario getLogMessageConfigurationScenario(int i) {
        return this.logMessageConfigurationScenario[i];
    }

    public void setLogMessageConfigurationScenario(int i, com.sap.xi.BASIS.LogMessageConfigurationScenario _value) {
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
            ((this.logMessageProcessComponent==null && other.getLogMessageProcessComponent()==null) || 
             (this.logMessageProcessComponent!=null &&
              java.util.Arrays.equals(this.logMessageProcessComponent, other.getLogMessageProcessComponent()))) &&
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
            ((this.logMessageDirectConnection==null && other.getLogMessageDirectConnection()==null) || 
             (this.logMessageDirectConnection!=null &&
              java.util.Arrays.equals(this.logMessageDirectConnection, other.getLogMessageDirectConnection()))) &&
            ((this.logMessageIntegratedConfiguration==null && other.getLogMessageIntegratedConfiguration()==null) || 
             (this.logMessageIntegratedConfiguration!=null &&
              java.util.Arrays.equals(this.logMessageIntegratedConfiguration, other.getLogMessageIntegratedConfiguration()))) &&
            ((this.logMessageReceiverDetermination==null && other.getLogMessageReceiverDetermination()==null) || 
             (this.logMessageReceiverDetermination!=null &&
              java.util.Arrays.equals(this.logMessageReceiverDetermination, other.getLogMessageReceiverDetermination()))) &&
            ((this.logMessageReceiverRule==null && other.getLogMessageReceiverRule()==null) || 
             (this.logMessageReceiverRule!=null &&
              java.util.Arrays.equals(this.logMessageReceiverRule, other.getLogMessageReceiverRule()))) &&
            ((this.logMessageInterfaceDetermination==null && other.getLogMessageInterfaceDetermination()==null) || 
             (this.logMessageInterfaceDetermination!=null &&
              java.util.Arrays.equals(this.logMessageInterfaceDetermination, other.getLogMessageInterfaceDetermination()))) &&
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
        if (getLogMessageProcessComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageProcessComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageProcessComponent(), i);
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
        if (getLogMessageDirectConnection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageDirectConnection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageDirectConnection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogMessageIntegratedConfiguration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageIntegratedConfiguration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageIntegratedConfiguration(), i);
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
        if (getLogMessageReceiverRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessageReceiverRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessageReceiverRule(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageChangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageChangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageChangeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageParty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCommunicationParty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageProcessComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageProcessComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageProcessComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageBusinessSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageBusinessSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCommunicationComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageBusinessComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageBusinessComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCommunicationComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageIntegrationProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageIntegrationProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCommunicationComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageCommunicationChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageCommunicationChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageCommunicationChannel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageSenderAgreement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageSenderAgreement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageMessageHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageReceiverAgreement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageReceiverAgreement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageMessageHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageDirectConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageDirectConnection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageMessageHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageIntegratedConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageIntegratedConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageMessageHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageReceiverDetermination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageReceiverDetermination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageMessageHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageReceiverRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageReceiverRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageReceiverRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageInterfaceDetermination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageInterfaceDetermination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageMessageHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageValueMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageValueMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageValueMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageConfigurationScenario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogMessageConfigurationScenario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "LogMessageConfigurationScenario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
