package com.payments.entei.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class BrainService implements Callable<List<Object>> {

    //Property for the file path of the directory
    private String arg;

    public BrainService(String path){
        this.arg = path;
    }

    @Override
    public List<Object> call() throws Exception {
        Thread.currentThread().setName("ENTEI {path}:" + arg);

        return new ArrayList<>();
    }

}
