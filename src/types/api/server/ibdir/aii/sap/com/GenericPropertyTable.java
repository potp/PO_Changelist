/**
 * GenericPropertyTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class GenericPropertyTable  implements java.io.Serializable {
    private java.lang.String name;

    private types.api.server.ibdir.aii.sap.com.GenericTableRowTableCell[][] valueTableRow;

    public GenericPropertyTable() {
    }

    public GenericPropertyTable(
           java.lang.String name,
           types.api.server.ibdir.aii.sap.com.GenericTableRowTableCell[][] valueTableRow) {
           this.name = name;
           this.valueTableRow = valueTableRow;
    }


    /**
     * Gets the name value for this GenericPropertyTable.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GenericPropertyTable.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the valueTableRow value for this GenericPropertyTable.
     * 
     * @return valueTableRow
     */
    public types.api.server.ibdir.aii.sap.com.GenericTableRowTableCell[][] getValueTableRow() {
        return valueTableRow;
    }


    /**
     * Sets the valueTableRow value for this GenericPropertyTable.
     * 
     * @param valueTableRow
     */
    public void setValueTableRow(types.api.server.ibdir.aii.sap.com.GenericTableRowTableCell[][] valueTableRow) {
        this.valueTableRow = valueTableRow;
    }

    public types.api.server.ibdir.aii.sap.com.GenericTableRowTableCell[] getValueTableRow(int i) {
        return this.valueTableRow[i];
    }

    public void setValueTableRow(int i, types.api.server.ibdir.aii.sap.com.GenericTableRowTableCell[] _value) {
        this.valueTableRow[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenericPropertyTable)) return false;
        GenericPropertyTable other = (GenericPropertyTable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.valueTableRow==null && other.getValueTableRow()==null) || 
             (this.valueTableRow!=null &&
              java.util.Arrays.equals(this.valueTableRow, other.getValueTableRow())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getValueTableRow() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueTableRow());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueTableRow(), i);
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
        new org.apache.axis.description.TypeDesc(GenericPropertyTable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericPropertyTable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueTableRow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ValueTableRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "GenericTableRow"));
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
