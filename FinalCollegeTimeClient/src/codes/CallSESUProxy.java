package codes;

public class CallSESUProxy implements codes.CallSESU {
  private String _endpoint = null;
  private codes.CallSESU callSESU = null;
  
  public CallSESUProxy() {
    _initCallSESUProxy();
  }
  
  public CallSESUProxy(String endpoint) {
    _endpoint = endpoint;
    _initCallSESUProxy();
  }
  
  private void _initCallSESUProxy() {
    try {
      callSESU = (new codes.CallSESUServiceLocator()).getcallSESU();
      if (callSESU != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)callSESU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)callSESU)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (callSESU != null)
      ((javax.xml.rpc.Stub)callSESU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public codes.CallSESU getCallSESU() {
    if (callSESU == null)
      _initCallSESUProxy();
    return callSESU;
  }
  
  public void scoresservice(int a, int b) throws java.rmi.RemoteException{
    if (callSESU == null)
      _initCallSESUProxy();
    callSESU.scoresservice(a, b);
  }
  
  public void serve(java.lang.String loc) throws java.rmi.RemoteException{
    if (callSESU == null)
      _initCallSESUProxy();
    callSESU.serve(loc);
  }
  
  
}