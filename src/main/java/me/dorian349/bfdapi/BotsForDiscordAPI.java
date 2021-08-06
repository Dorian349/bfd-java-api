package me.dorian349.bfdapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import me.dorian349.bfdapi.entities.bot.Bot;
import me.dorian349.bfdapi.entities.bot.BotLastVotes;
import me.dorian349.bfdapi.entities.bot.BotVotes;
import me.dorian349.bfdapi.entities.user.User;
import me.dorian349.bfdapi.entities.user.UserBots;
import org.json.JSONObject;

public class BotsForDiscordAPI {

    private final Gson gson;

    private final String botId;
    private final String bfdToken;

    public BotsForDiscordAPI(String botId, String bfdToken){

        gson = new GsonBuilder().setPrettyPrinting().create();

        this.botId = botId;
        this.bfdToken = bfdToken;
    }

    /**
     * Returns the {@link User} instance of this user id
     *
     * @param  userId
     *         The id of the corresponding user.
     *
     * @throws java.lang.IllegalArgumentException
     *         If the provided user id cannot be found.
     *
     * @return the corresponding User instance.
     */
    public User getUser(String userId){
        HttpResponse<String> response;

        if(userId == null) throw new IllegalArgumentException("The user id cannot be null.");

        try {
            response = Unirest.get("https://discords.com/bots/api/user/" + userId).asString();
            if(response.getStatus() == 200){
                return gson.fromJson(response.getBody(), User.class);
            }
            else {
                throw new IllegalArgumentException(new JSONObject(response.getBody()).getString("message"));
            }
        } catch (UnirestException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Returns the {@link UserBots} instance of this user id
     *
     * @param  userId
     *         The id of the corresponding user.
     *
     * @throws java.lang.IllegalArgumentException
     *         If the provided user id cannot be found.
     *
     * @return the corresponding UserBots instance.
     */
    public UserBots getUserBots(String userId){
        HttpResponse<String> response;

        if(userId == null) throw new IllegalArgumentException("The user id cannot be null.");

        try {
            response = Unirest.get("https://discords.com/bots/api/user/" + userId + "/bots").asString();
            if(response.getStatus() == 200){
                return gson.fromJson(response.getBody(), UserBots.class);
            }
            else {
                throw new IllegalArgumentException(new JSONObject(response.getBody()).getString("message"));
            }
        } catch (UnirestException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Returns the {@link Bot} instance of this bot id
     *
     * @param  botId
     *         The id of the corresponding user.
     *
     * @throws java.lang.IllegalArgumentException
     *         If the provided bot id cannot be found.
     *
     * @return the corresponding Bot instance.
     */
    public Bot getBot(String botId){
        HttpResponse<String> response;

        if(botId == null) throw new IllegalArgumentException("The bot id cannot be null.");

        try {
            response = Unirest.get("https://discords.com/bots/api/bot/" + botId).asString();
            if(response.getStatus() == 200){
                return gson.fromJson(response.getBody(), Bot.class);
            }
            else {
                throw new IllegalArgumentException(new JSONObject(response.getBody()).getString("message"));
            }
        } catch (UnirestException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Returns the {@link BotVotes} instance of this bot
     *
     * @throws java.lang.IllegalArgumentException
     *         If the provided bot id cannot be found.
     *
     * @return the corresponding BotVotes instance.
     */
    public BotVotes getVotes(){
        HttpResponse<String> response;

        if(this.botId == null) throw new IllegalArgumentException("The bot id cannot be null.");

        try {
            response = Unirest.get("https://discords.com/bots/api/bot/" + this.botId + "/votes").header("Authorization", this.bfdToken).header("Content-Type", "application/json").asString();
            if(response.getStatus() == 200){
                return gson.fromJson(response.getBody(), BotVotes.class);
            }
            else {
                throw new IllegalArgumentException(new JSONObject(response.getBody()).getString("message"));
            }
        } catch (UnirestException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Returns the {@link BotLastVotes} instance of this bot
     *
     * @throws java.lang.IllegalArgumentException
     *         If the provided bot id cannot be found or no user
     *         has voted in the last 12 hours.
     *
     * @return the corresponding BotLastVotes instance.
     */
    public BotLastVotes getLast12HVotes(){
        HttpResponse<String> response;

        if(this.botId == null) throw new IllegalArgumentException("The bot id cannot be null.");

        try {
            response = Unirest.get("https://discords.com/bots/api/bot/" + this.botId + "/votes12h").header("Authorization", this.bfdToken).header("Content-Type", "application/json").asString();
            if(response.getStatus() == 200){
                if(new JSONObject(response.getBody()).get("entries") instanceof String){
                    throw new IllegalArgumentException(new JSONObject(response.getBody()).getString("entries"));
                }
                return gson.fromJson(response.getBody(), BotLastVotes.class);
            }
            else {
                throw new IllegalArgumentException(new JSONObject(response.getBody()).getString("message"));
            }
        } catch (UnirestException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Returns the bot widget as a {@link String}
     *
     * @param  botId
     *         The id of the corresponding user.
     *
     * @throws java.lang.IllegalArgumentException
     *         If the provided bot id cannot be found.
     *
     * @return the corresponding bot widget.
     */
    public String getWidget(String botId){
        HttpResponse<String> response;

        if(botId == null) throw new IllegalArgumentException("The bot id cannot be null.");

        try {
            response = Unirest.get("https://discords.com/bots/api/bot/" + botId + "/widget").asString();
            if(response.getStatus() == 200){
                return response.getBody();
            }
            else {
                throw new IllegalArgumentException(new JSONObject(response.getBody()).getString("message"));
            }
        } catch (UnirestException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Post the bot server count to the API.
     *
     * @param  serverCount
     *         The total number of servers using the bot.
     *
     * @throws java.lang.IllegalArgumentException
     *         If the provided bot id cannot be found.
     *
     * @return the corresponding server response.
     */
    public JSONObject postStats(int serverCount){
        HttpResponse<String> response;

        try {
            response = Unirest.post("https://discords.com/bots/api/bot/" + this.botId).header("Authorization", this.bfdToken).header("Content-Type", "application/json").body(new JSONObject().put("server_count", serverCount).toString()).asString();
            return new JSONObject(response.getBody());
        } catch (UnirestException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
