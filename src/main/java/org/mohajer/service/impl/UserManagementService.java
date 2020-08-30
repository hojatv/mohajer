package org.mohajer.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mohajer.model.AgentDTO;
import org.mohajer.repository.AgentRepository;
import org.mohajer.repository.domain.Agent;
import org.mohajer.service.UserManagementApi;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserManagementService implements UserManagementApi {
    private final AgentRepository agentRepository;

    public Long saveAgent(AgentDTO agentDTO) {
        log.info("Persisting agent {}", agentDTO);
        Agent persistedAgent = agentRepository.save(toAgent(agentDTO));
        return persistedAgent.getId();
    }

    private Agent toAgent(AgentDTO agentDTO) {
        Agent agent = new Agent();
        agent.setName(agentDTO.getName());
        agent.setAddress(agentDTO.getAddress());
        agent.setTel(agentDTO.getTel());
        return agent;
    }
}
