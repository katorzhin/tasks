package tests.example.department.impl;

import tests.example.cooker.Cooker;
import tests.example.department.Department;
import tests.example.menu.Dish;
import tests.example.menu.MenuComponents;
import tests.example.menu.MenuPoint;

public class ColdDepartment extends Department {
    public ColdDepartment() {
        this.cookers = new Cooker[]{
                new Cooker("Vasiliy", new String[]{"паста", "салат", "сало", "селедка", "заправка"}),
                new Cooker("Inna", new String[]{"соус", "свинец", "огурцы", "водка"}),
        };
    }

    @Override
    public Dish cook(MenuPoint menuPoint) {
        Dish dish = new Dish();
        for (String component : MenuComponents.getComponents(menuPoint)) {
            dish.add(getDishComponent(component));
        }
        return dish;
    }


}

