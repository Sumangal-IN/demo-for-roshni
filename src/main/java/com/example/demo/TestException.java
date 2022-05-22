package com.example.demo;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.exception.UserNotPresentException;

public class TestException {

    public void doMethod() {
        throw new UserNotFoundException();
    }

    public void doMethod2() throws UserNotPresentException {
        throw new UserNotPresentException();
    }

    public void abc() {
        doMethod();

        try {
            doMethod2();
        } catch (UserNotPresentException ex) {
            // block 1
        } catch (Exception ex) {
            // block 2
        }
    }
}
