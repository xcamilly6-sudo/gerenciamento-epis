package Service;

import DTO.AdministradorDTO;
import Entity.AdministradorEntity;
import Repo.AdiministradorRepository;
import Repo.ColaboradorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class AdiministradorService {

    @Autowired
    private AdiministradorRepository administradorRepo;

    @Autowired
    private ColaboradorRepository colaboradorRepo;


    public void cadastrarAdministrador (@Valid AdministradorDTO administradorDto){


    }



}
