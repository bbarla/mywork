package com.idodevjobs;
 
public class ExamplePojo {
 
    public String methodMakingPrivateMethodCall(String message) {
        return privateMethod(message);
    }
 
    public String methodMakingStaticNonVoidMethodCall(String message) {
        return ExampleUtil.sayHello(message);
    }
 
    public String methodMakingStaticVoidMethodCall(String message) {
        ExampleUtil.printHello(message);
        return "printed " + message;
    }
 
    private String privateMethod(String helloMessage) {
        return "another " + helloMessage;
    }
    
    public String getMRAccount(String guid) {
    	AccountService service = new AccountService();
    	return service.getAccountDetails("mycredentials");
    	
    }
}