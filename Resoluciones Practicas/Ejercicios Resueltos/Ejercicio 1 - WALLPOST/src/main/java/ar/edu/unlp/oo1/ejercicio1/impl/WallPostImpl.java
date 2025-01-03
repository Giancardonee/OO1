package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

public class WallPostImpl implements WallPost {
	private String text; 
	private int likes;
	private boolean featured;
	
	public WallPostImpl ()
	{
		this.setText("Undefined post");
		this.likes = 0;
		this.featured = false;
	}
	
	
	/*
	* Retorna el texto descriptivo de la publicación
	*/
	public String getText()
	{
		return this.text;
	}
	/*
	* Asigna el texto descriptivo de la publicación
	*/

	public void setText(String text)
	{
		this.text = text; 
	}
	/*
	* Retorna la cantidad de “me gusta”
	*/
	public int getLikes()
	{
		return this.likes; 
	}
	/*
	 * Incrementa la cantidad de likes en uno.
	*/
	public void like ()
	{
		likes++;
	}
	/*
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada.
	*/
	public void dislike ()
	{
		if (this.getLikes()>0) likes--; 
	}
	/*
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	*/	
	public boolean isFeatured()
	{
		return this.featured; 
	}
	/*
	 * Cambia el post del estado destacado a no destacado y viceversa.
	*/
	public void toggleFeatured()
	{
		this.featured = !featured;
	}

    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
