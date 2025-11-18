package com.senai.gerenciamento_epis.Service;

import com.senai.gerenciamento_epis.DTO.AdministradorDTO;
import Repo.AdiministradorRepository;
import com.senai.gerenciamento_epis.Repo.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class AdiministradorService {

    @Autowired
    private AdiministradorRepository administradorRepo;

    private ColaboradorRepository colaboradorRepo;

    public void cadastrarAdministrador (@Valid AdministradorDTO administradorDto){


    }



}
