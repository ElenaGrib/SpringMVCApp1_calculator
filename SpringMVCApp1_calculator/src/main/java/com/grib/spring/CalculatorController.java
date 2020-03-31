package com.grib.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @RequestMapping ("calculator")
    ModelMap say (@RequestParam (required = false) Integer a,
                  @RequestParam (required = false) Integer b,
                  @RequestParam (required = false) String sign) {

        ModelMap modelMap = new ModelMap();
        if (a != null && b != null) {
            modelMap.addAttribute("a", a);
            modelMap.addAttribute("b", b);
            modelMap.addAttribute("sign", sign);

            switch (sign) {
                case ("+"):
                    modelMap.addAttribute("result", a + b);
                    break;
                case ("-"):
                    modelMap.addAttribute("result", a - b);
                    break;
                case ("*"):
                    modelMap.addAttribute("result", a * b);
                    break;
                case ("/"):
                    modelMap.addAttribute("result", a / b);
                    break;
            }

        } else {
            modelMap.addAttribute("result", "");
        }

        return modelMap;
    }
}
