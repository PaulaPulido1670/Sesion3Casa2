package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;



class CuentaTest {
	
	static Cuenta aux;
	static Cuenta aux1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux=new Cuenta("12345", "Manuel" , 50);
		aux1=new Cuenta("67890", "Levi" , 0);
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
/*	@Test
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
	}*/
	
	@Test
	void test14() {
		System.out.println("Cuenta 67890");
		aux1.retirar(350);
		aux1.retirar(200);
		aux1.retirar(150);
		aux1.ingresar(50);
		assertEquals(-450, aux1.getSaldo());
	}
	@Test
	void test15() {
		System.out.println("Cuenta 12345");
		aux.retirar(200);
		aux.ingresar(100);
		aux.retirar(200);
		assertEquals(-250, aux.getSaldo());
	}

}
