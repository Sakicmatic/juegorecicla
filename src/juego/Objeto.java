


/**
 * Objeto
 *
* @author THE NIBBLES
 * @author Evert Salinas
 * @author Daniel Mena
 * @author Daniela Valdés
 * @author Martha Valdés
 * @version BETA 2014/20/11
 */

package juego;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Rectangle;


public class Objeto {

    private int iX;     //posicion en x.       
    private int iY;     //posicion en y.
    private int iVelocidad;   // velocidad
    private int iDireccion; 
    private boolean bReturn;
    private boolean bVivo; 
    private ImageIcon imiIcono;	//icono.
    private Animacion aniImagen; 

    /**
     * Objeto
     * 
     * Metodo constructor usado para crear el objeto animal
     * creando el icono a partir de una imagen
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * @param iY es la <code>posicion en y</code> del objeto.
     * @param imaImagen es la <code>imagen</code> del objeto.
     * 
     */
//    public Objeto(int iX, int iY ,Image imaImagen,Animacion aniImagen) {
//        this.iX = iX;
//        this.iY = iY;
//        imiIcono = new ImageIcon(imaImagen);
//        this.iVelocidad = 1;   // default 1 en velocidad
//        this.iDireccion = -1; 
//        this.bReturn = false;
//        this.bVivo = true; 
//        this.aniImagen = aniImagen; 
//
//    }
//    
//    /**
//     * Objeto
//     * 
//     * Metodo constructor usado para crear el objeto animal
//     * creando el icono de imagen de un objeto igual
//     * 
//     * @param iX es la <code>posicion en x</code> del objeto.
//     * @param iY es la <code>posicion en y</code> del objeto.
//     * @param icoImagen es la <code>imagen tipo icono</code> del objeto.
//     * 
//     */
//    public Objeto(int iX, int iY ,ImageIcon icoImagen, Animacion aniImagen) {
//        this.iX = iX;
//        this.iY = iY;
//        imiIcono = icoImagen;
//        this.iVelocidad = 1;    // default 1 en velocidad
//        this.iDireccion = -1; 
//        this.bReturn = false; 
//        this.bVivo = true; 
//        this.aniImagen = aniImagen;
//
//    }

    public Objeto(int iX, int iY, Image imaImagen) {
        this.iX = iX;
        this.iY = iY;
        imiIcono = new ImageIcon(imaImagen);
        this.iVelocidad = 1;   // default 1 en velocidad
        this.iDireccion = -1;
        this.bReturn = false;
        this.bVivo = true;

    }

    public Objeto(int iX, int iY, ImageIcon icoImagen) {
        this.iX = iX;
        this.iY = iY;
        imiIcono = icoImagen;
        this.iVelocidad = 1;    // default 1 en velocidad
        this.iDireccion = -1;
        this.bReturn = false;
        this.bVivo = true;  
    }
 
    
    
     /**
     * setDireccion
     * 
     * Metodo modificador usado para cambiar la direccion del objeto
     * 
     * @param iD es la <code>posicion en x</code> del objeto.
     * 
     */
    public void setDireccion(int iD) {
        this.iDireccion = iD;
    }
    
    
     /**
     * getDireccion
     * 
     * Metodo de acceso que regresa la dirección del objeto
     * 
     * @param iD es la <code>posicion en x</code> del objeto.
     * 
     */
    public int getDireccion() {
        return iDireccion;  
    }
 
    // Metodo que ajusta la imagen del objeto
    public void setAnimacion (Animacion anim) {
        this.aniImagen = anim;
    }

    
    // Metodo que regresa la imagen
    public Animacion getAnimacion () {
        return this.aniImagen;
    }
     /* setVivo
     * 
     * Metodo de acceso que regresa el estado de direccion del objeto
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * 
     */
    public void setVivo(boolean bA) {
        this.bVivo = bA;
    }
    
    /**
     * getVivo
     * 
     * Metodo modificador usado para cambiar el estado de direccion del objeto
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * 
     */
    public boolean getVivo() {
        return bVivo;
    }
     /* setReturn
     * 
     * Metodo de acceso que regresa el estado de direccion del objeto
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * 
     */
    public void setReturn(boolean bA) {
        this.bReturn = bA;
    }
    
    /**
     * getReturn
     * 
     * Metodo modificador usado para cambiar el estado de direccion del objeto
     * 
     * @param iX es la <code>posicion en x</code> del objeto.
     * 
     */
    public boolean getReturn() {
        return bReturn;
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
     * Metodo para revisar si un objeto <code>Objeto</code> colisiona con otro
     * esto se logra con un objeto temporal de la clase <code>Rectangle</code>
     * 
     * @param aniObjeto es el objeto <code>Objeto</code> con el que se compara
     * @return  un valor true si esta colisionando y false si no
     * 
     */
    public boolean colisiona(Objeto aniParametro) {
        // creo un objeto rectangulo a partir de este objeto Objeto
        Rectangle recObjeto = new Rectangle(this.getX(),this.getY(),
                this.getAncho(), this.getAlto());
        
        // creo un objeto rectangulo a partir del objeto Objeto parametro
        Rectangle recParametro = new Rectangle(aniParametro.getX(),
                aniParametro.getY(), aniParametro.getAncho(),
                aniParametro.getAlto());
        
        // si se colisionan regreso verdadero, sino regreso falso
        return recObjeto.intersects(recParametro);
    }
    
    /** 
     * colisiona
     * 
     * Metodo para revisar si un objeto <code>Objeto</code> colisiona con una
     * coordenada que tiene valor de x y valor de y
     * 
     * @param iX es el valor <code>entero</code> de x
     * @param iY es el valor <code>entero</code> de x
     * @return  un valor true si esta colisionando y false si no
     * 
     */
    public boolean colisiona(int iX, int iY) {
        // creo un objeto rectangulo a partir de este objeto Objeto
        Rectangle recObjeto = new Rectangle(this.getX(),this.getY(),
                this.getAncho(), this.getAlto());
               
        // si se colisionan regreso verdadero, sino regreso falso
        return recObjeto.contains(iX, iY);
    }    
}