package com.ipn.app.simple.jdbc.template;

import com.ipn.app.sjdbct.dao.SpitterDAO;
import com.ipn.app.sjdbct.dao.impl.ComunDAOImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    private ApplicationContext ctx;
    
    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        assertNotNull( ctx );
        logger.debug("Inicio de la prueba unitaria");
    }
    
    @org.junit.Test
    public void testJdbcTemplate(){
        SpitterDAO product = (SpitterDAO) ctx.getBean("spitterDao");
        String descripcion = product.getAllProducts();
        assertEquals(descripcion,"Lamp");
    }
    
    @org.junit.Test
    public void testJdbcTemplateSupport() {
        ComunDAOImpl product = (ComunDAOImpl) ctx.getBean("spitterDaoSupport");
        String descripcion = product.getAllProducts();
        assertEquals(descripcion,"Lamp");
    }
}
