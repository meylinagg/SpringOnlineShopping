package com.meylinagunawan;

import com.meylinagunawan.dao.ProductService;
import com.meylinagunawan.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    ProductService ps;
    
@RequestMapping()
public String goToProduct(){
    return "product";
}
@RequestMapping(value = "/detail/{id}")
public String detail(@PathVariable("id")Integer id, Model model){
    Product product = ps.findById(id);
    model.addAttribute("product", product);
    return "detail";
}
}
