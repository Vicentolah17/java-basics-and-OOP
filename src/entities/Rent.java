package entities;

public class Rent {
    private String namee;
    private String emaill;

    public Rent() {
    }
    public Rent(String name, String emaill) {
        this.namee = name;
        this.emaill = emaill;
    }

    public String getName() {
        return namee;
    }
    public void setName(String name) {
        this.namee = name;
    }
    public String getEmail() {
        return emaill;
    }
    public void setEmail(String email) {
        this.emaill = emaill;
    }

    @Override
    public String toString() {
        return namee + "," + emaill;
    }

}
