package com.senai.gerenciamento_epis.Repo;

import com.senai.gerenciamento_epis.Entity.EpiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpiRepository extends JpaRepository<EpiEntity, Integer> {
}
