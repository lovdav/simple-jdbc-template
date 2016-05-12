/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app.sjdbct.dao.impl;

import com.ipn.app.sjdbct.dao.SpitterDAO;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

/**
 *
 * @author dml
 */
public class ComunDAOImpl extends SimpleJdbcDaoSupport implements SpitterDAO{

    @Override
    public String getAllProducts() {
        String descripcion = super.getJdbcTemplate().queryForObject("select description from products where id = 1", String.class);
        return descripcion;
    }
}
