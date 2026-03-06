package net.gustitos.modernSkywars;

import org.bukkit.plugin.java.JavaPlugin;

public class ModernSkywars extends JavaPlugin {

    @Override
    public void onEnable() {
        // Initialize the database
        initializeDatabase();
        
        // Initialize command managers
        getCommandManager();
        
        // Register event listeners
        registerEventListeners();
    }

    private void initializeDatabase() {
        // Code to initialize your database connection goes here
    }

    private void getCommandManager() {
        // Code to set up command managers goes here
    }

    private void registerEventListeners() {
        // Code to register event listeners goes here
    }

    @Override
    public void onDisable() {
        // Code to handle shutdown tasks, like closing database connections
    }
}