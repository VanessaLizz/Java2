import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jingle Bells!!");
        String msg = "Programando em ";
        System.out.println(msg + args[0]);
        System.out.println("Precisamos de uma " + args[1]);

        Vagas administrativo = new Vagas();
        System.out.println(administrativo.salario);
        administrativo.salario = 2100.00;
        System.out.println(administrativo.pegarSalario());
        System.out.println("Digite seu tempo de experiencia: ");
        administrativo.tempoDeExperienciaEmMeses = scanner.nextInt();
        System.out.println(administrativo.pegarExperiencia());
        administrativo.exigeExperiencia = true;
        System.out.println(administrativo.pegarExigenciadeExperiencia());

        Hotel hotel = new Hotel();
        System.out.println(hotel.reservarQuarto());
    }
}