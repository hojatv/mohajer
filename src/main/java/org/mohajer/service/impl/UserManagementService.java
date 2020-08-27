package org.mohajer.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.mohajer.model.AgentDTO;
import org.mohajer.service.UserManagementApi;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserManagementService implements UserManagementApi {

    public Long saveAgent(AgentDTO agentDTO) {
        log.info("Persisting agent {}", agentDTO);
        return 1L;
    }
}
