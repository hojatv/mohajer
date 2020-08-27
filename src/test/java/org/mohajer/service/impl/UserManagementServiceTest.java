package org.mohajer.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.mohajer.model.AgentDTO;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class UserManagementServiceTest {
    @InjectMocks
    private UserManagementService userManagementService;

    @Test
    public void testSaveAgent() {
        //given
        AgentDTO agentDTO = createAgentDto();

        //when
        Long agentId = userManagementService.saveAgent(agentDTO);

        //then
        assertEquals(agentId, new Long(1));


    }

    private AgentDTO createAgentDto() {
        return AgentDTO.builder()
                .name("Ali")
                .address("Tehran")
                .tel("+982324234")
                .build();
    }

}