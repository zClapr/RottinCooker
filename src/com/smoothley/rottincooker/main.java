package com.smoothley.rottincooker;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.SmokingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    public void onEnable() {
        this.FurnaceRecipes();
    }

    public void FurnaceRecipes() {
        final ItemStack l = new ItemStack(Material.LEATHER, 1);
        final NamespacedKey keyy = new NamespacedKey(this, "RottenSmelt");
        final FurnaceRecipe rftl = new FurnaceRecipe(keyy, l, Material.ROTTEN_FLESH, 0.1f, 160);
        final SmokingRecipe srftl = new SmokingRecipe(keyy, l, Material.ROTTEN_FLESH, 0.1f, 60);
        Bukkit.addRecipe((Recipe)rftl);
        Bukkit.addRecipe((Recipe)srftl);
    }
}
