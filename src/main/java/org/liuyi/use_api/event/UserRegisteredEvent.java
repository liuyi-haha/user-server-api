package org.liuyi.use_api.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.liuyi.common.domain.event.Event;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
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
