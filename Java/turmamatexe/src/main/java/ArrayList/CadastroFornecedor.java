
//package ArrayList;
//
//import Fornecedor.Fornecedor;
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//
///*
//fazer programa de cadastro de um fornecedor com arraylist, com as funções de add, remove, clear, get,
//*/
//
//public class CadastroFornecedor {
//    
//    public static void main(String[] args) {
//        
//        ArrayList<Fornecedor> ListaF = new ArrayList<>();
//        
//        for (int i = 0; i < 2; i++) {
//            for (i = 0; i < 2; i++) {
//                Fornecedor f = new Fornecedor();
//                f.setNomeEmpresa(JOptionPane.showInputDialog("Informe a razão social: "));
//                f.setNomeEmpresa(JOptionPane.showInputDialog("Informe o nome fantasia: "));
//                f.setCNPJ(Long.parseLong(JOptionPane.showInputDialog("Informe o CNPJ: ")));
//                ListaF.add(f);
//             }
//            for (i = 0; i < 2; i++) {
//                JOptionPane.showMessageDialog(null,"Razão Social: "+ListaF.get(i).getNomeEmpresa());
//            }  
//            Fornecedor f = new Fornecedor();
//            ListaF.remove(f);
//            ListaF.clear();
//        }
//    }
//}
