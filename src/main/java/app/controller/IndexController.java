package app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.model.Book;
import app.model.Reader;
import app.service.BookService;
import app.service.ReaderService;

@Controller
public class IndexController {

	@Autowired
	private BookService bookService;

	@Autowired
	private ReaderService readerService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLogin(Model model) {
		model.addAttribute("user", new Reader());
		return "login";
	}

	@RequestMapping(value = "checkLogin", method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute("user") Reader user, Model model) {
		Reader userCheck = readerService.checkLogin(user);
		if (userCheck == null) {
			model.addAttribute("err", "login error");
			return "login";
		}
		model.addAttribute("book", new Book());
		model.addAttribute("listBook", bookService.loadBooks());
		return "redirect:/listBook";
	}

	@RequestMapping(value = "listBook", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("listBook", bookService.loadBooks());
		return "listBook";
	}

	@RequestMapping(value = "searchActionUrl", method = RequestMethod.GET)
	public String searchBook(@Valid @ModelAttribute("book") Book book, Model model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "listBook";
		}

		return "redirect:/listBook";
	}
}
