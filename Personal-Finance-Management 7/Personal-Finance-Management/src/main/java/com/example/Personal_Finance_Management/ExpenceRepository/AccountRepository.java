package com.example.Personal_Finance_Management.ExpenceRepository;

import com.example.Personal_Finance_Management.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,String> {

}
