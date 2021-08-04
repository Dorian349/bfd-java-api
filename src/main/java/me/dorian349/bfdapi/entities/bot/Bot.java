package me.dorian349.bfdapi.entities.bot;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Bot {

    @SerializedName("id")
    private String id;

    @SerializedName("added")
    private long added;

    @SerializedName("approved")
    private boolean approved;

    @SerializedName("approvedTime")
    private long approvedTime;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("color")
    private String color;

    @SerializedName("discrim")
    private String discriminator;

    @SerializedName("featured")
    private boolean featured;

    @SerializedName("github")
    private String github;

    @SerializedName("invite")
    private String invite;

    @SerializedName("library")
    private String library;

    @SerializedName("name")
    private String name;

    @SerializedName("nsfw")
    private boolean nsfw;

    @SerializedName("owner")
    private String owner;

    @SerializedName("owners")
    private List<String> owners;

    @SerializedName("partner")
    private String partner;

    @SerializedName("prefix")
    private String prefix;

    @SerializedName("server_count")
    private int server_count;

    @SerializedName("short_desc")
    private String short_description;

    @SerializedName("status")
    private String status;

    @SerializedName("support_server")
    private String support_server;

    @SerializedName("tag")
    private String tag;

    @SerializedName("tags")
    private List<String> tags;

    @SerializedName("vanityUrl")
    private String vanityUrl;

    @SerializedName("verified")
    private boolean verified;

    @SerializedName("votes")
    private int votes;

    @SerializedName("votes24")
    private int votes24;

    @SerializedName("votesMonth")
    private int votesMonth;

    @SerializedName("website_bot")
    private boolean website_bot;

    public String getId() {
        return id;
    }

    public long getAdded() {
        return added;
    }

    public boolean isApproved() {
        return approved;
    }

    public long getApprovedTime() {
        return approvedTime;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getColor() {
        return color;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public boolean isFeatured() {
        return featured;
    }

    public String getGithub() {
        return github;
    }

    public String getInvite() {
        return invite;
    }

    public String getLibrary() {
        return library;
    }

    public String getName() {
        return name;
    }

    public boolean isNsfw() {
        return nsfw;
    }

    public String getOwner() {
        return owner;
    }

    public List<String> getOwners() {
        return owners;
    }

    public String getPartner() {
        return partner;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getServer_count() {
        return server_count;
    }

    public String getShort_description() {
        return short_description;
    }

    public String getStatus() {
        return status;
    }

    public String getSupport_server() {
        return support_server;
    }

    public String getTag() {
        return tag;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getVanityUrl() {
        return vanityUrl;
    }

    public boolean isVerified() {
        return verified;
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

    public boolean isWebsite_bot() {
        return website_bot;
    }
}
