package Author;

public class Author {
    public String name, email;
    public char gender;

    public Author(String name, String email, char gender){
        setEmail(email);
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return (this.name + " (" + this.gender + ") " + this.email);
    }
}
