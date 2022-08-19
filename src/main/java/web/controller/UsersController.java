package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import web.Dao.UsersDAOImp;
import web.Servises.UsersServises;
import web.model.User;

@Controller
@RequestMapping()
public class UsersController {

    private final UsersServises usersServises;

    @Autowired
    public UsersController(UsersServises usersServises) {
        this.usersServises = usersServises;
    }

    //Метод для получения всех User-ов
    @GetMapping()
    public String printUsers(Model model) {
        model.addAttribute("users", usersServises.allUsers());
        return "printUsers";
    }


    @GetMapping("/{id}")
    public String searchById(@PathVariable("id") int id, Model model) {
        model.addAttribute("users", usersServises.searchById(id));
        return "searchById";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("users", new User());
        return "newUser";
    }

    @PostMapping()
    public String createUser(@ModelAttribute("users") User user) {
        usersServises.save(user);
        return "redirect:/";

    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("users", usersServises.searchById(id));
        return "edit";

    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("users") User user,@PathVariable("id")int id){
        usersServises.update(id,user);
        return "redirect:/";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        usersServises.delete(id);
        return "redirect:/";
    }
}
