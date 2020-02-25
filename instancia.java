package TareaPOO;

import javax.swing.JOptionPane;

public class instancia {


	public  void calculo () {
		
		
		String edad = JOptionPane.showInputDialog("Introduce edad");
		
		int edad_usuario = Integer.parseInt(edad);
		
		if (edad_usuario >=18) {
			System.out.println("Puede votar en las elecciones");
		} else
			System.out.println("Debes ser mayor de edad para ejercer el voto");
		//return edad_usuario;
		
		

}

}
