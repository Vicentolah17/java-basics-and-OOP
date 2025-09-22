package entities;

public class Funcionarios {
    private String nome;
    private Integer id;
    private Double salary;

    public Funcionarios(String nome, Integer id, Double salary) {
        super();
        this.nome = nome;
        this.id = id;
        this.salary = salary;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void increaseSalary(double percentage){
        salary =salary +salary * percentage /100.0;
    }

    @Override
    public String toString() {
        return id + "\t" + nome + "\t" + String.format("%.2f", salary);
    }
}
