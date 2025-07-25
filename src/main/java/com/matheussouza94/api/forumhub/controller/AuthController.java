package com.matheussouza94.api.forumhub.controller;

import com.matheussouza94.api.forumhub.domain.Login;
import com.matheussouza94.api.forumhub.infra.security.DadosTokenJWT;
import com.matheussouza94.api.forumhub.infra.security.TokenService;
import com.matheussouza94.api.forumhub.usuario.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;
    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid Login dados){
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        var auth = manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.gerarToken((Usuario) auth.getPrincipal());

        return  ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
    }
}
