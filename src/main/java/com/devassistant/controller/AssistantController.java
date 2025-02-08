package com.devassistant.controller;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/assistant")
public class AssistantController {

    private static final String API_KEY = "SECRET_KEY_123"; // Remplace par une clé sécurisée

    @PostMapping("/execute")
    public String executeCommand(@RequestParam String command, @RequestHeader("X-API-KEY") String apiKey) {
        if (!API_KEY.equals(apiKey)) {
            return "Accès refusé : clé API invalide";
        }

        try {
            Process process;
            switch (command.toLowerCase()) {
                case "open_intellij":
                    process = new ProcessBuilder("open", "-a", "IntelliJ IDEA").start();
                    break;
                case "start_docker":
                    process = new ProcessBuilder("docker", "compose", "up", "-d").start();
                    break;
                case "stop_docker":
                    process = new ProcessBuilder("docker", "compose", "down").start();
                    break;
                case "open_github":
                    process = new ProcessBuilder("open", "https://github.com/").start();
                    break;
                default:
                    return "Commande inconnue";
            }
            process.waitFor();
            return "Commande exécutée avec succès : " + command;
        } catch (IOException | InterruptedException e) {
            return "Erreur lors de l'exécution : " + e.getMessage();
        }
    }
}
