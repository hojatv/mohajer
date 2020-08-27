package org.mohajer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mohajer.model.AgentDTO;
import org.mohajer.service.UserManagementApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserManagementController {
    private final UserManagementApi userManagementApi;

    @PostMapping("/agent")
    public ResponseEntity<Long> addAgent(@RequestBody AgentDTO agentDTO) {
        return ResponseEntity.ok(userManagementApi.saveAgent(agentDTO));
    }
}
