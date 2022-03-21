package classes;

import gui.JFrmAcercaDe;
import gui.JFrmHistorialSupervisiones;
import gui.JFrmNuevaSupervision;
import gui.JFrmHistorialSupervisiones;

public class JSingletonForms {
	private static JFrmAcercaDe frmAcercaDe = null;
	private static JFrmNuevaSupervision frmNuevaSupervision = null;
	private static JFrmHistorialSupervisiones frmHistorialSupervisiones = null;
	
	public static JFrmAcercaDe getFrmAcercaDe() {
		if (frmAcercaDe == null) {
			frmAcercaDe = new JFrmAcercaDe();			
		}
		return frmAcercaDe;
	}
	
	public static JFrmNuevaSupervision getFrmNuevaSupervision() {
		if (frmNuevaSupervision == null) {
			frmNuevaSupervision = new JFrmNuevaSupervision();
		}
		return frmNuevaSupervision;
	}
	
	public static JFrmHistorialSupervisiones getFrmHistorialSupervision() {
		if(frmHistorialSupervisiones == null) {
			frmHistorialSupervisiones = new JFrmHistorialSupervisiones();
		}			
		return frmHistorialSupervisiones;
	}
	
}
