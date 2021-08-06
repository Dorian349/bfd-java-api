package me.dorian349.bfdapi.entities.user;

import com.google.gson.annotations.SerializedName;

public class UserEntry {

    @SerializedName("userid")
    private String userId;

    @SerializedName("expires")
    private String expirationString;

    public String getUserId() {
        return userId;
    }

    public String getExpirationString() {
        return expirationString;
    }
}
