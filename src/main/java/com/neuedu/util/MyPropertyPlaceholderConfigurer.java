package com.neuedu.util;


import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * Created by Administrator on 2019/4/1.
 */
public class MyPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer{
    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if(propertyName.equals("username")||propertyName.equals("password")){
            return DESUTIL.decode(propertyValue);
        }
        return propertyValue;
    }
}
