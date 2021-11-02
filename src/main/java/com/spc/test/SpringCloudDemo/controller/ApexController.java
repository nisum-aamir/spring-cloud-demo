package com.spc.test.SpringCloudDemo.controller;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;

import java.util.Date;
import java.util.HashMap;


@RestController
public class ApexController {

    Logger log = Logger.getLogger(ApexController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public JSONObject hello() {
        JSONObject resp = new JSONObject();
        resp.put("timestamp", new Date());
        resp.put("endpoint", "/test");
        resp.put("data", Math.random());
        log.info(resp);
        return resp;
    }

    @RequestMapping(value = "/toast", method = RequestMethod.GET)
    public HashMap<String, Object> toast() {
        HashMap<String, Object> resp = new HashMap<>();
        resp.put("timestamp", new Date());
        resp.put("endpoint", "/toast");
        resp.put("data", Math.random());
        log.info(resp);
        return resp;
    }

}
