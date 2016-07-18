/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rodboza.coletortwitter;

import java.util.*;
import br.com.rodboza.coletortwitter.Model.*;
import twitter4j.*;
import twitter4j.auth.*;
import twitter4j.conf.*;

/**
 *
 * @author rodboza
 */
public class Coletor {
    
    public ResultFindHashTag FindHashTag (String hashTag){
        ResultFindHashTag resultHT = new ResultFindHashTag();
        
        Twitter twitter = GetTwitterInstance();
        try {
            Query query = new Query(hashTag);
            QueryResult result = twitter.search(query);
            for (Status s : result.getTweets()) {
                //System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
                twitter4j.User u =  s.getUser();
                resultHT.NewPost(s.getId(), s.getText(),s.getLang(),u.getId(), u.getName(),u.getFollowersCount());
            }

            return resultHT;
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
        return null;
    }

    public ArrayList<Post> GetPosts(String hash) {

        ArrayList<Post> posts = new ArrayList<>();

        Twitter twitter = GetTwitterInstance();
        try {
            Query query = new Query(hash);
            QueryResult result = twitter.search(query);
            for (Status s : result.getTweets()) {
                //System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
                twitter4j.User u =  s.getUser();
                Post p = Factory.NewPost(s.getId(), s.getText(),s.getLang(),u.getId(), u.getName(),u.getFollowersCount());
                posts.add(p);
            }

            return posts;
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
        return null;
    }

    private Twitter GetTwitterInstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("Zt0zDjPMohoQjEjeZmKoJBqVS")
                .setOAuthConsumerSecret("rm3YVTlcavNRVMQPALnZyVHxKQUZXtS1Aa8ZI9DVB3bn84Fgt0")
                .setOAuthAccessToken("754819894668095488-HmEX3thtcludrtRgNrI3Up7U4UwdObB")
                .setOAuthAccessTokenSecret("Hoc0JpwKBt0WAvAgWcjS9i7WsxgdhgVnwAVfa6XuoEnye");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }

}
