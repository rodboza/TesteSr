/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rodboza.coletortwitter.Teste;

import br.com.rodboza.coletortwitter.*;
import br.com.rodboza.coletortwitter.Model.Post;
import java.util.ArrayList;

/**
 *
 * @author rodboza
 */
public class Teste {
    public static void main ( String[] args ){
        System.out.println("hellow world");
        
        Coletor c = new Coletor();
        
        ResultFindHashTag result = c.FindHashTag("#rio2016");
                
        
        System.out.print(" qtd de posts:");
        System.out.println(result.GetPosts().size());
        System.out.print(" qtd de useers:");
        System.out.println(result.GetUsers().size());
        
    }
}
