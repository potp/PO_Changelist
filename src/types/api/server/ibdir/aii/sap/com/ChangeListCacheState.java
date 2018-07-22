/**
 * ChangeListCacheState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package types.api.server.ibdir.aii.sap.com;

public class ChangeListCacheState  implements java.io.Serializable {
    private java.lang.String consumer;

    private java.lang.String notificationState;

    private java.lang.String refreshState;

    private types.api.server.ibdir.aii.sap.com.LogMessageItem[] errorMessage;

    public ChangeListCacheState() {
    }

    public ChangeListCacheState(
           java.lang.String consumer,
           java.lang.String notificationState,
           java.lang.String refreshState,
           types.api.server.ibdir.aii.sap.com.LogMessageItem[] errorMessage) {
           this.consumer = consumer;
           this.notificationState = notificationState;
           this.refreshState = refreshState;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the consumer value for this ChangeListCacheState.
     * 
     * @return consumer
     */
    public java.lang.String getConsumer() {
        return consumer;
    }


    /**
     * Sets the consumer value for this ChangeListCacheState.
     * 
     * @param consumer
     */
    public void setConsumer(java.lang.String consumer) {
        this.consumer = consumer;
    }


    /**
     * Gets the notificationState value for this ChangeListCacheState.
     * 
     * @return notificationState
     */
    public java.lang.String getNotificationState() {
        return notificationState;
    }


    /**
     * Sets the notificationState value for this ChangeListCacheState.
     * 
     * @param notificationState
     */
    public void setNotificationState(java.lang.String notificationState) {
        this.notificationState = notificationState;
    }


    /**
     * Gets the refreshState value for this ChangeListCacheState.
     * 
     * @return refreshState
     */
    public java.lang.String getRefreshState() {
        return refreshState;
    }


    /**
     * Sets the refreshState value for this ChangeListCacheState.
     * 
     * @param refreshState
     */
    public void setRefreshState(java.lang.String refreshState) {
        this.refreshState = refreshState;
    }


    /**
     * Gets the errorMessage value for this ChangeListCacheState.
     * 
     * @return errorMessage
     */
    public types.api.server.ibdir.aii.sap.com.LogMessageItem[] getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ChangeListCacheState.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(types.api.server.ibdir.aii.sap.com.LogMessageItem[] errorMessage) {
        this.errorMessage = errorMessage;
    }

    public types.api.server.ibdir.aii.sap.com.LogMessageItem getErrorMessage(int i) {
        return this.errorMessage[i];
    }

    public void setErrorMessage(int i, types.api.server.ibdir.aii.sap.com.LogMessageItem _value) {
        this.errorMessage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeListCacheState)) return false;
        ChangeListCacheState other = (ChangeListCacheState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consumer==null && other.getConsumer()==null) || 
             (this.consumer!=null &&
              this.consumer.equals(other.getConsumer()))) &&
            ((this.notificationState==null && other.getNotificationState()==null) || 
             (this.notificationState!=null &&
              this.notificationState.equals(other.getNotificationState()))) &&
            ((this.refreshState==null && other.getRefreshState()==null) || 
             (this.refreshState!=null &&
              this.refreshState.equals(other.getRefreshState()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              java.util.Arrays.equals(this.errorMessage, other.getErrorMessage())));
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
        if (getConsumer() != null) {
            _hashCode += getConsumer().hashCode();
        }
        if (getNotificationState() != null) {
            _hashCode += getNotificationState().hashCode();
        }
        if (getRefreshState() != null) {
            _hashCode += getRefreshState().hashCode();
        }
        if (getErrorMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrorMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrorMessage(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeListCacheState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ChangeListCacheState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "Consumer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "NotificationState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "RefreshState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.aii.ibdir.server.api.types", "LogMessageItem"));
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
