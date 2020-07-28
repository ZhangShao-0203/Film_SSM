package com.film.controller;

import com.film.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VipController {

    @Autowired
    IVipService vipService;


}
