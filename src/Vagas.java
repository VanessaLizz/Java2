public class Vagas {
    public boolean exigeExperiencia;
    public double salario;
    public int tempoDeExperienciaEmMeses;

    public String pegarSalario() {
        return "O salário para esta vaga é de: " + this.salario;
    }

    public String pegarExperiencia(){
        if(this.tempoDeExperienciaEmMeses < 12){
            return "A experiencia mínima deve ser de 12 meses";
        } else{
            return "Tempo de experiencia desejavel para o cargo";
        }
    }

    public String pegarExigenciadeExperiencia(){
        if(this.exigeExperiencia){
            return "Requisito atingido";
        } else{
            return "Você não atingiu os requisitos da vaga";
        }
    }
}