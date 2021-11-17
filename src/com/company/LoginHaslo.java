package com.company;

import java.util.HashMap;

public class LoginHaslo {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginHaslo(){
        logininfo.put("Darius","Noxus");
        logininfo.put("123","abc");
        logininfo.put("abc","123");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
