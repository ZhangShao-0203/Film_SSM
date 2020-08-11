package com.film.tools;

import com.film.pojo.Admin;
import com.film.service.IAdminService;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private IAdminService adminService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        /*String pid_str = principalCollection.toString();

        Set<String> realmNames = principalCollection.getRealmNames();
        for(String realmName:realmNames){
            System.out.println("realmNames::::::::"+realmNames);
        }
        int id=Integer.parseInt(pid_str);
        try {
            Admin admin = adminService.get(id);
            if (admin == null) {
                throw new UnknownAccountException("没有此账户");
            }else{
                Set<String> roles=new HashSet<String>();
                roles.add(admin.getRank());
                //授权
                SimpleAuthorizationInfo info=new SimpleAuthorizationInfo(roles);
                return info;
            }
        }catch (Exception e){
        }


            return null;*/
        return null;
    }

    //认证--调用，去查询配置文件的用户信息--3
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //从token中取出身份信息
        String aidStr = (String)authenticationToken.getPrincipal();
        int id = Integer.parseInt(aidStr);
        System.out.println("id::::::::"+id);

        //调用service查询,数据库

            Admin admin = adminService.get(id);
            System.out.println("admin::::"+admin.getApass());

            if (admin == null) {
                throw new UnknownAccountException("没有此账户");
            }
            //加盐
            ByteSource salt = ByteSource.Util.bytes(admin.getAname());
            System.out.println(salt+"4444444444444");
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(id,admin.getApass(), salt, this.getName());

            System.out.println("info:::::" + info);//info---11(id)

            return info;
    }
}
