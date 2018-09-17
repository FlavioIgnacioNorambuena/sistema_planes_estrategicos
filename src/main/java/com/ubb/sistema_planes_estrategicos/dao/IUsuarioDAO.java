package com.ubb.sistema_planes_estrategicos.dao;



import com.ubb.sistema_planes_estrategicos.domain.InfoUsuario;

import javax.sql.DataSource;

public interface IUsuarioDAO {

    public void setDataSource(DataSource dataSource);

    public InfoUsuario getUserInfo(String username);
}
