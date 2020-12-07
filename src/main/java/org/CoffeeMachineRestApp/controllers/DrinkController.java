package org.CoffeeMachineRestApp.controllers;

import org.CoffeeMachineRestApp.models.ControllerHandler;
import org.CoffeeMachineRestApp.models.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class DrinkController {

    @Autowired
    private ControllerHandler controllerHandler;

    @GetMapping("/Drinks")
    public Iterable<Drink> getDrinks(){
        return controllerHandler.getAll();
    }

    @GetMapping("/Drinks/{drinkId}")
    public Drink getDrink(@PathVariable("drinkId")Integer drinkId){return controllerHandler.getDrink(drinkId);}
}
