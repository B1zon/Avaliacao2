/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author Gabriel Rodrigues Garcia <b1zon@hotmail.com>
 */
public class PontoXY extends Ponto2D{
       
       public PontoXY(){
           super();
       }
       
       public PontoXY(double x, double y){
           super(x,y,0);
       }
       
    @Override
    public String toString (){
        PontoXY p = new PontoXY();
        String s;
        return s = String.format("%s(%f,%f)",p.getNome(),p.getX(),p.getY());
    } 
}
