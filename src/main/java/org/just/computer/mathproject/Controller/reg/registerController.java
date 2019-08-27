package org.just.computer.mathproject.Controller.reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.just.computer.mathproject.Service.reg.RegisterService;
@RestController
public class registerController {
    @Autowired
    RegisterService registerService;
    @PostMapping("/reg")
    public String register(String username,String password){
        return registerService.register(username,password);
    }
}
