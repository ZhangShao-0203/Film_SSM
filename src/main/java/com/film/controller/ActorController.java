package com.film.controller;

import com.film.service.IActorService;
import com.film.service.impl.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ActorController {
    @Autowired
    IActorService iActorService;

}
