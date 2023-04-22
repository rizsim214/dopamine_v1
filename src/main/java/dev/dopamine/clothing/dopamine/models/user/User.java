package dev.dopamine.clothing.dopamine.models.user;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @OneToMany(mappedBy = "user_id")
    private List<Address> address;
    @Column
    private String userFirstName;
    @Column
    private String userLastName;
    @Column
    private String userEmailAddress;
    @Column
    private String userPassword;
    @Column
    private String userContactInfo;
    @Column
    private String userProfileImage;
    @Column(columnDefinition = "double default 100.00")
    private Double userScore;
    @Column
    private LocalDateTime updatedAt;
    @Column
    private LocalDateTime createdAt;
}
