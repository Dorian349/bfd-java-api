package me.dorian349.bfdapi.entities.user;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserBots {

    @SerializedName("bots")
    private List<String> bots;

    public List<String> getBots() {
        return bots;
    }
}
