package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author Gabriel Rodrigues Garcia <b1zon@hotmail.com>
 */
public class Ponto {
    private double x, y, z;

    public Ponto(){
        x = 0;
        y = 0;
        z = 0;
    }
    public Ponto(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
            
    /**
     * Retorna no nome não-qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }
    
    @Override
    public String toString (){
        Ponto p = new Ponto();
        String s;
        return s = String.format("%s(%f,%f,%f)",p.getNome(),x,y,z);
    }
    @Override
    public boolean equals(Object o){
           if(o == null)
               return false;
           Ponto p = new Ponto();
           if(p.getX()==p.getY()||p.getX()==p.getZ()||p.getY()==p.getZ())
               return false;
           else return true;
    }
    
    public double dist(Ponto p){
        double d;
        d = Math.sqrt(Math.pow((p.getX()-x),2)+Math.pow((p.getY()-y),2)+
                      Math.pow((p.getZ()-z),2));
        return d;
    }
    
}
