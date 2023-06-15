package org.example.obs_pattern;


public interface Observable {
    void ajouter(Observer o);
    void retirer(Observer o);
    void notifier();

}
