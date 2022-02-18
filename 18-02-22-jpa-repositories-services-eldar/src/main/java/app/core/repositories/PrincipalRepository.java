package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Principal;

// repository acts as a collection - DAO
public interface PrincipalRepository extends JpaRepository<Principal, Integer> {

}
