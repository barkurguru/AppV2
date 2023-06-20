
package com.v2.app.APP.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppService {
        
    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<String> getThirdPartyAPI(String url) throws Exception {
    System.out.println("URL:"+url);
     return restTemplate.exchange(url,HttpMethod.GET, null, String.class);
    }

}