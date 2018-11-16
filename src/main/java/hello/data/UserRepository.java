package hello.data;

import org.springframework.data.repository.CrudRepository;

interface UserRepository extends CrudRepository<User, Long> {

  long countByLastname(String lastname);
}