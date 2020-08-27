package org.mohajer.model;

import lombok.Data;
import lombok.Builder;


@Data
@Builder
public class AgentDTO {
    public String name;
    public String address;
    public String tel;
}
