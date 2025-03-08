//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //testando nova branch
        EmpresaSetor empresaSetor =  new EmpresaSetor();
        System.out.println("Nome do setor: "+ empresaSetor.nomeSetorFinanca);
        System.out.println("Nome do setor: "+ empresaSetor.nomeSetorRH);

        Empresa empresa = new Empresa();
        System.out.println("Nome da empresa: "+ empresa.nomeEmpresa);
        System.out.println("CNPJ: "+ empresa.cnpjEmpresa);
        System.out.println("Endereço: "+ empresa.enderecoEmpresa);
        System.out.println("Tipo: "+ empresa.tipoEmpresa);
        System.out.println("Cargo Funcionario: "+ empresa.cargoFuncionario);

       /* Empresa empresa = new Empresa();
        System.out.println("Nome da empresa: "+ empresa.nomeEmpresa);
        System.out.println("CNPJ: "+ empresa.cnpjEmpresa);
        System.out.println("Endereço: "+ empresa.enderecoEmpresa);
        System.out.println("Tipo: "+ empresa.tipoEmpresa);
        System.out.println("Cargo Funcionario: "+ empresa.cargoFuncionario);

        */

        /*
        Funcionario funcionario = new Funcionario();
       System.out.println("O cargo do funcionario é: "+funcionario.cargoFuncionario);
      */


        /*
        System.out.println("Ola Meu nome e Stephany!");
        System.out.println(10);
        int aumento = 20;
        int salarioFuncionario = 1000;
        System.out.println(aumento);
        System.out.println( aumento + salarioFuncionario); //aumento de salario
        System.out.println(salarioFuncionario - aumento);  //redução de salario
        System.out.println(salarioFuncionario * aumento);  //multiplicação de salário
        System.out.println(salarioFuncionario / aumento);  //divisão de salario
*/

    }
}