public class ConversorTiempo
{
    public static void main(String[] args)
    {
        int segundos = 24973;

        int horas = segundos / 3600;
        //los segundos restantes que no entran en la hora calculada
        segundos = segundos % 3600;
        int minutos = segundos / 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        segundos = segundos % 60;
        System.out.println("Segundos: " + segundos);

        /*segundos = segundos % 60 (restante de pasar a minutos)
        minutos = (segundos / 60) / 60;
        horas = segundos / 3600;*/
    }
}
