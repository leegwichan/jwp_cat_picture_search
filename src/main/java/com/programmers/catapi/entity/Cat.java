package com.programmers.catapi.entity;

import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Cat extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long catId;

    @Column(nullable = false)
    private String openApiId;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private int imageWidth;

    @Column(nullable = false)
    private int imageHeight;

    @Column
    private String name;

    @Column
    private String temperament;

    @Column
    private String origin;
}
