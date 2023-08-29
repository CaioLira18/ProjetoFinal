package school.cesar.projetofinal;

import java.sql.Date;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@RequestMapping
public class Client {
    
    @Id
    private String nome;
    private int age;
    private int dependents;
    private double income;
    private String marital_status;
    private int house;
    private int vehicles;
    private Date createAt;
    private Date updateAt;

}
