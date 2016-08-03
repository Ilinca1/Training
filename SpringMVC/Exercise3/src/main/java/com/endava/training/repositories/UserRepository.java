package com.endava.training.repositories;

import com.endava.training.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ivamesu on 8/2/2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
