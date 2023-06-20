package com.v2.app.APP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v2.app.APP.service.AppService;

import org.springframework.web.bind.annotation.RequestParam;

@RestController("/app")
public class AppController {


@Autowired
AppService service;


@GetMapping("/getAPIResponse")
public  ResponseEntity<ResponseEntity<String>>  getThirdPartyAPI(@RequestParam(value="url", required=true) 
String url) throws Exception{
    System.out.println("Controller URL:"+url);
    return  ResponseEntity.ok(service.getThirdPartyAPI(url));
}


}