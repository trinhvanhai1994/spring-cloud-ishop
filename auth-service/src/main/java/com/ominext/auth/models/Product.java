package com.ominext.auth.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String image;
    private String description;
    private Float discount;
    private Integer category;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public enum ProductEnum {
        WINTER(4),
        FALL(3),
        SUMMER(2),
        SPRING(1);

        ProductEnum(int id) {
            this.id = id;
        }
        private int id;
        public int ID() {
            return id;
        }
    }
}
