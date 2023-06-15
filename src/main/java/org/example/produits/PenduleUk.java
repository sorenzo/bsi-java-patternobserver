package org.example.produits;

import org.example.obs_pattern.Observer;

public class PenduleUk implements Observer {
    private String nom = this.getClass().getSimpleName();

    @Override
    public void update(String heureCourante) {
        System.out.printf("%s : now it is %s%n", nom, heureCourante);
    }
}