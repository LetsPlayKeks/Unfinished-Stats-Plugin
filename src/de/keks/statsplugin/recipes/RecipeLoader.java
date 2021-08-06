package de.keks.statsplugin.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
//import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class RecipeLoader {

	public void registerRecipes() {
		 /*
		@SuppressWarnings("deprecation")
		ShapelessRecipe parachuteRecipe = new ShapelessRecipe(parachute);
		parachuteRecipe.addIngredient(Material.LEATHER);*/
		
		ItemStack jalapenoSword = new ItemStack(Material.WOODEN_SWORD);
		ItemMeta jalapenoSwordMeta = jalapenoSword.getItemMeta();
		jalapenoSwordMeta.setDisplayName("§l§cJalapeno Sword");
		jalapenoSword.setItemMeta(jalapenoSwordMeta);
		
		@SuppressWarnings("deprecation")
		ShapedRecipe jalapenoSwordRecipe = new ShapedRecipe(jalapenoSword);
		jalapenoSwordRecipe.shape(" L ", " M ", " S ");
		//L = Leder/Leather
		jalapenoSwordRecipe.setIngredient('L', Material.LAVA_BUCKET);
		//S = Stick
		jalapenoSwordRecipe.setIngredient('S', Material.STICK);
		
		jalapenoSwordRecipe.setIngredient('M', Material.MAGMA_BLOCK);
		
		
		Bukkit.addRecipe(jalapenoSwordRecipe);
		
	}
	
}
