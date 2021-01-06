package com.practice.myappvs;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    
    @RequestMapping("/api/foos")
    @ResponseBody
    public String getFoos(@RequestParam List<String> id) {
         int x=Integer.parseInt(id.get(0));
         int y=Integer.parseInt(id.get(1));
         if(y==0)
         {
             return "Not Possible";
         }
         double z=(double)x/y;
        System.out.println(z);
        return String.valueOf(z);
    }
}
