package com.chenjing.bkowner;

import org.springframework.stereotype.Service;

/**
 * Created by chenjing on 2017/11/22.
 */
@Service("test")
public class TestService {
    private static String owner = "chenjing";

    public void printOwner(){
        System.out.println(owner);
    }
}
