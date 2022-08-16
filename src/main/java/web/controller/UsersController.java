package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import web.Service.UsersService;

@Controller
@RequestMapping("/user")
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    //Метод для получения всех User-ов
    @GetMapping("/list")
    public String printUsers(Model model) {
        model.addAttribute("users", usersService.allUsers());
        return "printUsers";
    }

    //Метод для получения конкретного User-а по id
    @GetMapping("/{id}")
    public String searchById(@PathVariable("id") int id, Model model) {
        model.addAttribute("users", usersService.searchById(id));
        return "searchById";
    }
}
