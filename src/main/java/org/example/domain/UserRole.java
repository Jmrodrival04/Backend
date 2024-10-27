package org.example.domain;

public class UserRole {

    private String roleName;
    private String[] permissions;

    public UserRole(String roleName, String[] permissions) {
        this.roleName = roleName;
        this.permissions = permissions;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "roleName='" + roleName + '\'' +
                ", permissions=" + String.join(", ", permissions) +
                '}';
    }
}
