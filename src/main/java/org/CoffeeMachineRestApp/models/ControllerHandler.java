package org.CoffeeMachineRestApp.models;

import org.CoffeeMachineRestApp.DAO.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerHandler {

    @Autowired
    private DrinkRepository repository;

    public ControllerHandler(){}

    public Iterable<Drink> getAll(){
        return repository.findAll();
    }
}
