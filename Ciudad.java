public class Ciudad {
    private String nombre;
    private String pais;
    private String presidente;
    private int poblacion;
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPais(String pais){
        this.pais=pais;
    }
    public void setPresidente(String presidente){
        this.presidente=presidente;
    }
    public void setPoblacion(int poblacion){
        this.poblacion=poblacion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getPais(){
        return pais;
    }
    public String getPresidente(){
        return presidente;
    }
    public int getPoblacion(){
        return poblacion;
    }

}
