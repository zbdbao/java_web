package com.meme.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.meme.beans.HelloWorldBean;
import com.meme.beans.UserService;
import com.meme.beans.impl.UserDetails;

@WebService(serviceName="HelloWorldWService")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public class HelloWorldWS{

    //DI via Spring
    HelloWorldBean helloWorldBean;
    private UserService userService;

    @WebMethod(exclude=true)
    public void setHelloWorldBean(HelloWorldBean helloWorldBean) {
        this.helloWorldBean = helloWorldBean;
    }

    @WebMethod(exclude=true)
    public void setUserService(UserService userService) {
        this.userService = userService;
    }



    @WebMethod(operationName="getHelloWorld")
    public String getHelloWorld() {

        return helloWorldBean.sayHello();

    }

    @WebMethod(operationName="getUserDetails")
    public UserDetails getUserDetails(int userId) {

        return userService.getUserDetails(userId);

    }

}