package com.ubb.sistema_planes_estrategicos.dao;

import com.ubb.sistema_planes_estrategicos.Exceptions.VisionNotFoundException;
import com.ubb.sistema_planes_estrategicos.domain.Vision;

import java.util.List;

public interface IVisionDAO {
    List<Vision> loadAllVision();

    Vision findById(String id) throws VisionNotFoundException;

    Vision findByTitle(String title);

    Vision create(Vision vision);

    Vision update(Vision vision)throws VisionNotFoundException;

    Vision deleteById(String id)throws VisionNotFoundException;

    Vision delete(Vision vision);
}
