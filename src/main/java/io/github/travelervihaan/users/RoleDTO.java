package io.github.travelervihaan.users;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleDTO extends MongoRepository<Role, String> {
}
