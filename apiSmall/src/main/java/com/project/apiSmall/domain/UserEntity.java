package com.project.apiSmall.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="users")
@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 5313493413859894403L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false)
    private String userId;

    @Column(nullable=false)
    private String name ;

    @Column(nullable=false)
    private String surname;

    @Column(nullable=false)
    private String email;

    @Column(nullable=false)
    private String encryptedPassword;

    private String emailVerificationToken;

    @Column(nullable=false)
    private Boolean emailVerificationStatus = false;

    @OneToMany(mappedBy="userDetails", cascade=CascadeType.ALL)
    private List<AddressEntity> addresses;
}
