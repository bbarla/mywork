package com.idodevjobs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
 
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.doNothing;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.support.membermodification.MemberMatcher.method;
 
@RunWith(PowerMockRunner.class)
//@RunWith(MockitoJUnitRunner.class)
//@PrepareForTest({ExampleUtil.class, ExamplePojo.class})
public class ExamplePojo2Test {
	@Mock
	AccountService acctService;
/*    @Test
    public void testMethodMakingPrivateMethodCall() throws Exception {
        ExamplePojo spyExamplePojo = PowerMockito.spy(new ExamplePojo());
        when(spyExamplePojo, method(ExamplePojo.class, "privateMethod", String.class)).withArguments(anyString()).thenReturn("test test");
        String result = spyExamplePojo.methodMakingPrivateMethodCall("test");
        System.out.println("****************"+result);
        assertEquals("test test", result);
    }
 
    @Test
    public void testMethodMakingStaticNonVoidMethodCall() throws Exception {
        mockStatic(ExampleUtil.class);
        when(ExampleUtil.sayHello(anyString())).thenReturn("test test");
        String result = new ExamplePojo().methodMakingStaticNonVoidMethodCall("test");
        assertEquals("test test", result);
    }
 
    @Test
    public void testMethodMakingStaticVoidMethodCall() throws Exception {
        mockStatic(ExampleUtil.class);
        doNothing().when(ExampleUtil.class);
        new ExamplePojo().methodMakingStaticVoidMethodCall("test");
    }	
  */  
    @Test
    public void testMethodgetMRAccount() throws Exception {
    	
    	//AccountService acctService = mock(AccountService.class);
    	
    	
       	when(acctService, method(AccountService.class, "getAccountDetails", String.class)).withArguments(anyString()).thenReturn("111111");
    	System.out.println("----------------------"+acctService.getAccountDetails(""));
    	ExamplePojo exmPojo = new ExamplePojo();
    	System.out.println(exmPojo.getMRAccount("newcred"));
    }
}