package com.film.tools;

import com.film.pojo.Admin;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

@Configuration
public class ShiroConfig {

    //创建安全管理对象--1
    @Bean
    public DefaultWebSecurityManager securityManager(){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager(getShiroRealm());
        return securityManager;  //安全管理器对象
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager());

        return shiroFilterFactoryBean;
    }

    @Bean
    public ShiroRealm getShiroRealm(){
        ShiroRealm shiroRealm = new ShiroRealm();
        return shiroRealm;
    }

    //MD5加密--Shiro
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        hashedCredentialsMatcher.setHashIterations(3);//加密次数

        return hashedCredentialsMatcher;
    }
    @Bean
    public ShiroRealm getRealm(){

        HashedCredentialsMatcher hashedCredentialsMatcher = hashedCredentialsMatcher();
        ShiroRealm shiroRealm=new ShiroRealm();
        shiroRealm.setAuthenticationCachingEnabled(false);
        shiroRealm.setCredentialsMatcher(hashedCredentialsMatcher);  //给安全数据源设置校验规则

        return shiroRealm;
    }

}
