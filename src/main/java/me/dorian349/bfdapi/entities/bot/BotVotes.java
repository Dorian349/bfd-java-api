package me.dorian349.bfdapi.entities.bot;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BotVotes {

    @SerializedName("hasVoted")
    private List<String> hasVoted;

    @SerializedName("hasVoted24")
    private List<String> hasVoted24;

    @SerializedName("votes")
    private int votes;

    @SerializedName("votes24")
    private int votes24;

    @SerializedName("votesMonth")
    private int votesMonth;

    public List<String> getHasVoted() {
        return hasVoted;
    }

    public List<String> getHasVoted24() {
        return hasVoted24;
    }

    public int getVotes() {
        return votes;
    }

    public int getVotes24() {
        return votes24;
    }

    public int getVotesMonth() {
        return votesMonth;
    }
}
