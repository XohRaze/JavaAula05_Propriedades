package Pessoas;

public class Pessoa {

	
	//atributos
	private String nome;
	private String morada;
	
    //Construtores
    public Pessoa(String nome)
    {
        this.nome = nome;
    }

   
    //metodos
	public String getNome() 
	{
		return nome;
	}
	
	public String getMorada() 
	{
		return morada;
	}

	public void setNome(String nome) 
	{
		if(nome.isEmpty() || nome.contains(" ") || nome == null)
		{
			System.out.println("O texto introduzido no nome é invalido");
		}
		else
		{
			this.nome = nome;
		}
		
	}
	
	public void setNome(String nome, String morada) 
	{
		if(nome.isEmpty() || nome.contains(" ") || nome == null)
		{
			System.out.println("O texto introduzido no nome é invalido");
		}
		else if(morada.isEmpty() || morada.contains(" ") || morada == null)
		{
			System.out.println("O texto introduzido na morada é invalido");
		}
		else
		{
			this.nome = nome;
			this.morada = morada;
		}
		
	}

	

	
	
	
	
    
}
