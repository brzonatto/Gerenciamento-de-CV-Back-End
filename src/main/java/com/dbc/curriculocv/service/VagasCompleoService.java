package com.dbc.curriculocv.service;

import com.dbc.curriculocv.client.VagasCompleoClient;
import com.dbc.curriculocv.dto.VagasCompleoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VagasCompleoService {

    private final ObjectMapper objectMapper;
    private final VagasCompleoClient vagasCompleoClient;

    public List<VagasCompleoDTO> list() {
        return vagasCompleoClient.listar();
    }

}
