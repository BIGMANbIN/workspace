package com.it.test;


import com.it.entity.User;
import com.it.service.Userservice;
import org.junit.Assert;
import org.junit.Test;

public class UserServiceTest {

    private Userservice userservice = new Userservice();

    @Test
    public void testLogin(){

        User user = userservice.login("jim","123");

        Assert.assertNotNull(user);
    }

}
