package com.practice.myappvs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Multiply {
    
    @RequestMapping("mul")
    @ResponseBody
    public String getFoos(@RequestParam("a") String a, @RequestParam("b") String b) {
         int x=Integer.parseInt(a);
         int y=Integer.parseInt(b);
         
         int z=x*y;
        System.out.println(z);
        return String.valueOf(z);
    }
}
