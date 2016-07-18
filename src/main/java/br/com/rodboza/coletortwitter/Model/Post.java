/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rodboza.coletortwitter.Model;

import java.util.Date;

/**
 *
 * @author rodboza
 */
public class Post {
    
    private long _Id;
    private String _Text;
    private Date _CreatedAt;
    private String _Lang;
    private User _User;
    
    public Post(){
        
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
     * @return the Text
     */
    public String getText() {
        return _Text;
    }

    /**
     * @param Text the Text to set
     */
    public void setText(String Text) {
        this._Text = Text;
    }

    /**
     * @return the CreatedAt
     */
    public Date getCreatedAt() {
        return _CreatedAt;
    }

    /**
     * @param CreatedAt the CreatedAt to set
     */
    public void setCreatedAt(Date CreatedAt) {
        this._CreatedAt = CreatedAt;
    }

    /**
     * @return the Lang
     */
    public String getLang() {
        return _Lang;
    }

    /**
     * @param Lang the Lang to set
     */
    public void setLang(String Lang) {
        this._Lang = Lang;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return _User;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this._User = user;
    }
    
}
