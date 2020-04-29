package io.github.travelervihaan.users;

import javax.validation.constraints.NotEmpty;

public class RoleDTO{

    @NotEmpty
    private String roleName;

    public RoleDTO(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "roleName='" + roleName + '\'' +
                '}';
    }
}
