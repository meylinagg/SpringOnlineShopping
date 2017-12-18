package com.meylinagunawan;

import com.meylinagunawan.dao.UserService;
import com.meylinagunawan.model.Register;
import com.meylinagunawan.model.User;
import com.meylinagunawan.utils.PasswordDigest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisController {
    
    @Autowired
    UserService us;
    
    @RequestMapping
    public String registerForm(Model model) {
        Register registerBean = new Register();
        model.addAttribute("registerBean", registerBean);
        return "registrasi";
    }
    @RequestMapping(value="/save")
    public String saveRegistrasi(@ModelAttribute("registerBean") Register register, Model model) {
        User user = new User();
        String encryptedPassword = PasswordDigest.createEncryptedPassword(register.getPassword());
        user.setName(register.getName());
        user.setPassword(encryptedPassword);
        user.setNumber(Integer.parseInt(register.getNumberHp()));
        user.setEmail(register.getEmail());
        
        us.saveUser(user);
        
        model.addAttribute("data", register);
        return "redirect:../login";
    }
}
