package com.trmab.SpringBootWebUsingJSP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @RequestMapping("/employee")
    public ModelAndView employee(ModelAndView mv) {
        mv.setViewName("addemployee");
        return mv;
    }

//    @RequestMapping("/employee/add")
//    public ModelAndView employeeAdd(@RequestParam("eid") int eid, @RequestParam("ename") String ename, ModelAndView mv) {
//        Alien alien = new Alien();
//        alien.setEid(eid);
//        alien.setEname(ename);
//        mv.addObject("resultalien", alien);
//        mv.setViewName("resultalien");
//        return mv;
//    }

    //we can now simply just use it like this also ModelAttribute is optional it is uses if u want to
    //pass value to jps file with different name as bydefault it will recieve ${employee} there but now
    // it will be used as ${resultemployee}

    @RequestMapping("/employee/add")
    public String employeeAdd(@ModelAttribute("resultemployee") Employee employee) {
        return "resultemployee";
    }

    //also you can use ModelAttribute the top of the method also like
    @ModelAttribute("course")
    public String courseName() {
        return "JAVA";
    }

}