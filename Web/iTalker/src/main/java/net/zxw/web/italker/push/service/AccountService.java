package net.zxw.web.italker.push.service;

import net.zxw.web.italker.push.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author zxw
 */
//127.0.0.1/api/account/...
@Path("/account")
public class AccountService {

    // GET 127.0.0.1/api/account/login
    @GET
    @Path("/login")
    public String get(){
        return "you get the login.";
    }

    // POST 127.0.0.1/api/account/login
    @POST
    @Path("/login")
    //指定请求与返回的相应体为JSON
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User post(){
        User user = new User();
        user.setName("美女");
        user.setSex(2);
        return user;
    }
}
