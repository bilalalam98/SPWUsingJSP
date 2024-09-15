package com.trmab.SpringBootWebUsingJSP;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//    now here we will return the jsp
    //also we have to use Request Mapping for redirecting to home
    @RequestMapping("/")
    public String home(){
//        return "index.jsp";
        //reson return in add method to remove.jsp
        return "index";
        //now in the above case our browser download the fil in the computer with all the code written on index.jsp  after
        //redirection to my route but i wanted it to show that on my web page now for that we have to convertjsp page
//        as by default it doesnt suport this conversion fopr this we will use tomcat jasper package
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        //now we have made this because after the submit it redirects to this add url
//
//        //so now for getting the parameters form the input submitted i can use httpServeletRequest
//        //and then spring will provide me the request in it
//        int num1 = Integer.parseInt(req.getParameter("number1"));
//        int num2 = Integer.parseInt(req.getParameter("number1"));
//        int result = num1+num2;
//        // now how to pass result to our jsp we can either pass it like return "result.jsp?result"
////        orbetter approach is to use session which is sarvelet
//        session.setAttribute("result", result);
//        //now in jsp you can either get it like <%= session.getAttribute("result")%> or use jsp stardar library
//        //${result}
//        return "result.jsp";
//    }

    // now we can use model which is interface and was intoduces after 2.4 rather then using
    // httpSarvletRequest and also no need to write file extension
    // also lets use RequestParam annonation
//    @RequestMapping("add")
//    public String add (@RequestParam("number1") int num1, @RequestParam("number2") int num2, Model model){
//        int result = num1 + num2;
//        model.addAttribute("result", result);
//        System.out.println("ayahan agya bhai result"+" " +result);
//        return  "result";
//        //also now i have shifter my index and css files in views folder iside the webapps but now we have to set the prefix and postfix to tell
//        //how to find my file prefix is file name and suffix will be the .jsp or any service you use this will be
//        //resolved by view resolver and you tells it in application properties
//    }


    //now lets change is to ModelAndView as its return as we are working with model and view and model object
//    whould be accountable to set model and view will be used to view the data

    @RequestMapping("add")
    public ModelAndView add (@RequestParam("number1") int num1, @RequestParam("number2") int num2, ModelAndView mv){
        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        System.out.println("ayahan agya bhai result"+" " +result);
        return mv;
    }
}
