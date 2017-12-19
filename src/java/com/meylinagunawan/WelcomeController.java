package com.meylinagunawan;

import com.meylinagunawan.dao.ProductService;
import com.meylinagunawan.model.Product;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @Autowired
    ProductService ps;

    @RequestMapping()
    public String goToWelcome(HttpSession session, ModelMap model) {
        model.put("produk", ps.showAllProduct());
        return "welcome";
    }

}
