package com.ubb.sistema_planes_estrategicos.dao.Implements;

import com.ubb.sistema_planes_estrategicos.dao.IUsuarioDAO;
import com.ubb.sistema_planes_estrategicos.domain.InfoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UsuarioDAO implements IUsuarioDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public InfoUsuario getUserInfo(String username) {
        String query = "SELECT u.username, u.password, r.rol FROM usuario u JOIN rol_usuario r ON u.username = r.username WHERE u.username=?;";
        InfoUsuario infoUsuario = (InfoUsuario)jdbcTemplate.queryForObject(query, new Object[]{username},
                new RowMapper<InfoUsuario>() {
                    public InfoUsuario mapRow(ResultSet rs, int rowNum) throws SQLException {
                        InfoUsuario user = new InfoUsuario();
                        user.setUsername(rs.getString("username"));
                        user.setPassword(rs.getString("password"));
                        user.setRole(rs.getString("rol"));
                        return user;
                    }
                });
        return infoUsuario;
    }
}
