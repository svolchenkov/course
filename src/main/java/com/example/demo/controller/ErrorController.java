package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/error")
public class ErrorController {

    private static Logger logger = LoggerFactory.getLogger(ErrorController.class);
    private List<int[]> junk = new ArrayList<>();

    @RequestMapping(value = "/kill")
    public void kill() throws Exception {
        logger.info("************** Forcing application exit");
        logger.info("************** You have clicked on kill button");
        logger.info("************** Waiting PCF start");
        System.exit(1);
    }

    @RequestMapping(value = "/fill-heap")
    public void fillHeap () {
        logger.info("************** filling out heap");
        while (true) {
            junk.add(new int[9999999]);
        }
    }

    @RequestMapping(value = "/throw")
    public void throwExeption () {
        logger.info("application is throwing Null pointer exception");
        throw  new NullPointerException("************** Trowing Null pointer Exception");
    }

}
