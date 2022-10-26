package br.org.recode.darlingviagens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/")
    public ModelAndView home(){

        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;

    }
	
	@GetMapping("/destinos")
    public ModelAndView destinos(){

        ModelAndView modelAndView = new ModelAndView("destinos");

        return modelAndView;

    }
	
	@GetMapping("/contato")
    public ModelAndView contato(){

        ModelAndView modelAndView = new ModelAndView("contato");

        return modelAndView;

    }
	
	@GetMapping("/pacotes")
    public ModelAndView pacotes(){

        ModelAndView modelAndView = new ModelAndView("pacotes");

        return modelAndView;

    }
	
	@GetMapping("/promocoes")
    public ModelAndView promocoes(){

        ModelAndView modelAndView = new ModelAndView("promocoes");

        return modelAndView;

    }
	

}
