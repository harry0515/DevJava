package Application.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {

    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private String city;

    public EmployeeEntity(){}

    public EmployeeEntity(String Id, String first_name, String last_name, String email, String city){
        super();
        this.id = id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.city=city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
