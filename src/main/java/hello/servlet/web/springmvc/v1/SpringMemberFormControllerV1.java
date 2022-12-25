package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Component // SpringBean으로 등록
//@RequestMapping // @RequestMapping이 클래스 레벨에 있을 경우, RequestMappingHandlerMapping이 해당 핸들러(컨트롤러)를 찾을 수 있음
@Controller // @Component + @RequestMapping 과 유사
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
