package org.example.obs_pattern;

import java.time.LocalDateTime;
import java.util.*;

public class TimeBroadcast extends Thread implements Observable {
    Collection<Observer> lesObserveurs = new ArrayList<>();
    private String heureCourante;

    @Override
    public void run() {
        super.run();
        while(true) {
            try {
                sleep(1000);
                heureCourante = LocalDateTime.now().toString();
                notifier();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void ajouter(Observer o) {
        lesObserveurs.add(o);
    }

    @Override
    public void retirer(Observer o) {
        lesObserveurs.remove(o);
    }

    @Override
    public void notifier() {
        for(Observer o: lesObserveurs) {
            o.update(heureCourante);
        }
    }
}
