package me.dorian349.bfdapi.entities.user;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    private String id;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("background")
    private String background;

    @SerializedName("bio")
    private String bio;

    @SerializedName("covidFund")
    private boolean covidFund;

    @SerializedName("discrim")
    private String discriminator;

    @SerializedName("flags")
    private int flags;

    @SerializedName("house")
    private String house;

    @SerializedName("isAdmin")
    private boolean isAdmin;

    @SerializedName("isBeta")
    private boolean isBeta;

    @SerializedName("isJrMod")
    private boolean isJrMod;

    @SerializedName("isMod")
    private boolean isMod;

    @SerializedName("isPartner")
    private boolean isPartner;

    @SerializedName("status")
    private String status;

    @SerializedName("tag")
    private String tag;

    @SerializedName("teamTrees")
    private boolean teamTrees;

    @SerializedName("username")
    private String username;

    @SerializedName("website")
    private String website;

    public String getId() {
        return id;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getBackground() {
        return background;
    }

    public String getBio() {
        return bio;
    }

    public boolean isCovidFund() {
        return covidFund;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public int getFlags() {
        return flags;
    }

    public String getHouse() {
        return house;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isBeta() {
        return isBeta;
    }

    public boolean isJrMod() {
        return isJrMod;
    }

    public boolean isMod() {
        return isMod;
    }

    public boolean isPartner() {
        return isPartner;
    }

    public String getStatus() {
        return status;
    }

    public String getTag() {
        return tag;
    }

    public boolean isTeamTrees() {
        return teamTrees;
    }

    public String getUsername() {
        return username;
    }

    public String getWebsite() {
        return website;
    }
}
