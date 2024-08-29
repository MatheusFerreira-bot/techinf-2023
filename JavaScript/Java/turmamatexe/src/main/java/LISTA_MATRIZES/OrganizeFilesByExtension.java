package LISTA_MATRIZES;

import javax.swing.JOptionPane;
import java.nio.file.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrganizeFilesByExtension {

    public static void main(String[] args) {
        String directoryPath = JOptionPane.showInputDialog("Informe o endereço da pasta:");

        if (directoryPath == null || directoryPath.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O endereço da pasta não pode ser vazio.");
            return;
        }

        Path path = Paths.get(directoryPath);
        
        if (!Files.exists(path) || !Files.isDirectory(path)) {
            JOptionPane.showMessageDialog(null, "O endereço fornecido não é um diretório válido.");
            return;
        }

        try {
            Map<String, Path> extensionDirectories = new HashMap<>();

            Files.list(path).forEach(file -> {
                if (Files.isRegularFile(file)) {
                    String fileName = file.getFileName().toString();
                    String fileExtension = getFileExtension(fileName);

                    if (fileExtension.isEmpty()) {
                        fileExtension = "sem_extensao";
                    }

                    extensionDirectories.putIfAbsent(fileExtension, path.resolve(fileExtension));
                    Path targetDir = extensionDirectories.get(fileExtension);

                    try {
                        Files.createDirectories(targetDir);
                        Files.move(file, targetDir.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });

            JOptionPane.showMessageDialog(null, "Arquivos organizados com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao organizar os arquivos.");
        }
    }

    private static String getFileExtension(String fileName) {
        int lastIndex = fileName.lastIndexOf('.');
        if (lastIndex == -1) {
            return "";
        }
        return fileName.substring(lastIndex + 1);
    }
}
