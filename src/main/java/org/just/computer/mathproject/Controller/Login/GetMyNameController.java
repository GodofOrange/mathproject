package org.just.computer.mathproject.Controller.Login;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@Api(tags ="获得自己的名字")
@RequestMapping("/GetMyNameController")
public class GetMyNameController {
    @GetMapping("/getMyName")
    public String getMyName(Principal pl){
        try {
            return pl.getName();
        }catch (Exception e){
            return "xxx";
        }
    }
}
