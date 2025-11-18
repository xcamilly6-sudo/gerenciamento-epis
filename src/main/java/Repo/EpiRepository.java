package Repo;

import Entity.EpiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpiRepository extends JpaRepository<EpiEntity, Integer> {


}
