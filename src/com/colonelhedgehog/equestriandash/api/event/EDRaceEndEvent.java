package com.colonelhedgehog.equestriandash.api.event;

import com.colonelhedgehog.equestriandash.api.entity.Racer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ColonelHedgehog on 11/8/14.
 * You have freedom to modify given sources. Please credit me as original author.
 * Keep in mind that this is not for sale.
 */
public class EDRaceEndEvent extends Event
{
    private static HandlerList handlers = new HandlerList();
    private ArrayList<Racer> contestantsByRank;

    public EDRaceEndEvent(ArrayList<Racer> contestantsByRank)
    {
        this.contestantsByRank = contestantsByRank;
    }

    public List<Racer> getContestantsByRank()
    {
        return contestantsByRank;
    }

    @Override
    public HandlerList getHandlers()
    {
        return handlers;
    }

    public static HandlerList getHandlerList()
    {
        return handlers;
    }
}

