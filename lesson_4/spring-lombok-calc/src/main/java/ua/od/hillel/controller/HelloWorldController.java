package ua.od.hillel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.od.hillel.controller.dto.GreetingDto;
import ua.od.hillel.service.HelloWorldService;

/**
 * Created by ruslangramatic on 5/5/18.
 */
/*
<beans>
 ...
 <bean class="ua.od.hillel.controller.HelloWorldController">
    <property name="helloWorldService" ref="ua.od.hillel.service.HelloWorldService"/>
 </bean>
 ...
</beans
*/
@Controller
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/hello-world")
    @ResponseBody
    public GreetingDto sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return helloWorldService.sayHello(name);
    }
}