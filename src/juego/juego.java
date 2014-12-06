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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class juego extends JFrame implements Runnable, MouseListener, MouseMotionListener,
        KeyListener {

    private int iVidas; // Vidas del usuario
    private int iProIdos;
    private int iScore; // Puntuacion
    private int iCategoria;
    private int iProducto;
    private int iIdosTotales;
    private int iConta;
    private int iDir;
    private int iVelocidad;
        private int iX;
    private int iY;
    private boolean bNivel1;  // tiempo actual
    private boolean bNivel2;
    private boolean bNivel3;
    private boolean N1, N2, N3;
    private boolean bCheck;
    private int mPosX;
    private int mPosY;
    private boolean bMute;  // Booleana para mutear sonidos
    private boolean bPausa;  // Booleana de pausa
    private boolean bInstrucM;  // Booleana de instrucciones
    private boolean bInstrucJ;  // Booleana de instruccioness
    private boolean bInstruc2;  // Booleana de instrucciones
    private boolean bInstruc3;  // Booleana de instrucciones
    private boolean bInstruc4;  // Booleana de instrucciones
    private boolean bMenu;  // Booleana de instrucciones
    private boolean bSelecc;  // Booleana de instrucciones
    private boolean bCreditos;  // Booleana de instrucciones 
    private boolean bScore;  // Booleana de instrucciones
    private boolean bFinJuego;  // Booleana de instrucciones
    private boolean bHistoria;
    private boolean bRegresa;
    LinkedList lnkProductos1; // Lista de los productos
    LinkedList lnkProductos2; // Lista de los productos
    LinkedList lnkProductos3; // Lista de los productos
    LinkedList lnkFire;
    private Producto proOrganicos; // OContenedor de organicos
    private Producto proPlasticos; // Contenedor de plasticos
    private Producto proAluminios; // Contenedor de aluminios
    private Producto proElectricos; // Contenedor de electricos
    private Producto proToxicos; // Contenedor de toxicos
    private Producto proPapeles; // Contenedor de papeles
    private Image imaInstruccionesJuego; // Imagen
    private Image imaInstruccionesMenu; // Imagen
    private Image imaInstrucciones2; // Imagen
    private Image imaInstrucciones3; // Imagen
    private Image imaInstrucciones4; // Imagen
    private Image imaMenu; // Imagen del menÃº
    private Image imaNivel1; // Imagen del nivel 1
    private Image imaNivel2; // Imagen del nivel 2
    private Image imaNivel3; // Imagen del nivel 3
    private Image imaBoss; // Imagen del boss
    private Image imaPuntuacion; // Imagen de puntacion
    private Image imaPausa; // Imagen de pausa   
    private Image imaSeleccJuego; // Imagen de la seleccion del juego
    private Image imaFinJuego; // Imagen de cuando termina el juego
    private Image imaCreditos; // Imagen de los creditos
    private Image dbImage; // Imagen de los creditos
    private Image imaWtr1;
    private Image imaWtr2;
    private Image imaBanana;
    private Image imaManzana;
    private Image imaSandwich;
    private Image imaBotella;
    private Image imaBolsa;
    private Image imaChips;
    private Image imaLata;
    private Image imaBotella2;
    private Image imaAlum;
    private Image imaCompu;
    private Image imaRadio;
    private Image imaHoja;
    private Image imaCel;
    private Image imaPeriodico;
    private Image imaOrganicos;
    private Image imaPapeles;
    private Image imaAluminios;
    private Image imaElectronicos;
    private Image imaPlasticos;
    private Image imaToxicos;
    private Image imaHistoria;
    private Image imaSaltar;
    private boolean bMonster;

    private Objeto objOrganico;
    private Objeto objPapel;
    private Objeto objPlastico;
    private Objeto objToxico;
    private Objeto objMetal;
    private Objeto objElectricos;
    private Objeto objBoss;
    private Objeto objFire ;
    private Objeto objFireAux; 


    private int k;
    
    private Image imaFire11;
    private Image imaFire12;
    private Image imaFire13;
    private Image imaFire14;
    private Image imaFire15;
    private Image imaFire16; 
    
    private Image imaFire21;
    private Image imaFire22;
    private Image imaFire23;
    private Image imaFire24;
    private Image imaFire25;
    private Image imaFire26;
    
    private Image imaFire31;
    private Image imaFire32;
    private Image imaFire33;
    private Image imaFire34;
    private Image imaFire35;
    private Image imaFire36;
    
    private Image imaFire41;
    private Image imaFire42;
    private Image imaFire43;
    private Image imaFire44;
    private Image imaFire45;
    private Image imaFire46;
    
    private Image imaFire51;
    private Image imaFire52;
    private Image imaFire53;
    private Image imaFire54;
    private Image imaFire55;
    private Image imaFire56;
    
    private Image imaFireR11;
    private Image imaFireR12;
    private Image imaFireR13;
    private Image imaFireR14;
    private Image imaFireR15;
    private Image imaFireR16; 
    
    private Image imaFireR21;
    private Image imaFireR22;
    private Image imaFireR23;
    private Image imaFireR24;
    private Image imaFireR25;
    private Image imaFireR26;
    
    private Image imaFireR31;
    private Image imaFireR32;
    private Image imaFireR33;
    private Image imaFireR34;
    private Image imaFireR35;
    private Image imaFireR36;
    
    private Image imaFireR41;
    private Image imaFireR42;
    private Image imaFireR43;
    private Image imaFireR44;
    private Image imaFireR45;
    private Image imaFireR46;
    
    private Image imaFireR51;
    private Image imaFireR52;
    private Image imaFireR53;
    private Image imaFireR54;
    private Image imaFireR55;
    private Image imaFireR56;

    private Animacion animFire1;
    
    private long lTiempoActual; 
    private long lTiempoInicial;
    private long lTiempoInic; 
    private long lTiempoTrans;
    
    private Graphics dbg; // Objeto Grafico

    public juego() {
        init();
        start();
        setSize(1200, 800);
        setTitle("Recicla!");        
    }

    /**
     * Constructor Se inicializan las variables
     */
    public void init() {
        setSize(1200, 800);
        setTitle("Recicla!");
        // Inicializacion de variables
        iVidas = 3;
        iScore = 0;
        iProIdos = 0;
        bNivel1 = false;
        bNivel2 = false;
        bNivel3 = false;
        bMute = false;
        bPausa = false;
        bInstrucM = false;
        bInstrucJ = false;
        bInstruc2 = false;
        bInstruc3 = false;
        bInstruc4 = false;
        bMenu = true;
        bSelecc = false;
        bCreditos = false;
        bScore = false;
        bMonster = false;
        bFinJuego = false;
        bHistoria = false;
        iIdosTotales = 0;
        bCheck = false;
        N1 = false;
        N2 = false;
        N3 = false;
        
        bMonster = false;
        bRegresa = false;
        iConta = 1;
        iVelocidad=1;
        k=1; 

        lnkProductos1 = new LinkedList();
        lnkProductos2 = new LinkedList();
        lnkProductos3 = new LinkedList();
        lnkFire = new LinkedList();

        // Se cargan las imagenes
        //Menus
        imaFinJuego = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/finJuego.jpg"));
        imaMenu = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/menu.jpg"));
        imaCreditos = Toolkit.getDefaultToolkit().getImage(this.getClass()
              .getResource("Imagenes/creditos.png"));
        imaSeleccJuego = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/menuJugar.png"));
        imaPausa = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/menuPausa.png"));
        imaPuntuacion = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/puntaje.jpg"));
        //Historia
        imaHistoria = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/HistoriaAnimada.gif"));
        imaSaltar = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/botonsaltar.png"));
        //Instrucciones
        imaInstruccionesJuego = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/instruccionesJuego.png"));
        imaInstruccionesMenu = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/instruccionesMenu.png"));
        imaInstrucciones2 = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/instruccionesPag2.png"));
        imaInstrucciones3 = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/instruccionesPag3.png"));
        imaInstrucciones4 = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/instruccionesPag4.png"));
        //Niveles
        imaNivel1 = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Niveles/fondoNivel1.png"));
        imaNivel2 = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Niveles/fondoNivel2.png"));
        imaNivel3 = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Niveles/fondoNivel3.png"));


        //Imagenes de productos
        //Organicos
        imaBanana = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/banana.png"));
        imaManzana = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/appleclick.png"));
        imaSandwich = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/sandwish.png"));
        //Papeles
        imaHoja = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/hoja1.png"));
        imaPeriodico = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/periodico1.png"));
        //Aluminios
        imaLata = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/lata.png"));
        imaAlum = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/aluminio1.png"));
        imaChips = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/chips.png"));
        //Electronicos
        imaCompu = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/compu.png"));
        imaRadio = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/radio.png"));
        imaCel = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/cel.png"));    
        //Plasticos
        imaBotella = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/botella.png"));
        imaBotella2 = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/detergente.png"));
        imaBolsa = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/Objetos/bolsa.png"));

        //Botes de basura
        imaOrganicos = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/basureros/basureroOrganico.png"));
        imaPapeles = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/basureros/basureroPapel.png"));
        imaAluminios = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/basureros/basureroAluminio.png"));
        imaElectronicos = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/basureros/basureroElectrico.png"));
        imaPlasticos = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/basureros/basureroPlastico.png"));
        imaToxicos = Toolkit.getDefaultToolkit().getImage(this.getClass()
                .getResource("Imagenes/basureros/basureroToxico.png"));
        
        Image imaPulp1 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Boss/1.png"));

        //Misiles de ida
        imaFire11 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Fire/Adelante/1 (1).png"));
        
        imaFire21 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Fire/Adelante/2 (1).png"));
        
        imaFire31 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Fire/Adelante/3 (1).png"));
        
        imaFire41 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Fire/Adelante/4 (1).png"));
        
        imaFire51 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Fire/Adelante/5 (1).png"));

        //Misiles de regreso
        imaFireR11 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Fire/Regreso/r5 (1).png"));
        
        imaFireR21 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Fire/Regreso/r4 (1).png"));
        
        imaFireR31 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Fire/Regreso/r3 (1).png"));
        
        imaFireR41 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Fire/Regreso/r2 (1).png"));
        
        imaFireR51 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Imagenes/Fire/Regreso/r1 (1).png"));
        
//        0 = Organico
        proOrganicos = new Producto(0, 200, imaOrganicos);
//        1 = Papel
        proPapeles = new Producto(0, 200, imaPapeles);
//        2 = Aluminio
        proAluminios = new Producto(0, 200, imaAluminios);
//        3 = Electrico
        proElectricos = new Producto(0, 200, imaElectronicos);
//        4 = Plastico
        proPlasticos = new Producto(0, 200, imaPlasticos);
        
//      Organico
        objOrganico = new Objeto(150, 200, imaOrganicos);
//         Aluminio
        objMetal = new Objeto(550, 200, imaAluminios);
//        Electrico
        objElectricos = new Objeto(750, 200, imaElectronicos);
//        Plastico
        objPlastico = new Objeto(350, 200, imaPlasticos);
//        Toxicos
        objToxico = new Objeto(950, 200, imaToxicos);
        
        //Creo Boss
        objBoss= new Objeto(300,450,imaPulp1);

        
        //Lista para nivel 1
        for (int iI = 1; iI <= 20; iI++) {
            iCategoria = ((int) (Math.random() * 3));
            iProducto = ((int) (Math.random() * 3));
            Producto proObjeto = new Producto(0, 0, imaBanana);
            switch (iCategoria) {
                case 0: //Organico
                    switch (iProducto) {
                        case 0: // Banana
                            proObjeto.setImagen(imaBanana);
                            break;
                        case 1: // Manzana
                            proObjeto.setImagen(imaManzana);
                            break;
                        case 2: // Sandwich
                            proObjeto.setImagen(imaSandwich);
                            break;
                    }
                    proObjeto.setCategoria(0);
                    break;
                case 1: //Papel
                    switch (iProducto) {
                        case 0: // Hoja
                            proObjeto.setImagen(imaHoja);
                            break;
                        case 1: // Periodico
                            proObjeto.setImagen(imaPeriodico);
                            break;
                        case 2: // Hoja
                            proObjeto.setImagen(imaHoja);
                            break;
                    }
                    proObjeto.setCategoria(1);
                    break;
                case 2: //Aluminio
                    switch (iProducto) {
                        case 0: // Lata
                            proObjeto.setImagen(imaLata);
                            break;
                        case 1: // Papel Aluminio
                            proObjeto.setImagen(imaAlum);
                            break;
                        case 2: // Chips
                            proObjeto.setImagen(imaChips);
                            break;
                    }
                    proObjeto.setCategoria(2);
                    break;
                }
                proObjeto.setX((int) (Math.random() * 3000) - 3400);
                //proObjeto.setX(10);
                proObjeto.setY((400 + proObjeto.getAlto()) + (int) (Math.random() * 250) - proObjeto.getAlto());
                proObjeto.setVelocidad(2);
                lnkProductos1.add(proObjeto);    
        }
        
        //Lista para nivel 2
        for (int iI = 1; iI <= 25; iI++) {
            iCategoria = ((int) (Math.random() * 4));
            iProducto = ((int) (Math.random() * 3));
            Producto proObjeto = new Producto(0, 0, imaBanana);
            switch (iCategoria) {
                case 0: //Organico
                    switch (iProducto) {
                        case 0: // Banana
                            proObjeto.setImagen(imaBanana);
                            break;
                        case 1: // Manzana
                            proObjeto.setImagen(imaManzana);
                            break;
                        case 2: // Sandwich
                            proObjeto.setImagen(imaSandwich);
                            break;
                    }
                    proObjeto.setCategoria(0);
                    break;
                case 1: //Papel
                    switch (iProducto) {
                        case 0: // Hoja
                            proObjeto.setImagen(imaHoja);
                            break;
                        case 1: // Periodico
                            proObjeto.setImagen(imaPeriodico);
                            break;
                        case 2: // Hoja
                            proObjeto.setImagen(imaHoja);
                            break;
                    }
                    proObjeto.setCategoria(1);
                    break;
                case 2: //Aluminio
                    switch (iProducto) {
                        case 0: // Lata
                            proObjeto.setImagen(imaLata);
                            break;
                        case 1: // Papel Aluminio
                            proObjeto.setImagen(imaAlum);
                            break;
                        case 2: // Chips
                            proObjeto.setImagen(imaChips);
                            break;
                    }
                    proObjeto.setCategoria(2);
                    break;
                case 3: //Electrico
                    switch (iProducto) {
                        case 0: // Cel
                            proObjeto.setImagen(imaCel);
                            break;
                        case 1: // Compu
                            proObjeto.setImagen(imaCompu);
                            break;
                        case 2: // Radio
                            proObjeto.setImagen(imaRadio);
                            break;
                    }
                    proObjeto.setCategoria(3);
                    break;
                }
                proObjeto.setX((int) (Math.random() * 3000) - 3500);
                //proObjeto.setX(10);
                proObjeto.setY((400 + proObjeto.getAlto()) + (int) (Math.random() * 250) - proObjeto.getAlto());
                proObjeto.setVelocidad(2);
                lnkProductos2.add(proObjeto);    
        }
        
        //Lista para nivel 3
        for (int iI = 1; iI <= 30; iI++) {
            iCategoria = ((int) (Math.random() * 5));
            iProducto = ((int) (Math.random() * 3));
            Producto proObjeto = new Producto(0, 0, imaBanana);
            switch (iCategoria) {
                case 0: //Organico
                    switch (iProducto) {
                        case 0: // Banana
                            proObjeto.setImagen(imaBanana);
                            break;
                        case 1: // Manzana
                            proObjeto.setImagen(imaManzana);
                            break;
                        case 2: // Sandwich
                            proObjeto.setImagen(imaSandwich);
                            break;
                    }
                    proObjeto.setCategoria(0);
                    break;
                case 1: //Papel
                    switch (iProducto) {
                        case 0: // Hoja
                            proObjeto.setImagen(imaHoja);
                            break;
                        case 1: // Periodico
                            proObjeto.setImagen(imaPeriodico);
                            break;
                        case 2: // Hoja
                            proObjeto.setImagen(imaHoja);
                            break;
                    }
                    proObjeto.setCategoria(1);
                    break;
                case 2: //Aluminio
                    switch (iProducto) {
                        case 0: // Lata
                            proObjeto.setImagen(imaLata);
                            break;
                        case 1: // Papel Aluminio
                            proObjeto.setImagen(imaAlum);
                            break;
                        case 2: // Chips
                            proObjeto.setImagen(imaChips);
                            break;
                    }
                    proObjeto.setCategoria(2);
                    break;
                case 3: //Electrico
                    switch (iProducto) {
                        case 0: // Cel
                            proObjeto.setImagen(imaCel);
                            break;
                        case 1: // Compu
                            proObjeto.setImagen(imaCompu);
                            break;
                        case 2: // Radio
                            proObjeto.setImagen(imaRadio);
                            break;
                    }
                    proObjeto.setCategoria(3);
                    break;
                case 4: //Plastico
                    switch (iProducto) {
                        case 0: // Botella
                            proObjeto.setImagen(imaBotella);
                            break;
                        case 1: // Detergente
                            proObjeto.setImagen(imaBotella2);
                            break;
                        case 2: // Bolsa
                            proObjeto.setImagen(imaBolsa);
                            break;
                    }
                    proObjeto.setCategoria(4);
                    break;
                }
                proObjeto.setX((int) (Math.random() * 3000) - 3600);
                //proObjeto.setX(10);
                proObjeto.setY((400 + proObjeto.getAlto()) + (int) (Math.random() * 250) - proObjeto.getAlto());
                proObjeto.setVelocidad(2);
                lnkProductos3.add(proObjeto);    
        }
        
        //Anadir listeners
        addMouseListener(this);
        addKeyListener(this);
        addMouseMotionListener(this);
    }

    public void start () {
        // Declaras un hilo
        Thread th = new Thread (this);
        // Empieza el hilo
        th.start ();
    }
    
    
    /**
     * Se ejecuta el Thread, el juego no continua si la pausa esta activada. El
     * juego finaliza si el numero de vidas en menor o igual que 0. El juego
     * tambien se pausa si el usuario desea ver las instrucciones.
     */
    public void run() {
        lTiempoActual = System.currentTimeMillis();
        lTiempoInic = System.currentTimeMillis();
        while (iVidas > 0) {
            if(!bInstrucJ && !bPausa) { // el juego se para si se pausa o se 
                                    // muestran las onstrucciones
                checaColision();
                actualiza();
            }
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                System.out.println("Error en " + ex.toString());
            }
        }
        if (iVidas == 0) {
            bFinJuego = true;
            repaint();
        }
    }

    /**
     * En este metodo se actualiza 
     */
    public void actualiza() {
        //NIVEL 1....................................................
        if (bNivel1) {
            proOrganicos.setX(200);
            proPapeles.setX(400);
            proAluminios.setX(600);

            for (Object lnkProducto : lnkProductos1) {
                Producto proObjeto = (Producto) lnkProducto;
                if (proObjeto.getAgarrado()) {
                    proObjeto.setX(mPosX - proObjeto.getAncho() / 2);
                    proObjeto.setY(mPosY - proObjeto.getAncho() / 2);
                } else if (proObjeto.getAgarrado() == false) {
                    if (proObjeto.getY() <= 450) {
                        proObjeto.setVelocidad(5);
                        proObjeto.abajo();
                    } else if (proObjeto.getY() > 700) {
                        proObjeto.abajo();
                    } else {
                        proObjeto.derecha();
                    }
                }
                if(proObjeto.getX() + proObjeto.getAncho() == 0) {
                    proObjeto.setVelocidad((int)(Math.random() * 4) + 2);
                }
            }
            if(iIdosTotales == 20){
                bNivel1 = false;
                bNivel2 = true;
                iIdosTotales = 0;
                iProIdos = 0;
            }
            else if(iVidas == 0)
            {
                bNivel1 = false;
                bFinJuego = true;
            }

        }
        
        //NIVEL 2....................................................
        if (bNivel2) {
            proOrganicos.setX(200);
            proPapeles.setX(400);
            proAluminios.setX(600);
            proElectricos.setX(800);

            for (Object lnkProducto : lnkProductos2) {
                Producto proObjeto = (Producto) lnkProducto;
                if (proObjeto.getAgarrado()) {
                    proObjeto.setX(mPosX - proObjeto.getAncho() / 2);
                    proObjeto.setY(mPosY - proObjeto.getAncho() / 2);
                } else if (proObjeto.getAgarrado() == false) {
                    if (proObjeto.getY() <= 450) {
                        proObjeto.setVelocidad(5);
                        proObjeto.abajo();
                    } else if (proObjeto.getY() > 700) {
                        proObjeto.abajo();
                    } else {
                        proObjeto.derecha();
                    }
                }
                if(proObjeto.getX() + proObjeto.getAncho() == 0) {
                    proObjeto.setVelocidad((int)(Math.random() * 3) + 2);
                }
            }
            if(iIdosTotales == 25){
                bNivel2 = false;
                bNivel3 = true;
                iIdosTotales = 0;
                iProIdos = 0;
            }
            if(iVidas == 0){
                bNivel2 = false;
                bFinJuego = true;
            }
        }
        
        //NIVEL 3....................................................
        if (bNivel3) {
            proOrganicos.setX(200);
            proPapeles.setX(400);
            proAluminios.setX(600);
            proElectricos.setX(800);
            proPlasticos.setX(1000);

            for (Object lnkProducto : lnkProductos3) {
                Producto proObjeto = (Producto) lnkProducto;
                if (proObjeto.getAgarrado()) {
                    proObjeto.setX(mPosX - proObjeto.getAncho() / 2);
                    proObjeto.setY(mPosY - proObjeto.getAncho() / 2);
                } else if (proObjeto.getAgarrado() == false) {
                    if (proObjeto.getY() <= 450) {
                        proObjeto.setVelocidad(5);
                        proObjeto.abajo();
                    } else if (proObjeto.getY() > 700) {
                        proObjeto.abajo();
                    } else {
                        proObjeto.derecha();
                    }
                }
                if(proObjeto.getX() + proObjeto.getAncho() == 0) {
                    proObjeto.setVelocidad((int)(Math.random() * 4) + 1);
                }
            }
            if(iIdosTotales == 30){
                bNivel3 = false;
                bFinJuego = true;
                iIdosTotales = 0;
                iProIdos = 0;
            }
            if(iVidas == 0){
                bNivel3 = false;
                bFinJuego = true;
            }
        }
        //NIVEL 4 (MONSTRO).....................................
        if (bMonster) {

            lTiempoTrans = System.currentTimeMillis() - lTiempoInic;
            if (lTiempoTrans > 1000) {
                genera();
                lTiempoInic = System.currentTimeMillis();
            }

            for (Object lnkFires : lnkFire) {
                objFire = (Objeto) lnkFires;
                if (objFire.getVivo()) {
                    switch (objFire.getDireccion()) {
                        case 1: {//Fire1
                            //Posicion del bote organico 
                            iX = objOrganico.getX() + ((objOrganico.getAncho() / 3) * 2);
                            iY = objOrganico.getY() + ((objOrganico.getAlto() / 3) * 2);

                            if (!objFire.getReturn()) { //Verifica el sentido de la bola

                                //Direccion X
                                if (objFire.getX() < iX) {
                                    objFire.setX(objFire.getX() + iVelocidad + 1);
                                } else {
                                    objFire.setX(objFire.getX() - iVelocidad - 1);
                                }

                                //Direccion Y
                                if (objFire.getY() < iY) {
                                    objFire.setY(objFire.getY() + iVelocidad + 2);
                                } else {
                                    objFire.setY(objFire.getY() - iVelocidad - 2);
                                }

                                //Cuando la bola choca con el bote 
                                if (objFire.colisiona(iX, iY)) {
                                    objFire.setVivo(false);
                                    reposiciona(iX, iY, objFire);
                                }
                            } else { //Si le picas a la bola (regreso)

                                objFire.setImagen(imaFireR11);

                                //Direccion X
                                if (objFire.getX() < 400) {
                                    objFire.setX(objFire.getX() + iVelocidad + 1);
                                } else {
                                    objFire.setX(objFire.getX() - iVelocidad - 1);
                                }

                                //Direccion Y
                                if (objFire.getY() < 550) {
                                    objFire.setY(objFire.getY() + iVelocidad + 2);
                                } else {
                                    objFire.setY(objFire.getY() - iVelocidad - 2);
                                }

                                //Si choca con otra bola
                                for (Object lnkFireA : lnkFire) {
                                    Objeto objAux = (Objeto) lnkFireA;
                                    // si la otra bola esta viva y colisiona con ella y no soy yo mismo
                                    if (!objFire.equals(objAux) && objAux.getVivo() && objFire.colisiona(objAux.getX(), objAux.getY())) {
                                        // se matan ambos objetos
                                        objFire.setVivo(false);
                                        objAux.setVivo(false);

                                    }
                                }
                                //Si choca con el Boss
                                if (objFire.colisiona(400, 550)) {
                                    objFire.setVivo(false);
                                    reposiciona(iX, iY, objFire);
                                }
                            }
                            break;

                        }

                        case 2: {//Fire2
                            //Posicion del bote plastico
                            iX = objPlastico.getX() + ((objPlastico.getAncho() / 3) * 2);
                            iY = objPlastico.getY() + ((objPlastico.getAlto() / 3) * 2);

                            if (!objFire.getReturn()) {

                                //Direccion X
                                if (objFire.getX() < iX) {
                                    objFire.setX(objFire.getX() + iVelocidad);
                                } else {
                                    objFire.setX(objFire.getX() - iVelocidad);
                                }

                                //Direccion Y
                                if (objFire.getY() < iY) {
                                    objFire.setY(objFire.getY() + iVelocidad + 4);
                                } else {
                                    objFire.setY(objFire.getY() - iVelocidad - 4);
                                }

                                //Cuando la bola choca con el bote 
                                if (objFire.colisiona(iX, iY)) {
                                    objFire.setVivo(false);
                                    reposiciona(iX, iY, objFire);
                                }

                            } else { //Si le picas a la bola (regreso)
                                
                                objFire.setImagen(imaFireR21);

                                //Direccion X
                                if (objFire.getX() < 500) {
                                    objFire.setX(objFire.getX() + iVelocidad);
                                } else {
                                    objFire.setX(objFire.getX() - iVelocidad);
                                }

                                //Direccion Y
                                if (objFire.getY() < 550) {
                                    objFire.setY(objFire.getY() + iVelocidad + 4);
                                } else {
                                    objFire.setY(objFire.getY() - iVelocidad - 4);
                                }

                                //Si choca con otra bola
                                for (Object lnkFireA : lnkFire) {
                                    Objeto objAux = (Objeto) lnkFireA;
                                    // si la otra bola esta viva y colisiona con ella y no soy yo mismo
                                    if (!objFire.equals(objAux) && objAux.getVivo() && objFire.colisiona(objAux.getX(), objAux.getY())) {
                                        // se matan ambos objetos
                                        objFire.setVivo(false);
                                        objAux.setVivo(false);
                                    }
                                }
                                //Si choca con el Boss
                                if (objFire.colisiona(500, 550)) {
                                    objFire.setVivo(false);
                                    reposiciona(iX, iY, objFire);
                                }
                            }

                            break;
                        }
                        case 3: {//Fire3
                            //Posicion del bote Metal 
                            iX = objMetal.getX() + (objMetal.getAncho() / 3);
                            iY = objMetal.getY() + ((objMetal.getAlto() / 3) * 2);

                            if (!objFire.getReturn()) {

                                //Direccion X
                                if (objFire.getX() < iX) {
                                    objFire.setX(objFire.getX() + iVelocidad);
                                } else {
                                    objFire.setX(objFire.getX() - iVelocidad);
                                }

                                //Direccion Y
                                if (objFire.getY() < iY) {
                                    objFire.setY(objFire.getY() + iVelocidad + 2);
                                } else {
                                    objFire.setY(objFire.getY() - iVelocidad - 2);
                                }

                                //Cuando la bola choca con el bote 
                                if (objFire.colisiona(iX, iY)) {
                                    objFire.setVivo(false);
                                    reposiciona(iX, iY, objFire);
                                }

                            } else { //Si le picas a la bola 
                                
                                objFire.setImagen(imaFireR31);

                                //Direccion X
                                if (objFire.getX() < 600) {
                                    objFire.setX(objFire.getX() + iVelocidad);
                                } else {
                                    objFire.setX(objFire.getX() - iVelocidad);
                                }

                                //Direccion Y
                                if (objFire.getY() < 550) {
                                    objFire.setY(objFire.getY() + iVelocidad + 2);
                                } else {
                                    objFire.setY(objFire.getY() - iVelocidad - 2);
                                }

                                //Si choca con otra bola
                                for (Object lnkFireA : lnkFire) {
                                    Objeto objAux = (Objeto) lnkFireA;
                                    // si la otra bola esta viva y colisiona con ella y no soy yo mismo
                                    if (!objFire.equals(objAux) && objAux.getVivo() && objFire.colisiona(objAux.getX() + objAux.getAncho(), objAux.getY())) {
                                        // se matan ambos objetos
                                        objFire.setVivo(false);
                                        objAux.setVivo(false);
                                    }
                                }
                                //Si choca con el Boss
                                if (objFire.colisiona(600, 550)) {
                                    objFire.setVivo(false);
                                    reposiciona(iX, iY, objFire);
                                }

                            }

                            break;
                        }
                        case 4: {//Fire4
                            //Posicion del bote Electrico
                            iX = objElectricos.getX() + (objElectricos.getAncho() / 2);
                            iY = objElectricos.getY() + ((objElectricos.getAlto() / 3) * 2);

                            if (!objFire.getReturn()) {

                                //Direccion X
                                if (objFire.getX() < iX) {
                                    objFire.setX(objFire.getX() + iVelocidad);
                                } else {
                                    objFire.setX(objFire.getX() - iVelocidad);
                                }

                                //Direccion Y
                                if (objFire.getY() < iY) {
                                    objFire.setY(objFire.getY() + iVelocidad + 4);
                                } else {
                                    objFire.setY(objFire.getY() - iVelocidad - 4);
                                }

                                //Cuando la bola choca con el bote 
                                if (objFire.colisiona(iX, iY)) {
                                    objFire.setVivo(false);
                                    reposiciona(iX, iY, objFire);
                                }

                            } else { //Si le picas a la bola
                                
                                objFire.setImagen(imaFireR41);

                                //Direccion X
                                if (objFire.getX() < 700) {
                                    objFire.setX(objFire.getX() + iVelocidad);
                                } else {
                                    objFire.setX(objFire.getX() - iVelocidad);
                                }
                                //Direccion Y
                                if (objFire.getY() < 550) {
                                    objFire.setY(objFire.getY() + iVelocidad + 4);
                                } else {
                                    objFire.setY(objFire.getY() - iVelocidad - 4);
                                }

                                //Si choca con otra bola
                                for (Object lnkFireA : lnkFire) {
                                    Objeto objAux = (Objeto) lnkFireA;
                                    // si la otra bola esta viva y colisiona con ella y no soy yo mismo
                                    if (!objFire.equals(objAux) && objAux.getVivo() && objFire.colisiona(objAux.getX(), objAux.getY())) {
                                        // se matan ambos objetos
                                        objFire.setVivo(false);
                                        objAux.setVivo(false);
                                    }
                                }
                                //Si choca con el Boss
                                if (objFire.colisiona(700, 550)) {
                                    objFire.setVivo(false);
                                    reposiciona(iX, iY, objFire);
                                }

                            }

                            break;
                        }
                        case 5: { //Fire5
                            //Posicion del bote Toxico 
                            iX = objToxico.getX() + (objToxico.getAncho() / 3);
                            iY = objToxico.getY() + ((objToxico.getAlto() / 3) * 2);

                            if (!objFire.getReturn()) {

                                //Direccion X
                                if (objFire.getX() < iX) {
                                    objFire.setX(objFire.getX() + iVelocidad);
                                } else {
                                    objFire.setX(objFire.getX() - iVelocidad);
                                }

                                //Direccion Y
                                if (objFire.getY() < iY) {
                                    objFire.setY(objFire.getY() + iVelocidad + 1);
                                } else {
                                    objFire.setY(objFire.getY() - iVelocidad - 1);
                                }

                                //Cuando la bola choca con el bote 
                                if (objFire.colisiona(iX, iY)) {
                                    objFire.setVivo(false);
                                    reposiciona(iX, iY, objFire);
                                }

                            } else { //Si le picas a la bola 
                                
                                objFire.setImagen(imaFireR51);

                                //Direccion X
                                if (objFire.getX() < 800) {
                                    objFire.setX(objFire.getX() + iVelocidad);
                                } else {
                                    objFire.setX(objFire.getX() - iVelocidad);
                                }

                                //Direccion Y
                                if (objFire.getY() < 550) {
                                    objFire.setY(objFire.getY() + iVelocidad);
                                } else {
                                    objFire.setY(objFire.getY() - iVelocidad);
                                }

                                //Si choca con otra bola
                                for (Object lnkFireA : lnkFire) {
                                    Objeto objAux = (Objeto) lnkFireA;
                                    // si la otra bola esta viva y colisiona con ella y no soy yo mismo
                                    if (!objFire.equals(objAux) && objAux.getVivo() && objFire.colisiona(objAux.getX(), objAux.getY())) {
                                        // se matan ambos objetos
                                        objFire.setVivo(false);
                                        objAux.setVivo(false);
                                    }
                                }
                                //Si choca con el Boss
                                if (objFire.colisiona(800, 550)) {
                                    objFire.setVivo(false);
                                    reposiciona(iX, iY, objFire);
                                }

                            }

                            break;
                        }
                    }
                }

            }

        }
    }
    
    public void genera() {
        iDir = ((int) (Math.random() * 5 + 1));            
        Objeto objFire = new Objeto(0,0,imaFire11);
        switch (iDir) {
            case 1: //Fire1
                objFire.setX(400);
                objFire.setY(550);
                objFire.setImagen(imaFire11);
                break;
            case 2: //Fire2
                objFire.setX(480);
                objFire.setY(550);
                objFire.setImagen(imaFire21);
                break;

            case 3: //Fire3
                objFire.setX(600);
                objFire.setY(550);
                objFire.setImagen(imaFire31);
                break;
            case 4: //Fire4
                objFire.setX(700);
                objFire.setY(550);
                objFire.setImagen(imaFire41);
                break;
            case 5: //Fire5
               objFire.setX(820);
                objFire.setY(550);
                objFire.setImagen(imaFire51);
                break;

        }
        objFire.setDireccion(iDir);
        lnkFire.add(objFire);
    }
    
    public void reposiciona(int iX, int iY, Objeto objF){
        objF.setX(-100);
        objF.setY(-100); 
        
    }

    /**
     * Este metodo se encarga de cambiar las posiciones de lso objetos balon y
     * canasta cuando colisionan entre si.
     */
    public void checaColision() {
        //NIVEL 1..............................................
        if (bNivel1) {
            for (Object lnkProducto : lnkProductos1) {
                Producto proObjeto = (Producto) lnkProducto;
                // Si el producto pasa el lado derecho del frame
                if (proObjeto.getX() > getWidth() 
                        || proObjeto.getY() > getHeight()) {
                    if(iScore > 0){
                        iScore -= 10;
                    }
                    iIdosTotales++;
                    iProIdos++;
                    lnkProductos1.remove(proObjeto);
                    break;
                }
                
                if(proObjeto.getCategoria() == 0) {
                    if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        iScore += 50;
                        lnkProductos1.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos1.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos1.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                } 
                if(proObjeto.getCategoria() == 1) {
                    if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        iScore += 50;
                        lnkProductos1.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {     
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos1.remove(proObjeto);
                        break;
                    }
                    else if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos1.remove(proObjeto);
                        break;
                    }
                } 
                if(proObjeto.getCategoria() == 2) {
                    if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {   
                        iScore += 50;
                        lnkProductos1.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos1.remove(proObjeto);
                        break;
                    }
                    else if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos1.remove(proObjeto);
                        break;
                    }
                }
         
                if (iProIdos == 6) {
                    iVidas--;
                    iProIdos = 0;
                }
            }
        }
        
        //NIVEL2....................................................
        if (bNivel2) {
            for (Object lnkProducto : lnkProductos2) {
                Producto proObjeto = (Producto) lnkProducto;
                // Si el producto pasa el lado derecho del frame
                if (proObjeto.getX() > getWidth() 
                        || proObjeto.getY() > getHeight()) {
                    if(iScore > 0) {
                        iScore -= 10;
                    }
                    iIdosTotales++;
                    iProIdos++;
                    lnkProductos2.remove(proObjeto);
                    break;
                }
                
                if(proObjeto.getCategoria() == 0) {
                    if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        iScore += 50;
                        lnkProductos2.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos2.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos2.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proElectricos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos2.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                } 
                if(proObjeto.getCategoria() == 1) {
                    if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        iScore += 50;
                        lnkProductos2.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {     
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos2.remove(proObjeto);
                        break;
                    }
                    else if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos2.remove(proObjeto);
                        break;
                    }
                    else if (proElectricos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos2.remove(proObjeto);
                        break;
                    }
                } 
                if(proObjeto.getCategoria() == 2) {
                    if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {   
                        iScore += 50;
                        lnkProductos2.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos2.remove(proObjeto);
                        break;
                    }
                    else if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos2.remove(proObjeto);
                        break;
                    }
                    else if (proElectricos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos2.remove(proObjeto);
                        break;
                    }
                }
                if(proObjeto.getCategoria() == 3) {
                    if (proElectricos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {   
                        iScore += 50;
                        lnkProductos2.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos2.remove(proObjeto);
                        break;
                    }
                    else if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos2.remove(proObjeto);
                        break;
                    }
                    else if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos2.remove(proObjeto);
                        break;
                    }
                }
         
                if (iProIdos == 6) {
                    iVidas--;
                    iProIdos = 0;
                }
            }
        }
        
        //NIVEL 3....................................................
        if (bNivel3) {
            for (Object lnkProducto : lnkProductos3) {
                Producto proObjeto = (Producto) lnkProducto;
                // Si el producto pasa el lado derecho del frame
                if (proObjeto.getX() > getWidth() 
                        || proObjeto.getY() > getHeight()) {
                    if(iScore > 0) {
                        iScore -= 10;
                    }
                    iIdosTotales++;
                    iProIdos++;
                    lnkProductos3.remove(proObjeto);
                    break;
                }
                
                if(proObjeto.getCategoria() == 0) {
                    if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        iScore += 50;
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proElectricos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proPlasticos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                } 
                if(proObjeto.getCategoria() == 1) {
                    if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        iScore += 50;
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {     
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proElectricos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proPlasticos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                } 
                if(proObjeto.getCategoria() == 2) {
                    if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {   
                        iScore += 50;
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proElectricos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proPlasticos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                }
                if(proObjeto.getCategoria() == 3) {
                    if (proElectricos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {   
                        iScore += 50;
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proPlasticos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                }
                if(proObjeto.getCategoria() == 4) {
                    if (proPlasticos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {   
                        iScore += 50;
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                    else if (proOrganicos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proPapeles.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proAluminios.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) { 
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        iIdosTotales++;
                        lnkProductos3.remove(proObjeto);
                        break;
                    }
                    else if (proElectricos.colisionaArriba(proObjeto) 
                            && proObjeto.getAgarrado() == false) {  
                        if(iScore > 0) {      
                            iScore -= 20;
                            if(iScore < 0){
                                iScore = 0;
                            }
                        }
                        lnkProductos3.remove(proObjeto);
                        iIdosTotales++;
                        break;
                    }
                }
         
                if (iProIdos == 6) {
                    iVidas--;
                    iProIdos = 0;
                }
            }
        }
    }


   public void mouseClicked(MouseEvent e) {
       
   }
   
   
   /**
     * mouseEntered
     * 
     * Metodo sobrescrito de la interface <code>MouseListener</code>.<P>
     * En este metodo maneja el evento que se genera introducir el cursor
     * dentro del applet.
     * 
     */
   public void mouseEntered(MouseEvent e) {
       
   }
   
   /**
     * mouseExited
     * 
     * Metodo sobrescrito de la interface <code>MouseListener</code>.<P>
     * En este metodo maneja el evento que se genera sacar el cursor
     * del applet.
     * 
     */
   public void mouseExited(MouseEvent e) {
       
   }
   
   /**
     * mousePressed 
     * 
     * Metodo sobrescrito de la interface <code>MouseListener</code>.<P>
     * En este metodo maneja el evento que se genera al mantener presionado
     * el click del mouse.
     * 
     */
   public void mousePressed(MouseEvent e) {
       //NIVEL 1 ............................................
       if(bNivel1){
            for(Object lnkProducto : lnkProductos1) {
                     Producto proObjeto = (Producto) lnkProducto;
                     // Si se selecciona un objeto
                     if(proObjeto.colisiona(e.getX(), e.getY())) {
                         proObjeto.setAgarrado(true);
                         mPosX = e.getX();
                         mPosY= e.getY();
                         break;
                     }
            }
       }
       //NIVEL 2..................................................
       if(bNivel2){
            for(Object lnkProducto : lnkProductos2) {
                     Producto proObjeto = (Producto) lnkProducto;
                     // Si se selecciona un objeto
                     if(proObjeto.colisiona(e.getX(), e.getY())) {
                         proObjeto.setAgarrado(true);
                         mPosX = e.getX();
                         mPosY= e.getY();
                         break;
                     }
            }
       }
       //NIVEL 3..................................................
       if(bNivel3){
            for(Object lnkProducto : lnkProductos3) {
                     Producto proObjeto = (Producto) lnkProducto;
                     // Si se selecciona un objeto
                     if(proObjeto.colisiona(e.getX(), e.getY())) {
                         proObjeto.setAgarrado(true);
                         mPosX = e.getX();
                         mPosY= e.getY();
                         break;
                     }
            }
       }
   }
   
   /**
     * mouseReleased
     * 
     * Metodo sobrescrito de la interface <code>MouseListener</code>.<P>
     * En este metodo maneja el evento que se genera al dejar de hacer click
     * al mouse.
     * 
     */
   public void mouseReleased(MouseEvent e) {
        // Estando en menu
       if(bMenu == true)
       {        
            //Si se da click en creditos
            if(e.getX() >  215 && e.getX() < 410 
                    && e.getY() > 550 && e.getY() < 615) {
                bCreditos = true;
                bMenu = false;
            }
            // Si se da click en puntos
            if(e.getX() >  820 && e.getX() < 975 
                    && e.getY() > 550 && e.getY() < 600) {
                bMonster = true;
                bMenu = false;
            }
            // Si se da click en instrucciones
            if(e.getX() >  340 && e.getX() < 850 
                    && e.getY() > 420 && e.getY() < 500) {
                bInstrucM = true;
                bMenu = false;
            }
            // Si se da click en jugar
            if(e.getX() >  490 && e.getX() < 700 
                    && e.getY() > 260 && e.getY() < 380) {                
                bSelecc = true;
                bMenu = false;
            }
             bCheck = false;
        }
        // Estando en seleccion de juego
        else if(bSelecc == true) {
            // Si se da click en nuevo juego
            if(e.getX() >=  370 && e.getX() <= 820 
                    && e.getY() >= 235 && e.getY() <= 350) {
                bHistoria = true;
                bSelecc = false;
            }
//            // Si se da click en cargar juego
//            if(e.getX() >=  350 && e.getX() <= 760 
//                    && e.getY() >= 360 && e.getY() <= 430) {
//                iNivel = 2;
//                bSelecc = false;
//            }
            // Si se da click en volver al menu
            if(e.getX() >=  20 && e.getX() <= 450 
                    && e.getY() >= 700 && e.getY() <= 760) {
                bMenu = true;
                bSelecc = false;
            }
        }
        // Estando en puntajes
        else if(bScore == true) {
            // Si se da click en volver al menu
            if(e.getX() >=  20 && e.getX() <= 450 
                    && e.getY() >= 700 && e.getY() <= 760) {
                bMenu = true;
                bScore = false;
            }
        }
        // Estando en creditos
        else if(bCreditos == true) {
            // Si se da click en volver al menu
            if(e.getX() >=  20 && e.getX() <= 450 
                    && e.getY() >= 680 && e.getY() <= 740) {
                bMenu = true;
                bCreditos = false;
            }
        }
        // Estando en instrucciones del menu
        else if(bInstrucM == true) {
            // Si se da click en volver al menu
            if(e.getX() >=  20 && e.getX() <= 450 
                    && e.getY() >= 700 && e.getY() <= 760) {
                bMenu = true;
                bInstrucM = false;
            }
            // Si se da click en la flecha derecha
            if(e.getX() >=  1070 && e.getX() <= 1170 
                    && e.getY() >= 700 && e.getY() <= 760) {
                bInstruc2 = true;
                bInstrucM = false;
            }
        }
        // Estando en instrucciones de pausa
        else if (bInstrucJ == true) {
            // Si se da click en volver al menu
            if (e.getX() >= 20 && e.getX() <= 450
                   && e.getY() >= 700 && e.getY() <= 760) {
                bPausa = true;
                bInstrucJ = false;
             }
            // Si se da click en la flecha derecha
            if (e.getX() >= 1070 && e.getX() <= 1170
                   && e.getY() >= 700 && e.getY() <= 760) {
                bInstruc2 = true;
                bInstrucJ = false;
            }
        } // Estando en la pag 2 de instrucciones
        else if (bInstruc2 == true) {
           // Si se da click en la flecha izquierda
            if(bCheck) {
                if (e.getX() >= 40 && e.getX() <= 140
                        && e.getY() >= 700 && e.getY() <= 760) {
                     bInstrucJ = true;
                     bInstruc2 = false;
                }
                // Si se da click en la flecha derecha
                if(e.getX() >=  1070 && e.getX() <= 1170 
                        && e.getY() >= 700 && e.getY() <= 760) {
                    bInstruc3 = true;
                    bInstruc2 = false;
                }
            }
            else {
               if (e.getX() >= 40 && e.getX() <= 140
                        && e.getY() >= 700 && e.getY() <= 760) {
                     bInstrucM = true;
                     bInstruc2 = false;
                }
                // Si se da click en la flecha derecha
                if(e.getX() >=  1070 && e.getX() <= 1170 
                        && e.getY() >= 700 && e.getY() <= 760) {
                    bInstruc3 = true;
                    bInstruc2 = false;
                } 
            }
        }
        // Estando en la pag 3 de instrucciones
        else if(bInstruc3 == true) {
            // Si se da click en volver al menu
            if(e.getX() >=  40 && e.getX() <= 140 
                    && e.getY() >= 700 && e.getY() <= 760) {
                bInstruc2 = true;
                bInstruc3 = false;
            }
            if(e.getX() >=  1070 && e.getX() <= 1170 
                    && e.getY() >= 700 && e.getY() <= 760) {
                bInstruc4 = true;
                bInstruc3 = false;
            }
        }
        // Estando en la pag 4 de instrucciones
        else if(bInstruc4 == true) {
            // Si se da click en volver al menu
            if(e.getX() >=  40 && e.getX() <= 140 
                    && e.getY() >= 700 && e.getY() <= 760) {
                bInstruc3 = true;
                bInstruc4 = false;
            }
        }
        // Estando en pausa
        else if(bPausa == true) {
            // Si se da click en volver al juego
            if(e.getX() >=  370 && e.getX() <= 820 
                    && e.getY() >= 285 && e.getY() <= 350) {
                if(N1){
                    bNivel1 = true;
                    bPausa = false;
                    N1 = false;
                }
                else if(N2) {
                    bNivel2 = true;
                    bPausa = false;
                    N1 = false;
                }
                else if(N3) {
                    bNivel3 = true;
                    bPausa = false;
                    N1 = false;
                }
            }
            // Si se da click en intrucciones
            if(e.getX() >=  350 && e.getX() <= 800 
                    && e.getY() >= 450 && e.getY() <= 580) {
                bInstrucJ = true;
                bPausa = false;
            }
            // Si se da click en volver al menu
            if(e.getX() > 170 && e.getX() < 500 
                    && e.getY() > 700 && e.getY() < 760) { 
                bMenu = true;
                bPausa = false;
            }
            bCheck = true;
        }
        //Estando en historia
        else if(bHistoria) {
            // Si se da click en saltar
            if(e.getX() >=  1000 && e.getX() <= 1165 
                    && e.getY() >= 100 && e.getY() <= 196) {
                bNivel1 = true;
                bHistoria = false;
            }
        }
        if(bNivel1){
            for(Object lnkProducto : lnkProductos1) {
                Producto proObjeto = (Producto) lnkProducto;
                if(proObjeto.getAgarrado() && proObjeto.colisiona(e.getX(), e.getY())) {
                    proObjeto.setAgarrado(false);
                }
            }
        }
       if(bNivel2){
            for(Object lnkProducto : lnkProductos2) {
                Producto proObjeto = (Producto) lnkProducto;
                if(proObjeto.getAgarrado() && proObjeto.colisiona(e.getX(), e.getY())) {
                    proObjeto.setAgarrado(false);
                }
            }
        }
       if(bNivel3){
            for(Object lnkProducto : lnkProductos3) {
                Producto proObjeto = (Producto) lnkProducto;
                if(proObjeto.getAgarrado() && proObjeto.colisiona(e.getX(), e.getY())) {
                    proObjeto.setAgarrado(false);
                }
            }
        }
       if (bMonster) {

            for (Object lnkFires : lnkFire) {
                Objeto objFire = (Objeto) lnkFires;
                if (objFire.colisiona(e.getX(), e.getY())) {
                    objFire.setReturn(true);                

                }

            }


        }
   }
   
   /**
     * mouseDragged
     * 
     * Metodo sobrescrito de la interface <code>MouseListener</code>.<P>
     * En este metodo maneja el evento que se genera al mover el cursor 
     * mientras se hace click al mouse.

     * 
     */
   public void mouseDragged(MouseEvent e) {
        //NIVEL 1............................................
        if(bNivel1) {
            for(Object lnkProducto : lnkProductos1) {
                Producto proObjeto = (Producto) lnkProducto;
                if(proObjeto.getAgarrado()) {
                    mPosX = e.getX();
                    mPosY= e.getY();
                    break;
                }
            }
        }
        //NIVEL 2............................................
        if(bNivel2) {
            for(Object lnkProducto : lnkProductos2) {
                Producto proObjeto = (Producto) lnkProducto;
                if(proObjeto.getAgarrado()) {
                    mPosX = e.getX();
                    mPosY= e.getY();
                    break;
                }
            }
        }
        //NIVEL 3............................................
        if(bNivel3) {
            for(Object lnkProducto : lnkProductos3) {
                Producto proObjeto = (Producto) lnkProducto;
                if(proObjeto.getAgarrado()) {
                    mPosX = e.getX();
                    mPosY= e.getY();
                    break;
                }
            }
        }
   }
   
   /**
     * mouseMoved
     * 
     * Metodo sobrescrito de la interface <code>MouseListener</code>.<P>
     * En este metodo maneja el evento que se genera al mover el cursor
     * del mouse.

     * 
     */
   public void mouseMoved(MouseEvent e) {

   }
   


    /**
     * Metodo que actualiza las animaciones.
     *

     */
    public void paint (Graphics graGrafico){          
        // Inicializan el DoubleBuffer
        if (dbImage == null){
                dbImage = createImage (this.getSize().width, 
                        this.getSize().height);
                dbg = dbImage.getGraphics ();
        }

        // creo imagen para el background
        URL urlImagenFondo  = this.getClass().getResource("Imagenes/menuPrincipal.png");
        Image imaImagenFondo= Toolkit.getDefaultToolkit().getImage(urlImagenFondo);
        
        
        // Despliego la imagen
        dbg.drawImage(imaImagenFondo, 0, 0, 
                getWidth(), getHeight(), this);
        
        

        // Actualiza el Foreground.
        dbg.setColor (getForeground());
        paint1(dbg);

        // Dibuja la imagen actualizada
        graGrafico.drawImage (dbImage, 0, 0, this);
    }

    /**
     * Este metodo se encarga de pintar todos los objetos graficos del juego. Se
     * pintan los valores desplegados en el tablero
     *
     * @param g
     */
    public void paint1(Graphics g) {     
        
        if(bPausa) {
            g.drawImage(imaPausa, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaPausa, 0, 0, getWidth(), getHeight(), null);
        }
        else if(bCreditos) {
            g.drawImage(imaCreditos, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaCreditos, 0, 0, getWidth(), getHeight(), null);      
        }
        else if(bScore) {
            g.drawImage(imaPuntuacion, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaPuntuacion, 0, 0, getWidth(), getHeight(), null);
        }
        else if(bHistoria) {
            g.drawImage(imaHistoria, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaHistoria, 0, 0, getWidth(), getHeight(), null);
            
            g.drawImage(imaSaltar, 1000, 100, null); 
        }
        else if(bFinJuego) {
            g.drawImage(imaFinJuego, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaFinJuego, 0, 0, getWidth(), getHeight(), null);
        }
        else if(bNivel1) {
            g.drawImage(imaNivel1, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaNivel1, 0, 0, getWidth(), getHeight(), null);
            
            g.drawImage(proOrganicos.getImagen(), 200, 200, this);
            g.drawImage(proPapeles.getImagen(), 400, 200, this);
            g.drawImage(proAluminios.getImagen(), 600, 200, this);

            for(Object lnkProducto : lnkProductos1) {
                Producto proObjeto = (Producto) lnkProducto;
                //Dibuja la imagen del producto en la posicion actualizada
                g.drawImage(proObjeto.getImagen(), proObjeto.getX(),
                        proObjeto.getY(), this);
            }

            //Pinto el score
            g.setColor(Color.white);
            Font font = new Font("Comic Sans",Font.BOLD,50);
            g.setFont(font); 
            g.drawString(String.valueOf(iScore), 30, 95);
            //Pinto las vidas
            g.setColor(Color.white);
            g.drawString(String.valueOf(iVidas), 1120, 95);      
        }
        else if(bNivel2) {
            g.drawImage(imaNivel2, 100, 100, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaNivel2, 0, 0, getWidth(), getHeight(), null);
            
            g.drawImage(proOrganicos.getImagen(), 200, 200, this);
            g.drawImage(proPapeles.getImagen(), 400, 200, this);
            g.drawImage(proAluminios.getImagen(), 600, 200, this);
            g.drawImage(proElectricos.getImagen(), 800, 200, this);
            
            for(Object lnkProducto : lnkProductos2) {
                Producto proObjeto = (Producto) lnkProducto;
                //Dibuja la imagen del producto en la posicion actualizada
                g.drawImage(proObjeto.getImagen(), proObjeto.getX(),
                        proObjeto.getY(), this);
            }
            
            //Pinto el score
            g.setColor(Color.white);
            Font font = new Font("Comic Sans",Font.BOLD,50);
            g.setFont(font); 
            g.drawString(String.valueOf(iScore), 30, 95);
            //Pinto las vidas
            g.setColor(Color.white);
            g.drawString(String.valueOf(iVidas), 1120, 95);
        }
        else if(bNivel3) {
            g.drawImage(imaNivel3, 100, 100, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaNivel3, 0, 0, getWidth(), getHeight(), null);
            
            g.drawImage(proOrganicos.getImagen(), 200, 200, this);
            g.drawImage(proPapeles.getImagen(), 400, 200, this);
            g.drawImage(proAluminios.getImagen(), 600, 200, this);
            g.drawImage(proElectricos.getImagen(), 800, 200, this);
            g.drawImage(proPlasticos.getImagen(), 1000, 200, this);
            
            for(Object lnkProducto : lnkProductos3) {
                Producto proObjeto = (Producto) lnkProducto;
                //Dibuja la imagen del producto en la posicion actualizada
                g.drawImage(proObjeto.getImagen(), proObjeto.getX(),
                        proObjeto.getY(), this);
            }
            
            //Pinto el score
            g.setColor(Color.white);
            Font font = new Font("Comic Sans",Font.BOLD,50);
            g.setFont(font); 
            g.drawString(String.valueOf(iScore), 30, 95);
            //Pinto las vidas
            g.setColor(Color.white);
            g.drawString(String.valueOf(iVidas), 1120, 95);
        }
        else if(bMenu) {
            g.drawImage(imaMenu, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaMenu, 0, 0, getWidth(), getHeight(), null);
        }
        
        else if(bInstrucM) {
            g.drawImage(imaInstruccionesMenu, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaInstruccionesMenu, 0, 0, getWidth(), getHeight(), null);
        }
        else if(bInstrucJ) {
            g.drawImage(imaInstruccionesJuego, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaInstruccionesJuego, 0, 0, getWidth(), getHeight(), null);
        }
        else if(bInstruc2) {
            g.drawImage(imaInstrucciones2, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaInstrucciones2, 0, 0, getWidth(), getHeight(), null);
        }
        else if(bInstruc3) {
            g.drawImage(imaInstrucciones3, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaInstrucciones3, 0, 0, getWidth(), getHeight(), null);
        }
        else if(bInstruc4) {
            g.drawImage(imaInstrucciones4, 0, 0, this);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaInstrucciones4, 0, 0, getWidth(), getHeight(), null);
        }
        else if(bSelecc) {
            g.drawImage(imaSeleccJuego, 0, 0, this);
//            g.drawImage(imaMenu, 0, 0, getWidth(), getHeight(), null);
            Dimension size = new Dimension(getWidth(),getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaSeleccJuego, 0, 0, getWidth(), getHeight(), null);
        }
        
        else if (bMonster) {
            g.drawImage(imaNivel2, 0, 0, this);
            Dimension size = new Dimension(getWidth(), getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
            g.drawImage(imaNivel2, 0, 0, getWidth(), getHeight(), null);

            g.drawImage(objOrganico.getImagen(), objOrganico.getX(),
                    objOrganico.getY(), this);
            g.drawImage(objPlastico.getImagen(), objPlastico.getX(),
                    objPlastico.getY(), this);
            g.drawImage(objToxico.getImagen(), objToxico.getX(),
                    objToxico.getY(), this);
            g.drawImage(objElectricos.getImagen(), objElectricos.getX(),
                    objElectricos.getY(), this);
            g.drawImage(objMetal.getImagen(), objMetal.getX(),
                    objMetal.getY(), this);
             g.drawImage(objBoss.getImagen(), objBoss.getX(),
                    objBoss.getY(), this);

            for (Object lnkFires : lnkFire) {
                Objeto objFire = (Objeto) lnkFires;
                
                if(objFire.getVivo() && !objFire.getReturn()){
                g.drawImage(objFire.getImagen(), objFire.getX(),
                        objFire.getY(), this);
                }
                else if (objFire.getReturn() && objFire.getVivo()) {                 
                    g.drawImage(objFire.getImagen(), objFire.getX(),
                                objFire.getY(), this);

                }
            }
           

        }

             
    }
    
    /**
     * keyPressed
     * 
     * Metodo sobrescrito de la interface <code>KeyListener</code>.<P>
     * En este metodo maneja el evento que se genera al dejar presionada
     * alguna tecla.
     * @param keyEvent es el <code>evento</code> generado al presionar.
     * 
     */
    public void keyPressed(KeyEvent keyEvent) {

    }
    
    /**
     * keyTyped
     * 
     * Metodo sobrescrito de la interface <code>KeyListener</code>.<P>
     * En este metodo maneja el evento que se genera al presionar una 
     * tecla que no es de accion.
     * 
     */
    public void keyTyped(KeyEvent keyEvent){
        
    }
    
    /**
     * keyReleased
     * Metodo sobrescrito de la interface <code>KeyListener</code>.<P>
     * En este metodo maneja el evento que se genera al soltar la tecla.
     */
    public void keyReleased(KeyEvent keyEvent){
        if(keyEvent.getKeyCode()== KeyEvent.VK_K)
        {
            if(bNivel1){
                bSelecc = !bSelecc;
                bNivel1 = !bNivel1;
            }
        }
        if(keyEvent.getKeyCode() == KeyEvent.VK_P) 
        {
            if(bNivel1){
                bPausa = true;
                bNivel1 = !bNivel1;
                N1 = true;
            }
            if(bNivel2){
                bPausa = true;
                bNivel2 = !bNivel2;
                N2 = true;
            }
            if(bNivel3){
                bPausa = true;
                bNivel3 = !bNivel3;
                N3 = true;
            }
        }
    }
    
}
