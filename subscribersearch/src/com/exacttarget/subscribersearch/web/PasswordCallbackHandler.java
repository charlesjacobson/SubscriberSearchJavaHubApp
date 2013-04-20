package com.exacttarget.subscribersearch.web;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;

import org.apache.ws.security.WSPasswordCallback;

public class PasswordCallbackHandler implements CallbackHandler {
    private String password = null;

    public void setPassword(String password) {
        this.password = password;
    }

    public void handle(Callback[] callbacks) {
        WSPasswordCallback callback = (WSPasswordCallback) callbacks[0];
        callback.setPassword(password);
    }
}
