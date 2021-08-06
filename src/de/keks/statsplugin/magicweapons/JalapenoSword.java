package de.keks.statsplugin.magicweapons;
import de.keks.statsplugin.main.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.SmallFireball;

public class JalapenoSword extends AbilityItem{
 
   public JalapenoSword(Main plugin, Material material, String name, long cooldown, double abilityDamage, int neededSlayingLevel, int neededMiningLevel,
 		  int neededFarmingLevel, int neededForagingLevel){ 
	   super(plugin, material, name, cooldown, abilityDamage, neededSlayingLevel, neededMiningLevel, neededFarmingLevel, neededForagingLevel); 
	   
   }
 
   public void abilityEffects(Player player) {
	
     SmallFireball bullet = (SmallFireball)player.launchProjectile(SmallFireball.class);
     bullet.setFallDistance(0.0F);
     bullet.setVelocity(bullet.getVelocity().multiply(1.5));
				
   }
 
}
