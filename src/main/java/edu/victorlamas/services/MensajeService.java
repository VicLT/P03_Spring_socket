package edu.victorlamas.services;

import edu.victorlamas.models.Mensaje;
import edu.victorlamas.repositories.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository mensajeRepository;

    // Guardar un mensaje
    public Mensaje guardarMensaje(Mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

    // Obtener todos los mensajes
    public List<Mensaje> obtenerTodosLosMensajes() {
        return mensajeRepository.findAll();
    }

    // Obtener mensajes de un usuario específico
    public List<Mensaje> obtenerMensajesPorUsuario(String username) {
        return mensajeRepository.findByUsername(username);
    }
}