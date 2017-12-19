package com.meylinagunawan;

import com.meylinagunawan.dao.ProductService;
import com.meylinagunawan.model.Barang;
import com.meylinagunawan.model.Cart;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    ProductService ps;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String order(HttpSession session, Model model, @PathVariable Integer id) {

        int x = 0;
        Cart cart = null;
        if (session.getAttribute("cart") == null) {
            cart = new Cart();

        } else {
            cart = (Cart) session.getAttribute("cart");
        }

        cart.getIsiKeranjang().put(id, new Barang(ps.findById(id), 1));
        int jumlah = cart.getIsiKeranjang().get(id).getJumlahBarang() + 1;
        cart.getIsiKeranjang().put(id, new Barang(ps.findById(id), jumlah));

        x = cart.getIsiKeranjang().size();
        System.out.println("Jumlah : " + x);
        session.setAttribute("cart", cart);
        session.setAttribute("totals", x);

        return "successlogin";
    }
}
