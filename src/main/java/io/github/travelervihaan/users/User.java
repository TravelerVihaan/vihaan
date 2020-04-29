package io.github.travelervihaan.users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String visibleUsername;

    public String getVisibleUsername() {
        return visibleUsername;
    }

    public void setVisibleUsername(String visibleUsername) {
        this.visibleUsername = visibleUsername;
    }
}
