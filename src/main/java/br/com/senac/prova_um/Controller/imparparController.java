package br.com.senac.prova_um.Controller;

import br.com.senac.prova_um.dtos.imparparResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prova")
@CrossOrigin
public class imparparController {

    @GetMapping("/validarNumero")
    public ResponseEntity<imparparResponseDTO> validarNumero (@RequestParam Double numero1) {

        imparparResponseDTO resultado = new imparparResponseDTO();
        resultado.setRestoDivisao(numero1/2);

        if (resultado.getRestoDivisao() == 0) {
            resultado.setImparPar("Par");

        }else{
            resultado.setImparPar("Impar");
        }

        return ResponseEntity.ok(resultado);
    }
}
