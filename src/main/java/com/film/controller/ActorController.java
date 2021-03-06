package com.film.controller;

import com.film.pojo.Actor;
import com.film.pojo.Movie;
import com.film.service.IActorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    IActorService actorService;


    @RequestMapping("/list")
    @ResponseBody
    public List<Actor> list() {
        List<Actor> actors = actorService.list();
        return actors;
    }
    @RequestMapping("/listmm")
    @ResponseBody
    public List<Actor> listm(@RequestParam(value = "start", defaultValue = "1")int start,@RequestParam(value = "size", defaultValue = "6")int size,@RequestParam(value = "seek")String seek) {
        List<Actor> listm = actorService.listmm(start,size,seek);
        return listm;
    }
    @RequestMapping("/listm")
    @ResponseBody
    public List<Actor> listmm(int mid) {
        List<Actor> listm = actorService.listm(mid);
        return listm;
    }
    @RequestMapping("/edit")
    @ResponseBody
    public Actor edit(int acid) {
        Actor actor = actorService.get(acid);
        return actor;
    }

    @SneakyThrows
    @RequestMapping("/update")
    public ModelAndView update(Actor actor, ModelAndView mav,MultipartFile doc, HttpServletRequest request) {
        String originalFilename = doc.getOriginalFilename();
        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));

        String uuid = UUID.randomUUID().toString();
        String savePath = request.getRealPath("/") + "docs/" + uuid + actor.getAcid() + substring;
        File file = new File(savePath);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        doc.transferTo(file);
        //读取路径
        String readPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/docs/" + uuid + actor.getAcid() + substring;
        actor.setAcphoto(readPath);
        int i = actorService.update(actor);
        mav.setViewName("/admin/actor.html");
        return mav;
    }

    @SneakyThrows
    @RequestMapping("/add1")
    public String add(Actor actor, MultipartFile doc, HttpServletRequest request) {
        System.out.println("1");
        String originalFilename = doc.getOriginalFilename();
        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        String savePath = request.getRealPath("/") + "docs/" + uuid + actor.getAcname() + substring;
        File file = new File(savePath);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        doc.transferTo(file);
        //读取路径
        String readPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/docs/" + uuid + actor.getAcname() + substring;
        actor.setAcphoto(readPath);
        int i = actorService.add(actor);
        return "/admin/actor.html";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int acid) {
        int i = actorService.delete(acid);
        return i;
    }


}
