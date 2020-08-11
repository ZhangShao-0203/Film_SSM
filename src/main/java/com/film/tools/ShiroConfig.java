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

    @Bean
    public ShiroRealm getShiroRealm(){

        HashedCredentialsMatcher hashedCredentialsMatcher = hashedCredentialsMatcher();
        ShiroRealm shiroRealm=new ShiroRealm();
        shiroRealm.setAuthenticationCachingEnabled(false);
        shiroRealm.setCredentialsMatcher(hashedCredentialsMatcher);  //给安全数据源设置校验规则

        return shiroRealm;
    }

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

        /*LinkedHashMap<String,String> map=new LinkedHashMap<String, String>();
        map.put("/admin/login.html","anon");  //不用登陆就能访问

       map.put("/**","authc");
       shiroFilterFactoryBean.setFilterChainDefinitionMap(map);

       //没有登录的时候 去哪
       shiroFilterFactoryBean.setLoginUrl("/user/login.html");*/

        /*//验证是否有权限
        LinkedHashMap<String,String> map=new LinkedHashMap<String, String>();
        map.put("/admin/login.html","anon");  //不用登陆就能访问
        map.put("/indexRegist","anon");
        map.put("/regist","anon");

        map.put("/admin/index.html","authc");  //登录才能访问
        map.put("/**","authc");

        ////////////////
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        //没有登录的时候 去哪
        shiroFilterFactoryBean.setLoginUrl("/user/login.html");  //controller映射

        //访问没有权限的资源的时候 去哪
        shiroFilterFactoryBean.setUnauthorizedUrl("/user/login.html"); //controller映射*/

        return shiroFilterFactoryBean;
    }

    //MD5加密--Shiro
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        //hashedCredentialsMatcher.setHashIterations(3);//加密次数

        return hashedCredentialsMatcher;
    }
}
