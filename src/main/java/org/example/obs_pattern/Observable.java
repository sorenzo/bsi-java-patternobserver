package org.example.obs_pattern;


public interface Observable {
    public void ajouter(Observer o);
    public void retirer(Observer o);
    public void notifier();

}
