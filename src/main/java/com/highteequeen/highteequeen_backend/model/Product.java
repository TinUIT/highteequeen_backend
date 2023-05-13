package com.highteequeen.highteequeen_backend.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "branch", nullable = false)
    private String branch;

    @Column(name = "description", nullable = false)
    private String description;

    @Lob
    @Column(name = "image", nullable = false)
    private byte[] image;

    @Column(name = "price", nullable = false)
    private float price;

    @Temporal(TemporalType.DATE)
    @Column(name = "expiry_date", nullable = false)
    private Date expiryDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update_time", nullable = false)
    private Date lastUpdateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    // default constructor
    public Product() {}

    // constructor with fields
    public Product(String name, String branch, String description, byte[] image, float price, Date expiryDate,
                   Date lastUpdateTime, Category category) {
        this.name = name;
        this.branch = branch;
        this.description = description;
        this.image = image;
        this.price = price;
        this.expiryDate = expiryDate;
        this.lastUpdateTime = lastUpdateTime;
        this.category = category;
    }

    // getters and setters
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
