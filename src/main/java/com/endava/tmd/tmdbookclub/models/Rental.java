package com.endava.tmd.tmdbookclub.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

enum RentalPeriod {
    WEEK_1,
    WEEK_2,
    WEEK_3,
    MONTH_1
}

@Entity(name = "rentals")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer user_id_renter;
    private Integer user_book_id;
    private Date rental_date;
    private Date return_date;
    @Enumerated(EnumType.STRING)
    private RentalPeriod rental_period;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_book_id", referencedColumnName = "id", insertable=false, updatable=false)
    private UserBook user_books;

    public Rental() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id_renter() {
        return user_id_renter;
    }

    public void setUser_id_renter(Integer user_id_renter) {
        this.user_id_renter = user_id_renter;
    }

    public Integer getUser_book_id() {
        return user_book_id;
    }

    public void setUser_book_id(Integer user_book_id) {
        this.user_book_id = user_book_id;
    }

    public Date getRental_date() {
        return rental_date;
    }

    public void setRental_date(Date rental_date) {
        this.rental_date = rental_date;
    }

    public RentalPeriod getRental_period() {
        return rental_period;
    }

    public void setRental_period(RentalPeriod rental_period) {
        this.rental_period = rental_period;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }

    public UserBook getUser_books() {
        return user_books;
    }

    public void setUser_books(UserBook user_books) {
        this.user_books = user_books;
    }
}
