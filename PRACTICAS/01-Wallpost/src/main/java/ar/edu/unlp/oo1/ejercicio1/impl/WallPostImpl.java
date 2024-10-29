package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 Se está construyendo una red social como Facebook o Twitter. 
 Debemos definir una clase Wallpost con los siguientes atributos: un texto que se desea publicar, 
 cantidad de likes (“me gusta”) y una marca que indica si es destacado o no
 */

public class WallPostImpl implements WallPost {
	private String texto; 
	private int likes; 
	private boolean esDestacado; 
	
	// CONSTRUCTOR
	
	public WallPostImpl() {
		texto = "Undefined post"; 
		likes = 0; 
		esDestacado = false; 
	}
	
	// MÉTODOS 
	
	public String getText() {
		return texto; 
	}
	
	public void setText (String descriptionText) {
		texto = descriptionText; 
	}
	
	public int getLikes() {
		return likes; 
	}
	
	public void like() {
		likes++; 
	}
	
	public void dislike() {
		if (likes > 0) 
			likes--;
	}
	
	public boolean isFeatured() {
		return esDestacado; 
	}
	
	public void toggleFeatured() {
		esDestacado = !esDestacado;
	}

	 /* Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
