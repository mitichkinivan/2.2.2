package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;


@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarDAO carDAO;

    @GetMapping()
    public String getCount(@RequestParam(defaultValue = "0") int count, Model model){
        if (count == 0){
            model.addAttribute("carList", carDAO.getCars());
        } else {
            model.addAttribute("carList", carDAO.getCarsCount(count));
        }
        return "cars/cars";
    }

}