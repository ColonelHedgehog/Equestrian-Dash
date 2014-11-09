/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tk.ColonelHedgehog.Dash.Events;

import org.bukkit.GameMode;
import tk.ColonelHedgehog.Dash.Core.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;

/**
 *
 * @author Robert
 */
public class PlayerToggleSprintListener implements Listener
{
    public static Main plugin = Main.plugin;

    @EventHandler
    public void onSprint(PlayerToggleSprintEvent event)
    {

        if(event.getPlayer().getGameMode() != GameMode.CREATIVE)
        {
            //event.getPlayer().sendMessage(Main.Prefix + "§4§oDon't try to cheat... >_>");
            event.setCancelled(true);
        }
        //event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20, 999999999));
    }
    
}