/**
 * CallSESUServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package codes;

public class CallSESUServiceLocator extends org.apache.axis.client.Service implements codes.CallSESUService {

    public CallSESUServiceLocator() {
    }


    public CallSESUServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CallSESUServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for callSESU
    private java.lang.String callSESU_address = "http://localhost:8080/FinalCollegeTime/services/callSESU";

    public java.lang.String getcallSESUAddress() {
        return callSESU_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String callSESUWSDDServiceName = "callSESU";

    public java.lang.String getcallSESUWSDDServiceName() {
        return callSESUWSDDServiceName;
    }

    public void setcallSESUWSDDServiceName(java.lang.String name) {
        callSESUWSDDServiceName = name;
    }

    public codes.CallSESU getcallSESU() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(callSESU_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcallSESU(endpoint);
    }

    public codes.CallSESU getcallSESU(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            codes.CallSESUSoapBindingStub _stub = new codes.CallSESUSoapBindingStub(portAddress, this);
            _stub.setPortName(getcallSESUWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcallSESUEndpointAddress(java.lang.String address) {
        callSESU_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (codes.CallSESU.class.isAssignableFrom(serviceEndpointInterface)) {
                codes.CallSESUSoapBindingStub _stub = new codes.CallSESUSoapBindingStub(new java.net.URL(callSESU_address), this);
                _stub.setPortName(getcallSESUWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("callSESU".equals(inputPortName)) {
            return getcallSESU();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://codes", "callSESUService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://codes", "callSESU"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("callSESU".equals(portName)) {
            setcallSESUEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
