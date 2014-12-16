/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1338773
 */
public class PontoXZ extends Ponto2D{
       
      public PontoXZ (){
          super();
      }
      
      public PontoXZ (double x, double z){
          super(x,0,z);
      }
      
    @Override
    public String toString (){
        PontoXZ p = new PontoXZ();
        String s;
        return s = String.format("%s(%f,%f)",p.getNome(),p.getX(),p.getZ());
    }
}
