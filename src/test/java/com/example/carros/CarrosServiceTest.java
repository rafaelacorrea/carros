//package com.example.carros;
//
//import com.example.carros.domain.Carro;
//import com.example.carros.domain.CarroService;
//import com.example.carros.domain.dto.CarroDTO;
//import com.example.carros.domain.exception.ObjectNotFoundException;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//import static junit.framework.TestCase.*;
//
//@ActiveProfiles("local")
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class CarrosServiceTest {
//
//    @Autowired
//    private CarroService service;
//
//    @Test
//    public void testSave() {
//
//        Carro carro = new Carro();
//        carro.setNome("Porshe");
//        carro.setTipo("esportivos");
//
//        CarroDTO c = service.insert(carro);
//
//        assertNotNull(c);
//
//        Long id = c.getId();
//        assertNotNull(id);
//
//        // Buscar o objeto
//        c = service.getCarroById(id);
//        assertNotNull(c);
//
//        assertEquals("Porshe",c.getNome());
//        assertEquals("esportivos",c.getTipo());
//
//        // Deletar o objeto
//        service.delete(id);
//
//        // Verificar se deletou
//        try {
//            service.getCarroById(id);
//            fail("O carro não foi excluído");
//        } catch (ObjectNotFoundException e) {
//            // OK
//        }
//    }
//
//    @Test
//    public void testLista() {
//
//        List<CarroDTO> carros = service.getCarros();
//
//        assertEquals(30, carros.size());
//    }
//
//    @Test
//    public void testListaPorTipo() {
//
//        assertEquals(10, service.getCarroByTipo("classicos").size());
//        assertEquals(10, service.getCarroByTipo("esportivos").size());
//        assertEquals(10, service.getCarroByTipo("luxo").size());
//
//        assertEquals(0, service.getCarroByTipo("x").size());
//    }
//
//    @Test
//    public void testGet() {
//
//        CarroDTO c = service.getCarroById(11L);
//
//        assertNotNull(c);
//
//
//        assertEquals("Ferrari FF", c.getNome());
//    }
//}