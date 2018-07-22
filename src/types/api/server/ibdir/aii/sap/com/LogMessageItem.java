/**
 * LogMessageItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class LogMessageItem  implements java.io.Serializable {
    private java.lang.String severityCode;

    private java.lang.String classificationCode;

    private types.api.server.ibdir.aii.sap.com.Text message;

    public LogMessageItem() {
    }

    public LogMessageItem(
           java.lang.String severityCode,
           java.lang.String classificationCode,
           types.api.server.ibdir.aii.sap.com.Text message) {
           this.severityCode = severityCode;
           this.classificationCode = classificationCode;
           this.message = message;
    }


    /**
     * Gets the severityCode value for this LogMessageItem.
     * 
     * @return severityCode
     */
    public java.lang.String getSeverityCode() {
        return severityCode;
    }


    /**
     * Sets the severityCode value for this LogMessageItem.
     * 
     * @param severityCode
     */
    public void setSeverityCode(java.lang.String severityCode) {
        this.severityCode = severityCode;
    }


    /**
     * Gets the classificationCode value for this LogMessageItem.
     * 
     * @return classificationCode
     */
    public java.lang.String getClassificationCode() {
        return classificationCode;
    }


    /**
     * Sets the classificationCode value for this LogMessageItem.
     * 
     * @param classificationCode
     */
    public void setClassificationCode(java.lang.String classificationCode) {
        this.classificationCode = classificationCode;
    }


    /**
     * Gets the message value for this LogMessageItem.
     * 
     * @return message
     */
    public types.api.server.ibdir.aii.sap.com.Text getMessage() {
        return message;
    }


    /**
     * Sets the message value for this LogMessageItem.
     * 
     * @param message
     */
    public void setMessage(types.api.server.ibdir.aii.sap.com.Text message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogMessageItem)) return false;
        LogMessageItem other = (LogMessageItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.severityCode==null && other.getSeverityCode()==null) || 
             (this.severityCode!=null &&
              this.severityCode.equals(other.getSeverityCode()))) &&
            ((this.classificationCode==null && other.getClassificationCode()==null) || 
             (this.classificationCode!=null &&
              this.classificationCode.equals(other.getClassificationCode()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getSeverityCode() != null) {
            _hashCode += getSeverityCode().hashCode();
        }
        if (getClassificationCode() != null) {
            _hashCode += getClassificationCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogMessageItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "SeverityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ClassificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "Text"));
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
