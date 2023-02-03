package operator.entity;

public class Operator {

    Integer id;

    String username;

    String password;

    Role role;

    public Operator(Integer id, String username, String password, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Operator{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\'' + ", role='" + role + '\'' + '}';
    }


    public void addOperator(Operator operator) {
        // add to list
    }

    public void deleteOperator(Operator operator) {
        // delete to list
    }

    public void updateOperator(Operator operator) {
        // update to list
    }
}
