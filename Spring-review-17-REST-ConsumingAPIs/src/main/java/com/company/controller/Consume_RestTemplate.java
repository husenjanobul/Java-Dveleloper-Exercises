package com.company.controller;

import com.company.dto.User;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class Consume_RestTemplate {

    private final String URI = "https://jsonplaceholder.typicode.com/users";

    private final RestTemplate restTemplate;

    public Consume_RestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public User[] readAllUsers(){

        ResponseEntity<User[]> responseEntity = restTemplate.getForEntity(URI,User[].class);

        return responseEntity.getBody();
    }

    @GetMapping("{id}")
    public Object readUser(@PathVariable("id") Long id){
        String URL = URI + "/{id}";

        return restTemplate.getForObject(URL,Object.class,id);
    }


    @GetMapping("/test")
    public ResponseEntity<Object> consumeDummyApi(){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        httpHeaders.set("app-id","6298ebfecd0551211fce37a6");

        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<Object> response = restTemplate.exchange("https://dummyapi.io/data/v1/user", HttpMethod.GET,httpEntity,Object.class);
        return response;

    }

}
