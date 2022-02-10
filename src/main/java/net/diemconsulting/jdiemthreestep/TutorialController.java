package net.diemconsulting.jdiemthreestep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tutorial")
public class TutorialController {

    @RequestMapping("/banana")
    public String showBanana(){
        return "/pages/tutorial-banana";
    }

    @RequestMapping("/computer")
    public String showComputer(){
        return "/pages/tutorial-computer";
    }

    @RequestMapping("/cry")
    public String showCry(){
        return "/pages/tutorial-cry";
    }
}
