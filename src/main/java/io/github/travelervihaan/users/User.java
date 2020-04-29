package io.github.travelervihaan.users;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    private String visibleUsername;

    public String getVisibleUsername() {
        return visibleUsername;
    }

    public void setVisibleUsername(String visibleUsername) {
        this.visibleUsername = visibleUsername;
    }
}
