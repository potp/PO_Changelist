/**
 * LogMessageConfigurationScenario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class LogMessageConfigurationScenario  implements java.io.Serializable {
    private java.lang.String configurationScenarioID;

    private types.api.server.ibdir.aii.sap.com.LogMessageItem logMessageItem;

    public LogMessageConfigurationScenario() {
    }

    public LogMessageConfigurationScenario(
           java.lang.String configurationScenarioID,
           types.api.server.ibdir.aii.sap.com.LogMessageItem logMessageItem) {
           this.configurationScenarioID = configurationScenarioID;
           this.logMessageItem = logMessageItem;
    }


    /**
     * Gets the configurationScenarioID value for this LogMessageConfigurationScenario.
     * 
     * @return configurationScenarioID
     */
    public java.lang.String getConfigurationScenarioID() {
        return configurationScenarioID;
    }


    /**
     * Sets the configurationScenarioID value for this LogMessageConfigurationScenario.
     * 
     * @param configurationScenarioID
     */
    public void setConfigurationScenarioID(java.lang.String configurationScenarioID) {
        this.configurationScenarioID = configurationScenarioID;
    }


    /**
     * Gets the logMessageItem value for this LogMessageConfigurationScenario.
     * 
     * @return logMessageItem
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageItem getLogMessageItem() {
        return logMessageItem;
    }


    /**
     * Sets the logMessageItem value for this LogMessageConfigurationScenario.
     * 
     * @param logMessageItem
     */
    public void setLogMessageItem(types.api.server.ibdir.aii.sap.com.LogMessageItem logMessageItem) {
        this.logMessageItem = logMessageItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogMessageConfigurationScenario)) return false;
        LogMessageConfigurationScenario other = (LogMessageConfigurationScenario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.configurationScenarioID==null && other.getConfigurationScenarioID()==null) || 
             (this.configurationScenarioID!=null &&
              this.configurationScenarioID.equals(other.getConfigurationScenarioID()))) &&
            ((this.logMessageItem==null && other.getLogMessageItem()==null) || 
             (this.logMessageItem!=null &&
              this.logMessageItem.equals(other.getLogMessageItem())));
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
        if (getConfigurationScenarioID() != null) {
            _hashCode += getConfigurationScenarioID().hashCode();
        }
        if (getLogMessageItem() != null) {
            _hashCode += getLogMessageItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogMessageConfigurationScenario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageConfigurationScenario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationScenarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ConfigurationScenarioID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessageItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageItem"));
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
