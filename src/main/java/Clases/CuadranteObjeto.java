/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Enum.Estado;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author dell
 */
public class CuadranteObjeto extends JButton  implements ActionListener{
     private Estado estado;
    
    public CuadranteObjeto(int posx, int posy ,int ancho  ,int alto   ){
    super.setBounds(posx, posy, ancho, alto);
    addActionListener(this);
    setBackground(Color.ORANGE);
    
    }
    public void posicion(int x,int y){
    setText((x+1)+"-"+(y+1));
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.PINK);
        
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado stado) {
        this.estado = estado;
    }
    
    public void cambiarColor(){
     setBackground(Color.WHITE);
    }
    
    
}
