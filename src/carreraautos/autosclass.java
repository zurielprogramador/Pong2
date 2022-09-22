/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraautos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Zuriel PC
 */
public class autosclass extends Thread{
    private JLabel eti;
    private carrosjfame p;
     public autosclass(JLabel eti, carrosjfame p){
         this.eti=eti;
         this.p=p;
     }
     public void run(){
         int c2=0;
         int c1=0;
         while(true){
         try {
           sleep((int)(Math.random()*1000));
              c1=p.getlbl1().getLocation().x;
              c2=p.getlbl2().getLocation().x;
              if(c1<p.getlbl3_meta().getLocation().x-10 && c2<p.getlbl3_meta().getLocation().x-10){
                  eti.setLocation(eti.getLocation().x+10,eti.getLocation().y);
                  p.repaint();
              }else{
                  break;
              }
              
                 
         
         } catch (InterruptedException e) {
         }
             
             if(eti.getLocation().x>=p.getlbl3_meta().getLocation().x-10){
                 if(c1>c2){
                     JOptionPane.showMessageDialog(null, "gano el 1");
                 }else if(c2>c1){
                     JOptionPane.showMessageDialog(null,"gano el 2" );
                 }else{
                      JOptionPane.showMessageDialog(null,"Empate" );
                 }
             }
         }
         }
     }
