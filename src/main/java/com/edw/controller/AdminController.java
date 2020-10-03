package com.edw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * <pre>
 *     com.edw.controller.AdminController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 03 Okt 2020 13:04
 */
@Controller
public class AdminController {

    @GetMapping(path = "/admin/index")
    public String index() {
        return "admin-index";
    }


    @GetMapping(path = "/admin/logout")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "redirect:/";
    }

}
