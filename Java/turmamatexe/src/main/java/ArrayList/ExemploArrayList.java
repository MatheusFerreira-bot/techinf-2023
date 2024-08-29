
//package ArrayList;
//
//import Cliente.Cliente;
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//
//public class ExemploArrayList {
//    
//    public static void main(String[] args) {
//        
//        ArrayList<Cliente> Listap = new ArrayList<>();
//        
//        for(int i=0;i<2;i++){
//            Cliente c = new Cliente();
//            c.setNome(JOptionPane.showInputDialog("Informe o Nome: "));
//            c.setTelefone(Long.parseLong(JOptionPane.showInputDialog("Informe o telefone: ")));
//            c.setNome(JOptionPane.showInputDialog("Informe o país: "));
//            Listap.add(c);
//        }
//        for (int i = 0; i < 2; i++) {
//            JOptionPane.showMessageDialog(null,"Nome: "+Listap.get(i).getNome()+"\nTelefone: "+Listap.get(i).getTelefone()+
//                    "\nPaís: "+Listap.get(i).getNome());
//        }
//    }
//}