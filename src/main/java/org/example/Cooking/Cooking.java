package org.example.Cooking;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        Cook cook = new Cook(menuItem);
        return cook;
    }
}
