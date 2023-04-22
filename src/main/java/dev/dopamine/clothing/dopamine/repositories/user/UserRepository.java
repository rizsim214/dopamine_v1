package dev.dopamine.clothing.dopamine.repositories.user;

import dev.dopamine.clothing.dopamine.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

