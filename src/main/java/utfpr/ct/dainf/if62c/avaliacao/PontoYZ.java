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
public class PontoYZ extends Ponto2D{
       
       public PontoYZ(){
           super();
       }
       
       public PontoYZ(double y, double z){
           super(0,y,z);
       }
       
    @Override
    public String toString (){
        PontoYZ p = new PontoYZ();
        String s;
        return s = String.format("%s(%f,%f)",p.getNome(),p.getY(),p.getZ());
    }
}
