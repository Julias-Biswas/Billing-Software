/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author julia
 */
public class Validations 
{
    private final Pattern name ;
    private final Pattern phoneno ;
    private final Pattern password ;
    private final Pattern email ;
    
    private final Pattern item_id ;
    private final Pattern item_name ;
    private final Pattern item_price ;
    private final Pattern item_desc ;
    
    private Matcher matcher ;
    private static final String NAME_PATTERN = "^[A-Za-z-0-9 ]{3,25}$";   
    private static final String PHONE_PATTERN = "^[0-9]{10}$";
    private static final String PASS_PATTERN = "^[A-Za-z@0-9]{8,25}$";
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z-]+(\\.[A-Za-z]+)*(\\.[A-Za-z]{2,3})$";
    
    private static final String ITEMID_PATTERN = "^[A-Za-z/0-9]{10,55}$";
    private static final String ITEMNAME_PATTERN = "^[A-Za-z 0-9 ]{3,25}$";
    private static final String ITEMPRICE_PATTERN = "^[0-9-\\+]+(\\.[_0-9])"+"[.[0-9]]{1,25}$";
    private static final String ITEMDESC_PATTERN = "^[A-Za-z 0-9 , \n , A-Za-z 0-9]{15,1000}$";
    
    public Validations()
    {
        email = Pattern.compile(EMAIL_PATTERN);
        name = Pattern.compile(NAME_PATTERN);
        password = Pattern.compile(PASS_PATTERN);
        phoneno = Pattern.compile(PHONE_PATTERN);
        
        item_id = Pattern.compile(ITEMID_PATTERN);
        item_name = Pattern.compile(ITEMNAME_PATTERN);
        item_price = Pattern.compile(ITEMPRICE_PATTERN);
        item_desc = Pattern.compile(ITEMDESC_PATTERN);
    }
    
    public boolean emailValidate(final String email1)
    {
        matcher = email.matcher(email1);
        return matcher.matches();
    }
    
    public boolean nameValidate(final String name1)
    {
        matcher = name.matcher(name1);
        return matcher.matches();
    }
    
    public boolean passwordValidate(final String pass1)
    {
        matcher = password.matcher(pass1);
        return matcher.matches();
    }
    
    public boolean phoneValidate(final String phoneno1)
    {
        matcher = phoneno.matcher(phoneno1);
        return matcher.matches();
    }
    
    public boolean itemIdValidate(final String item_id1)
    {
        matcher = item_id.matcher(item_id1);
        return matcher.matches();
    }
    
    public boolean itemNameValidate(final String item_name1)
    {
        matcher = item_name.matcher(item_name1);
        return matcher.matches();
    }
    
    public boolean itemPriceValidate(final String item_price1)
    {
        matcher = item_price.matcher(item_price1);
        return matcher.matches();
    }
    
    public boolean itemDescValidate(final String item_desc1)
    {
        matcher = item_desc.matcher(item_desc1);
        return matcher.matches();
    }
}
