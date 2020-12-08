package org.CoffeeMachineRestApp.controllers;

import org.CoffeeMachineRestApp.models.ControllerHandler;
import org.CoffeeMachineRestApp.models.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/Drinks", produces = "application/json", method = {RequestMethod.PUT})
    @ResponseStatus(HttpStatus.OK)
    public void updateDrink(@RequestBody Drink drink){
        System.out.println("drink = " + drink.getName());
        controllerHandler.updateDrink(drink);
    }
}
