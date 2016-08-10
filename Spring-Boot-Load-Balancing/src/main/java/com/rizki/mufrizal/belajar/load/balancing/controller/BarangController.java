package com.rizki.mufrizal.belajar.load.balancing.controller;

import com.rizki.mufrizal.belajar.load.balancing.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com> <https://RizkiMufrizal.github.io>
 * @Since 10 August 2016
 * @Time 21:57
 * @Project Spring-Boot-Load-Balancing
 * @Package com.rizki.mufrizal.belajar.load.balancing.controller
 * @File BarangController
 */

@Controller
public class BarangController {

    @Autowired
    private BarangRepository barangRepository;

    @Secured(value = {"ROLE_ADMINISTRATOR"})
    @RequestMapping(value = "/barang", method = RequestMethod.GET)
    public String index() {
        return "barang/Index";
    }

}
