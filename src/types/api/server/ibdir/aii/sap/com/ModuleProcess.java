/**
 * ModuleProcess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class ModuleProcess  implements java.io.Serializable {
    private types.api.server.ibdir.aii.sap.com.ProcessStep[] processStep;

    private types.api.server.ibdir.aii.sap.com.ParameterGroup[] parameterGroup;

    public ModuleProcess() {
    }

    public ModuleProcess(
           types.api.server.ibdir.aii.sap.com.ProcessStep[] processStep,
           types.api.server.ibdir.aii.sap.com.ParameterGroup[] parameterGroup) {
           this.processStep = processStep;
           this.parameterGroup = parameterGroup;
    }


    /**
     * Gets the processStep value for this ModuleProcess.
     * 
     * @return processStep
     */
    public types.api.server.ibdir.aii.sap.com.ProcessStep[] getProcessStep() {
        return processStep;
    }


    /**
     * Sets the processStep value for this ModuleProcess.
     * 
     * @param processStep
     */
    public void setProcessStep(types.api.server.ibdir.aii.sap.com.ProcessStep[] processStep) {
        this.processStep = processStep;
    }

    public types.api.server.ibdir.aii.sap.com.ProcessStep getProcessStep(int i) {
        return this.processStep[i];
    }

    public void setProcessStep(int i, types.api.server.ibdir.aii.sap.com.ProcessStep _value) {
        this.processStep[i] = _value;
    }


    /**
     * Gets the parameterGroup value for this ModuleProcess.
     * 
     * @return parameterGroup
     */
    public types.api.server.ibdir.aii.sap.com.ParameterGroup[] getParameterGroup() {
        return parameterGroup;
    }


    /**
     * Sets the parameterGroup value for this ModuleProcess.
     * 
     * @param parameterGroup
     */
    public void setParameterGroup(types.api.server.ibdir.aii.sap.com.ParameterGroup[] parameterGroup) {
        this.parameterGroup = parameterGroup;
    }

    public types.api.server.ibdir.aii.sap.com.ParameterGroup getParameterGroup(int i) {
        return this.parameterGroup[i];
    }

    public void setParameterGroup(int i, types.api.server.ibdir.aii.sap.com.ParameterGroup _value) {
        this.parameterGroup[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuleProcess)) return false;
        ModuleProcess other = (ModuleProcess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processStep==null && other.getProcessStep()==null) || 
             (this.processStep!=null &&
              java.util.Arrays.equals(this.processStep, other.getProcessStep()))) &&
            ((this.parameterGroup==null && other.getParameterGroup()==null) || 
             (this.parameterGroup!=null &&
              java.util.Arrays.equals(this.parameterGroup, other.getParameterGroup())));
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
        if (getProcessStep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessStep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessStep(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParameterGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameterGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameterGroup(), i);
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
        new org.apache.axis.description.TypeDesc(ModuleProcess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ModuleProcess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processStep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ProcessStep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ProcessStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ParameterGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ParameterGroup"));
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
