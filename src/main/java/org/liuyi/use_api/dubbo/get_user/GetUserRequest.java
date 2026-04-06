package org.liuyi.use_api.dubbo.get_user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetUserRequest implements Serializable {
    private String userId;
}
