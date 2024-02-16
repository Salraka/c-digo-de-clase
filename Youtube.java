public class Youtube {
    public static void main(String[] args) {
        Usuario usu1 = new Usuario("Alejandra");
        Video vid1= new Video (9000,"Curso de ingles","https://youtube.com/k8");
        usu1.SubirVideo(vid1);
        usu1.MostrarInfoUsuario();
        System.out.println("---");
        
        Usuario usu2 = new Usuario ("Fernanda");
        Comentario commt1 = new Comentario("Excelente video, que divertido. ", usu2);
        
        System.out.println("El usuario: " + usu2.getNombre() + "    Realizo el comentario: " + commt1.getContenido());
               
    }
} 
