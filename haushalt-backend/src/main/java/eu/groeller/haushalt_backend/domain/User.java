package eu.groeller.haushalt_backend.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "user")
public class User extends AbstractEntity{

    @Email
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Float currentMonthExpenses;
    private Float monthlyIncome;

    @Column(name = "current_month_balance")
    private Float currentMonthBalance;

}
