package tests.example.menu;

import tests.example.department.Department;
import tests.example.department.impl.ColdDepartment;
import tests.example.department.impl.HotDepartment;
import tests.example.department.impl.TestyDepartment;


import static tests.example.menu.MenuPoint.*;

public class MenuComponents {
    private static MenuComponent[] menuComponents = {
            new MenuComponent(POINT1, new HotDepartment(), new String[]{"картошка", "мясо", "соус"}),
            new MenuComponent(POINT2, new HotDepartment(), new String[]{"тесто", "начинка", "соус"}),
            new MenuComponent(POINT3, new ColdDepartment(), new String[]{"паста", "соус"}),
            new MenuComponent(POINT4, new ColdDepartment(), new String[]{"салат", "свинец", "заправка"}),
            new MenuComponent(POINT5, new TestyDepartment(), new String[]{"пирожене", "крем", "фрукты"}),
            new MenuComponent(POINT6, new ColdDepartment(), new String[]{"сало", "селедка", "огурцы", "водка"})

    };

    public static Department getDepartment(MenuPoint menuPoint) {
        for (MenuComponent menuComponent : menuComponents) {
            if (menuComponent.getMenuPoint().equals(menuPoint)) return menuComponent.getDepartment();
        }
        /*fuck off*/
        return null;
    }

    public static String[] getComponents(MenuPoint menuPoint) {
        for (MenuComponent menuComponent : menuComponents) {
            if (menuComponent.getMenuPoint().equals(menuPoint)) return menuComponent.getComponents();
        }
        /*fuck off*/
        return null;
    }
}