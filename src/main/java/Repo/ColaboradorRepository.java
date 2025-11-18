package Repo;

import Entity.ColaboradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColaboradorRepository extends JpaRepository<ColaboradorEntity, Integer> {

}
