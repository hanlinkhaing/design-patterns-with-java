package com.smiles.singleton;

public class Eg1 {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.setSetting("Hello", "World");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.getSetting("Hello"));
    }
}
