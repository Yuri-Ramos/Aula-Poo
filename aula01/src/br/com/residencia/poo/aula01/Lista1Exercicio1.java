package br.com.residencia.poo.aula01;
/*O programa “bem-vindo” pergunta seu nome e sobrenome, e depois
gentilmente te cumprimenta.
- 1o etapa: perguntar o nome;
- 2o etapa: perguntar o sobrenome;
- 3o etapa: junta o nome com o sobrenome e forma uma frase.*/


import javax.swing.JOptionPane;
public class Lista1Exercicio1 {

	    public static void main(String[] args) {
	    	// Está pedindo ao usuário para inserir um nome.
	        String name = JOptionPane.showInputDialog("Digite o seu nome");
	     // Está pedindo que o usuário insira um sobrenome.
	        String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome");

	     // Está mostrando uma caixa de diálogo de mensagem com o nome e sobrenome.
	        JOptionPane.showMessageDialog(null, "Bem vindo(a) "+ name + " " + sobrenome);
	    }
	}
