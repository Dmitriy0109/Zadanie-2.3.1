package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import web.Service.UsersDAOImp;

@Controller
@RequestMapping()
public class UsersController {

    private final UsersDAOImp usersDAOimp;

    @Autowired
    public UsersController(UsersDAOImp usersDAOimp) {
        this.usersDAOimp = usersDAOimp;
    }

    //Метод для получения всех User-ов
    @GetMapping()
    public String printUsers(Model model) {
        model.addAttribute("users", usersDAOimp.allUsers());
        return "printUsers";
    }

    //Метод для получения конкретного User-а по id
//    @GetMapping("/{id}")
//    public String searchById(@PathVariable("id") int id, Model model) {
//        model.addAttribute("users", usersDAOimp.searchById(id));
//        return "searchById";
//    }
//
//    @GetMapping("/new")
//    public String newUser(Model model) {
//        model.addAttribute("users", new User());
//        return "newUser";
//    }
//
//    @PostMapping()
//    public String createUser(@ModelAttribute("users") User user) {
//        usersDAOimp.save(user);
//        return "redirect:/";
//
//    }
//
//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") int id) {
//        model.addAttribute("users", usersDAOimp.searchById(id));
//        return "/edit";
//
//    }
//
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("users") User user,@PathVariable("id")int id){
//        usersDAOimp.update(id,user);
//        return "redirect:/";
//    }
}
