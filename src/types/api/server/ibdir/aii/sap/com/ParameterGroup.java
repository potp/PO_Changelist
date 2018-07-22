/**
 * ParameterGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class ParameterGroup  implements java.io.Serializable {
    private java.lang.String parameterGroupID;

    private types.api.server.ibdir.aii.sap.com.GenericPropertyRestricted[] parameter;

    public ParameterGroup() {
    }

    public ParameterGroup(
           java.lang.String parameterGroupID,
           types.api.server.ibdir.aii.sap.com.GenericPropertyRestricted[] parameter) {
           this.parameterGroupID = parameterGroupID;
           this.parameter = parameter;
    }


    /**
     * Gets the parameterGroupID value for this ParameterGroup.
     * 
     * @return parameterGroupID
     */
    public java.lang.String getParameterGroupID() {
        return parameterGroupID;
    }


    /**
     * Sets the parameterGroupID value for this ParameterGroup.
     * 
     * @param parameterGroupID
     */
    public void setParameterGroupID(java.lang.String parameterGroupID) {
        this.parameterGroupID = parameterGroupID;
    }


    /**
     * Gets the parameter value for this ParameterGroup.
     * 
     * @return parameter
     */
    public types.api.server.ibdir.aii.sap.com.GenericPropertyRestricted[] getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this ParameterGroup.
     * 
     * @param parameter
     */
    public void setParameter(types.api.server.ibdir.aii.sap.com.GenericPropertyRestricted[] parameter) {
        this.parameter = parameter;
    }

    public types.api.server.ibdir.aii.sap.com.GenericPropertyRestricted getParameter(int i) {
        return this.parameter[i];
    }

    public void setParameter(int i, types.api.server.ibdir.aii.sap.com.GenericPropertyRestricted _value) {
        this.parameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParameterGroup)) return false;
        ParameterGroup other = (ParameterGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameterGroupID==null && other.getParameterGroupID()==null) || 
             (this.parameterGroupID!=null &&
              this.parameterGroupID.equals(other.getParameterGroupID()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              java.util.Arrays.equals(this.parameter, other.getParameter())));
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
        if (getParameterGroupID() != null) {
            _hashCode += getParameterGroupID().hashCode();
        }
        if (getParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameter(), i);
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
        new org.apache.axis.description.TypeDesc(ParameterGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ParameterGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ParameterGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "Parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericPropertyRestricted"));
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
