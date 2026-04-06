package org.liuyi.use_api.event;

import lombok.Builder;
import lombok.Data;
import org.liuyi.common.domain.event.Event;

@Builder
@Data
public class UserRegisteredEvent extends Event{
    public static final String TOPIC = "user-registered";
    private String userId;
    private String phone;
    private String hashedPassword;

    @Override
    public String getTopic() {
        return TOPIC;
    }
}
