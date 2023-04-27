package com.kbstar.controller;

import com.kbstar.dto.Cust;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j  //로그사용할수있따
@Controller
@RequestMapping("/cust")
public class CustController {
    //Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    String dir = "cust/";

    //127.0.0.1/cust
    @RequestMapping("")
    public String main(Model model) {
        model.addAttribute("left", dir + "left");
        model.addAttribute("center", dir + "center");
        // logger.info("-----------------------------------------------------------------");
        Random r = new Random();
        int inx = r.nextInt(1000) + 1;
        log.info(inx + "");
        return "index";
    }

    @RequestMapping("add")
    public String add(Model model) {
        model.addAttribute("left", dir + "left");
        model.addAttribute("center", dir + "add");
        return "index";
    }

    @RequestMapping("get")
    public String get(Model model, String id) {
        Cust cust = new Cust(id, "xxx", "james");
        model.addAttribute("gcust", cust);
        model.addAttribute("left", dir + "left");
        model.addAttribute("center", dir + "get");
        return "index";
    }

    @RequestMapping("all")
    public String all(Model model) {
        List<Cust> list = new ArrayList<>();
        list.add(new Cust("id01", "pw01", "james1"));
        list.add(new Cust("id02", "pw02", "james2"));
        list.add(new Cust("id03", "pw03", "james3"));
        list.add(new Cust("id04", "pw04", "james4"));
        list.add(new Cust("id05", "pw05", "james5"));

        model.addAttribute("clist", list);

        model.addAttribute("left", dir + "left");
        model.addAttribute("center", dir + "all");
        return "index";
    }
}
