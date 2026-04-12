package com.williamnogueira.clientapi.repositories;

import com.williamnogueira.clientapi.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
