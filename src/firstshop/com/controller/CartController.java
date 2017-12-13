package firstshop.com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import firstshop.com.entity.Product;
import firstshop.com.serviceimpl.CartServiceImpl;

@Controller
public class CartController {
	@Resource
	private CartServiceImpl cartServiceImpl;
	
	@RequestMapping(value = "/addcart",method = RequestMethod.GET)
	public String addCart(Product product,HttpServletRequest request) {
		this.cartServiceImpl.addCart(product.getId(), request);
		return "cart";
	}
}
