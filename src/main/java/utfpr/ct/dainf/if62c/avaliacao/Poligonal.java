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
public class Poligonal {
       
       private Ponto2D[] vertices;   
    
       public Poligonal (int num) throws Exception{
           if(num<2)
           {
               throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
           }
        vertices = new Ponto2D[num];    
       }
       
       public Ponto2D[] getN(){
           return vertices;
       }
       
       public Ponto2D get(int num){
           if(num<0)
               return null;
           
           return vertices[num];       
       }
       
      /* public void set(int num, Ponto2D vertice) throws Exception{
            if(vertice
            vertices[num] = vertice;
       }*/
       
}
