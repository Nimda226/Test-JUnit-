package controllers;

import models.User;
import org.springframework.web.client.RestTemplate;

public class UserController {
    private RestTemplate restTemplate;
    private final String  startUrl = "https://api.github.com";

    public UserController(){
        restTemplate = new RestTemplate();
    }

    /**
     * @param username Enter username of the person we want to find followers
     * @return followers
     *
     */
    public User[] getFollowersByUser(String username){
        try {
            return restTemplate.getForObject(startUrl + "/users/"+ username + "/followers", User[].class);
        } catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    /**
     * @param username enter the username of the person we want to know who he is subscribed to
     * @return those on whom he signed
     */
    public User[] getFollowingByUser(String username){
        try {
            return restTemplate.getForObject(startUrl + "/users/"+ username + "/following", User[].class);
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}

