package com.edw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <pre>
 *     com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 03 Okt 2020 12:26
 */
@Controller
public class IndexController {
    @GetMapping(path = "/")
    public String index() {
        return "index";
    }
}
