/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.image.BufferedImage;

/**
 *
 * @author julia
 */
public class AdminDetails 
{
    public AdminDetails(){ }
    
    private String name ;
    private String email ;
    private String phoneno ;
    private String password ;
    private String gender ;
    private BufferedImage im ;

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public BufferedImage getIm()
    {
        return im;
    }

    public void setIm(BufferedImage im) 
    {
        this.im = im;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getPhoneno()
    {
        return phoneno;
    }

    public void setPhoneno(String phoneno) 
    {
        this.phoneno = phoneno;
    }
}
