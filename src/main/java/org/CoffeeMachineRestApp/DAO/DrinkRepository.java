package org.CoffeeMachineRestApp.DAO;

import org.CoffeeMachineRestApp.models.Drink;
import org.springframework.data.repository.CrudRepository;

public interface DrinkRepository extends CrudRepository<Drink, Integer> {
}
