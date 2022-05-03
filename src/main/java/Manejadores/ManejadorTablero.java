/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;

import Clases.CuadranteObjeto;
import Enum.Estado;
import Jframe.Tablero;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author dell
 */
public class ManejadorTablero {
    private int CANTIDAD_BOTONES=10;
    private Tablero tablero;
    private int filax=8;
    private int columnay=8;
    private CuadranteObjeto [][] botones;
    
    public ManejadorTablero( Tablero tablero){    
        this.tablero= tablero;
         botones=new CuadranteObjeto[CANTIDAD_BOTONES][CANTIDAD_BOTONES];
    }
    
    public void CrearCuadrantes(){
       
        for(int i=0;i<columnay;i++){
            
            for(int j=0;j<filax;j++){
                    botones[i][j]=new CuadranteObjeto(70*j,70*i,60,60);
                    botones[i][j].posicion(i, j);
                    Icon imag = new ImageIcon(getClass().getResource("/main/java/imagenes/C2.jpg"));
                    botones[i][j].setIcon(imag);
                    //System.out.println(getClass().getResource("/Imagenes/C2.jpg"));
                    tablero.getPanel().add((botones[i][j]));
                    botones[i][j].setEstado(Estado.OCUPADO);
                    botones[i][j].setEnabled(true);
                   /* if(i%2==0){
                        if(j%2==0){
                            botones[i][j].cambiarColor();
                            botones[i][j].setEnabled(false);
                        }
                    
                    }
                    
                  if(j%2!=0 && i%2!=0){
                      botones[i][j].cambiarColor();
                      botones[i][j].setEnabled(false);
                  }*/
                    
                    
                    
                    
            }
        }
    }
       
    
  
}
