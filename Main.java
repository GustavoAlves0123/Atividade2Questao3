class Empregado {
    String nome, sobrenome, cpf;
    
    public void informacoes() {
        System.out.println("Nome: " + nome + ", Sobrenome: " + sobrenome + ", CPF: " + cpf);
    }
}

class Assalariado extends Empregado {
    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Funcionário assalariado.");
    }
}

class Comissionado extends Empregado {
    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Comissionado");
    }
}

class Horista extends Empregado {
    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Horista");
    }
}

class Secretario extends Empregado {
    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Secretário");
    }
}

class Gerente extends Empregado {
    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Gerente");
    }
}

public class Main {
    public static void main(String[] args) {
        Empregado novoSecretario = new Secretario();
        Empregado novoGerente = new Gerente();
        novoSecretario.informacoes();
        novoGerente.informacoes();
    }
}
