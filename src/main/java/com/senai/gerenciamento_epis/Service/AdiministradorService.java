package com.senai.gerenciamento_epis.Service;


import com.senai.gerenciamento_epis.DTO.AdministradorDTO;
import com.senai.gerenciamento_epis.Entity.AdministradorEntity;
import com.senai.gerenciamento_epis.Repo.AdministradoRepository;
import com.senai.gerenciamento_epis.Repo.ColaboradorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@Validated
public class AdiministradorService {

    @Autowired
    private AdministradoRepository administradorRepo;

    @Autowired
    private ColaboradorRepository colaboradorRepo;


    public void cadastrarAdministrador (@Valid AdministradorDTO administradorDto){

        AdministradorEntity administradorEntity= new AdministradorEntity();

        administradorEntity.setNmAdministradro(administradorDto.getNmadministrador());

        administradorRepo.save(administradorEntity);

    }

    public List<AdministradorDTO> listarAdministradores() {

        List<AdministradorEntity> listaAdministradorEntity = administradorRepo.findAll();

        List<AdministradorDTO> listaAdministradorDTO = new ArrayList<>();

        for (AdministradorEntity d : listaAdministradorEntity) {

            AdministradorDTO administradorDTO = new AdministradorDTO();

            administradorDTO.setIdAdministrador(d.getIdAdiministrador());
            administradorDTO.setNmadministrador(d.getNmAdministradro());

            listaAdministradorDTO.add(administradorDTO);

        }

        return listaAdministradorDTO;

    }

    public void atualizarAdministrador(int id,@Valid AdministradorDTO departamentoDTO) {

        AdministradorEntity administradorEntity = administradorRepo.findById(id).orElseThrow(() -> new RuntimeException("Departamento não existe"));

        administradorEntity.setNmAdministradro(departamentoDTO.getNmadministrador());

        administradorRepo.save(administradorEntity);
    }

    public void deletarAdministrador(int id){

        administradorRepo.findById(id).orElseThrow(() -> new RuntimeException("Administrador não existe"));

        if (colaboradorRepo.existsByAdministradorIdAdministrador(id)){

        }



    }


}
