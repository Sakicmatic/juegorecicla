/**
 *
 *
 *
 *
 * @author THE NIBBLES
 * @author Evert Salinas
 * @author Daniel Mena
 * @author Daniela Valdés
 * @author Martha Valdés
 * @version BETA 2014/20/11
 */

package juego;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Evert
 */
class Producto {

    private int iX;     //posicion en x.       
    private int iY;     //posicion en y.
    private int iVelocidad;   // velocidad
    private int iCategoria; // categoria
    private boolean bAgarrado; // booleana de agarrado
    private ImageIcon imiIcono;	//icono.

    /**
     * Personaje
     * 
     * Metodo constructor usado para crear el objeto animal
     * creando el icono a partir de una imagen
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * @param iY es la <code>posicion en y</code> del objeto.
     * @param imaImagen es la <code>imagen</code> del objeto.
     * 
     */
    public Producto(int iX, int iY , Image imaImagen) {
        this.iX = iX;
        this.iY = iY;
        imiIcono = new ImageIcon(imaImagen);
        this.iVelocidad = 1;   // default 1 en velocidad
        this.bAgarrado = false;
        this.iCategoria = -1;
    }

    /**
     * Personaje
     * 
     * Metodo constructor usado para crear el objeto animal
     * creando el icono de imagen de un objeto igual
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * @param iY es la <code>posicion en y</code> del objeto.
     * @param icoImagen es la <code>imagen tipo icono</code> del objeto.
     * 
     */
    public Producto(int iX, int iY ,ImageIcon icoImagen) {
        this.iX = iX;
        this.iY = iY;
        imiIcono = icoImagen;
        this.iVelocidad = 1;    // default 1 en velocidad
        this.bAgarrado = false;
        this.iCategoria = -1;
    }
    
    /**
     * setCategoria
     * 
     * Metodo de acceso que regresa el estado de agarrado del objeto
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * 
     */
    public void setCategoria(int iC) {
        this.iCategoria = iC;
    }
    
    /**
     * getAgarrado
     * 
     * Metodo modificador usado para cambiar el estado de agarrado del objeto
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * 
     */
    public int getCategoria() {
        return iCategoria;
    }
    
    /**
     * setAgarrado
     * 
     * Metodo de acceso que regresa el estado de agarrado del objeto
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * 
     */
    public void setAgarrado(boolean bA) {
        this.bAgarrado = bA;
    }
    
    /**
     * getAgarrado
     * 
     * Metodo modificador usado para cambiar el estado de agarrado del objeto
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * 
     */
    public boolean getAgarrado() {
        return bAgarrado;
    }
    
    /**
     * setX
     * 
     * Metodo modificador usado para cambiar la posicion en x del objeto
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * 
     */
    public void setX(int iX) {
        this.iX = iX;
    }

    
    /**
     * getX
     * 
     * Metodo de acceso que regresa la posicion en x del objeto 
     * 
     * @return iX es la <code>posicion en x</code> del objeto.
     * 
     */
    public int getX() {
        return iX;
    }

    /**
     * setY
     * 
     * Metodo modificador usado para cambiar la posicion en y del objeto 
     * 
     * @param iY es la <code>posicion en y</code> del objeto.
     * 
     */
    public void setY(int iY) {
            this.iY = iY;
    }

    /**
     * getY
     * 
     * Metodo de acceso que regresa la posicion en y del objeto 
     * 
     * @return posY es la <code>posicion en y</code> del objeto.
     * 
     */
    public int getY() {
        return iY;
    }

    /**
     * setImageIcon
     * 
     * Metodo modificador usado para cambiar el icono del objeto
     * 
     * @param imiIcono es el <code>icono</code> del objeto.
     * 
     */
    public void setImageIcon(ImageIcon imiIcono) {
        this.imiIcono = imiIcono;
    }

    /**
     * getImageIcon
     * 
     * Metodo de acceso que regresa el icono del objeto 
     * 
     * @return imiIcono es el <code>icono</code> del objeto.
     * 
     */
    public ImageIcon getImageIcon() {
        return imiIcono;
    }

    /**
     * setImagen
     * 
     * Metodo modificador usado para cambiar el icono de imagen del objeto
     * tomandolo de un objeto imagen
     * 
     * @param imaImagen es la <code>imagen</code> del objeto.
     * 
     */
    public void setImagen(Image imaImagen) {
        this.imiIcono = new ImageIcon(imaImagen);
    }

    /**
     * getImagen
     * 
     * Metodo de acceso que regresa la imagen que representa el icono del objeto
     * 
     * @return la imagen a partide del <code>icono</code> del objeto.
     * 
     */
    public Image getImagen() {
        return imiIcono.getImage();
    }

    /**
     * setVelocidad
     * 
     * Metodo modificador usado para cambiar la velocidad del objeto 
     * 
     * @param iVelocidad es un <code>entero</code> con la velocidad del objeto.
     * 
     */
    public void setVelocidad(int iVelocidad) {
            this.iVelocidad = iVelocidad;
    }

    /**
     * getVelocidad
     * 
     * Metodo de acceso que regresa la velocidad del objeto 
     * 
     * @return iVelocidad un <code>entero</code> con velocidad del objeto.
     * 
     */
    public int getVelocidad() {
        return iVelocidad;
    }

    /**
     * getAncho
     * 
     * Metodo de acceso que regresa el ancho del icono 
     * 
     * @return un <code>entero</code> que es el ancho del icono.
     * 
     */
    public int getAncho() {
        return imiIcono.getIconWidth();
    }

    /**
     * getAlto
     * 
     * Metodo que  da el alto del icono 
     * 
     * @return un <code>entero</code> que es el alto del icono.
     * 
     */
    public int getAlto() {
        return imiIcono.getIconHeight();
    }
    
    /**
     * arriba
     * 
     * Metodo que sube al personaje de acuerdo a la velocidad
     * 
     */
    public void arriba() {
        this.setY(this.getY() - iVelocidad);
    }
    
    /**
     * abajo
     * 
     * Metodo que baja al personaje de acuerdo a la velocidad
     * 
     */
    public void abajo() {
        this.setY(this.getY() + iVelocidad);
    }
    
    /**
     * derecha
     * 
     * Metodo que mueve a la derecha al personaje de acuerdo a la velocidad
     * 
     */
    public void derecha() {
        this.setX(this.getX() + iVelocidad);
    }
    
    /**
     * izquierda
     * 
     * Metodo que mueve a la izquierda al personaje de acuerdo a la velocidad
     * 
     */
    public void izquierda() {
        this.setX(this.getX() - iVelocidad);
    }
    
    /** 
     * colisiona
     * 
     * Metodo para revisar si un objeto <code>Personaje</code> colisiona con otro
     * esto se logra con un objeto temporal de la clase <code>Rectangle</code>
     * 
     * @param aniObjeto es el objeto <code>Personaje</code> con el que se compara
     * @return  un valor true si esta colisionando y false si no
     * 
     */
    public boolean colisiona(Producto aniParametro) {
        // creo un objeto rectangulo a partir de este objeto Personaje
        Rectangle recObjeto = new Rectangle(this.getX(),this.getY(),
                this.getAncho(), this.getAlto());
        
        // creo un objeto rectangulo a partir del objeto Personaje parametro
        Rectangle recParametro = new Rectangle(aniParametro.getX(),
                aniParametro.getY(), aniParametro.getAncho(),
                aniParametro.getAlto());
        
        // si se colisionan regreso verdadero, sino regreso falso
        return recObjeto.intersects(recParametro);
    }
    
    /** 
     * colisiona
     * 
     * Metodo para revisar si un objeto <code>Personaje</code> colisiona con una
     * coordenada que tiene valor de x y valor de y
     * 
     * @param iX es el valor <code>entero</code> de x
     * @param iY es el valor <code>entero</code> de x
     * @return  un valor true si esta colisionando y false si no
     * 
     */
    public boolean colisiona(int iX, int iY) {
        // creo un objeto rectangulo a partir de este objeto Personaje
        Rectangle recObjeto = new Rectangle(this.getX(),this.getY(),
                this.getAncho(), this.getAlto());
               
        // si se colisionan regreso verdadero, sino regreso falso
        return recObjeto.contains(iX, iY);
    }        
    
    public boolean colisionaArriba(Producto aniParametro) {
    // creo un objeto rectangulo a partir de este objeto cosa
        Rectangle recObjeto = new Rectangle(this.getX(),this.getY(),
        this.getAncho(), 1);
        
        // creo un objeto rectangulo a partir del objeto Animal parametro
        Rectangle recParametro = new Rectangle(aniParametro.getX(),
        aniParametro.getY(), aniParametro.getAncho(),
        aniParametro.getAlto());
        
        // si se colisionan regreso verdadero, sino regreso falso
        return recObjeto.intersects(recParametro);
    }
   
    public boolean colisionaAbajo(Producto aniParametro) {
        // creo un objeto rectangulo a partir de este objeto cosa
        Rectangle recObjeto = new Rectangle(this.getX(),this.getY() +
        this.getAlto(), this.getAncho(), 1);
        
        // creo un objeto rectangulo a partir del objeto Animal parametro
        Rectangle recParametro = new Rectangle(aniParametro.getX(),
        aniParametro.getY(), aniParametro.getAncho(),
        aniParametro.getAlto());
        
        // si se colisionan regreso verdadero, sino regreso falso
        return recObjeto.intersects(recParametro);
    }
    
    public boolean colisionaIzquierda(Producto aniParametro) {
        // creo un objeto rectangulo a partir de este objeto cosa
        Rectangle recObjeto = new Rectangle(this.getX(),this.getY(),
        1, this.getAlto());
        
        // creo un objeto rectangulo a partir del objeto Animal parametro
        Rectangle recParametro = new Rectangle(aniParametro.getX(),
        aniParametro.getY(), aniParametro.getAncho(),
        aniParametro.getAlto());
        
        // si se colisionan regreso verdadero, sino regreso falso
        return recObjeto.intersects(recParametro);
    }
    
    public boolean colisionaDerecha(Producto aniParametro) {
        // creo un objeto rectangulo a partir de este objeto cosa
        Rectangle recObjeto = new Rectangle(this.getX() + this.getAncho(),
        this.getY(), 1, this.getAlto());
        
        // creo un objeto rectangulo a partir del objeto Animal parametro
        Rectangle recParametro = new Rectangle(aniParametro.getX(),
        aniParametro.getY(), aniParametro.getAncho(),
        aniParametro.getAlto());
        
        // si se colisionan regreso verdadero, sino regreso falso
        return recObjeto.intersects(recParametro);
        }
}