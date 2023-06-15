package org.example.produits;

import org.example.obs_pattern.Observer;

public class PenduleFrance implements Observer {
    private String nom = this.getClass().getSimpleName();

    @Override
    public void update(String heureCourante) {
        System.out.printf("%s : il est %s%n", nom, heureCourante);
    }
}
