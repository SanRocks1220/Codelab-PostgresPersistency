package edu.eci.PostgresPersistence.datapostgres.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.eci.PostgresPersistence.datapostgres.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
