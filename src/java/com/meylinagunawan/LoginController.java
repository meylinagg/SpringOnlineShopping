package com.meylinagunawan;

import com.meylinagunawan.dao.ProductService;
import com.meylinagunawan.dao.UserService;
import com.meylinagunawan.model.Login;
import com.meylinagunawan.model.Product;
import com.meylinagunawan.model.User;
import com.meylinagunawan.utils.PasswordDigest;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService us;
    @Autowired
    ProductService ps;

    @RequestMapping()
    public String goToLogin(Model model) {
        Login loginBean = new Login();
        model.addAttribute("loginBean", loginBean);
        return "login";
    }

    @RequestMapping(value = "/check")
    public String checkLogin(HttpSession session, @ModelAttribute("loginBean") Login loginBean, Model model) {
        User user = us.findByEmail(loginBean.getEmail());
        if (user.getEmail() == null) {
            model.addAttribute("errMsg", "Email salah");
            return "login";
        }

        String encryptedPassword = PasswordDigest.createEncryptedPassword(loginBean.getPassword());
        if (!encryptedPassword.equals(user.getPassword())) {
            model.addAttribute("errMsg", "Password salah");
            return "login";
        }

        List<Product> products = ps.showAllProduct();
        model.addAttribute("produk", products);

        session.setAttribute("user", user);

        return "successlogin";
    }
}
