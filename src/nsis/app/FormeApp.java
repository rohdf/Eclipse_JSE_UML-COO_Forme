/** @author: Rohdri FRIMAT 
 *  Date: 06/09/2016 
 */


package nsis.app;

import nsis.metier.Carre;
import nsis.metier.Cercle;
import nsis.metier.Espace;
import nsis.metier.Point;
import nsis.metier.Rectangle;

/**
 * 
 * Classe FormeApp est l'entrée de l'application
 *
 */
public class FormeApp {

	public static void main(String[] args) {
		System.out.println("Hello Forme");
		
		/*création de rectangles*/
		Rectangle rec = new Rectangle(12, 13, 1, 1);
		
		/*Création de carrés*/
		Carre car = new Carre(10, 10, 10);
		
		/*Création de cercles*/
		Cercle ce = new Cercle(2015, 1, 2);
		
		/*Création de points*/
		Point pt = new Point(2, 4);
		
		/*Affichage des périmètres*/
		System.out.println("Périmètre rectangle "+ rec.getPerimetre());
		System.out.println("Périmètre carré "+ car.getPerimetre());
		System.out.println("Périmètre cercle "+ ce.getPerimetre());
		System.out.println("Périmètre cercle "+ pt.getPerimetre());
		
		/*Création de l'espace*/
		Espace esp = new Espace();
		
		/*Insertion des formes dans l'espace*/
		esp.addForme(rec);
		esp.addForme(car);
		esp.addForme(ce);
		esp.addForme(pt);
		
		/*Affichage des dimantions des formes*/
		System.out.println("----------------------------------------------------------------------------------");
		esp.displayFormes();
		
		/*déplacement des formes*/
		rec.deplacer(1, 1);
		car.deplacer(2, 2);
		ce.deplacer(3, 3);
		pt.deplacer(4, 4);
		
		/*Affichage des dimantions des formes*/
		System.out.println("----------------------------------------------------------------------------------");
		esp.displayFormes();
		
	}

}
