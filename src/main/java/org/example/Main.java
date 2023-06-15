package org.example;

import org.example.obs_pattern.Observer;
import org.example.obs_pattern.TimeBroadcast;
import org.example.produits.PenduleFrance;
import org.example.produits.PenduleFranceFrame;
import org.example.produits.PenduleUk;

public class Main {
    public static void main(String[] args) {
        TimeBroadcast temps = new TimeBroadcast();
        Observer penduleFr = new PenduleFrance();
        Observer penduleUk = new PenduleUk();
        Observer penduleFrame = new PenduleFranceFrame();
        temps.ajouter(penduleFr);
        temps.ajouter(penduleUk);
        temps.ajouter(penduleFrame);
        temps.start();
    }
}