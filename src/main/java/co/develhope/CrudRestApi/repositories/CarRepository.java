package co.develhope.CrudRestApi.repositories;

import co.develhope.CrudRestApi.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Tania Ielpo
 */

@RepositoryRestResource

public interface CarRepository extends JpaRepository<Car, Long> {
}
