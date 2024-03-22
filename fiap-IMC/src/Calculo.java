public class Calculo {

    //atributos
    public double peso;
    public double altura;

    //Métodos construtor
    public Calculo(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    //  double x = Math.pow(3,2); // 3 elevado a 2// sqrt => raiz quadrada
    // metodo
    public double calcularIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    public String exibirMensagem() {
        double imc = calcularIMC();
        String mensagem = "Seu IMC è  de " + imc;

        if(imc <= 18.5)
        mensagem += ", você está abaixo do peso!";
        else if (imc > 18.5 && imc < 25)
            mensagem += ", você está no peso ideal!";
        else if(imc >= 25 && imc < 30)
            mensagem +=", você está levemente acima do peso!";
        else if (imc >= 30 && imc < 35)
            mensagem += ", você está com obesidade grau I!";
        else if(imc >= 35 && imc < 40)
            mensagem +=", você está com obesidade grau II- severa!";
        else
            mensagem +=", você está com obesidade grau III - morbida!";

        return  mensagem;
    }
    public double pesoIdeal(String sexo){

        if(sexo.equalsIgnoreCase("M"))
            return  52 + (0.75 * (this.altura - 152.4));
        else
            return  52 + (0.67 * (this.altura - 152.4));

    }



}
