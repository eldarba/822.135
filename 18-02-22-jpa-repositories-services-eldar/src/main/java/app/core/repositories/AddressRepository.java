package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Address;

// repository acts as a collection - DAO
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
