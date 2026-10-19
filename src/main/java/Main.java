import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Insira o valor inicial: "));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("Insira o valor final: "));
        int i=n1;
        int soma = 0;
        while (i<=n2){
            soma = soma+i;
            i++;
        }
        JOptionPane.showMessageDialog(null,"o valor total é: "+ soma);
    }
}
