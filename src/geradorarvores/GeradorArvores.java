package geradorarvores;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
public class GeradorArvores {
	private static int Numero_de_Vertices, Ramificação;
    public static void main(String[] args) {
    	Numero_de_Vertices = Integer.parseInt(JOptionPane.showInputDialog("Informe o Número de Vértices da Árvore"));
		Ramificação = Integer.parseInt(JOptionPane.showInputDialog("Informe a Ramificação"));
		if(Ramificação == 2) {
        int raiz = 0, ramoa = Ramificação+1 , tamanho_arvore = Numero_de_Vertices; 
        FileOutputStream stream = null;
        try {
        	String Nome = "Arvore"+Numero_de_Vertices+"_R"+Ramificação+".txt";
            stream = new FileOutputStream(Nome);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s;
        for (int i = 1; i <= tamanho_arvore;i++) {
                if (ramoa<=tamanho_arvore)
                    s =  i + " " + raiz + ";"+ ramoa++ + ";"+ramoa++ + "\n";
                else
                    s =  i + " " + raiz + "\n";
                //reader--;
                try {
                    stream.write(s.getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(i%Ramificação==0)
            raiz++;
        }
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Escrito com Sucesso a Árvore: "+Numero_de_Vertices+"_R"+Ramificação+".txt");
		}else if(Ramificação == 3) {
			int raiz = 0, ramoa = Ramificação+1 , tamanho_arvore = Numero_de_Vertices;
	        FileOutputStream stream = null;
	        try {
	        	String Nome = "Arvore"+Numero_de_Vertices+"_R"+Ramificação+".txt";
	            stream = new FileOutputStream(Nome);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        String s;
	        for (int i = 1; i <= tamanho_arvore;i++) {
	                if (ramoa<=tamanho_arvore)
	                    s =  i + " " + raiz + ";"+ ramoa++ + ";"+ramoa++  +";"+ ramoa++ + "\n";
	                else
	                    s =  i + " " + raiz + "\n";
	                try {
	                    stream.write(s.getBytes());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            if(i%Ramificação==0)
	            raiz++;
	        }
	        try {
	            stream.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        JOptionPane.showMessageDialog(null, "Escrito com Sucesso a Árvore: "+Numero_de_Vertices+"_R"+Ramificação+".txt");
		}else if(Ramificação == 4) {
			int raiz = 0, ramoa = Ramificação+1 , tamanho_arvore = Numero_de_Vertices;
	        FileOutputStream stream = null;
	        try {
	        	String Nome = "Arvore"+Numero_de_Vertices+"_R"+Ramificação+".txt";
	            stream = new FileOutputStream(Nome);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        String s;
	        for (int i = 1; i <= tamanho_arvore;i++) {
	                if (ramoa<=tamanho_arvore)
	                    s =  i + " " + raiz + ";"+ ramoa++ + ";"+ramoa++  +";"+ ramoa++ +";"+ ramoa++ + "\n";
	                else
	                    s =  i + " " + raiz + "\n";
	                try {
	                    stream.write(s.getBytes());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            if(i%Ramificação==0)
	            raiz++;
	        }
	        try {
	            stream.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        JOptionPane.showMessageDialog(null, "Escrito com Sucesso a Árvore: "+Numero_de_Vertices+"_R"+Ramificação+".txt");
		}       
    }
}
