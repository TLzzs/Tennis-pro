package com.ludistudy.tennispro.Repository;


import com.ludistudy.tennispro.Dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}