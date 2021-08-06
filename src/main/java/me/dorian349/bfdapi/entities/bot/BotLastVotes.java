package me.dorian349.bfdapi.entities.bot;

import com.google.gson.annotations.SerializedName;
import me.dorian349.bfdapi.entities.user.UserEntry;

import java.util.List;

public class BotLastVotes {

    @SerializedName("entries")
    private List<UserEntry> entries;

    public List<UserEntry> getEntries() {
        return entries;
    }
}

