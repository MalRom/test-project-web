package com.tinman.project.Repository;

import com.tinman.project.Model.User;
import com.tinman.project.Model.UserIfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{



}
