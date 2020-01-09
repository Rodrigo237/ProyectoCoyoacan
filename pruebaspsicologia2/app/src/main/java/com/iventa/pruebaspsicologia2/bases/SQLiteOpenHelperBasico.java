package com.iventa.pruebaspsicologia2.bases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteOpenHelperBasico extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "CuestionarioBasico";
    private static final int DATABASE_VERSION = 1;

    public static class TablaPosicionador{
        public static String TABLA_POSICIONADOR = "posicionador";
        public static String COLUMNA_REGISTRO = "registro";
        public static String COLUMNA_POSICION = "posicion";
        public static String COLUMNA_TABLETA = "tableta";
        public static String COLUMNA_ENCUESTO = "encuesto";
        public static String COLUMNA_REFIERE = "refiere";
    }

    public static class TablaCuestionarioBasico{
        public static String TABLA_CUESTIONARIO_BASICO = "cuestionariobasico";
        public static String COLUMNA_REGISTRO = "registro";
        public static String COLUMNA_CADENA = "cadena";
        public static String COLUMNA_MUNICIPIO = "municipio";
        public static String COLUMNA_AGEB = "ageb";
        public static String COLUMNA_AREA = "area";
        public static String COLUMNA_MANZANA = "manzana";
        public static String COLUMNA_VIVIENDA = "vivienda";
        public static String COLUMNA_NOMBRE = "nombre";
        public static String COLUMNA_PATERNO = "paterno";
        public static String COLUMNA_MATERNO = "materno";
        public static String COLUMNA_NOMBRE_CO = "nombre_co";
        public static String COLUMNA_PATERNO_CO = "paterno_co";
        public static String COLUMNA_MATERNO_CO = "materno_co";
        public static String COLUMNA_SEXO = "sexo";
        public static String COLUMNA_EDAD = "edad";
        public static String COLUMNA_EDAD_HOY = "edad_hoy";
        public static String COLUMNA_FECHA = "fecha";
        public static String COLUMNA_HORA_INI = "hora_ini";
        public static String COLUMNA_FECHOR_INI = "fechor_ini";
        public static String COLUMNA_LATITUD_A = "latitud_a";
        public static String COLUMNA_LONGITUD_A = "longitud_a";
        public static String COLUMNA_P_0101 = "p_0101";
        public static String COLUMNA_T_0101 = "t_0101";
        public static String COLUMNA_P_0102 = "p_0102";
        public static String COLUMNA_T_0102 = "t_0102";
        public static String COLUMNA_P_0103 = "p_0103";
        public static String COLUMNA_T_0103 = "t_0103";
        public static String COLUMNA_P_0104 = "p_0104";
        public static String COLUMNA_T_0104 = "t_0104";
        public static String COLUMNA_P_010501 = "p_010501"; // D�a naci�.
        public static String COLUMNA_T_010501 = "t_010501"; // D�a naci�.
        public static String COLUMNA_P_010502 = "p_010502"; // Mes naci�.
        public static String COLUMNA_T_010502 = "t_010502"; // Mes naci�.
        public static String COLUMNA_P_010503 = "p_010503"; // A�o naci�.
        public static String COLUMNA_T_010503 = "t_010503"; // A�o naci�.
        public static String COLUMNA_P_010504 = "p_010504"; // No sabe. No responde.
        public static String COLUMNA_T_010504 = "t_010504"; // No sabe. No responde.
        public static String COLUMNA_P_0106 = "p_0106";		// Tel�fono
        public static String COLUMNA_T_0106 = "t_0106";		// Tel�fono
        public static String COLUMNA_P_010601 = "p_010601";	// Tel�fono
        public static String COLUMNA_T_010601 = "t_010601";	// Tel�fono
        public static String COLUMNA_P_0107 = "p_0107";		// Correo electr�nico
        public static String COLUMNA_T_0107 = "t_0107";		// Correo electr�nico
        public static String COLUMNA_P_010701 = "p_010701";	// Correo electr�nico
        public static String COLUMNA_T_010701 = "t_010701";	// Correo electr�nico
        public static String COLUMNA_P_0201 = "p_0201";		// Relaci�n.
        public static String COLUMNA_T_0201 = "t_0201";		// Relaci�n.
        public static String COLUMNA_P_020201 = "p_020201"; // D�a naci�.
        public static String COLUMNA_T_020201 = "t_020201"; // D�a naci�.
        public static String COLUMNA_P_020202 = "p_020202"; // Mes naci�.
        public static String COLUMNA_T_020202 = "t_020202"; // Mes naci�.
        public static String COLUMNA_P_020203 = "p_020203"; // A�o naci�.
        public static String COLUMNA_T_020203 = "t_020203"; // A�o naci�.
        public static String COLUMNA_P_020204 = "p_020204"; // Nosabe. No responde.
        public static String COLUMNA_T_020204 = "t_020204"; // Nosabe. No responde.
        public static String COLUMNA_P_020301 = "p_020301"; // D�a falleci�.
        public static String COLUMNA_T_020301 = "t_020301"; // D�a falleci�.
        public static String COLUMNA_P_020302 = "p_020302"; // Mes falleci�.
        public static String COLUMNA_T_020302 = "t_020302"; // Mes falleci�.
        public static String COLUMNA_P_020303 = "p_020303";	// A�o falleci�.
        public static String COLUMNA_T_020303 = "t_020303"; // A�o falleci�.
        public static String COLUMNA_P_020304 = "p_020304"; // A�os cumplidos.
        public static String COLUMNA_T_020304 = "t_020304"; // A�os cumplidos.
        public static String COLUMNA_P_020305 = "p_020305"; // Nosabe. No responde.
        public static String COLUMNA_T_020305 = "t_020305"; // Nosabe. No responde.
        public static String COLUMNA_P_0204 = "p_0204";		// Lugar de fallecimiento.
        public static String COLUMNA_T_0204 = "t_0204";		// Lugar de fallecimiento.
        public static String COLUMNA_P_020401 = "p_020401";	// Municipio.
        public static String COLUMNA_T_020401 = "t_020401";	// Municipio.
        public static String COLUMNA_P_020402 = "p_020402";	// Estado.
        public static String COLUMNA_T_020402 = "t_020402";	// Estado.
        public static String COLUMNA_P_020403 = "p_020403";	// Pa�s.
        public static String COLUMNA_T_020403 = "t_020403";	// Pa�s.
        public static String COLUMNA_P_0205 = "p_0205";		// Causa de fallecimiento.
        public static String COLUMNA_T_0205 = "t_0205";		// Causa de fallecimiento.
        public static String COLUMNA_P_020501 = "p_020501";	// Causa de fallecimiento.
        public static String COLUMNA_T_020501 = "t_020501";	// Causa de fallecimiento.
        public static String COLUMNA_P_0206 = "p_0206";		// Certificado de defunci�n.
        public static String COLUMNA_T_0206 = "t_0206";		// Certificado de defunci�n.
        public static String COLUMNA_P_0207 = "p_0207";
        public static String COLUMNA_T_0207 = "t_0207";
        public static String COLUMNA_P_020801 = "p_020801";
        public static String COLUMNA_T_020801 = "t_020801";
        public static String COLUMNA_P_020802 = "p_020802";
        public static String COLUMNA_T_020802 = "t_020802";
        public static String COLUMNA_P_020901 = "p_020901";
        public static String COLUMNA_T_020901 = "t_020901";
        public static String COLUMNA_P_020902 = "p_020902";
        public static String COLUMNA_T_020902 = "t_020902";
        public static String COLUMNA_P_0301 = "p_0301";			// Nombre correcto.
        public static String COLUMNA_T_0301 = "t_0301";			// Nombre correcto.
        public static String COLUMNA_P_030201 = "p_030201"; 	// D�a naci�.
        public static String COLUMNA_T_030201 = "t_030201"; 	// D�a naci�.
        public static String COLUMNA_P_030202 = "p_030202"; 	// Mes naci�.
        public static String COLUMNA_T_030202 = "t_030202"; 	// Mes naci�.
        public static String COLUMNA_P_030203 = "p_030203"; 	// A�o naci�.
        public static String COLUMNA_T_030203 = "t_030203";		// A�o naci�.
        public static String COLUMNA_P_030204 = "p_030204"; 	// No sabe. No responde.
        public static String COLUMNA_T_030204 = "t_030204"; 	// No sabe. No responde.
        public static String COLUMNA_P_0303 = "p_0303";			// Tel�fono.
        public static String COLUMNA_T_0303 = "t_0303";			// Tel�fono.
        public static String COLUMNA_P_030301 = "p_030301";		// No sabe. No responde.
        public static String COLUMNA_T_030301 = "t_030301";		// No sabe. No responde.
        public static String COLUMNA_P_0304 = "p_0304";			// Correo electr�nico.
        public static String COLUMNA_T_0304 = "t_0304";			// Correo electr�nico.
        public static String COLUMNA_P_030401 = "p_030401";		// No sabe. No responde.
        public static String COLUMNA_T_030401 = "t_030401";		// No sabe. No responde.
        public static String COLUMNA_P_0305 = "p_0305";			// Principal proveedor.
        public static String COLUMNA_T_0305 = "t_0305";			// Principal proveedor.
        public static String COLUMNA_P_0306 = "p_0306";			// Mostrar identificaci�n.
        public static String COLUMNA_T_0306 = "t_0306";			// Mostrar identificaci�n.
        public static String COLUMNA_P_0307 = "p_0307";			// Mostrar CURP.
        public static String COLUMNA_T_0307 = "t_0307";			// Mostrar CURP.
        public static String COLUMNA_P_0308 = "p_0308";			// Mostrar credencial de proveedor.
        public static String COLUMNA_T_0308 = "t_0308";			// Mostrar credencial de proveedor.
        public static String COLUMNA_P_03080101 = "p_03080101";	// Primer proveedor.
        public static String COLUMNA_T_03080101 = "t_03080101";	// Primer proveedor.
        public static String COLUMNA_P_03080102 = "p_03080102";	// Primer proveedor.
        public static String COLUMNA_T_03080102 = "t_03080102";	// Primer proveedor.
        public static String COLUMNA_P_03080201 = "p_03080201";	// Segundo proveedor.
        public static String COLUMNA_T_03080201 = "t_03080201";	// Segundo proveedor.
        public static String COLUMNA_P_03080202 = "p_03080202";	// Segundo proveedor.
        public static String COLUMNA_T_03080202 = "t_03080202";	// Segundo proveedor.
        public static String COLUMNA_P_03080301 = "p_03080301";	// Tercer proveedor.
        public static String COLUMNA_T_03080301 = "t_03080301";	// Tercer proveedor.
        public static String COLUMNA_P_03080302 = "p_03080302";	// Tercer proveedor.
        public static String COLUMNA_T_03080302 = "t_03080302";	// Tercer proveedor.
        public static String COLUMNA_P_03080401 = "p_03080401";	// Cuarto proveedor.
        public static String COLUMNA_T_03080401 = "t_03080401";	// Cuarto proveedor.
        public static String COLUMNA_P_03080402 = "p_03080402";	// Cuarto proveedor.
        public static String COLUMNA_T_03080402 = "t_03080402";	// Cuarto proveedor.
        public static String COLUMNA_P_03080501 = "p_03080501";	// Quinto proveedor.
        public static String COLUMNA_T_03080501 = "t_03080501";	// Quinto proveedor.
        public static String COLUMNA_P_03080502 = "p_03080502";	// Quinto proveedor.
        public static String COLUMNA_T_03080502 = "t_03080502";	// Quinto proveedor.
        public static String COLUMNA_P_03090101 = "p_03090101"; // Opci�n 01. Angina de pecho.
        public static String COLUMNA_T_03090101 = "t_03090101"; // Opci�n 01.
        public static String COLUMNA_P_03090102 = "p_03090102"; // A�o de la opci�n 01.
        public static String COLUMNA_T_03090102 = "t_03090102"; // A�o de la opci�n 01.
        public static String COLUMNA_P_03090103 = "p_03090103"; // Peso de la opci�n 01.
        public static String COLUMNA_P_03090201 = "p_03090201"; // Opci�n 02. Ataque al coraz�n.
        public static String COLUMNA_T_03090201 = "t_03090201"; // Opci�n 02.
        public static String COLUMNA_P_03090202 = "p_03090202"; // A�o de la opci�n 02.
        public static String COLUMNA_T_03090202 = "t_03090202"; // A�o de la opci�n 02.
        public static String COLUMNA_P_03090203 = "p_03090203"; // Peso de la opci�n 02.
        public static String COLUMNA_P_03090301 = "p_03090301"; // Opci�n 03. Ataque cerebral.
        public static String COLUMNA_T_03090301 = "t_03090301"; // Opci�n 03.
        public static String COLUMNA_P_03090302 = "p_03090302"; // A�o de la opci�n 03.
        public static String COLUMNA_T_03090302 = "t_03090302"; // A�o de la opci�n 03.
        public static String COLUMNA_P_03090303 = "p_03090303"; // Peso de la opci�n 03.
        public static String COLUMNA_P_03090401 = "p_03090401"; // Opci�n 04. Diabetes.
        public static String COLUMNA_T_03090401 = "t_03090401"; // Opci�n 04.
        public static String COLUMNA_P_03090402 = "p_03090402"; // A�o de la opci�n 04.
        public static String COLUMNA_T_03090402 = "t_03090402"; // A�o de la opci�n 04.
        public static String COLUMNA_P_03090403 = "p_03090403"; // Peso de la opci�n 04.
        public static String COLUMNA_P_03090501 = "p_03090501"; // Opci�n 05. Da�o a la retina (o perdi� la vista).
        public static String COLUMNA_T_03090501 = "t_03090501"; // Opci�n 05.
        public static String COLUMNA_P_03090502 = "p_03090502"; // A�o de la opci�n 05.
        public static String COLUMNA_T_03090502 = "t_03090502"; // A�o de la opci�n 05.
        public static String COLUMNA_P_03090503 = "p_03090503"; // Peso de la opci�n 05.
        public static String COLUMNA_P_03090601 = "p_03090601"; // Opci�n 06. Amputaci�n de extremidades por enfermedad vascular o infecci�n.
        public static String COLUMNA_T_03090601 = "t_03090601"; // Opci�n 06.
        public static String COLUMNA_P_03090602 = "p_03090602"; // A�o de la opci�n 06.
        public static String COLUMNA_T_03090602 = "t_03090602"; // A�o de la opci�n 06.
        public static String COLUMNA_P_03090603 = "p_03090603"; // Peso de la opci�n 06.
        public static String COLUMNA_P_03090701 = "p_03090701"; // Opci�n 07. Enfermedad renal cr�nica.
        public static String COLUMNA_T_03090701 = "t_03090701"; // Opci�n 07.
        public static String COLUMNA_P_03090702 = "p_03090702"; // A�o de la opci�n 07.
        public static String COLUMNA_T_03090702 = "t_03090702"; // A�o de la opci�n 07.
        public static String COLUMNA_P_03090703 = "p_03090703"; // Peso de la opci�n 07.
        public static String COLUMNA_P_03090801 = "p_03090801"; // Opci�n 08. Necesidad de di�lisis o transplante renal.
        public static String COLUMNA_T_03090801 = "t_03090801"; // Opci�n 08.
        public static String COLUMNA_P_03090802 = "p_03090802"; // A�o de la opci�n 08.
        public static String COLUMNA_T_03090802 = "t_03090802"; // A�o de la opci�n 08.
        public static String COLUMNA_P_03090803 = "p_03090803"; // Peso de la opci�n 08.
        public static String COLUMNA_P_03090901 = "p_03090901"; // Opci�n 09. Cirrosis del h�gado.
        public static String COLUMNA_T_03090901 = "t_03090901"; // Opci�n 09.
        public static String COLUMNA_P_03090902 = "p_03090902"; // A�o de la opci�n 09.
        public static String COLUMNA_T_03090902 = "t_03090902"; // A�o de la opci�n 09.
        public static String COLUMNA_P_03090903 = "p_03090903"; // Peso de la opci�n 09.
        public static String COLUMNA_P_03091001 = "p_03091001"; // Opci�n 10. Enfermedad pulmonar obstructiva cr�nica (por ejemplo, enfisema).
        public static String COLUMNA_T_03091001 = "t_03091001"; // Opci�n 10.
        public static String COLUMNA_P_03091002 = "p_03091002"; // A�o de la opci�n 10.
        public static String COLUMNA_T_03091002 = "t_03091002"; // A�o de la opci�n 10.
        public static String COLUMNA_P_03091003 = "p_03091003"; // Peso de la opci�n 10.
        public static String COLUMNA_P_03091101 = "p_03091101"; // Opci�n 11. Hipertensi�n arterial.
        public static String COLUMNA_T_03091101 = "t_03091101"; // Opci�n 11.
        public static String COLUMNA_P_03091102 = "p_03091102"; // A�o de la opci�n 11.
        public static String COLUMNA_T_03091102 = "t_03091102"; // A�o de la opci�n 11.
        public static String COLUMNA_P_03091103 = "p_03091103"; // Peso de la opci�n 11.
        public static String COLUMNA_P_03091201 = "p_03091201"; // Opci�n 12. Demencia.
        public static String COLUMNA_T_03091201 = "t_03091201"; // Opci�n 12.
        public static String COLUMNA_P_03091202 = "p_03091202"; // A�o de la opci�n 12.
        public static String COLUMNA_T_03091202 = "t_03091202"; // A�o de la opci�n 12.
        public static String COLUMNA_P_03091203 = "p_03091203"; // Peso de la opci�n 12.
        public static String COLUMNA_P_03091301 = "p_03091301"; // Opci�n 13. Depresi�n o ansiedad.
        public static String COLUMNA_T_03091301 = "t_03091301"; // Opci�n 13.
        public static String COLUMNA_P_03091302 = "p_03091302"; // A�o de la opci�n 13.
        public static String COLUMNA_T_03091302 = "t_03091302"; // A�o de la opci�n 13.
        public static String COLUMNA_P_03091303 = "p_03091303"; // Peso de la opci�n 13.
        public static String COLUMNA_P_030914 = "p_030914";		// Opci�n 14. C�ncer.
        public static String COLUMNA_T_030914 = "t_030914";		// Opci�n 14.
        public static String COLUMNA_P_03091501 = "p_03091501"; // Opci�n 15. Pulm�n.
        public static String COLUMNA_T_03091501 = "t_03091501"; // Opci�n 15.
        public static String COLUMNA_P_03091502 = "p_03091502"; // A�o de la opci�n 15.
        public static String COLUMNA_T_03091502 = "t_03091502"; // A�o de la opci�n 15.
        public static String COLUMNA_P_03091503 = "p_03091503"; // Peso de la opci�n 15.
        public static String COLUMNA_P_03091601 = "p_03091601"; // Opci�n 16. Pr�stata.
        public static String COLUMNA_T_03091601 = "t_03091601"; // Opci�n 16.
        public static String COLUMNA_P_03091602 = "p_03091602"; // A�o de la opci�n 16.
        public static String COLUMNA_T_03091602 = "t_03091602"; // A�o de la opci�n 16.
        public static String COLUMNA_P_03091603 = "p_03091603"; // Peso de la opci�n 16.
        public static String COLUMNA_P_03091701 = "p_03091701"; // Opci�n 17. C�rvix.
        public static String COLUMNA_T_03091701 = "t_03091701"; // Opci�n 17
        public static String COLUMNA_P_03091702 = "p_03091702"; // A�o de la opci�n 17.
        public static String COLUMNA_T_03091702 = "t_03091702"; // A�o de la opci�n 17.
        public static String COLUMNA_P_03091703 = "p_03091703"; // Peso de la opci�n 17.
        public static String COLUMNA_P_03091801 = "p_03091801"; // Opci�n 18. Pecho.
        public static String COLUMNA_T_03091801 = "t_03091801"; // Opci�n 18.
        public static String COLUMNA_P_03091802 = "p_03091802"; // A�o de la opci�n 18.
        public static String COLUMNA_T_03091802 = "t_03091802"; // A�o de la opci�n 18.
        public static String COLUMNA_P_03091803 = "p_03091803"; // Peso de la opci�n 18.
        public static String COLUMNA_P_03091901 = "p_03091901"; // Opci�n 19. Es�fago, est�mago, c�lon, recto.
        public static String COLUMNA_T_03091901 = "t_03091901"; // Opci�n 19.
        public static String COLUMNA_P_03091902 = "p_03091902"; // A�o de la opci�n 19.
        public static String COLUMNA_T_03091902 = "t_03091902"; // A�o de la opci�n 19.
        public static String COLUMNA_P_03091903 = "p_03091903"; // Peso de la opci�n 19.
        public static String COLUMNA_P_03092001 = "p_03092001"; // Opci�n 20. Oral, nasal, garganta.
        public static String COLUMNA_T_03092001 = "t_03092001"; // Opci�n 20.
        public static String COLUMNA_P_03092002 = "p_03092002"; // A�o de la opci�n 20.
        public static String COLUMNA_T_03092002 = "t_03092002"; // A�o de la opci�n 20.
        public static String COLUMNA_P_03092003 = "p_03092003"; // Peso de la opci�n 20.
        public static String COLUMNA_P_03092101 = "p_03092101";	// Opci�n 21.
        public static String COLUMNA_T_03092101 = "t_03092101";	// Opci�n 21.
        public static String COLUMNA_P_03092102 = "p_03092102";	// A�o de la opci�n 21.
        public static String COLUMNA_T_03092102 = "t_03092102";	// A�o de la opci�n 21.
        public static String COLUMNA_P_03092103 = "p_03092103";	// Peso de la opci�n 21.
        public static String COLUMNA_P_030922 = "p_030922";		// Opci�n 22. Ninguna enfermedad.
        public static String COLUMNA_T_030922 = "t_030922";		// Opci�n 22.
        public static String COLUMNA_P_030923 = "p_030923";		// Opci�n 23. No sabe. No responde.
        public static String COLUMNA_T_030923 = "t_030923";		// Opci�n 23.
        public static String COLUMNA_P_0310 = "p_0310";			// Tuvo hospitalizaci�n.
        public static String COLUMNA_T_0310 = "t_0310";			// Tuvo hospitalizaci�n.
        public static String COLUMNA_P_0311 = "p_0311";			// Acepta relatar hospitalizaci�n.
        public static String COLUMNA_T_0311 = "t_0311";			// Acepta relatar hospitalizaci�n.
        public static String COLUMNA_P_0311010101 = "p_0311010101";	// Mes.
        public static String COLUMNA_T_0311010101 = "t_0311010101";
        public static String COLUMNA_P_0311010102 = "p_0311010102";	// A�o.
        public static String COLUMNA_T_0311010102 = "t_0311010102";
        public static String COLUMNA_P_0311010201 = "p_0311010201";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311010201 = "t_0311010201";
        public static String COLUMNA_P_0311010202 = "p_0311010202";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311010202 = "t_0311010202";
        public static String COLUMNA_P_03110103 = "p_03110103";		// Ubicaci�n del hospital.
        public static String COLUMNA_T_03110103 = "t_03110103";
        public static String COLUMNA_P_0311010301 = "p_0311010301";	// Ubicaci�n del hospital en Alcald�a.
        public static String COLUMNA_T_0311010301 = "t_0311010301";
        public static String COLUMNA_P_0311010302 = "p_0311010302";	// Ubicaci�n del hospital en alg�n Estado.
        public static String COLUMNA_T_0311010302 = "t_0311010302";
        public static String COLUMNA_P_0311010303 = "p_0311010303";	// Ubicaci�n del hospital en alg�n otro Pa�s.
        public static String COLUMNA_T_0311010303 = "t_0311010303";
        public static String COLUMNA_P_03110104 = "p_03110104";		// Proveedor.
        public static String COLUMNA_T_03110104 = "t_03110104";
        public static String COLUMNA_P_0311010501 = "p_0311010501";		// Nombre del hospital.
        public static String COLUMNA_T_0311010501 = "t_0311010501";
        public static String COLUMNA_P_0311010502 = "p_0311010502";		// Nombre del hospital.
        public static String COLUMNA_T_0311010502 = "t_0311010502";
        public static String COLUMNA_P_03110106 = "p_03110106";		// �Desea registrar otra hospitalizaci�n?.
        public static String COLUMNA_T_03110106 = "t_03110106";
        public static String COLUMNA_P_0311020101 = "p_0311020101";	// Mes.
        public static String COLUMNA_T_0311020101 = "t_0311020101";
        public static String COLUMNA_P_0311020102 = "p_0311020102";	// A�o.
        public static String COLUMNA_T_0311020102 = "t_0311020102";
        public static String COLUMNA_P_0311020201 = "p_0311020201";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311020201 = "t_0311020201";
        public static String COLUMNA_P_0311020202 = "p_0311020202";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311020202 = "t_0311020202";
        public static String COLUMNA_P_03110203 = "p_03110203";		// Ubicaci�n del hospital.
        public static String COLUMNA_T_03110203 = "t_03110203";
        public static String COLUMNA_P_0311020301 = "p_0311020301";	// Ubicaci�n del hospital en Alcald�a.
        public static String COLUMNA_T_0311020301 = "t_0311020301";
        public static String COLUMNA_P_0311020302 = "p_0311020302";	// Ubicaci�n del hospital en alg�n Estado.
        public static String COLUMNA_T_0311020302 = "t_0311020302";
        public static String COLUMNA_P_0311020303 = "p_0311020303";	// Ubicaci�n del hospital en alg�n otro Pa�s.
        public static String COLUMNA_T_0311020303 = "t_0311020303";
        public static String COLUMNA_P_03110204 = "p_03110204";		// Proveedor.
        public static String COLUMNA_T_03110204 = "t_03110204";
        public static String COLUMNA_P_0311020501 = "p_0311020501";		// Nombre del hospital.
        public static String COLUMNA_T_0311020501 = "t_0311020501";
        public static String COLUMNA_P_0311020502 = "p_0311020502";		// Nombre del hospital.
        public static String COLUMNA_T_0311020502 = "t_0311020502";
        public static String COLUMNA_P_03110206 = "p_03110206";		// �Desea registrar otra hospitalizaci�n?.
        public static String COLUMNA_T_03110206 = "t_03110206";
        public static String COLUMNA_P_0311030101 = "p_0311030101";	// Mes.
        public static String COLUMNA_T_0311030101 = "t_0311030101";
        public static String COLUMNA_P_0311030102 = "p_0311030102";	// A�o.
        public static String COLUMNA_T_0311030102 = "t_0311030102";
        public static String COLUMNA_P_0311030201 = "p_0311030201";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311030201 = "t_0311030201";
        public static String COLUMNA_P_0311030202 = "p_0311030202";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311030202 = "t_0311030202";
        public static String COLUMNA_P_03110303 = "p_03110303";		// Ubicaci�n del hospital.
        public static String COLUMNA_T_03110303 = "t_03110303";
        public static String COLUMNA_P_0311030301 = "p_0311030301";	// Ubicaci�n del hospital en Alcald�a.
        public static String COLUMNA_T_0311030301 = "t_0311030301";
        public static String COLUMNA_P_0311030302 = "p_0311030302";	// Ubicaci�n del hospital en alg�n Estado.
        public static String COLUMNA_T_0311030302 = "t_0311030302";
        public static String COLUMNA_P_0311030303 = "p_0311030303";	// Ubicaci�n del hospital en alg�n otro Pa�s.
        public static String COLUMNA_T_0311030303 = "t_0311030303";
        public static String COLUMNA_P_03110304 = "p_03110304";		// Proveedor.
        public static String COLUMNA_T_03110304 = "t_03110304";
        public static String COLUMNA_P_0311030501 = "p_0311030501";		// Nombre del hospital.
        public static String COLUMNA_T_0311030501 = "t_0311030501";
        public static String COLUMNA_P_0311030502 = "p_0311030502";		// Nombre del hospital.
        public static String COLUMNA_T_0311030502 = "t_0311030502";
        public static String COLUMNA_P_03110306 = "p_03110306";		// �Desea registrar otra hospitalizaci�n?.
        public static String COLUMNA_T_03110306 = "t_03110306";
        public static String COLUMNA_P_0311040101 = "p_0311040101";	// Mes.
        public static String COLUMNA_T_0311040101 = "t_0311040101";
        public static String COLUMNA_P_0311040102 = "p_0311040102";	// A�o.
        public static String COLUMNA_T_0311040102 = "t_0311040102";
        public static String COLUMNA_P_0311040201 = "p_0311040201";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311040201 = "t_0311040201";
        public static String COLUMNA_P_0311040202 = "p_0311040202";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311040202 = "t_0311040202";
        public static String COLUMNA_P_03110403 = "p_03110403";		// Ubicaci�n del hospital.
        public static String COLUMNA_T_03110403 = "t_03110403";
        public static String COLUMNA_P_0311040301 = "p_0311040301";	// Ubicaci�n del hospital en Alcald�a.
        public static String COLUMNA_T_0311040301 = "t_0311040301";
        public static String COLUMNA_P_0311040302 = "p_0311040302";	// Ubicaci�n del hospital en alg�n Estado.
        public static String COLUMNA_T_0311040302 = "t_0311040302";
        public static String COLUMNA_P_0311040303 = "p_0311040303";	// Ubicaci�n del hospital en alg�n otro Pa�s.
        public static String COLUMNA_T_0311040303 = "t_0311040303";
        public static String COLUMNA_P_03110404 = "p_03110404";		// Proveedor.
        public static String COLUMNA_T_03110404 = "t_03110404";
        public static String COLUMNA_P_0311040501 = "p_0311040501";		// Nombre del hospital.
        public static String COLUMNA_T_0311040501 = "t_0311040501";
        public static String COLUMNA_P_0311040502 = "p_0311040502";		// Nombre del hospital.
        public static String COLUMNA_T_0311040502 = "t_0311040502";
        public static String COLUMNA_P_03110406 = "p_03110406";		// �Desea registrar otra hospitalizaci�n?.
        public static String COLUMNA_T_03110406 = "t_03110406";
        public static String COLUMNA_P_0311050101 = "p_0311050101";	// Mes.
        public static String COLUMNA_T_0311050101 = "t_0311050101";
        public static String COLUMNA_P_0311050102 = "p_0311050102";	// A�o.
        public static String COLUMNA_T_0311050102 = "t_0311050102";
        public static String COLUMNA_P_0311050201 = "p_0311050201";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311050201 = "t_0311050201";
        public static String COLUMNA_P_0311050202 = "p_0311050202";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311050202 = "t_0311050202";
        public static String COLUMNA_P_03110503 = "p_03110503";		// Ubicaci�n del hospital.
        public static String COLUMNA_T_03110503 = "t_03110503";
        public static String COLUMNA_P_0311050301 = "p_0311050301";	// Ubicaci�n del hospital en Alcald�a.
        public static String COLUMNA_T_0311050301 = "t_0311050301";
        public static String COLUMNA_P_0311050302 = "p_0311050302";	// Ubicaci�n del hospital en alg�n Estado.
        public static String COLUMNA_T_0311050302 = "t_0311050302";
        public static String COLUMNA_P_0311050303 = "p_0311050303";	// Ubicaci�n del hospital en alg�n otro Pa�s.
        public static String COLUMNA_T_0311050303 = "t_0311050303";
        public static String COLUMNA_P_03110504 = "p_03110504";		// Proveedor.
        public static String COLUMNA_T_03110504 = "t_03110504";
        public static String COLUMNA_P_0311050501 = "p_0311050501";		// Nombre del hospital.
        public static String COLUMNA_T_0311050501 = "t_0311050501";
        public static String COLUMNA_P_0311050502 = "p_0311050502";		// Nombre del hospital.
        public static String COLUMNA_T_0311050502 = "t_0311050502";
        public static String COLUMNA_P_03110506 = "p_03110506";		// �Desea registrar otra hospitalizaci�n?.
        public static String COLUMNA_T_03110506 = "t_03110506";
        public static String COLUMNA_P_0311060101 = "p_0311060101";	// Mes.
        public static String COLUMNA_T_0311060101 = "t_0311060101";
        public static String COLUMNA_P_0311060102 = "p_0311060102";	// A�o.
        public static String COLUMNA_T_0311060102 = "t_0311060102";
        public static String COLUMNA_P_0311060201 = "p_0311060201";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311060201 = "t_0311060201";
        public static String COLUMNA_P_0311060202 = "p_0311060202";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311060202 = "t_0311060202";
        public static String COLUMNA_P_03110603 = "p_03110603";		// Ubicaci�n del hospital.
        public static String COLUMNA_T_03110603 = "t_03110603";
        public static String COLUMNA_P_0311060301 = "p_0311060301";	// Ubicaci�n del hospital en Alcald�a.
        public static String COLUMNA_T_0311060301 = "t_0311060301";
        public static String COLUMNA_P_0311060302 = "p_0311060302";	// Ubicaci�n del hospital en alg�n Estado.
        public static String COLUMNA_T_0311060302 = "t_0311060302";
        public static String COLUMNA_P_0311060303 = "p_0311060303";	// Ubicaci�n del hospital en alg�n otro Pa�s.
        public static String COLUMNA_T_0311060303 = "t_0311060303";
        public static String COLUMNA_P_03110604 = "p_03110604";		// Proveedor.
        public static String COLUMNA_T_03110604 = "t_03110604";
        public static String COLUMNA_P_0311060501 = "p_0311060501";		// Nombre del hospital.
        public static String COLUMNA_T_0311060501 = "t_0311060501";
        public static String COLUMNA_P_0311060502 = "p_0311060502";		// Nombre del hospital.
        public static String COLUMNA_T_0311060502 = "t_0311060502";
        public static String COLUMNA_P_03110606 = "p_03110606";		// �Desea registrar otra hospitalizaci�n?.
        public static String COLUMNA_T_03110606 = "t_03110606";
        public static String COLUMNA_P_0311070101 = "p_0311070101";	// Mes.
        public static String COLUMNA_T_0311070101 = "t_0311070101";
        public static String COLUMNA_P_0311070102 = "p_0311070102";	// A�o.
        public static String COLUMNA_T_0311070102 = "t_0311070102";
        public static String COLUMNA_P_0311070201 = "p_0311070201";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311070201 = "t_0311070201";
        public static String COLUMNA_P_0311070202 = "p_0311070202";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311070202 = "t_0311070202";
        public static String COLUMNA_P_03110703 = "p_03110703";		// Ubicaci�n del hospital.
        public static String COLUMNA_T_03110703 = "t_03110703";
        public static String COLUMNA_P_0311070301 = "p_0311070301";	// Ubicaci�n del hospital en Alcald�a.
        public static String COLUMNA_T_0311070301 = "t_0311070301";
        public static String COLUMNA_P_0311070302 = "p_0311070302";	// Ubicaci�n del hospital en alg�n Estado.
        public static String COLUMNA_T_0311070302 = "t_0311070302";
        public static String COLUMNA_P_0311070303 = "p_0311070303";	// Ubicaci�n del hospital en alg�n otro Pa�s.
        public static String COLUMNA_T_0311070303 = "t_0311070303";
        public static String COLUMNA_P_03110704 = "p_03110704";		// Proveedor.
        public static String COLUMNA_T_03110704 = "t_03110704";
        public static String COLUMNA_P_0311070501 = "p_0311070501";		// Nombre del hospital.
        public static String COLUMNA_T_0311070501 = "t_0311070501";
        public static String COLUMNA_P_0311070502 = "p_0311070502";		// Nombre del hospital.
        public static String COLUMNA_T_0311070502 = "t_0311070502";
        public static String COLUMNA_P_03110706 = "p_03110706";		// �Desea registrar otra hospitalizaci�n?.
        public static String COLUMNA_T_03110706 = "t_03110706";
        public static String COLUMNA_P_0311080101 = "p_0311080101";	// Mes.
        public static String COLUMNA_T_0311080101 = "t_0311080101";
        public static String COLUMNA_P_0311080102 = "p_0311080102";	// A�o.
        public static String COLUMNA_T_0311080102 = "t_0311080102";
        public static String COLUMNA_P_0311080201 = "p_0311080201";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311080201 = "t_0311080201";
        public static String COLUMNA_P_0311080202 = "p_0311080202";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311080202 = "t_0311080202";
        public static String COLUMNA_P_03110803 = "p_03110803";		// Ubicaci�n del hospital.
        public static String COLUMNA_T_03110803 = "t_03110803";
        public static String COLUMNA_P_0311080301 = "p_0311080301";	// Ubicaci�n del hospital en Alcald�a.
        public static String COLUMNA_T_0311080301 = "t_0311080301";
        public static String COLUMNA_P_0311080302 = "p_0311080302";	// Ubicaci�n del hospital en alg�n Estado.
        public static String COLUMNA_T_0311080302 = "t_0311080302";
        public static String COLUMNA_P_0311080303 = "p_0311080303";	// Ubicaci�n del hospital en alg�n otro Pa�s.
        public static String COLUMNA_T_0311080303 = "t_0311080303";
        public static String COLUMNA_P_03110804 = "p_03110804";		// Proveedor.
        public static String COLUMNA_T_03110804 = "t_03110804";
        public static String COLUMNA_P_0311080501 = "p_0311080501";		// Nombre del hospital.
        public static String COLUMNA_T_0311080501 = "t_0311080501";
        public static String COLUMNA_P_0311080502 = "p_0311080502";		// Nombre del hospital.
        public static String COLUMNA_T_0311080502 = "t_0311080502";
        public static String COLUMNA_P_03110806 = "p_03110806";		// �Desea registrar otra hospitalizaci�n?.
        public static String COLUMNA_T_03110806 = "t_03110806";
        public static String COLUMNA_P_0311090101 = "p_0311090101";	// Mes.
        public static String COLUMNA_T_0311090101 = "t_0311090101";
        public static String COLUMNA_P_0311090102 = "p_0311090102";	// A�o.
        public static String COLUMNA_T_0311090102 = "t_0311090102";
        public static String COLUMNA_P_0311090201 = "p_0311090201";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311090201 = "t_0311090201";
        public static String COLUMNA_P_0311090202 = "p_0311090202";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311090202 = "t_0311090202";
        public static String COLUMNA_P_03110903 = "p_03110903";		// Ubicaci�n del hospital.
        public static String COLUMNA_T_03110903 = "t_03110903";
        public static String COLUMNA_P_0311090301 = "p_0311090301";	// Ubicaci�n del hospital en Alcald�a.
        public static String COLUMNA_T_0311090301 = "t_0311090301";
        public static String COLUMNA_P_0311090302 = "p_0311090302";	// Ubicaci�n del hospital en alg�n Estado.
        public static String COLUMNA_T_0311090302 = "t_0311090302";
        public static String COLUMNA_P_0311090303 = "p_0311090303";	// Ubicaci�n del hospital en alg�n otro Pa�s.
        public static String COLUMNA_T_0311090303 = "t_0311090303";
        public static String COLUMNA_P_03110904 = "p_03110904";		// Proveedor.
        public static String COLUMNA_T_03110904 = "t_03110904";
        public static String COLUMNA_P_0311090501 = "p_0311090501";		// Nombre del hospital.
        public static String COLUMNA_T_0311090501 = "t_0311090501";
        public static String COLUMNA_P_0311090502 = "p_0311090502";		// Nombre del hospital.
        public static String COLUMNA_T_0311090502 = "t_0311090502";
        public static String COLUMNA_P_03110906 = "p_03110906";		// �Desea registrar otra hospitalizaci�n?.
        public static String COLUMNA_T_03110906 = "t_03110906";
        public static String COLUMNA_P_0311100101 = "p_0311100101";	// Mes.
        public static String COLUMNA_T_0311100101 = "t_0311100101";
        public static String COLUMNA_P_0311100102 = "p_0311100102";	// A�o.
        public static String COLUMNA_T_0311100102 = "t_0311100102";
        public static String COLUMNA_P_0311100201 = "p_0311100201";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311100201 = "t_0311100201";
        public static String COLUMNA_P_0311100202 = "p_0311100202";	// Raz�n de la admisi�n.
        public static String COLUMNA_T_0311100202 = "t_0311100202";
        public static String COLUMNA_P_03111003 = "p_03111003";		// Ubicaci�n del hospital.
        public static String COLUMNA_T_03111003 = "t_03111003";
        public static String COLUMNA_P_0311100301 = "p_0311100301";	// Ubicaci�n del hospital en Alcald�a.
        public static String COLUMNA_T_0311100301 = "t_0311100301";
        public static String COLUMNA_P_0311100302 = "p_0311100302";	// Ubicaci�n del hospital en alg�n Estado.
        public static String COLUMNA_T_0311100302 = "t_0311100302";
        public static String COLUMNA_P_0311100303 = "p_0311100303";	// Ubicaci�n del hospital en alg�n otro Pa�s.
        public static String COLUMNA_T_0311100303 = "t_0311100303";
        public static String COLUMNA_P_03111004 = "p_03111004";		// Proveedor.
        public static String COLUMNA_T_03111004 = "t_03111004";
        public static String COLUMNA_P_0311100501 = "p_0311100501";		// Nombre del hospital.
        public static String COLUMNA_T_0311100501 = "t_0311100501";
        public static String COLUMNA_P_0311100502 = "p_0311100502";		// Nombre del hospital.
        public static String COLUMNA_T_0311100502 = "t_0311100502";
        public static String COLUMNA_P_03111006 = "p_03111006";		// �Desea registrar otra hospitalizaci�n?.
        public static String COLUMNA_T_03111006 = "t_03111006";
        public static String COLUMNA_P_0312 = "p_0312";
        public static String COLUMNA_T_0312 = "t_0312";
        public static String COLUMNA_P_0313 = "p_0313";
        public static String COLUMNA_T_0313 = "t_0313";
        public static String COLUMNA_P_0401 = "p_0401";
        public static String COLUMNA_T_0401 = "t_0401";
        public static String COLUMNA_P_04010101 = "p_04010101";
        public static String COLUMNA_T_04010101 = "t_04010101";
        public static String COLUMNA_P_04010102 = "p_04010102";
        public static String COLUMNA_T_04010102 = "t_04010102";
        public static String COLUMNA_P_0402 = "p_0402";
        public static String COLUMNA_T_0402 = "t_0402";
        public static String COLUMNA_P_04020101 = "p_04020101";
        public static String COLUMNA_T_04020101 = "t_04020101";
        public static String COLUMNA_P_04020102 = "p_04020102";
        public static String COLUMNA_T_04020102 = "t_04020102";
        public static String COLUMNA_P_0403 = "p_0403";
        public static String COLUMNA_T_0403 = "t_0403";
        public static String COLUMNA_P_04030101 = "p_04030101";
        public static String COLUMNA_T_04030101 = "t_04030101";
        public static String COLUMNA_P_04030102 = "p_04030102";
        public static String COLUMNA_T_04030102 = "t_04030102";
        public static String COLUMNA_P_0404 = "p_0404";
        public static String COLUMNA_T_0404 = "t_0404";
        public static String COLUMNA_P_04040101 = "p_04040101";
        public static String COLUMNA_T_04040101 = "t_04040101";
        public static String COLUMNA_P_04040102 = "p_04040102";
        public static String COLUMNA_T_04040102 = "t_04040102";
        public static String COLUMNA_P_0405 = "p_0405";
        public static String COLUMNA_T_0405 = "t_0405";
        public static String COLUMNA_P_04050101 = "p_04050101";
        public static String COLUMNA_T_04050101 = "t_04050101";
        public static String COLUMNA_P_04050102 = "p_04050102";
        public static String COLUMNA_T_04050102 = "t_04050102";
        public static String COLUMNA_P_0406 = "p_0406";
        public static String COLUMNA_T_0406 = "t_0406";
        public static String COLUMNA_P_04060101 = "p_04060101";
        public static String COLUMNA_T_04060101 = "t_04060101";
        public static String COLUMNA_P_04060102 = "p_04060102";
        public static String COLUMNA_T_04060102 = "t_04060102";
        public static String COLUMNA_P_0407 = "p_0407";	// Efecto Dolly.
        public static String COLUMNA_T_0407 = "t_0407";
        public static String COLUMNA_P_040701 = "p_040701";
        public static String COLUMNA_T_040701 = "t_040701";
        public static String COLUMNA_P_0408 = "p_0408";	// Efecto Dolly.
        public static String COLUMNA_T_0408 = "t_0408";
        public static String COLUMNA_P_040801 = "p_040801";
        public static String COLUMNA_T_040801 = "t_040801";
        public static String COLUMNA_P_0815 = "p_0815"; // Resultado de la entrevista.
        public static String COLUMNA_T_0815 = "t_0815";
        public static String COLUMNA_FECHA_FIN = "fecha_fin";
        public static String COLUMNA_HORA_FIN = "hora_fin";
        public static String COLUMNA_FECHOR_FIN = "fechor_fin";
        public static String COLUMNA_LATITUD_B = "latitud_b";
        public static String COLUMNA_LONGITUD_B = "longitud_b";
        public static String COLUMNA_P72 = "p72";
        public static String COLUMNA_VIVE = "vive";
        public static String COLUMNA_TABLETA = "tableta"; // Nombre de la tableta.
        public static String COLUMNA_ENCUESTO = "encuesto"; // Nombre de la entrevistadora.
    }

    private static final String CREAR_TABLA_POSICIONADOR = "create table "
            + TablaPosicionador.TABLA_POSICIONADOR + "("
            + TablaPosicionador.COLUMNA_REGISTRO + " text, "
            + TablaPosicionador.COLUMNA_POSICION + " text, "
            + TablaPosicionador.COLUMNA_TABLETA + " text, "
            + TablaPosicionador.COLUMNA_ENCUESTO + " text, "
            + TablaPosicionador.COLUMNA_REFIERE + " integer)";

    private static final String CREAR_TABLA_CUESTIONARIO_BASICO = "create table "
            + TablaCuestionarioBasico.TABLA_CUESTIONARIO_BASICO + "("
            + TablaCuestionarioBasico.COLUMNA_REGISTRO + " text, "
            + TablaCuestionarioBasico.COLUMNA_CADENA + " text, "
            + TablaCuestionarioBasico.COLUMNA_MUNICIPIO + " integer, "
            + TablaCuestionarioBasico.COLUMNA_AGEB + " integer, "
            + TablaCuestionarioBasico.COLUMNA_AREA + " integer, "
            + TablaCuestionarioBasico.COLUMNA_MANZANA + " integer, "
            + TablaCuestionarioBasico.COLUMNA_VIVIENDA + " integer, "
            + TablaCuestionarioBasico.COLUMNA_NOMBRE + " text, "
            + TablaCuestionarioBasico.COLUMNA_PATERNO + " text, "
            + TablaCuestionarioBasico.COLUMNA_MATERNO + " text, "
            + TablaCuestionarioBasico.COLUMNA_NOMBRE_CO + " text, "
            + TablaCuestionarioBasico.COLUMNA_PATERNO_CO + " text, "
            + TablaCuestionarioBasico.COLUMNA_MATERNO_CO + " text, "
            + TablaCuestionarioBasico.COLUMNA_SEXO + " integer, "
            + TablaCuestionarioBasico.COLUMNA_EDAD + " integer, "
            + TablaCuestionarioBasico.COLUMNA_EDAD_HOY + " integer, "
            + TablaCuestionarioBasico.COLUMNA_FECHA + " date, "
            + TablaCuestionarioBasico.COLUMNA_HORA_INI + " time, "
            + TablaCuestionarioBasico.COLUMNA_FECHOR_INI + " text, "
            + TablaCuestionarioBasico.COLUMNA_LATITUD_A + " text, "
            + TablaCuestionarioBasico.COLUMNA_LONGITUD_A + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0103 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0103 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0104 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0104 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_010501 + " integer, "	// D�a naci�.
            + TablaCuestionarioBasico.COLUMNA_T_010501 + " text, "		// D�a naci�.
            + TablaCuestionarioBasico.COLUMNA_P_010502 + " integer, "	// Mes naci�.
            + TablaCuestionarioBasico.COLUMNA_T_010502 + " text, "		// Mes naci�.
            + TablaCuestionarioBasico.COLUMNA_P_010503 + " integer, "	// A�o naci�.
            + TablaCuestionarioBasico.COLUMNA_T_010503 + " text, "		// A�o naci�.
            + TablaCuestionarioBasico.COLUMNA_P_010504 + " integer, "	// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_T_010504 + " text, "		// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_P_0106 + " text, "		// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_T_0106 + " text, "		// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_P_010601 + " integer, "	// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_T_010601 + " text, "		// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_P_0107 + " text, "		// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_T_0107 + " text, "		// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_P_010701 + " integer, "	// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_T_010701 + " text, "		// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_P_0201 + " integer, "		// Relaci�n.
            + TablaCuestionarioBasico.COLUMNA_T_0201 + " text, "		// Relaci�n.
            + TablaCuestionarioBasico.COLUMNA_P_020201 + " integer, "	// D�a naci�.
            + TablaCuestionarioBasico.COLUMNA_T_020201 + " text, "		// D�a naci�.
            + TablaCuestionarioBasico.COLUMNA_P_020202 + " integer, "	// Mes naci�.
            + TablaCuestionarioBasico.COLUMNA_T_020202 + " text, "		// Mes naci�.
            + TablaCuestionarioBasico.COLUMNA_P_020203 + " integer, "	// A�o naci�.
            + TablaCuestionarioBasico.COLUMNA_T_020203 + " text, "		// A�o naci�.
            + TablaCuestionarioBasico.COLUMNA_P_020204 + " integer, "	// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_T_020204 + " text, "		// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_P_020301 + " integer, "	// D�a falleci�.
            + TablaCuestionarioBasico.COLUMNA_T_020301 + " text, "		// D�a falleci�.
            + TablaCuestionarioBasico.COLUMNA_P_020302 + " integer, "	// Mes falleci�.
            + TablaCuestionarioBasico.COLUMNA_T_020302 + " text, "		// Mes falleci�.
            + TablaCuestionarioBasico.COLUMNA_P_020303 + " integer, "	// A�o falleci�.
            + TablaCuestionarioBasico.COLUMNA_T_020303 + " text, "		// A�o falleci�.
            + TablaCuestionarioBasico.COLUMNA_P_020304 + " integer, "	// A�os cumplidos.
            + TablaCuestionarioBasico.COLUMNA_T_020304 + " text, "		// A�os cumplidos.
            + TablaCuestionarioBasico.COLUMNA_P_020305 + " integer, "	// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_T_020305 + " text, "		// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_P_0204 + " integer, "		// Lugar de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_T_0204 + " text, "		// Lugar de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_P_020401 + " integer, "	// Municipio.
            + TablaCuestionarioBasico.COLUMNA_T_020401 + " text, "		// Municipio.
            + TablaCuestionarioBasico.COLUMNA_P_020402 + " integer, "	// Estado.
            + TablaCuestionarioBasico.COLUMNA_T_020402 + " text, "		// Estado.
            + TablaCuestionarioBasico.COLUMNA_P_020403 + " text, "		// Pa�s.
            + TablaCuestionarioBasico.COLUMNA_T_020403 + " text, "		// Pa�s.
            + TablaCuestionarioBasico.COLUMNA_P_0205 + " integer, "		// Causa de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_T_0205 + " text, "		// Causa de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_P_020501 + " text, "		// Causa de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_T_020501 + " text, "		// Causa de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_P_0206 + " integer, "		// Certificado de defunci�n.
            + TablaCuestionarioBasico.COLUMNA_T_0206 + " text, "		// Certificado de defunci�n.
            + TablaCuestionarioBasico.COLUMNA_P_0207 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0207 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_020801 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_020801 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_020802 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_020802 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_020901 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_020901 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_020902 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_020902 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_030201 + " integer, "	// D�a naci�.
            + TablaCuestionarioBasico.COLUMNA_T_030201 + " text, "		// D�a naci�.
            + TablaCuestionarioBasico.COLUMNA_P_030202 + " integer, "	// Mes naci�.
            + TablaCuestionarioBasico.COLUMNA_T_030202 + " text, "		// Mes naci�.
            + TablaCuestionarioBasico.COLUMNA_P_030203 + " integer, "	// A�o naci�.
            + TablaCuestionarioBasico.COLUMNA_T_030203 + " text, "		// A�o naci�.
            + TablaCuestionarioBasico.COLUMNA_P_030204 + " integer, "	// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_T_030204 + " text, "		// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_P_0303 + " text, "		// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_T_0303 + " text, "		// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_P_030301 + " integer, "	// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_T_030301 + " text, "		// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_P_0304 + " text, "		// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_T_0304 + " text, "		// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_P_030401 + " integer, "	// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_T_030401 + " text, "		// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_P_0305 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0305 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0306 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0306 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0307 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0307 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0308 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0308 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03080101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03080101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03080102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_03080102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03080201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03080201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03080202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_03080202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03080301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03080301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03080302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_03080302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03080401 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03080401 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03080402 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_03080402 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03080501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03080501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03080502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_03080502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03090101 + " integer, "	// Opci�n 01. Angina de pecho.
            + TablaCuestionarioBasico.COLUMNA_T_03090101 + " text, "	// Opci�n 01.
            + TablaCuestionarioBasico.COLUMNA_P_03090102 + " integer, "	// A�o de la opci�n 01.
            + TablaCuestionarioBasico.COLUMNA_T_03090102 + " text, "	// A�o de la opci�n 01.
            + TablaCuestionarioBasico.COLUMNA_P_03090103 + " integer, "	// Peso de la opci�n 01.
            + TablaCuestionarioBasico.COLUMNA_P_03090201 + " integer, "	// Opci�n 02. Ataque al coraz�n.
            + TablaCuestionarioBasico.COLUMNA_T_03090201 + " text, "	// Opci�n 02.
            + TablaCuestionarioBasico.COLUMNA_P_03090202 + " integer, "	// A�o de la opci�n 02.
            + TablaCuestionarioBasico.COLUMNA_T_03090202 + " text, "	// A�o de la opci�n 02.
            + TablaCuestionarioBasico.COLUMNA_P_03090203 + " integer, "	// Peso de la opci�n 02.
            + TablaCuestionarioBasico.COLUMNA_P_03090301 + " integer, "	// Opci�n 03. Ataque cerebral.
            + TablaCuestionarioBasico.COLUMNA_T_03090301 + " text, "	// Opci�n 03.
            + TablaCuestionarioBasico.COLUMNA_P_03090302 + " integer, "	// A�o de la opci�n 03.
            + TablaCuestionarioBasico.COLUMNA_T_03090302 + " text, "	// A�o de la opci�n 03.
            + TablaCuestionarioBasico.COLUMNA_P_03090303 + " integer, "	// Peso de la opci�n 03.
            + TablaCuestionarioBasico.COLUMNA_P_03090401 + " integer, "	// Opci�n 04. Diabetes.
            + TablaCuestionarioBasico.COLUMNA_T_03090401 + " text, "	// Opci�n 04.
            + TablaCuestionarioBasico.COLUMNA_P_03090402 + " integer, "	// A�o de la opci�n 04.
            + TablaCuestionarioBasico.COLUMNA_T_03090402 + " text, "	// A�o de la opci�n 04.
            + TablaCuestionarioBasico.COLUMNA_P_03090403 + " integer, "	// Peso de la opci�n 04.
            + TablaCuestionarioBasico.COLUMNA_P_03090501 + " integer, "	// Opci�n 05. Da�o a la retina (o perdi� la vista).
            + TablaCuestionarioBasico.COLUMNA_T_03090501 + " text, "	// Opci�n 05.
            + TablaCuestionarioBasico.COLUMNA_P_03090502 + " integer, "	// A�o de la opci�n 05.
            + TablaCuestionarioBasico.COLUMNA_T_03090502 + " text, "	// A�o de la opci�n 05.
            + TablaCuestionarioBasico.COLUMNA_P_03090503 + " integer, "	// Peso de la opci�n 05.
            + TablaCuestionarioBasico.COLUMNA_P_03090601 + " integer, "	// Opci�n 06. Amputaci�n de extremidades por enfermedad vascular o infecci�n.
            + TablaCuestionarioBasico.COLUMNA_T_03090601 + " text, "	// Opci�n 06.
            + TablaCuestionarioBasico.COLUMNA_P_03090602 + " integer, "	// A�o de la opci�n 06.
            + TablaCuestionarioBasico.COLUMNA_T_03090602 + " text, "	// A�o de la opci�n 06.
            + TablaCuestionarioBasico.COLUMNA_P_03090603 + " integer, "	// Peso de la opci�n 06.
            + TablaCuestionarioBasico.COLUMNA_P_03090701 + " integer, "	// Opci�n 07. Enfermedad renal cr�nica.
            + TablaCuestionarioBasico.COLUMNA_T_03090701 + " text, "	// Opci�n 07.
            + TablaCuestionarioBasico.COLUMNA_P_03090702 + " integer, "	// A�o de la opci�n 07.
            + TablaCuestionarioBasico.COLUMNA_T_03090702 + " text, "	// A�o de la opci�n 07.
            + TablaCuestionarioBasico.COLUMNA_P_03090703 + " integer, "	// Peso de la opci�n 07.
            + TablaCuestionarioBasico.COLUMNA_P_03090801 + " integer, "	// Opci�n 08. Necesidad de di�lisis o transplante renal.
            + TablaCuestionarioBasico.COLUMNA_T_03090801 + " text, "	// Opci�n 08.
            + TablaCuestionarioBasico.COLUMNA_P_03090802 + " integer, "	// A�o de la opci�n 08.
            + TablaCuestionarioBasico.COLUMNA_T_03090802 + " text, "	// A�o de la opci�n 08.
            + TablaCuestionarioBasico.COLUMNA_P_03090803 + " integer, "	// Peso de la opci�n 08.
            + TablaCuestionarioBasico.COLUMNA_P_03090901 + " integer, "	// Opci�n 09. Cirrosis del h�gado.
            + TablaCuestionarioBasico.COLUMNA_T_03090901 + " text, "	// Opci�n 09.
            + TablaCuestionarioBasico.COLUMNA_P_03090902 + " integer, "	// A�o de la opci�n 09.
            + TablaCuestionarioBasico.COLUMNA_T_03090902 + " text, "	// A�o de la opci�n 09.
            + TablaCuestionarioBasico.COLUMNA_P_03090903 + " integer, "	// Peso de la opci�n 09.
            + TablaCuestionarioBasico.COLUMNA_P_03091001 + " integer, "	// Opci�n 10. Enfermedad pulmonar obstructiva cr�nica (por ejemplo, enfisema).
            + TablaCuestionarioBasico.COLUMNA_T_03091001 + " text, "	// Opci�n 10.
            + TablaCuestionarioBasico.COLUMNA_P_03091002 + " integer, "	// A�o de la opci�n 10.
            + TablaCuestionarioBasico.COLUMNA_T_03091002 + " text, "	// A�o de la opci�n 10.
            + TablaCuestionarioBasico.COLUMNA_P_03091003 + " integer, "	// Peso de la opci�n 10.
            + TablaCuestionarioBasico.COLUMNA_P_03091101 + " integer, "	// Opci�n 11. Hipertensi�n arterial.
            + TablaCuestionarioBasico.COLUMNA_T_03091101 + " text, "	// Opci�n 11.
            + TablaCuestionarioBasico.COLUMNA_P_03091102 + " integer, "	// A�o de la opci�n 11.
            + TablaCuestionarioBasico.COLUMNA_T_03091102 + " text, "	// A�o de la opci�n 11.
            + TablaCuestionarioBasico.COLUMNA_P_03091103 + " integer, "	// Peso de la opci�n 11.
            + TablaCuestionarioBasico.COLUMNA_P_03091201 + " integer, "	// Opci�n 12. Demencia.
            + TablaCuestionarioBasico.COLUMNA_T_03091201 + " text, "	// Opci�n 12.
            + TablaCuestionarioBasico.COLUMNA_P_03091202 + " integer, "	// A�o de la opci�n 12.
            + TablaCuestionarioBasico.COLUMNA_T_03091202 + " text, "	// A�o de la opci�n 12.
            + TablaCuestionarioBasico.COLUMNA_P_03091203 + " integer, "	// Peso de la opci�n 12.
            + TablaCuestionarioBasico.COLUMNA_P_03091301 + " integer, "	// Opci�n 13. Depresi�n o ansiedad.
            + TablaCuestionarioBasico.COLUMNA_T_03091301 + " text, "	// Opci�n 13.
            + TablaCuestionarioBasico.COLUMNA_P_03091302 + " integer, "	// A�o de la opci�n 13.
            + TablaCuestionarioBasico.COLUMNA_T_03091302 + " text, "	// A�o de la opci�n 13.
            + TablaCuestionarioBasico.COLUMNA_P_03091303 + " integer, "	// Peso de la opci�n 13.
            + TablaCuestionarioBasico.COLUMNA_P_030914 + " integer, "	// Opci�n 14. C�ncer.
            + TablaCuestionarioBasico.COLUMNA_T_030914 + " text, "		// Opci�n 14.
            + TablaCuestionarioBasico.COLUMNA_P_03091501 + " integer, "	// Opci�n 15. Pulm�n.
            + TablaCuestionarioBasico.COLUMNA_T_03091501 + " text, "	// Opci�n 15.
            + TablaCuestionarioBasico.COLUMNA_P_03091502 + " integer, "	// A�o de la opci�n 15.
            + TablaCuestionarioBasico.COLUMNA_T_03091502 + " text, "	// A�o de la opci�n 15.
            + TablaCuestionarioBasico.COLUMNA_P_03091503 + " integer, "	// Peso de la opci�n 15.
            + TablaCuestionarioBasico.COLUMNA_P_03091601 + " integer, "	// Opci�n 16. Pr�stata.
            + TablaCuestionarioBasico.COLUMNA_T_03091601 + " text, "	// Opci�n 16.
            + TablaCuestionarioBasico.COLUMNA_P_03091602 + " integer, "	// A�o de la opci�n 16.
            + TablaCuestionarioBasico.COLUMNA_T_03091602 + " text, "	// A�o de la opci�n 16.
            + TablaCuestionarioBasico.COLUMNA_P_03091603 + " integer, "	// Peso de la opci�n 16.
            + TablaCuestionarioBasico.COLUMNA_P_03091701 + " integer, "	// Opci�n 17. C�rvix.
            + TablaCuestionarioBasico.COLUMNA_T_03091701 + " text, "	// Opci�n 17.
            + TablaCuestionarioBasico.COLUMNA_P_03091702 + " integer, "	// A�o de la opci�n 17
            + TablaCuestionarioBasico.COLUMNA_T_03091702 + " text, "	// A�o de la opci�n 17
            + TablaCuestionarioBasico.COLUMNA_P_03091703 + " integer, "	// Peso de la opci�n 17
            + TablaCuestionarioBasico.COLUMNA_P_03091801 + " integer, "	// Opci�n 18. Pecho.
            + TablaCuestionarioBasico.COLUMNA_T_03091801 + " text, "	// Opci�n 18.
            + TablaCuestionarioBasico.COLUMNA_P_03091802 + " integer, "	// A�o de la opci�n 18.
            + TablaCuestionarioBasico.COLUMNA_T_03091802 + " text, "	// A�o de la opci�n 18.
            + TablaCuestionarioBasico.COLUMNA_P_03091803 + " integer, "	// Peso de la opci�n 18.
            + TablaCuestionarioBasico.COLUMNA_P_03091901 + " integer, "	// Opci�n 19. Es�fago, est�mago, c�lon, recto.
            + TablaCuestionarioBasico.COLUMNA_T_03091901 + " text, "	// Opci�n 19.
            + TablaCuestionarioBasico.COLUMNA_P_03091902 + " integer, "	// A�o de la opci�n 19.
            + TablaCuestionarioBasico.COLUMNA_T_03091902 + " text, "	// A�o de la opci�n 19.
            + TablaCuestionarioBasico.COLUMNA_P_03091903 + " integer, "	// Peso de la opci�n 19.
            + TablaCuestionarioBasico.COLUMNA_P_03092001 + " integer, "	// Opci�n 20. Oral, nasal, garganta.
            + TablaCuestionarioBasico.COLUMNA_T_03092001 + " text, "	// Opci�n 20.
            + TablaCuestionarioBasico.COLUMNA_P_03092002 + " integer, "	// A�o de la opci�n 20.
            + TablaCuestionarioBasico.COLUMNA_T_03092002 + " text, "	// A�o de la opci�n 20.
            + TablaCuestionarioBasico.COLUMNA_P_03092003 + " integer, "	// Peso de la opci�n 20.
            + TablaCuestionarioBasico.COLUMNA_P_03092101 + " integer, "	// Opci�n 21. Otro c�ncer.
            + TablaCuestionarioBasico.COLUMNA_T_03092101 + " text, "	// Opci�n 21.
            + TablaCuestionarioBasico.COLUMNA_P_03092102 + " integer, "	// A�o de la opci�n 21.
            + TablaCuestionarioBasico.COLUMNA_T_03092102 + " text, "	// A�o de la opci�n 21.
            + TablaCuestionarioBasico.COLUMNA_P_03092103 + " integer, "	// Peso de la opci�n 21.
            + TablaCuestionarioBasico.COLUMNA_P_030922 + " integer, "	// Opci�n 22. Ninguna enfermedad.
            + TablaCuestionarioBasico.COLUMNA_T_030922 + " text, "		// Opci�n 22.
            + TablaCuestionarioBasico.COLUMNA_P_030923 + " integer, "	// Opci�n 23. No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_T_030923 + " text, "		// Opci�n 23.
            + TablaCuestionarioBasico.COLUMNA_P_0310 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0310 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311010101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311010101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311010102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311010102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311010201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311010201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311010202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311010202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110103 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110103 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311010301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311010301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311010302 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311010302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311010303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311010303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110104 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110104 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311010501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311010501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311010502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311010502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110106 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110106 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311020101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311020101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311020102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311020102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311020201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311020201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311020202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311020202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110203 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110203 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311020301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311020301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311020302 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311020302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311020303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311020303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110204 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110204 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311020501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311020501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311020502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311020502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110206 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110206 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311030101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311030101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311030102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311030102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311030201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311030201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311030202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311030202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110303 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311030301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311030301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311030302 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311030302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311030303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311030303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110304 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110304 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311030501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311030501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311030502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311030502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110306 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110306 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311040101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311040101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311040102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311040102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311040201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311040201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311040202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311040202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110403 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110403 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311040301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311040301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311040302 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311040302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311040303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311040303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110404 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110404 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311040501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311040501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311040502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311040502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110406 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110406 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311050101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311050101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311050102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311050102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311050201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311050201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311050202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311050202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110503 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110503 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311050301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311050301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311050302 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311050302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311050303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311050303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110504 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110504 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311050501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311050501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311050502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311050502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110506 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110506 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311060101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311060101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311060102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311060102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311060201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311060201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311060202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311060202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110603 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110603 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311060301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311060301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311060302 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311060302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311060303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311060303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110604 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110604 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311060501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311060501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311060502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311060502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110606 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110606 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311070101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311070101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311070102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311070102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311070201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311070201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311070202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311070202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110703 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110703 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311070301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311070301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311070302 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311070302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311070303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311070303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110704 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110704 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311070501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311070501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311070502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311070502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110706 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110706 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311080101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311080101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311080102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311080102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311080201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311080201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311080202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311080202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110803 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110803 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311080301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311080301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311080302 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311080302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311080303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311080303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110804 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110804 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311080501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311080501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311080502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311080502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110806 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110806 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311090101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311090101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311090102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311090102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311090201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311090201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311090202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311090202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110903 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110903 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311090301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311090301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311090302 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311090302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311090303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311090303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110904 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110904 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311090501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311090501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311090502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311090502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03110906 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03110906 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311100101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311100101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311100102 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311100102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311100201 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311100201 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311100202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311100202 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03111003 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03111003 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311100301 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311100301 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311100302 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311100302 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311100303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311100303 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03111004 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03111004 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311100501 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0311100501 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0311100502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_0311100502 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03111006 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03111006 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0312 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0312 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0313 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0313 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0401 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0401 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04010101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_04010101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04010102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_04010102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0402 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0402 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04020101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_04020101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04020102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_04020102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0403 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0403 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04030101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_04030101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04030102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_04030102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0404 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0404 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04040101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_04040101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04040102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_04040102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0405 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0405 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04050101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_04050101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04050102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_04050102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0406 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0406 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04060101 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_04060101 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_04060102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_T_04060102 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0407 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0407 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_040701 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_040701 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0408 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_0408 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_040801 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_040801 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_0815 + " integer, "	// Resultado de la entrevista.
            + TablaCuestionarioBasico.COLUMNA_T_0815 + " text, "	// Resultado de la entrevista.
            + TablaCuestionarioBasico.COLUMNA_FECHA_FIN + " date, "
            + TablaCuestionarioBasico.COLUMNA_HORA_FIN + " time, "
            + TablaCuestionarioBasico.COLUMNA_FECHOR_FIN + " text, "
            + TablaCuestionarioBasico.COLUMNA_LATITUD_B + " text, "
            + TablaCuestionarioBasico.COLUMNA_LONGITUD_B + " text, "
            + TablaCuestionarioBasico.COLUMNA_P72 + " text, "
            + TablaCuestionarioBasico.COLUMNA_VIVE + " integer, "
            + TablaCuestionarioBasico.COLUMNA_TABLETA + " text, "	// Nombre de la tableta.
            + TablaCuestionarioBasico.COLUMNA_ENCUESTO + " text)";	// Nombre de la entrevistadora.

    public SQLiteOpenHelperBasico(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(CREAR_TABLA_POSICIONADOR);
        db.execSQL(CREAR_TABLA_CUESTIONARIO_BASICO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
//        db.execSQL("delete table if exists " + TablaCuestionarioBasico.TABLA_CUESTIONARIO_BASICO);
        onCreate(db);
    }
}
