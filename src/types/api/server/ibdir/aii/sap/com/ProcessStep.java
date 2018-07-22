/**
 * ProcessStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class ProcessStep  implements java.io.Serializable {
    private java.lang.String moduleName;

    private java.lang.String moduleType;

    private java.lang.String parameterGroupID;

    public ProcessStep() {
    }

    public ProcessStep(
           java.lang.String moduleName,
           java.lang.String moduleType,
           java.lang.String parameterGroupID) {
           this.moduleName = moduleName;
           this.moduleType = moduleType;
           this.parameterGroupID = parameterGroupID;
    }


    /**
     * Gets the moduleName value for this ProcessStep.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this ProcessStep.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * Gets the moduleType value for this ProcessStep.
     * 
     * @return moduleType
     */
    public java.lang.String getModuleType() {
        return moduleType;
    }


    /**
     * Sets the moduleType value for this ProcessStep.
     * 
     * @param moduleType
     */
    public void setModuleType(java.lang.String moduleType) {
        this.moduleType = moduleType;
    }


    /**
     * Gets the parameterGroupID value for this ProcessStep.
     * 
     * @return parameterGroupID
     */
    public java.lang.String getParameterGroupID() {
        return parameterGroupID;
    }


    /**
     * Sets the parameterGroupID value for this ProcessStep.
     * 
     * @param parameterGroupID
     */
    public void setParameterGroupID(java.lang.String parameterGroupID) {
        this.parameterGroupID = parameterGroupID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessStep)) return false;
        ProcessStep other = (ProcessStep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moduleName==null && other.getModuleName()==null) || 
             (this.moduleName!=null &&
              this.moduleName.equals(other.getModuleName()))) &&
            ((this.moduleType==null && other.getModuleType()==null) || 
             (this.moduleType!=null &&
              this.moduleType.equals(other.getModuleType()))) &&
            ((this.parameterGroupID==null && other.getParameterGroupID()==null) || 
             (this.parameterGroupID!=null &&
              this.parameterGroupID.equals(other.getParameterGroupID())));
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
        if (getModuleName() != null) {
            _hashCode += getModuleName().hashCode();
        }
        if (getModuleType() != null) {
            _hashCode += getModuleType().hashCode();
        }
        if (getParameterGroupID() != null) {
            _hashCode += getParameterGroupID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ProcessStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ModuleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ModuleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ParameterGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
