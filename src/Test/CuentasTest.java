package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuentas;



class CuentaTest {
	
	static Cuentas aux;
	static Cuentas aux1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux=new Cuentas("12345", "Manuel" , 50);
		aux1=new Cuentas("67890", "Levi" , 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/*@BeforeAll
	void setUp() throws Exception {
		aux.setSaldo(50);
		aux1.setSaldo(0);
		
	}*/

	@AfterEach
	void tearDown() throws Exception {
	}

	
	/*
	@Test
	void testingresar() throws Exception {
		aux.ingresar(0);
		assertEquals(aux.getSaldo() ,1000 );
	}
	@Test
	void testretirar() throws Exception {
		aux.retirar(0);
		assertEquals(aux.getSaldo() ,0 );
	}*/
	@Test
	void testreintegro200auxprimer() throws Exception {
		aux.retirar(200);
		assertEquals(aux.getSaldo() ,-150 );
	}
	@Test
	void testreintegro350aux1() throws Exception {
		aux1.retirar(350);
		assertEquals(aux1.getSaldo() ,-350 );
	}
	@Test
	void testingresar100aux() throws Exception {
		aux.ingresar(100);
		assertEquals(aux.getSaldo() ,-50 );
	}
	@Test
	void testreintegro200aux1() throws Exception {
		aux1.ingresar(200);
		assertEquals(aux1.getSaldo() ,0);
	}
	@Test
	void testreintegro150aux1() throws Exception {
		aux1.retirar(150);
		assertEquals(aux1.getSaldo() ,-200);
	}
	@Test
	void testreintegro200aux() throws Exception {
		aux.ingresar(200);
		assertEquals(aux.getSaldo() ,150 );
	}
	@Test
	void testingreso50aux1() throws Exception {
		aux1.ingresar(50);
		assertEquals(aux1.getSaldo() ,50 );
	}
	@Test
	void testreintegro100aux1() throws Exception {
		aux1.retirar(100);
		assertEquals(aux1.getSaldo() ,-50 );
	}

}