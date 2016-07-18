/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rodboza.coletortwitter.Model;

import java.util.ArrayList;

/**
 *
 * @author rodboza
 */
public class User {
    
    private long _Id;
    private String _Name;
    private int _Followers;
    private ArrayList<Post> _Posts ;
            
    
    public User (){
        
    }

    /**
     * @return the Id
     */
    public long getId() {
        return _Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(long Id) {
        this._Id = Id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return _Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this._Name = Name;
    }

    /**
     * @return the Followers
     */
    public int getFollowers() {
        return _Followers;
    }

    /**
     * @param Followers the Followers to set
     */
    public void setFollowers(int Followers) {
        this._Followers = Followers;
    }

    /**
     * @return the Posts
     */
    public ArrayList<Post> getPosts() {
        return _Posts;
    }

    /**
     * @param Posts the Posts to set
     */
    public void setPosts(ArrayList<Post> _Posts) {
        this._Posts = _Posts;
    }

    /**
     * @param Post the Post to add in Posts
     */
    public void setPost(Post _Post) {
        this._Posts.add(_Post);
    }
    
}
