package org.iesalandalus.programacion.reservasaulas.modelo;

import org.iesalandalus.programacion.reservasaulas.modelo.dao.*;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AulaTest.class, PermanenciaTest.class, ProfesorTest.class, ReservaTest.class, TramoTest.class,
	AulasTest.class, ProfesoresTest.class, ReservasTest.class })
public class AllTests {

}
