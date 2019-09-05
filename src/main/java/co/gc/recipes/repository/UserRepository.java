package co.gc.recipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.recipes.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
