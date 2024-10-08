package org.example;

import java.io.File;
import java.io.IOException;

public class WsimportRunner {
    public static void main(String[] args) {
        // Define a propriedade do sistema para permitir acesso a DTDs externos
        System.setProperty("javax.xml.accessExternalDTD", "all");

        // Caminho para o WSDL e o pacote para o código gerado
        String wsdlPath = "/home/cauan/IdeaProjects/api_sponte/WSAPIEdu.wsdl"; // Caminho no Linux
        String packageName = "com.sponteeducacional";

        // Caminho absoluto para o executável wsimport no Linux
        String wsimportPath = "/usr/lib/jvm/java-17-openjdk-amd64/bin/wsimport"; // Ajuste conforme necessário

        // Comando wsimport com parâmetros
        String[] command = {
                wsimportPath,
                "-keep",
                "-p", packageName,
                wsdlPath
        };

        // Cria um processo para executar o wsimport
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        processBuilder.redirectErrorStream(true); // Redireciona o erro para o fluxo de saída

        try {
            // Executa o comando
            Process process = processBuilder.start();

            // Lê a saída do processo
            java.io.InputStreamReader reader = new java.io.InputStreamReader(process.getInputStream());
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Espera o processo terminar e obtém o código de saída
            int exitCode = process.waitFor();
            System.out.println("Exit code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
