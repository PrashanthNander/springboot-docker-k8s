package com.prash.k8s.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class K8sController {

    @Value("${configmap.db-name}")
    private String dbName;

    @Value("${configmap.db-host}")
    private String dbHost;

    @Value("${configmap.db-user}")
    private String dbUser;

    @Value("${configmap.db-password}")
    private String dbPassword;


    @GetMapping("/message")
    public String test() {
        String message = "Welcome to SpringBoot K8s application, belo database information is being read" +
                "from k8s manifest files(ConfigMap, Secret)\n" +
                "Database name : " + dbName + "\n" +
                "Database host : " + dbHost + "\n" +
                "Database user : " + dbUser + "\n" +
                "Database password : " + dbPassword ;
        System.out.println("Message = " + message);
        return message;
    }
}
