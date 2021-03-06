package com.ciclo2udea.navegadorweb;

import java.util.Arrays;

public class NavegadorWeb {
  private String[] paginas;  //Lista con las paginas a visitar
  private int[] paginasFavoritas;  //lista con los indices las paginas favoritas
  private boolean desconectado=false;  //estado inicial del desconexion
  private int paginaVisitando=0;  //Pagina que estoy visitando por defecto
  
  //Constructor del objeto principal de la clase
  public NavegadorWeb(String [] paginas){
      this.paginas=paginas;
      paginasFavoritas= new int[paginas.length];
      for (int i=0; i<paginasFavoritas.length;i++){
          paginasFavoritas[i]=-1;
      }
      
  }   
   public void proximaPagina(){
       if (paginaVisitando==(paginas.length -1)){
       paginaVisitando=0;
       }
       else{
       paginaVisitando=paginaVisitando+1;
       }
   }
   
   public void devolverPagina(){
       if (paginaVisitando==0){
       paginaVisitando=paginas.length-1;
       }
       else{
       paginaVisitando=paginaVisitando-1;
       }
   }
   
   public void desconectar(){
       desconectado= true;
   }
   
   public void conectar(){
       desconectado=false;
   }
   
   public void agregarPaginasFavoritas(){ //Metodo para agregar favoritos
       for (int i=0;i<paginas.length;i++){
           if (paginasFavoritas[i]==paginaVisitando){ //Ya esta guardada la pagina en favoritos
           return;
           } 
           else if (paginasFavoritas[i]==-1){
           paginasFavoritas[i]=paginaVisitando;
           return;
           }
       }
   
   }

    public String[] getPaginas() {
        return paginas;
    }

    public void setPaginas(String[] paginas) {
        this.paginas = paginas;
    }

    public int[] getPaginasFavoritas() {
        return paginasFavoritas;
    }

    public void setPaginasFavoritas(int[] paginasFavoritas) {
        this.paginasFavoritas = paginasFavoritas;
    }

    public boolean isDesconectado() {
        return desconectado;
    }

    public void setDesconectado(boolean desconectado) {
        this.desconectado = desconectado;
    }

    public int getPaginaVisitando() {
        return paginaVisitando;
    }

    public void setPaginaVisitando(int paginaVisitando) {  //Set
        this.paginaVisitando = paginaVisitando;
    }

    @Override
    public String toString() {
        return "NavegadorWeb {paginas=" + Arrays.toString(paginas) + ", paginasFavoritas=" + Arrays.toString(paginasFavoritas) + ", desconectado=" + desconectado + ", paginaVisitando=" + paginaVisitando + '}';
    }
    

    
    public static void main(String[] args) {
        String [] listaPaginas = new String[]{
        "www.google.com","www.twitter.com","www.udea.edu.co","www.exito.com","www.efset.com","www.lacasaqueladra.com","www.invictapromotora.com"};
        
        NavegadorWeb pesta??a1=new NavegadorWeb (listaPaginas);
        pesta??a1.devolverPagina();
        pesta??a1.setPaginaVisitando(4);
        pesta??a1.agregarPaginasFavoritas();
        pesta??a1.desconectar();
        pesta??a1.proximaPagina();
        pesta??a1.agregarPaginasFavoritas();
        System.out.println(pesta??a1.toString());
        System.out.println(listaPaginas.length);//prueba
    
    }
}
