# Discords.com / BotsForDiscord.com Java Library
[![Release](https://jitpack.io/v/jitpack/android-example.svg)](https://jitpack.io/#jitpack/android-example)
[![Build Status](https://github.com/mdo/github-buttons/workflows/CI/badge.svg)](https://github.com/mdo/github-buttons/actions?workflow=CI)

A simple API wrapper for discords.com (alias botsfordiscord.com) written in Java 8.

## Installation

This wrapper is distributed using [jitpack.io](https://jitpack.io).

Using Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```xml
<dependencies>
    <dependency>
        <groupId>com.github.Dorian349</groupId>
        <artifactId>bfd-java-api</artifactId>
        <version>1.1.0</version>
    </dependency>
</dependencies>
```
Using Gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```
```groovy
dependencies {
    implementation 'com.github.Dorian349:bfd-java-api:1.1.0'
}
```

## Features
• Collect information about a user from discords.com

• Collect information about a bot from discords.com such as votes / widget

• Post the bot server count on discords.com

## Simplest Usage
*Note: All classes contains getters to get every information listed on the [documentation](https://docs.botsfordiscord.com). The below examples are just some basic usages. You will need to get your API key and bot id to fully use the wrapper.*

Firstly, you should create a new instance of BotsForDiscordAPI, this will be the main object for all future requests using this wrapper.

```java
BotsForDiscordAPI botsForDiscordAPI = new BotsForDiscordAPI("Your bot ID", "Your API token");
```

Then, you can easily use the 6 different methods to get/post information.

```java
User user = botsForDiscordAPI.getUser("234735468267307008");
System.out.println(user.getUsername()); //Dorian349

Bot bot = botsForDiscordAPI.getBot("466204515390193674");
System.out.println(bot.getName()); //MyBrawlStats

botsForDiscordAPI.postStats(jda.getGuilds().size());
```
