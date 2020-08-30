package org.mohajer.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mohajer.model.AgentDTO;
import org.mohajer.repository.AgentRepository;
import org.mohajer.repository.domain.Agent;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserManagementServiceTest {
    @Mock
    AgentRepository agentRepository;

    @InjectMocks
    private UserManagementService userManagementService;

    @Test
    public void testSaveAgent() {
        //given
        AgentDTO agentDTO = createAgentDto();
        Agent agent = createAgent(agentDTO);
        when(agentRepository.save(any())).thenReturn(agent);

        //when
        Long persistedAgentId = userManagementService.saveAgent(agentDTO);

        //then
        assertEquals(new Long(1), persistedAgentId);

    }

    private Agent createAgent(AgentDTO agentDTO) {
        Agent agent = new Agent();
        agent.setAddress(agentDTO.getAddress());
        agent.setName(agentDTO.getName());
        agent.setId(1L);
        return agent;

    }

    private AgentDTO createAgentDto() {
        return AgentDTO.builder()
                .name("Ali")
                .address("Tehran")
                .tel("+982324234")
                .build();
    }

}