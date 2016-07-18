/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rodboza.coletortwitter.Model;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author rodboza
 */
public class Factory {

    private static Map<Long, User> _Users = new HashMap<>();
    private static Map<Long, Post> _Posts = new HashMap<>();

    public static Post NewPost(long id, String text, String lang, User user) {

        if (_Posts.containsKey(id)) {
            return _Posts.get(id);
        }

        Post post = new Post();
        post.setId(id);
        post.setLang(lang);
        post.setUser(user);
        user.setPost(post);

        _Posts.put(id, post);
        return post;
    }

    public static Post NewPost(long id, String text, String lang, long userId, String userName, int userFollowers) {
        User user = NewUser(userId, userName, userFollowers);
        return NewPost(id, text, lang, user);
    }

    public static User NewUser(long id, String name, int followers) {

        if (_Users.containsKey(id)) {
            return _Users.get(id);
        }

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setFollowers(followers);
        user.setPosts(new ArrayList<Post>());

        _Users.put(id, user);
        return user;
    }

}
